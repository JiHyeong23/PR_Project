package com.example.PR.comment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment findByNameAndPassword(String name, String password);
    Page<Comment> findAll(Pageable pageable);
}
