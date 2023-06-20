package com.colinapp.user.Entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    public String UserId;
    public String UserName;

    public String PhoneNo;
}
