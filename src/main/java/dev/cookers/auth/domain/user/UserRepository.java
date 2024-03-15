package dev.cookers.auth.domain.user;

import dev.cookers.auth.core.generic.AbstractRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends AbstractRepository<User> {
  Optional<User> findByEmail(String email);
}

