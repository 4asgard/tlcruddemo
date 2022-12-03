package com.example.tlcruddemo.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/info")
    public String getInfo(){
        System.out.println("Użytkownik próbuje pobrać infomacje o aplikacji");
        return "infoPage";
    }

    @GetMapping("/list")
    public String getListOfUsers(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User(1l));
        users.add(new User(1l));
        users.add(new User(3l, "agnieszka", "agnieszka@agnieszka.pl", true));

        model.addAttribute("users", users);
        System.out.println(users);

        return "usersList";
    }

}
