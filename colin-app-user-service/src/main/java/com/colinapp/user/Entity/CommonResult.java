package com.colinapp.user.Entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult <T> implements Serializable {
    public int code;
    public String msg;
    public T data;
    public  CommonResult(int _code,String _msg,T _data){
        code =_code;
        msg = _msg;
        data = _data;
    }
}
