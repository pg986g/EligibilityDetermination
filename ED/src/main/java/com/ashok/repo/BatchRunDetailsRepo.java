package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.entity.BATCH_RUN_DETAILS;
@Repository
public interface BatchRunDetailsRepo extends JpaRepository<BATCH_RUN_DETAILS, Serializable>{

}
