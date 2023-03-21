package com.safe_and_found.controller;

import com.safe_and_found.entity.FoundPost;
import com.safe_and_found.repository.FoundPostRepository;
import com.safe_and_found.services.FoundPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foundpost")
@CrossOrigin("*")
public class FoundPostController {
    @Autowired
    private FoundPostService foundPostService;

    @Autowired
    private FoundPostRepository foundPostRepository;

    @PostMapping("/save")
    public FoundPost createPost(@RequestBody FoundPost post) throws Exception {
        return this.foundPostService.createPost(post);
    }


    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable("id") Long id)
    {
        this.foundPostService.deletePost(id);
    }

    @GetMapping("/all-posts")
    public List<FoundPost> getAllPosts()
    {
        return foundPostRepository.findAll();
    }

    @GetMapping("/{query}")
    public List<FoundPost> getSpecificPosts(@PathVariable("query") String query)
    {
        return this.foundPostService.getPost(query);
    }

}
