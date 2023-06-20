package com.colinapp.user.Controller;

import com.colinapp.user.Entity.CommonResult;
import com.colinapp.user.Entity.User;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("create")
    public CommonResult<User> create(@RequestBody User user){
        return new CommonResult<User>(200,"ok",null);
    }

    @GetMapping("/{UserId}")
    public CommonResult<User> getUser(@PathVariable String UserId){
        User user = new User();
        user.setUserId("888888");
        user.setPhoneNo("15889465811");
        user.setUserName("colin");
        return new CommonResult<User>(200,"ok",user);
    }
}
