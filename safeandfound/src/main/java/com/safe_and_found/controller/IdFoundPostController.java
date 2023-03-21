package com.safe_and_found.controller;


import com.safe_and_found.entity.IdFoundPost;
import com.safe_and_found.repository.IdFoundPostRepository;
import com.safe_and_found.services.IdFoundPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idfoundpost")
@CrossOrigin("*")
public class IdFoundPostController {
    @Autowired
    private IdFoundPostService idFoundPostService;

    @Autowired
    private IdFoundPostRepository idFoundPostRepository;

    @PostMapping("/save")
    public IdFoundPost createPost(@RequestBody IdFoundPost post) throws Exception {
        return this.idFoundPostService.createPost(post);
    }


    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable("id") Long id)
    {
        this.idFoundPostService.deletePost(id);
    }

    @GetMapping("/all-posts")
    public List<IdFoundPost> getAllPosts()
    {
        return idFoundPostRepository.findAll();
    }

    @GetMapping("/{query}")
    public List<IdFoundPost> getSpecificPosts(@PathVariable("query") String query)
    {
        return this.idFoundPostService.getPost(query);
    }

}
