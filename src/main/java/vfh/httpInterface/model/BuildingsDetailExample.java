package vfh.httpInterface.model;

import java.util.ArrayList;
import java.util.List;

public class BuildingsDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public BuildingsDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
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
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
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

        public Criteria andBuildingCountIsNull() {
            addCriterion("building_count is null");
            return (Criteria) this;
        }

        public Criteria andBuildingCountIsNotNull() {
            addCriterion("building_count is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingCountEqualTo(Integer value) {
            addCriterion("building_count =", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountNotEqualTo(Integer value) {
            addCriterion("building_count <>", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountGreaterThan(Integer value) {
            addCriterion("building_count >", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_count >=", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountLessThan(Integer value) {
            addCriterion("building_count <", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountLessThanOrEqualTo(Integer value) {
            addCriterion("building_count <=", value, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountIn(List<Integer> values) {
            addCriterion("building_count in", values, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountNotIn(List<Integer> values) {
            addCriterion("building_count not in", values, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountBetween(Integer value1, Integer value2) {
            addCriterion("building_count between", value1, value2, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andBuildingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("building_count not between", value1, value2, "buildingCount");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIsNull() {
            addCriterion("floor_space is null");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIsNotNull() {
            addCriterion("floor_space is not null");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceEqualTo(Integer value) {
            addCriterion("floor_space =", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotEqualTo(Integer value) {
            addCriterion("floor_space <>", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceGreaterThan(Integer value) {
            addCriterion("floor_space >", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_space >=", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLessThan(Integer value) {
            addCriterion("floor_space <", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLessThanOrEqualTo(Integer value) {
            addCriterion("floor_space <=", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIn(List<Integer> values) {
            addCriterion("floor_space in", values, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotIn(List<Integer> values) {
            addCriterion("floor_space not in", values, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceBetween(Integer value1, Integer value2) {
            addCriterion("floor_space between", value1, value2, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_space not between", value1, value2, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceIsNull() {
            addCriterion("building_space is null");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceIsNotNull() {
            addCriterion("building_space is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceEqualTo(Integer value) {
            addCriterion("building_space =", value, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceNotEqualTo(Integer value) {
            addCriterion("building_space <>", value, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceGreaterThan(Integer value) {
            addCriterion("building_space >", value, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_space >=", value, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceLessThan(Integer value) {
            addCriterion("building_space <", value, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceLessThanOrEqualTo(Integer value) {
            addCriterion("building_space <=", value, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceIn(List<Integer> values) {
            addCriterion("building_space in", values, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceNotIn(List<Integer> values) {
            addCriterion("building_space not in", values, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceBetween(Integer value1, Integer value2) {
            addCriterion("building_space between", value1, value2, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andBuildingSpaceNotBetween(Integer value1, Integer value2) {
            addCriterion("building_space not between", value1, value2, "buildingSpace");
            return (Criteria) this;
        }

        public Criteria andHouseCountIsNull() {
            addCriterion("house_count is null");
            return (Criteria) this;
        }

        public Criteria andHouseCountIsNotNull() {
            addCriterion("house_count is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCountEqualTo(Integer value) {
            addCriterion("house_count =", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountNotEqualTo(Integer value) {
            addCriterion("house_count <>", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountGreaterThan(Integer value) {
            addCriterion("house_count >", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_count >=", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountLessThan(Integer value) {
            addCriterion("house_count <", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountLessThanOrEqualTo(Integer value) {
            addCriterion("house_count <=", value, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountIn(List<Integer> values) {
            addCriterion("house_count in", values, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountNotIn(List<Integer> values) {
            addCriterion("house_count not in", values, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountBetween(Integer value1, Integer value2) {
            addCriterion("house_count between", value1, value2, "houseCount");
            return (Criteria) this;
        }

        public Criteria andHouseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("house_count not between", value1, value2, "houseCount");
            return (Criteria) this;
        }

        public Criteria andGreenRateIsNull() {
            addCriterion("green_rate is null");
            return (Criteria) this;
        }

        public Criteria andGreenRateIsNotNull() {
            addCriterion("green_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGreenRateEqualTo(Integer value) {
            addCriterion("green_rate =", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateNotEqualTo(Integer value) {
            addCriterion("green_rate <>", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateGreaterThan(Integer value) {
            addCriterion("green_rate >", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("green_rate >=", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateLessThan(Integer value) {
            addCriterion("green_rate <", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateLessThanOrEqualTo(Integer value) {
            addCriterion("green_rate <=", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateIn(List<Integer> values) {
            addCriterion("green_rate in", values, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateNotIn(List<Integer> values) {
            addCriterion("green_rate not in", values, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateBetween(Integer value1, Integer value2) {
            addCriterion("green_rate between", value1, value2, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateNotBetween(Integer value1, Integer value2) {
            addCriterion("green_rate not between", value1, value2, "greenRate");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionIsNull() {
            addCriterion("decoration_condition is null");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionIsNotNull() {
            addCriterion("decoration_condition is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionEqualTo(String value) {
            addCriterion("decoration_condition =", value, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionNotEqualTo(String value) {
            addCriterion("decoration_condition <>", value, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionGreaterThan(String value) {
            addCriterion("decoration_condition >", value, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionGreaterThanOrEqualTo(String value) {
            addCriterion("decoration_condition >=", value, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionLessThan(String value) {
            addCriterion("decoration_condition <", value, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionLessThanOrEqualTo(String value) {
            addCriterion("decoration_condition <=", value, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionLike(String value) {
            addCriterion("decoration_condition like", value, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionNotLike(String value) {
            addCriterion("decoration_condition not like", value, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionIn(List<String> values) {
            addCriterion("decoration_condition in", values, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionNotIn(List<String> values) {
            addCriterion("decoration_condition not in", values, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionBetween(String value1, String value2) {
            addCriterion("decoration_condition between", value1, value2, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andDecorationConditionNotBetween(String value1, String value2) {
            addCriterion("decoration_condition not between", value1, value2, "decorationCondition");
            return (Criteria) this;
        }

        public Criteria andUtilTypeIsNull() {
            addCriterion("util_type is null");
            return (Criteria) this;
        }

        public Criteria andUtilTypeIsNotNull() {
            addCriterion("util_type is not null");
            return (Criteria) this;
        }

        public Criteria andUtilTypeEqualTo(Integer value) {
            addCriterion("util_type =", value, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeNotEqualTo(Integer value) {
            addCriterion("util_type <>", value, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeGreaterThan(Integer value) {
            addCriterion("util_type >", value, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("util_type >=", value, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeLessThan(Integer value) {
            addCriterion("util_type <", value, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeLessThanOrEqualTo(Integer value) {
            addCriterion("util_type <=", value, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeIn(List<Integer> values) {
            addCriterion("util_type in", values, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeNotIn(List<Integer> values) {
            addCriterion("util_type not in", values, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeBetween(Integer value1, Integer value2) {
            addCriterion("util_type between", value1, value2, "utilType");
            return (Criteria) this;
        }

        public Criteria andUtilTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("util_type not between", value1, value2, "utilType");
            return (Criteria) this;
        }

        public Criteria andParkingCountIsNull() {
            addCriterion("parking_count is null");
            return (Criteria) this;
        }

        public Criteria andParkingCountIsNotNull() {
            addCriterion("parking_count is not null");
            return (Criteria) this;
        }

        public Criteria andParkingCountEqualTo(Integer value) {
            addCriterion("parking_count =", value, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountNotEqualTo(Integer value) {
            addCriterion("parking_count <>", value, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountGreaterThan(Integer value) {
            addCriterion("parking_count >", value, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_count >=", value, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountLessThan(Integer value) {
            addCriterion("parking_count <", value, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountLessThanOrEqualTo(Integer value) {
            addCriterion("parking_count <=", value, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountIn(List<Integer> values) {
            addCriterion("parking_count in", values, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountNotIn(List<Integer> values) {
            addCriterion("parking_count not in", values, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountBetween(Integer value1, Integer value2) {
            addCriterion("parking_count between", value1, value2, "parkingCount");
            return (Criteria) this;
        }

        public Criteria andParkingCountNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_count not between", value1, value2, "parkingCount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated do_not_delete_during_merge Wed Jan 06 17:08:26 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
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