package com.safe_and_found.services;

import com.safe_and_found.entity.IdLostPost;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface IdLostPostService {
    public IdLostPost createPost(IdLostPost post) throws Exception;

    public List<IdLostPost> getPost(String query);

    void deletePost(Long id);
}
