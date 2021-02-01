package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.entity.CO_PDFS;
@Repository
public interface CoPdfsRepo  extends JpaRepository<CO_PDFS, Serializable>{

}
