package com.ashok.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BATCH_SUMMARY {
	
	
	@Id
	private Integer summaryId;
	
	private String batchName;
	
	private Integer failureTriggerCount;
	
	private Integer successTriggerCount;
	
	private Integer totalTriggerProcessed;
	
	
	

}
