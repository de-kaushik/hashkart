package com.userService.user.controller;

import com.userService.user.model.userDetails;
import com.userService.user.repository.userRepository;
import io.micrometer.core.ipc.http.HttpSender;
import io.micrometer.core.ipc.http.OkHttpSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class userController {

  @Autowired
  userRepository userrepository;

  @PostMapping(value = "/register")
  public  userDetails register(@RequestBody userDetails user){
      userDetails u =userrepository.save(user);
      return u;
  }
  @PostMapping(value = "/login")
  public  String  login(@RequestBody userDetails user){
      //hard coded
      if(user.getUserName().matches("deepesh") && user.getPassWord().matches("de123")){
          return "Login successful";
      }
      else
          return "Invalid username or password";
  }
}
