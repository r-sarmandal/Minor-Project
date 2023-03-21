package com.safe_and_found.controller;

import com.safe_and_found.entity.KeyFoundPost;
import com.safe_and_found.entity.LostPost;
import com.safe_and_found.repository.KeyFoundPostRepository;
import com.safe_and_found.repository.LostPostRepository;
import com.safe_and_found.services.KeyFoundPostService;
import com.safe_and_found.services.LostPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lostpost")
@CrossOrigin("*")
public class LostPostController {

    @Autowired
    private LostPostService lostPostService;

    @Autowired
    private LostPostRepository lostPostRepository;

    @PostMapping("/save")
    public LostPost createPost(@RequestBody LostPost post) throws Exception {
        return this.lostPostService.createPost(post);
    }


    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable("id") Long id)
    {
        this.lostPostService.deletePost(id);
    }

    @GetMapping("/all-posts")
    public List<LostPost> getAllPosts()
    {
        return lostPostRepository.findAll();
    }

    @GetMapping("/{query}")
    public List<LostPost> getSpecificPosts(@PathVariable("query") String query)
    {
        return this.lostPostService.getPost(query);
    }

}
