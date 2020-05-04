package com.ahmed.lastcheack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = {"/", "/index.html"}, method= RequestMethod.GET)
    public String index()
    {
        return "index";
    }
}

