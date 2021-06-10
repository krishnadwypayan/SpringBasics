package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Krishna Kota on 10/06/21
 */
@Controller
public class MyController {

    public MyController() {
        System.out.println("Initialising controller");
    }

    @GetMapping("/hello")
    public ModelAndView greeting() {
        Map<String, String> values = new HashMap<>();
        values.put("name", "Krishna");
        ModelAndView modelAndView = new ModelAndView("greet", values);
        return modelAndView;
    }
}
