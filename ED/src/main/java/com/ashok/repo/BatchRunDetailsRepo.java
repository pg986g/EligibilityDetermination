package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.entity.BATCH_RUN_DETAILS;

public interface BatchRunDetailsRepo extends JpaRepository<BATCH_RUN_DETAILS, Serializable>{

}
