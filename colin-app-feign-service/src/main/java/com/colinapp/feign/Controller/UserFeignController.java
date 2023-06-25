package com.colinapp.feign.Controller;

import com.colinapp.feign.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserFeignController {

    @Autowired
    private UserService userService;

    @GetMapping("/{UserId}")
    public String getUser(@PathVariable String UserId){
       return userService.getUser(UserId);
    }
}
