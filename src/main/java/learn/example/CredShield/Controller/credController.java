package learn.example.CredShield.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class credController {


    @GetMapping("/Hello")
    public String HappyPath(credController credController){
        return "Welcome";
    }
}
