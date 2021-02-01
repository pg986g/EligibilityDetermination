package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.entity.BATCH_SUMMARY;
@Repository
public interface BatchSummaryDetailsRepo extends JpaRepository<BATCH_SUMMARY, Serializable> {

}
