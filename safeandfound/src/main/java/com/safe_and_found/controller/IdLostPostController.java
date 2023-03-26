package com.safe_and_found.controller;

import com.safe_and_found.entity.IdLostPost;
import com.safe_and_found.entity.KeyLostPost;
import com.safe_and_found.repository.IdLostPostRepository;
import com.safe_and_found.repository.KeyLostPostRepository;
import com.safe_and_found.services.IdLostPostService;
import com.safe_and_found.services.KeyLostPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idlostpost")
@CrossOrigin("*")
public class IdLostPostController {
    @Autowired
    private IdLostPostService idLostPostService;

    @Autowired
    private IdLostPostRepository idLostPostRepository;

    @PostMapping("/save")
    public IdLostPost createPost(@RequestBody IdLostPost post) throws Exception {
        return this.idLostPostService.createPost(post);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable("id") Long id)
    {
        this.idLostPostService.deletePost(id);
    }

    @GetMapping("/all-posts")
    public List<IdLostPost> getAllPosts()
    {
        return idLostPostRepository.findAll();
    }

    @GetMapping("/{query}")
    public List<IdLostPost> getSpecificPosts(@PathVariable("query") String query)
    {
        return this.idLostPostService.getPost(query);
    }
}
