package com.safe_and_found.repository;

import com.safe_and_found.entity.KeyFoundPost;
import com.safe_and_found.entity.LostPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LostPostRepository extends JpaRepository<LostPost, Long> {
    LostPost findByid(Long id);
}
