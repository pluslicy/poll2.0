package com.briup.apps.poll.bean;

public class GradeCourse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_grade_course.id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_grade_course.course_id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    private Long courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_grade_course.grade_id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    private Long gradeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_grade_course.id
     *
     * @return the value of poll_grade_course.id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_grade_course.id
     *
     * @param id the value for poll_grade_course.id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_grade_course.course_id
     *
     * @return the value of poll_grade_course.course_id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_grade_course.course_id
     *
     * @param courseId the value for poll_grade_course.course_id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_grade_course.grade_id
     *
     * @return the value of poll_grade_course.grade_id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    public Long getGradeId() {
        return gradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_grade_course.grade_id
     *
     * @param gradeId the value for poll_grade_course.grade_id
     *
     * @mbg.generated Sun Jun 10 23:12:26 CST 2018
     */
    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }
}