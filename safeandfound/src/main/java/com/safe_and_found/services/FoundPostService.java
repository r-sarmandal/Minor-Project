package com.safe_and_found.services;


import com.safe_and_found.entity.FoundPost;
import com.safe_and_found.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FoundPostService {
    public FoundPost createPost(FoundPost post) throws Exception;

    public List<FoundPost> getPost(String query);

    void deletePost(Long id);
}
