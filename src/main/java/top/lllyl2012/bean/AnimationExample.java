package top.lllyl2012.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AnimationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioIsNull() {
            addCriterion("resolution_ratio is null");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioIsNotNull() {
            addCriterion("resolution_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioEqualTo(String value) {
            addCriterion("resolution_ratio =", value, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioNotEqualTo(String value) {
            addCriterion("resolution_ratio <>", value, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioGreaterThan(String value) {
            addCriterion("resolution_ratio >", value, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioGreaterThanOrEqualTo(String value) {
            addCriterion("resolution_ratio >=", value, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioLessThan(String value) {
            addCriterion("resolution_ratio <", value, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioLessThanOrEqualTo(String value) {
            addCriterion("resolution_ratio <=", value, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioLike(String value) {
            addCriterion("resolution_ratio like", value, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioNotLike(String value) {
            addCriterion("resolution_ratio not like", value, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioIn(List<String> values) {
            addCriterion("resolution_ratio in", values, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioNotIn(List<String> values) {
            addCriterion("resolution_ratio not in", values, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioBetween(String value1, String value2) {
            addCriterion("resolution_ratio between", value1, value2, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andResolutionRatioNotBetween(String value1, String value2) {
            addCriterion("resolution_ratio not between", value1, value2, "resolutionRatio");
            return (Criteria) this;
        }

        public Criteria andFormatIsNull() {
            addCriterion("format is null");
            return (Criteria) this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("format is not null");
            return (Criteria) this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("format =", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("format <>", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("format >", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("format >=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("format <", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("format <=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("format like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("format not like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("format in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("format not in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("format between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("format not between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andConntryIsNull() {
            addCriterion("conntry is null");
            return (Criteria) this;
        }

        public Criteria andConntryIsNotNull() {
            addCriterion("conntry is not null");
            return (Criteria) this;
        }

        public Criteria andConntryEqualTo(String value) {
            addCriterion("conntry =", value, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryNotEqualTo(String value) {
            addCriterion("conntry <>", value, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryGreaterThan(String value) {
            addCriterion("conntry >", value, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryGreaterThanOrEqualTo(String value) {
            addCriterion("conntry >=", value, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryLessThan(String value) {
            addCriterion("conntry <", value, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryLessThanOrEqualTo(String value) {
            addCriterion("conntry <=", value, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryLike(String value) {
            addCriterion("conntry like", value, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryNotLike(String value) {
            addCriterion("conntry not like", value, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryIn(List<String> values) {
            addCriterion("conntry in", values, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryNotIn(List<String> values) {
            addCriterion("conntry not in", values, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryBetween(String value1, String value2) {
            addCriterion("conntry between", value1, value2, "conntry");
            return (Criteria) this;
        }

        public Criteria andConntryNotBetween(String value1, String value2) {
            addCriterion("conntry not between", value1, value2, "conntry");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIsNull() {
            addCriterion("subtitles is null");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIsNotNull() {
            addCriterion("subtitles is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitlesEqualTo(String value) {
            addCriterion("subtitles =", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotEqualTo(String value) {
            addCriterion("subtitles <>", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesGreaterThan(String value) {
            addCriterion("subtitles >", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesGreaterThanOrEqualTo(String value) {
            addCriterion("subtitles >=", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLessThan(String value) {
            addCriterion("subtitles <", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLessThanOrEqualTo(String value) {
            addCriterion("subtitles <=", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesLike(String value) {
            addCriterion("subtitles like", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotLike(String value) {
            addCriterion("subtitles not like", value, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesIn(List<String> values) {
            addCriterion("subtitles in", values, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotIn(List<String> values) {
            addCriterion("subtitles not in", values, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesBetween(String value1, String value2) {
            addCriterion("subtitles between", value1, value2, "subtitles");
            return (Criteria) this;
        }

        public Criteria andSubtitlesNotBetween(String value1, String value2) {
            addCriterion("subtitles not between", value1, value2, "subtitles");
            return (Criteria) this;
        }

        public Criteria andBeanScoreIsNull() {
            addCriterion("bean_score is null");
            return (Criteria) this;
        }

        public Criteria andBeanScoreIsNotNull() {
            addCriterion("bean_score is not null");
            return (Criteria) this;
        }

        public Criteria andBeanScoreEqualTo(String value) {
            addCriterion("bean_score =", value, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreNotEqualTo(String value) {
            addCriterion("bean_score <>", value, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreGreaterThan(String value) {
            addCriterion("bean_score >", value, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreGreaterThanOrEqualTo(String value) {
            addCriterion("bean_score >=", value, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreLessThan(String value) {
            addCriterion("bean_score <", value, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreLessThanOrEqualTo(String value) {
            addCriterion("bean_score <=", value, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreLike(String value) {
            addCriterion("bean_score like", value, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreNotLike(String value) {
            addCriterion("bean_score not like", value, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreIn(List<String> values) {
            addCriterion("bean_score in", values, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreNotIn(List<String> values) {
            addCriterion("bean_score not in", values, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreBetween(String value1, String value2) {
            addCriterion("bean_score between", value1, value2, "beanScore");
            return (Criteria) this;
        }

        public Criteria andBeanScoreNotBetween(String value1, String value2) {
            addCriterion("bean_score not between", value1, value2, "beanScore");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBaiduyunIsNull() {
            addCriterion("baiduyun is null");
            return (Criteria) this;
        }

        public Criteria andBaiduyunIsNotNull() {
            addCriterion("baiduyun is not null");
            return (Criteria) this;
        }

        public Criteria andBaiduyunEqualTo(String value) {
            addCriterion("baiduyun =", value, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunNotEqualTo(String value) {
            addCriterion("baiduyun <>", value, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunGreaterThan(String value) {
            addCriterion("baiduyun >", value, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunGreaterThanOrEqualTo(String value) {
            addCriterion("baiduyun >=", value, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunLessThan(String value) {
            addCriterion("baiduyun <", value, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunLessThanOrEqualTo(String value) {
            addCriterion("baiduyun <=", value, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunLike(String value) {
            addCriterion("baiduyun like", value, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunNotLike(String value) {
            addCriterion("baiduyun not like", value, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunIn(List<String> values) {
            addCriterion("baiduyun in", values, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunNotIn(List<String> values) {
            addCriterion("baiduyun not in", values, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunBetween(String value1, String value2) {
            addCriterion("baiduyun between", value1, value2, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunNotBetween(String value1, String value2) {
            addCriterion("baiduyun not between", value1, value2, "baiduyun");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmIsNull() {
            addCriterion("baiduyunmm is null");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmIsNotNull() {
            addCriterion("baiduyunmm is not null");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmEqualTo(String value) {
            addCriterion("baiduyunmm =", value, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmNotEqualTo(String value) {
            addCriterion("baiduyunmm <>", value, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmGreaterThan(String value) {
            addCriterion("baiduyunmm >", value, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmGreaterThanOrEqualTo(String value) {
            addCriterion("baiduyunmm >=", value, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmLessThan(String value) {
            addCriterion("baiduyunmm <", value, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmLessThanOrEqualTo(String value) {
            addCriterion("baiduyunmm <=", value, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmLike(String value) {
            addCriterion("baiduyunmm like", value, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmNotLike(String value) {
            addCriterion("baiduyunmm not like", value, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmIn(List<String> values) {
            addCriterion("baiduyunmm in", values, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmNotIn(List<String> values) {
            addCriterion("baiduyunmm not in", values, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmBetween(String value1, String value2) {
            addCriterion("baiduyunmm between", value1, value2, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andBaiduyunmmNotBetween(String value1, String value2) {
            addCriterion("baiduyunmm not between", value1, value2, "baiduyunmm");
            return (Criteria) this;
        }

        public Criteria andXunleiIsNull() {
            addCriterion("xunlei is null");
            return (Criteria) this;
        }

        public Criteria andXunleiIsNotNull() {
            addCriterion("xunlei is not null");
            return (Criteria) this;
        }

        public Criteria andXunleiEqualTo(String value) {
            addCriterion("xunlei =", value, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiNotEqualTo(String value) {
            addCriterion("xunlei <>", value, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiGreaterThan(String value) {
            addCriterion("xunlei >", value, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiGreaterThanOrEqualTo(String value) {
            addCriterion("xunlei >=", value, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiLessThan(String value) {
            addCriterion("xunlei <", value, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiLessThanOrEqualTo(String value) {
            addCriterion("xunlei <=", value, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiLike(String value) {
            addCriterion("xunlei like", value, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiNotLike(String value) {
            addCriterion("xunlei not like", value, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiIn(List<String> values) {
            addCriterion("xunlei in", values, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiNotIn(List<String> values) {
            addCriterion("xunlei not in", values, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiBetween(String value1, String value2) {
            addCriterion("xunlei between", value1, value2, "xunlei");
            return (Criteria) this;
        }

        public Criteria andXunleiNotBetween(String value1, String value2) {
            addCriterion("xunlei not between", value1, value2, "xunlei");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}