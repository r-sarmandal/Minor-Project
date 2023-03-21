package com.safe_and_found.services;

import com.safe_and_found.entity.FoundPost;
import com.safe_and_found.entity.LostPost;

import java.util.List;

public interface LostPostService {
    public LostPost createPost(LostPost post) throws Exception;

    public List<LostPost> getPost(String query);

    void deletePost(Long id);
}
