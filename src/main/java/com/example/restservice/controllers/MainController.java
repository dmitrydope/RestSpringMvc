package com.example.restservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
//        return "redirect:/fun/";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About us");
        return "about";
    }

    @GetMapping("/spring")
    public String springNews(Model model) {
        model.addAttribute("title", "About spring news");
        return "spring";
    }

    @GetMapping("/signin")
    public String signIn(Model model) {
        model.addAttribute("title", "signIn");
        return "signin";
    }

    @GetMapping("/fun")
    public String fun(Model model) {
        model.addAttribute("title", "fun");
        return "fun";
    }

    @GetMapping("/cont")
    public String contactMe(Model model) {
        model.addAttribute("title", "contact");
        return "cont";
    }

    @GetMapping("/blog-detail")
    public String blogDetail(Model model) {
        model.addAttribute("title", "blog-detail");
        return "blog-detail";
    }

//    @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }

//    @RequestMapping("/index")
//    public ModelAndView index () {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }

}
