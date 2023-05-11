package springlambdaexample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springlambdaexample.model.User;

import java.util.List;

@RestController
public class ProfileController {

    @GetMapping("/")
    public String getUser() {
        return "Hello good eveing.";
    }
}