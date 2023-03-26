package com.safe_and_found.repository;

import com.safe_and_found.entity.IdLostPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IdLostPostRepository extends JpaRepository<IdLostPost, Long> {
    IdLostPost findByid(Long id);
}
