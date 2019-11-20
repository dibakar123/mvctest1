
package com.service;

import java.util.List;

import com.model.User;

public interface UserService {

  boolean register(User user);

  User validateUser(User user);
  
  public List<User> getUsers();
  
  public User getMe(String uid);
}
