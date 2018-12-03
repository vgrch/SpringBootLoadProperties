package az.lsim.Controller;

import az.lsim.ConfigurationProperties.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    JdbcUserDetailsManager userDetailsService;


    @GetMapping("/test")
    public @ResponseBody
    String getTest() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        return "Response:OK | " + name;
    }

    @GetMapping("/test1")
    public @ResponseBody
    String getTest1() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        //userDetailsService.createUser(User.withUsername("admin2").password(SecurityConfig.PWDBcrypt).roles("ADMIN","USER").build());
        return "Response:OK | " + name;
    }

    @PostMapping("/test2")
    public @ResponseBody
    String getTest2() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        return "Response:OK | " + name;
    }


}