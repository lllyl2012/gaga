package top.lllyl2012.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import top.lllyl2012.bean.mapper.CountryMapper;
import top.lllyl2012.bean.mapper.FormatMapper;
import top.lllyl2012.bean.mapper.LanguagesMapper;
import top.lllyl2012.bean.mapper.ResolutionRatioMapper;
import top.lllyl2012.service.EditMovieService;

@Service
public class EditMovieServiceImpl implements EditMovieService{

	@Resource
	private CountryMapper countryMapper;
	
	@Resource
	private FormatMapper formatMapper;
	
	@Resource
	private LanguagesMapper languagesMapper;
	
	@Resource
	private ResolutionRatioMapper resolutionRatioMapper;
	
	@Override
	public List<String> getCountryList() {
		return countryMapper.getAll();
	}

	@Override
	public List<String> getLanguageList() {
		return languagesMapper.getAll();
	}

	@Override
	public List<String> getResolutionRatioList() {
		return resolutionRatioMapper.getAll();
	}

	@Override
	public List<String> getFormatList() {
		return formatMapper.getAll();
	}

}
