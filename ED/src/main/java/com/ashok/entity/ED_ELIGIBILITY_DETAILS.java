package com.ashok.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ED_ELIGIBILITY_DETAILS {
	
	@Id
	private Integer traceId;
	
	private Double benefitAmount;
	
	private String caseNumber;
	
	private String createDate;
	
	private String denialReason;
	
	private String planEndDate;
	
	private String planName;
	
	private String planStartDate;
	
	private String planStatus;
	
	private String updateDate;
	

}
