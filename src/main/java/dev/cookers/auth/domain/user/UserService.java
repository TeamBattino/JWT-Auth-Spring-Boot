package dev.cookers.auth.domain.user;

import dev.cookers.auth.core.generic.AbstractService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService, AbstractService<User> {
  User register(User user);

  User registerUser(User user);
}
