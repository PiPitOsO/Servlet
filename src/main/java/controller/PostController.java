package controller;

import exception.NotFoundException;
import model.Post;
import service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping
    public List<Post> all() {
        return service.all();
    }

    @GetMapping("/{id}")
    public Post getById(@PathVariable Integer id) throws NotFoundException {
        return service.getById(id);
    }

    @PostMapping
    public Post save(@RequestBody Post post) throws NotFoundException {
        return service.save(post);
    }

    @DeleteMapping("/{id}")
    public void removeById(Integer id) {
        service.removeById(id);
    }
}