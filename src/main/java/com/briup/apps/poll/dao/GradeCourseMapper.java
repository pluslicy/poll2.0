package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.GradeCourse;
import com.briup.apps.poll.bean.GradeCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    long countByExample(GradeCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    int deleteByExample(GradeCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    int insert(GradeCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    int insertSelective(GradeCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    List<GradeCourse> selectByExample(GradeCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    GradeCourse selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    int updateByExampleSelective(@Param("record") GradeCourse record, @Param("example") GradeCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    int updateByExample(@Param("record") GradeCourse record, @Param("example") GradeCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    int updateByPrimaryKeySelective(GradeCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_grade_course
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    int updateByPrimaryKey(GradeCourse record);
}