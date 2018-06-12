package com.briup.apps.poll.bean;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public QuestionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidIsNull() {
            addCriterion("questionTypeId is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidIsNotNull() {
            addCriterion("questionTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidEqualTo(Long value) {
            addCriterion("questionTypeId =", value, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidNotEqualTo(Long value) {
            addCriterion("questionTypeId <>", value, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidGreaterThan(Long value) {
            addCriterion("questionTypeId >", value, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("questionTypeId >=", value, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidLessThan(Long value) {
            addCriterion("questionTypeId <", value, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidLessThanOrEqualTo(Long value) {
            addCriterion("questionTypeId <=", value, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidIn(List<Long> values) {
            addCriterion("questionTypeId in", values, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidNotIn(List<Long> values) {
            addCriterion("questionTypeId not in", values, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidBetween(Long value1, Long value2) {
            addCriterion("questionTypeId between", value1, value2, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeidNotBetween(Long value1, Long value2) {
            addCriterion("questionTypeId not between", value1, value2, "questiontypeid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelIsNull() {
            addCriterion("questionTypeLabel is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelIsNotNull() {
            addCriterion("questionTypeLabel is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelEqualTo(String value) {
            addCriterion("questionTypeLabel =", value, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelNotEqualTo(String value) {
            addCriterion("questionTypeLabel <>", value, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelGreaterThan(String value) {
            addCriterion("questionTypeLabel >", value, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelGreaterThanOrEqualTo(String value) {
            addCriterion("questionTypeLabel >=", value, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelLessThan(String value) {
            addCriterion("questionTypeLabel <", value, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelLessThanOrEqualTo(String value) {
            addCriterion("questionTypeLabel <=", value, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelLike(String value) {
            addCriterion("questionTypeLabel like", value, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelNotLike(String value) {
            addCriterion("questionTypeLabel not like", value, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelIn(List<String> values) {
            addCriterion("questionTypeLabel in", values, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelNotIn(List<String> values) {
            addCriterion("questionTypeLabel not in", values, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelBetween(String value1, String value2) {
            addCriterion("questionTypeLabel between", value1, value2, "questiontypelabel");
            return (Criteria) this;
        }

        public Criteria andQuestiontypelabelNotBetween(String value1, String value2) {
            addCriterion("questionTypeLabel not between", value1, value2, "questiontypelabel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poll_question
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 12 11:43:24 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table poll_question
     *
     * @mbg.generated Tue Jun 12 11:43:24 CST 2018
     */
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