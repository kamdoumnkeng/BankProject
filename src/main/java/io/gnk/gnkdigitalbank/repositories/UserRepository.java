package io.gnk.gnkdigitalbank.repositories;

import io.gnk.gnkdigitalbank.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);

    User findByAccountNumber(String accountNumber);

    boolean existsByAccountNumber(String accountNumber);
}
