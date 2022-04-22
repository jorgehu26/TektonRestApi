package com.jlhuarcaya.model;

import java.util.Date;

public class User {

  private String id;
  private Date updated_at;
  private String username;
  private String name;
  private String first_name;
  private String last_name;
  private String twitter_username;
  private String portfolio_url;
  private String bio;
  private String location;
  private Links links;
  private ProfileImage profile_image;
  private String instagram_username;
  private Integer total_collections;
  private Integer total_likes;
  private Integer total_photos;
  private Boolean accepted_tos;
  private Boolean for_hire;
  private Social social;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getTwitter_username() {
    return twitter_username;
  }

  public void setTwitter_username(String twitter_username) {
    this.twitter_username = twitter_username;
  }

  public String getPortfolio_url() {
    return portfolio_url;
  }

  public void setPortfolio_url(String portfolio_url) {
    this.portfolio_url = portfolio_url;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public ProfileImage getProfile_image() {
    return profile_image;
  }

  public void setProfile_image(ProfileImage profile_image) {
    this.profile_image = profile_image;
  }

  public String getInstagram_username() {
    return instagram_username;
  }

  public void setInstagram_username(String instagram_username) {
    this.instagram_username = instagram_username;
  }

  public Integer getTotal_collections() {
    return total_collections;
  }

  public void setTotal_collections(Integer total_collections) {
    this.total_collections = total_collections;
  }

  public Integer getTotal_likes() {
    return total_likes;
  }

  public void setTotal_likes(Integer total_likes) {
    this.total_likes = total_likes;
  }

  public Integer getTotal_photos() {
    return total_photos;
  }

  public void setTotal_photos(Integer total_photos) {
    this.total_photos = total_photos;
  }

  public Boolean getAccepted_tos() {
    return accepted_tos;
  }

  public void setAccepted_tos(Boolean accepted_tos) {
    this.accepted_tos = accepted_tos;
  }

  public Boolean getFor_hire() {
    return for_hire;
  }

  public void setFor_hire(Boolean for_hire) {
    this.for_hire = for_hire;
  }

  public Social getSocial() {
    return social;
  }

  public void setSocial(Social social) {
    this.social = social;
  }

}
