package com.safe_and_found.services;

import com.safe_and_found.entity.KeyLostPost;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface KeyLostPostService {

    public KeyLostPost createPost(KeyLostPost post) throws Exception;

    public List<KeyLostPost> getPost(String query);

    void deletePost(Long id);
}
