package com.safe_and_found.controller;

import com.safe_and_found.entity.KeyLostPost;
import com.safe_and_found.repository.KeyLostPostRepository;
import com.safe_and_found.services.KeyLostPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/keylostpost")
@CrossOrigin("*")
public class KeyLostPostController {
    @Autowired
    private KeyLostPostService keyLostPostService;

    @Autowired
    private KeyLostPostRepository keyLostPostRepository;

    @PostMapping("/save")
    public KeyLostPost createPost(@RequestBody KeyLostPost post) throws Exception {
        return this.keyLostPostService.createPost(post);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable("id") Long id)
    {
        this.keyLostPostService.deletePost(id);
    }

    @GetMapping("/all-posts")
    public List<KeyLostPost> getAllPosts()
    {
        return keyLostPostRepository.findAll();
    }

    @GetMapping("/{query}")
    public List<KeyLostPost> getSpecificPosts(@PathVariable("query") String query)
    {
        return this.keyLostPostService.getPost(query);
    }

}
