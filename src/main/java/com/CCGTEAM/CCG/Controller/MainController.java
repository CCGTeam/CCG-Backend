package com.CCGTEAM.CCG.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Hello()
    {
        return "hello";
    }
}
