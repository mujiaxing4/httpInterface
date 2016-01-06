package vfh.httpInterface.dao.buildings;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vfh.httpInterface.model.BuildingsResource;
import vfh.httpInterface.model.BuildingsResourceExample;

public interface BuildingsResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int countByExample(BuildingsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int deleteByExample(BuildingsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int insert(BuildingsResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int insertSelective(BuildingsResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    List<BuildingsResource> selectByExampleWithBLOBs(BuildingsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    List<BuildingsResource> selectByExample(BuildingsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    BuildingsResource selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int updateByExampleSelective(@Param("record") BuildingsResource record, @Param("example") BuildingsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") BuildingsResource record, @Param("example") BuildingsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int updateByExample(@Param("record") BuildingsResource record, @Param("example") BuildingsResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int updateByPrimaryKeySelective(BuildingsResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(BuildingsResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_building_resource
     *
     * @mbggenerated Wed Jan 06 17:12:02 CST 2016
     */
    int updateByPrimaryKey(BuildingsResource record);
}