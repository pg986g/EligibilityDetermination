package com.ashok.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CO_TRIGGERS {
	
	
	@Id
	private Integer triggerId;
	
	private String caseNumber;
	
	private String createDate;
	
	private String triggerStatus;
	
	private String updateDate;
	
	
	
	

}
