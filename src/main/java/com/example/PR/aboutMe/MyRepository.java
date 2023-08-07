package com.example.PR.aboutMe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<Me, Long> {
    Me findByid(Long id);
}
