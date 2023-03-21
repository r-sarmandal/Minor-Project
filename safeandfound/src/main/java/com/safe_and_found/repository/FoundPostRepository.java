package com.safe_and_found.repository;

import com.safe_and_found.entity.FoundPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoundPostRepository extends JpaRepository<FoundPost,Long> {
    FoundPost findByid(Long id);
}
