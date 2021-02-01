package com.ashok.entity;

import javax.persistence.Entity;
import javax.print.DocFlavor.BYTE_ARRAY;

import lombok.Data;

@Data
@Entity
public class CO_PDFS {

	private Integer coPdfId;
	
	private String planStatus;
	
	private String caseNumber;
	
	private BYTE_ARRAY pdfDocument;
	
	private String planName;
	
	
}
