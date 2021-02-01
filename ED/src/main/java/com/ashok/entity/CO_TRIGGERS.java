package com.ashok.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class CO_TRIGGERS {
	
	
	private Integer triggerId;
	
	private String caseNumber;
	
	private String createDate;
	
	private String triggerStatus;
	
	private String updateDate;
	
	
	
	

}
