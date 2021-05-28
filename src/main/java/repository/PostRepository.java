package repository;

import model.Post;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Stub
public class PostRepository {
    private AtomicInteger id = new AtomicInteger(1);
    private Map<Integer, Post> map = new ConcurrentHashMap<>();

    public List<Post> all() {
        return Collections.emptyList();
    }

    public Optional<Post> getById(Integer id) {
        return Optional.ofNullable(map.get(id));
    }

    public Post save(Post post) {
        int newId = id.incrementAndGet();
        map.put(newId, post);
        return post;
    }

    public void removeById(Integer id) {
        map.remove(id);
    }
}