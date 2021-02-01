package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.entity.ED_ELIGIBILITY_DETAILS;
@Repository
public interface EDEligibilityRepo extends JpaRepository<ED_ELIGIBILITY_DETAILS, Serializable> {

}
