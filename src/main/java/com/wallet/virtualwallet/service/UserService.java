package com.wallet.virtualwallet.service;

import com.wallet.virtualwallet.model.User;
import com.wallet.virtualwallet.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User addUser(User user) {
    return userRepository.save(user);
  }

}
