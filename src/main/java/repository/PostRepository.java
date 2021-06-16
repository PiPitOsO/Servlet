package repository;

import model.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    List<Post> all();

    Optional<Post> getById(Integer id);

    Post save(Post post);

    void removeById(Integer id);
}