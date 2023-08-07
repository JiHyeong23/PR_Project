package com.example.PR.aboutMe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MyController {
    private final MyService myservice;
    @Autowired
    public MyController(MyService myservice) {
        this.myservice = myservice;
    }

    @GetMapping("introduce")
    public String getMyInfo(Model model) {
        Long id = 1L;
        IntroduceDto myInfo = myservice.getMyInfo(id);
        model.addAttribute("name", myInfo.getName());
        model.addAttribute("dob", myInfo.getDOB());
        model.addAttribute("loe", myInfo.getLOE());
        model.addAttribute("email",myInfo.getEmail());
        model.addAttribute("phone", myInfo.getPhone());
        return "info";//ResponseEntity.ok().body(myInfo);
    }
}
