package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.Option;
import com.briup.apps.poll.bean.OptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    long countByExample(OptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    int deleteByExample(OptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    int insert(Option record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    int insertSelective(Option record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    List<Option> selectByExample(OptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    Option selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") Option record, @Param("example") OptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    int updateByExample(@Param("record") Option record, @Param("example") OptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    int updateByPrimaryKeySelective(Option record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_option
     *
     * @mbg.generated Tue Jun 12 10:15:00 CST 2018
     */
    int updateByPrimaryKey(Option record);
}