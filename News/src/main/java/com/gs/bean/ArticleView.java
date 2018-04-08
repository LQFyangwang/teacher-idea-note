package com.gs.bean;

import java.util.Date;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleView {

    /**
     * 如果第三张关联表没有额外的字段,则使用原先的方法
     * Stu
     *  Set<Teacher>
     * Teacher
     *  Set<Stu>
     *
     * 如果第三张关联表中还有额外的字段，先要添加一个与第三张表对应的JavaBean
     * 把多对多的关系拆分成两个一对多的关系
     */
    private String id;
    private Date viewTime;

    private User user;
    private Article article;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getViewTime() {
        return viewTime;
    }

    public void setViewTime(Date viewTime) {
        this.viewTime = viewTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "ArticleView{" +
                "id='" + id + '\'' +
                ", viewTime=" + viewTime +
                '}';
    }
}
