package com.example.library_api.repository;

import com.example.library_api.model.Book;
import com.example.library_api.model.Lend;
import com.example.library_api.model.LendStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LendRepository extends JpaRepository<Lend, Long> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
