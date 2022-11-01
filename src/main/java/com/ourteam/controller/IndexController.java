package com.ourteam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RenQi
 * @Description:
 * @date 2022-11-01 11:05
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/ping")
    public String index(){
        return "helloworld";
    }

}  