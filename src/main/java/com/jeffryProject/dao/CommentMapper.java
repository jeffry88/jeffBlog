package com.jeffryProject.dao;

import com.jeffryProject.entity.Comment;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jeff_comment
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    int deleteByPrimaryKey(Integer comid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jeff_comment
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jeff_comment
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jeff_comment
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    Comment selectByPrimaryKey(Integer comid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jeff_comment
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jeff_comment
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    int updateByPrimaryKey(Comment record);
}