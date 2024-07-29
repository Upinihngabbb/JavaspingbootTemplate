package template.javalogin.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import template.javalogin.Model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);  // Menambahkan method ini

    void deleteById(Integer id);

    Optional<User> findById(Integer id);

}