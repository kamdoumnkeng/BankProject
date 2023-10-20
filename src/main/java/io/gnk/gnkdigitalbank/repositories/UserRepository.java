package io.gnk.gnkdigitalbank.repositories;

import io.gnk.gnkdigitalbank.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);

    User findByAccountNumber(String accountNumber);

    boolean existsByAccountNumber(String accountNumber);
}
