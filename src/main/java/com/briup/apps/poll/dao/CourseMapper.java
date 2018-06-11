package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.bean.CourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    long countByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    int deleteByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    int insert(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    int insertSelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    List<Course> selectByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    Course selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_course
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    int updateByPrimaryKey(Course record);
}