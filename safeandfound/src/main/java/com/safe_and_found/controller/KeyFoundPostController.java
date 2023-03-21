package com.safe_and_found.controller;

import com.safe_and_found.entity.IdFoundPost;
import com.safe_and_found.entity.KeyFoundPost;
import com.safe_and_found.repository.IdFoundPostRepository;
import com.safe_and_found.repository.KeyFoundPostRepository;
import com.safe_and_found.services.IdFoundPostService;
import com.safe_and_found.services.KeyFoundPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/keyfoundpost")
@CrossOrigin("*")
public class KeyFoundPostController {

    @Autowired
    private KeyFoundPostService keyFoundPostService;

    @Autowired
    private KeyFoundPostRepository keyFoundPostRepository;

    @PostMapping("/save")
    public KeyFoundPost createPost(@RequestBody KeyFoundPost post) throws Exception {
        return this.keyFoundPostService.createPost(post);
    }


    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable("id") Long id)
    {
        this.keyFoundPostService.deletePost(id);
    }

    @GetMapping("/all-posts")
    public List<KeyFoundPost> getAllPosts()
    {
        return keyFoundPostRepository.findAll();
    }

    @GetMapping("/{query}")
    public List<KeyFoundPost> getSpecificPosts(@PathVariable("query") String query)
    {
        return this.keyFoundPostService.getPost(query);
    }

}
