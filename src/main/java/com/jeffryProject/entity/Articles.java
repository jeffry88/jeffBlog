package com.jeffryProject.entity;

import java.util.Date;

public class Articles {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.article_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.title
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.uid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.summary
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String summary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.pub_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Date pubTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.pageviews
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer pageviews;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.comid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer comid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.file_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.tags
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.category_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jeff_article.article_detail
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    private String articleDetail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.article_id
     *
     * @return the value of jeff_article.article_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.article_id
     *
     * @param articleId the value for jeff_article.article_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.title
     *
     * @return the value of jeff_article.title
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.title
     *
     * @param title the value for jeff_article.title
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.uid
     *
     * @return the value of jeff_article.uid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.uid
     *
     * @param uid the value for jeff_article.uid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.summary
     *
     * @return the value of jeff_article.summary
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.summary
     *
     * @param summary the value for jeff_article.summary
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.pub_time
     *
     * @return the value of jeff_article.pub_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Date getPubTime() {
        return pubTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.pub_time
     *
     * @param pubTime the value for jeff_article.pub_time
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.pageviews
     *
     * @return the value of jeff_article.pageviews
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getPageviews() {
        return pageviews;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.pageviews
     *
     * @param pageviews the value for jeff_article.pageviews
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setPageviews(Integer pageviews) {
        this.pageviews = pageviews;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.comid
     *
     * @return the value of jeff_article.comid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getComid() {
        return comid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.comid
     *
     * @param comid the value for jeff_article.comid
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setComid(Integer comid) {
        this.comid = comid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.file_id
     *
     * @return the value of jeff_article.file_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.file_id
     *
     * @param fileId the value for jeff_article.file_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.tags
     *
     * @return the value of jeff_article.tags
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.tags
     *
     * @param tags the value for jeff_article.tags
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.category_id
     *
     * @return the value of jeff_article.category_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.category_id
     *
     * @param categoryId the value for jeff_article.category_id
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jeff_article.article_detail
     *
     * @return the value of jeff_article.article_detail
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public String getArticleDetail() {
        return articleDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jeff_article.article_detail
     *
     * @param articleDetail the value for jeff_article.article_detail
     *
     * @mbg.generated Mon Dec 16 14:36:44 CST 2019
     */
    public void setArticleDetail(String articleDetail) {
        this.articleDetail = articleDetail == null ? null : articleDetail.trim();
    }
}