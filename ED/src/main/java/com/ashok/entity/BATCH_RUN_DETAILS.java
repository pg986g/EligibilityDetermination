package com.ashok.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class BATCH_RUN_DETAILS {

	private Integer batchRunSequence;
	
	private String batchName;
	
	private String batchRunStatus;
	
	private String batchEndDate;
	
	private Integer instanceNumber;
	
	private String startDate;
}
