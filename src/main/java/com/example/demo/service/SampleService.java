package com.example.demo.service;

import org.springframework.stereotype.Service;

// サービスクラス
@Service
public class SampleService {

    public void hello(String name){
        System.out.println(name + "さんこんにちは!!!");
    }

}
