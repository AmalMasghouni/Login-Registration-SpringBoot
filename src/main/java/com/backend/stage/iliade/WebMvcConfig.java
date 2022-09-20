package com.backend.stage.iliade;

import com.backend.stage.iliade.models.User;
import com.backend.stage.iliade.service.UserService;
import com.backend.stage.iliade.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration

public class WebMvcConfig extends WebMvcConfigurerAdapter {
@Bean
public UserService userService(){
    UserService userService =new UserServiceImp();
    return userService;
}
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }


}
