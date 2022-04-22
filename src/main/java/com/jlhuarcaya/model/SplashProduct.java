package com.jlhuarcaya.model;

import java.util.Date;
import java.util.List;

public class SplashProduct {

  private String id;
  private Date created_at;
  private Date updated_at;
  private Date promoted_at;
  private Integer width;
  private Integer height;
  private String color;
  private String blur_hash;
  private String description;
  private String alt_description;
  private Urls urls;
  private Links links;
  private List<String> categories;
  private Integer likes;
  private Boolean liked_by_user;
  private List<String> current_user_collection;
  private String sponsorship;
  private TopicSubmissions topic_submissions;
  private User user;
  private List<Tag> tags;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public Date getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }

  public Date getPromoted_at() {
    return promoted_at;
  }

  public void setPromoted_at(Date promoted_at) {
    this.promoted_at = promoted_at;
  }

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBlur_hash() {
    return blur_hash;
  }

  public void setBlur_hash(String blur_hash) {
    this.blur_hash = blur_hash;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAlt_description() {
    return alt_description;
  }

  public void setAlt_description(String alt_description) {
    this.alt_description = alt_description;
  }

  public Urls getUrls() {
    return urls;
  }

  public void setUrls(Urls urls) {
    this.urls = urls;
  }

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public Integer getLikes() {
    return likes;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }

  public Boolean getLiked_by_user() {
    return liked_by_user;
  }

  public void setLiked_by_user(Boolean liked_by_user) {
    this.liked_by_user = liked_by_user;
  }

  public List<String> getCurrent_user_collection() {
    return current_user_collection;
  }

  public void setCurrent_user_collection(List<String> current_user_collection) {
    this.current_user_collection = current_user_collection;
  }

  public String getSponsorship() {
    return sponsorship;
  }

  public void setSponsorship(String sponsorship) {
    this.sponsorship = sponsorship;
  }

  public TopicSubmissions getTopic_submissions() {
    return topic_submissions;
  }

  public void setTopic_submissions(TopicSubmissions topic_submissions) {
    this.topic_submissions = topic_submissions;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


}
