package service;

import exception.NotFoundException;
import model.Post;
import repository.PostRepositoryStubImpl;

import java.util.List;

public class PostService {
    private final PostRepositoryStubImpl repository;

    public PostService(PostRepositoryStubImpl repository) {
        this.repository = repository;
    }

    public List<Post> all() {
        return repository.all();
    }

    public Post getById(Integer id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public void removeById(Integer id) {
        repository.removeById(id);
    }
}