package com.wallet.virtualwallet.controller;

import com.wallet.virtualwallet.model.User;
import com.wallet.virtualwallet.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("/user")
  public User addUser(User user) {
    return userService.addUser(user);
  }


}
