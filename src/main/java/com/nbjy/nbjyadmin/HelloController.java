package com.nbjy.nbjyadmin;

import com.nbjy.nbjyadmin.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say", method = RequestMethod.GET)
//    public  String say(@PathVariable("id") Integer id) {
    @GetMapping(value = "/say")
    public  String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        return "id:" + id;
//        return girlProperties.getCupSize();
//        return "index";
    }
 }
