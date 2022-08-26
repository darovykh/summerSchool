package buem.darovykh.summerschool.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/v1/admin/")
@Controller
@CrossOrigin
public class AdminUIController {
    @GetMapping("")
    public String showAdmin() {
        return "admin";
    }
}
