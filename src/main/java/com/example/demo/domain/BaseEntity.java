package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@SuppressWarnings("serial")
@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable{

	private long id;
	
}
