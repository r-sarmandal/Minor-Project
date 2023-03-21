package com.safe_and_found.repository;

import com.safe_and_found.entity.IdFoundPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdFoundPostRepository extends JpaRepository<IdFoundPost,Long>{
    IdFoundPost findByid(Long id);
}
