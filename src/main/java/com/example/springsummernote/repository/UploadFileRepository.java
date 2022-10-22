package com.example.springsummernote.repository;

import com.example.springsummernote.model.UploadFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UploadFileRepository extends JpaRepository<UploadFile, Long> {

}
