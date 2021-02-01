package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.entity.CO_TRIGGERS;
@Repository
public interface COTriggersRepo extends JpaRepository<CO_TRIGGERS, Serializable>{

}
