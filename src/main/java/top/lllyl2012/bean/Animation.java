package top.lllyl2012.bean;

import java.util.Date;

public class Animation {
    private Integer id;

    private String name;

    private String director;

    private Date createTime;

    private String language;

    private String resolutionRatio;

    private String format;

    private String conntry;

    private String subtitles;

    private String beanScore;

    private String size;

    private String time;

    private String remark;

    private String baiduyun;

    private String baiduyunmm;

    private String xunlei;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getResolutionRatio() {
        return resolutionRatio;
    }

    public void setResolutionRatio(String resolutionRatio) {
        this.resolutionRatio = resolutionRatio == null ? null : resolutionRatio.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getConntry() {
        return conntry;
    }

    public void setConntry(String conntry) {
        this.conntry = conntry == null ? null : conntry.trim();
    }

    public String getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String subtitles) {
        this.subtitles = subtitles == null ? null : subtitles.trim();
    }

    public String getBeanScore() {
        return beanScore;
    }

    public void setBeanScore(String beanScore) {
        this.beanScore = beanScore == null ? null : beanScore.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBaiduyun() {
        return baiduyun;
    }

    public void setBaiduyun(String baiduyun) {
        this.baiduyun = baiduyun == null ? null : baiduyun.trim();
    }

    public String getBaiduyunmm() {
        return baiduyunmm;
    }

    public void setBaiduyunmm(String baiduyunmm) {
        this.baiduyunmm = baiduyunmm == null ? null : baiduyunmm.trim();
    }

    public String getXunlei() {
        return xunlei;
    }

    public void setXunlei(String xunlei) {
        this.xunlei = xunlei == null ? null : xunlei.trim();
    }
}