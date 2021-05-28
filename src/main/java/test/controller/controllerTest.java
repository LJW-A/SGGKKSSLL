package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controllerTest {


    @GetMapping("/testA")
    @ResponseBody
    public String testA(){

        System.out.println("增加一句话");
        return "12345678";
    }
}
