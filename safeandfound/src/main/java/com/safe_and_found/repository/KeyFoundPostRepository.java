package com.safe_and_found.repository;

import com.safe_and_found.entity.IdFoundPost;
import com.safe_and_found.entity.KeyFoundPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyFoundPostRepository extends JpaRepository<KeyFoundPost, Long> {
    KeyFoundPost findByid(Long id);
}
