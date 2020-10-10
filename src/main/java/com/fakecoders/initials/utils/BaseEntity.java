package com.fakecoders.initials.utils;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public abstract class BaseEntity {
 
	 @Column(name = "creator_id", updatable = false)
	 private String creatorId;
	 
	 @Column(name = "modifier_id")
	 private String modifierId;
	
 @Column(name = "created_by", updatable = false)
 private String createdBy;

 @CreationTimestamp
 @Column(name = "created_time", updatable = false)
 private Timestamp createdTime;

 @Column(name = "modified_by")
 private String modifiedBy;

 @UpdateTimestamp
 @Column(name = "modified_time")
 private Timestamp modifiedTime;

 public String getCreatedBy() {
  return createdBy;
 }

 public void setCreatedBy(String createdBy) {
  this.createdBy = createdBy;
 }

 public Timestamp getCreatedTime() {
  return createdTime;
 }

 public void setCreatedTime(Timestamp createdTime) {
  this.createdTime = createdTime;
 }

public String getCreatorId() {
	return creatorId;
}

public void setCreatorId(String creatorId) {
	this.creatorId = creatorId;
}

public String getModifierId() {
	return modifierId;
}

public void setModifierId(String modifierId) {
	this.modifierId = modifierId;
}

public String getModifiedBy() {
	return modifiedBy;
}

public void setModifiedBy(String modifiedBy) {
	this.modifiedBy = modifiedBy;
}

public Timestamp getModifiedTime() {
	return modifiedTime;
}

public void setModifiedTime(Timestamp modifiedTime) {
	this.modifiedTime = modifiedTime;
}
}