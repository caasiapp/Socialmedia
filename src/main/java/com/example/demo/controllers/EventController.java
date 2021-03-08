package com.example.demo.controllers;

import com.example.demo.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {

    ArrayList<Post> data = new ArrayList<>();
    int view = 0;

    @GetMapping(value = "/post")
    public String post() {
        return "event-form.html";
    }

    @PostMapping(value = "/submit")
    public String redirectToDashboard(Model model, @RequestParam("titel") String titel, @RequestParam("content") String content, @RequestParam("date") String date, @RequestParam("formalname") String formalname) {
        Post post = new Post(titel, content, date, formalname);
        model.addAttribute("sucesspost", post);
        data.add(post);
        return "redirect:/sucess";
    }

    @GetMapping(value = "/sucess")
    public String sucess(Model model) {

        model.addAttribute("titel", data.get(view).getTitel());
        model.addAttribute("content", data.get(view).getContent());
        model.addAttribute("date", data.get(view).getDate());
        model.addAttribute("formalname", data.get(view).getFormalname());

        view ++;
        return "sucess.html";
    }

    @GetMapping(value = "/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("posts", data);

        return "dashboard.html";
    }


}
