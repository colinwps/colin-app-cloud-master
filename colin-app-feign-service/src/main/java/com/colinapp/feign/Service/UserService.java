package com.colinapp.feign.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "colin-user-service")
public interface UserService {

    @GetMapping("/user/{UserId}")
    String getUser(@PathVariable(value = "UserId") String UserId);
}
