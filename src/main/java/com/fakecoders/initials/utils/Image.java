package com.fakecoders.initials.utils;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class Image extends BaseEntity{
	
	
	@Id
	private Integer id;
	private String name;

}
