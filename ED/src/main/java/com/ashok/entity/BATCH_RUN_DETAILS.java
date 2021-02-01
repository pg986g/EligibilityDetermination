package com.ashok.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BATCH_RUN_DETAILS {

	@Id
	@GeneratedValue
	private Integer batchRunSequence;
	
	private String batchName;
	
	private String batchRunStatus;
	
	private String batchEndDate;
	
	private Integer instanceNumber;
	
	private String startDate;
}
