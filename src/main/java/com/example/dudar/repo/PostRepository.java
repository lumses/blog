package com.example.dudar.repo;

import com.example.dudar.models.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Posts, Long> {
}
