package com.ashok.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class BATCH_SUMMARY {
	
	
	private Integer summaryId;
	
	private String batchName;
	
	private Integer failureTriggerCount;
	
	private Integer successTriggerCount;
	
	private Integer totalTriggerProcessed;
	
	
	

}
