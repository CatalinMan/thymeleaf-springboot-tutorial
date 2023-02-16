package net.javaguides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/if-unless")
    public String users(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("Marius", "marius10@gmail.com", "ADMIN"));
        users.add(new User("Cristian", "cris@gmail.com", "USER"));
        users.add(new User("Mirel", "mirel@gmail.com", "USER"));
        model.addAttribute("users", users); //"users" attributeName is used in the view to pass the Object users
        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchExample(Model model){
        User user = new User("Cosmin", "cosmin2@gmail.com", "ADMIN");
        model.addAttribute("user", user);
        return "switch-case";
    }
}
