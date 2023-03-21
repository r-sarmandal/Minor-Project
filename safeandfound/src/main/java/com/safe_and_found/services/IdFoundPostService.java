package com.safe_and_found.services;

import com.safe_and_found.entity.FoundPost;
import com.safe_and_found.entity.IdFoundPost;

import java.util.List;

public interface IdFoundPostService {
    public IdFoundPost createPost(IdFoundPost post) throws Exception;

    public List<IdFoundPost> getPost(String query);

    void deletePost(Long id);
}
