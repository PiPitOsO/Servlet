package repository;

import model.Post;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class PostRepositoryStubImpl implements PostRepository {
    private AtomicInteger id = new AtomicInteger(0);
    private Map<Integer, Post> map = new ConcurrentHashMap<>();

    public List<Post> all() {
        return Collections.emptyList();
    }

    public Optional<Post> getById(Integer id) {
        return Optional.ofNullable(map.get(id));
    }

    public Post save(Post post) {
        int idd = (int) post.getId();
        if (idd == 0) {
            // добавим новый
            int newId = id.incrementAndGet();
            post.setId(newId); // присвоим id
        }
        map.put((int) post.getId(), post);
        return post;
    }

    public void removeById(Integer id) {
        map.remove(id);
    }
}