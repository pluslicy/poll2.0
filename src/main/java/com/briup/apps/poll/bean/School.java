package com.briup.apps.poll.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="学校")
public class School {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_school.id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
	@ApiModelProperty(value="编号")
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_school.name
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
	@ApiModelProperty(value="学校名称")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_school.logo
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
	@ApiModelProperty(value="学校logo地址")
    private String logo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_school.description
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
	@ApiModelProperty(value="描述信息")
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_school.address
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
	@ApiModelProperty(value="学校地址")
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_school.telephone
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
	@ApiModelProperty(value="学校电话")
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_school.copyright
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    @ApiModelProperty(value="学校版权信息")
    private String copyright;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_school.id
     *
     * @return the value of poll_school.id
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_school.id
     *
     * @param id the value for poll_school.id
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_school.name
     *
     * @return the value of poll_school.name
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_school.name
     *
     * @param name the value for poll_school.name
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_school.logo
     *
     * @return the value of poll_school.logo
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public String getLogo() {
        return logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_school.logo
     *
     * @param logo the value for poll_school.logo
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_school.description
     *
     * @return the value of poll_school.description
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_school.description
     *
     * @param description the value for poll_school.description
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_school.address
     *
     * @return the value of poll_school.address
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_school.address
     *
     * @param address the value for poll_school.address
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_school.telephone
     *
     * @return the value of poll_school.telephone
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_school.telephone
     *
     * @param telephone the value for poll_school.telephone
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_school.copyright
     *
     * @return the value of poll_school.copyright
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_school.copyright
     *
     * @param copyright the value for poll_school.copyright
     *
     * @mbg.generated Mon Jun 11 11:28:36 CST 2018
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }
}