package com.safe_and_found.repository;

import com.safe_and_found.entity.KeyLostPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyLostPostRepository extends JpaRepository<KeyLostPost, Long> {
    KeyLostPost findByid(Long id);
}
