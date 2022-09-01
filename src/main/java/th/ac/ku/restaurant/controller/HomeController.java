package th.ac.ku.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    //ต้องคืนค่าเป็น string เสมอ จะคืนค่า home html ผ่าน model
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sawaddee");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home";
    }
}
