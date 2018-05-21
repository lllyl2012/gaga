package top.lllyl2012.util;

import org.springframework.util.StringUtils;

public final class StringUtil {

	/**
	 * 判断字符串是否为空
	 */
	public static boolean isEmpty(String str){
		if(str != null){
			str = str.trim();
		}
		return StringUtils.isEmpty(str);
	}
	
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
}