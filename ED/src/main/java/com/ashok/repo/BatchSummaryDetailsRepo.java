package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.entity.BATCH_SUMMARY;

public interface BatchSummaryDetailsRepo extends JpaRepository<BATCH_SUMMARY, Serializable> {

}
