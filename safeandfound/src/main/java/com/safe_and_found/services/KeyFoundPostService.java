package com.safe_and_found.services;

import com.safe_and_found.entity.IdFoundPost;
import com.safe_and_found.entity.KeyFoundPost;

import java.util.List;

public interface KeyFoundPostService {
    public KeyFoundPost createPost(KeyFoundPost post) throws Exception;

    public List<KeyFoundPost> getPost(String query);

    void deletePost(Long id);
}
