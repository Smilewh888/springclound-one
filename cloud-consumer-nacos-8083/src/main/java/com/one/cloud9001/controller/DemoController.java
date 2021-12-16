package com.one.cloud9001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Value("${service-url.nacos-user-service}")
    private String nacosurl;

    private String uri ="/one";

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/nacos")
    public String getDiscoveryServer(){
        String forObject = restTemplate.getForObject(nacosurl + uri, String.class);
        return forObject;
    }



}
