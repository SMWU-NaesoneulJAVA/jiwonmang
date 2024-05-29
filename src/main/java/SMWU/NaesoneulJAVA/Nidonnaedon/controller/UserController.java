package SMWU.NaesoneulJAVA.Nidonnaedon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/home")
    public String home(@AuthenticationPrincipal OAuth2User oauth2User) {
        System.out.println("User's Name: " + oauth2User.getAttribute("name"));
        return "home";
    }

    @GetMapping("/oauth2/callback/kakao")
    public String callback() {
        return "redirect:/home";
    }
}
