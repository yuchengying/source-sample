package com.zhuguang.jack.service;

import com.zhuguang.jack.springtest.MyAnnotation;

@MyAnnotation
public class MyService {
    private String name ="jack";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
