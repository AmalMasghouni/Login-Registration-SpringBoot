package com.backend.stage.iliade.service;

import com.backend.stage.iliade.models.Role;
import com.backend.stage.iliade.models.User;
import com.backend.stage.iliade.repositry.RoleRepositry;
import com.backend.stage.iliade.repositry.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    BCryptPasswordEncoder encoder;
    @Autowired
    RoleRepositry roleRepository;
    @Autowired
    UserRepositry userRepository;

    @Override
    public void SavedUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setStatus("VERIFIED");
        Role userRole = roleRepository.findByRole("SITE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);


    }

    @Override
    public boolean UserIsAlreadySaved(User user) {
        boolean isUserAlreadyExists = false;
        User existingUser = userRepository.findByEmail(user.getEmail());

        if(existingUser != null){
            isUserAlreadyExists = true;
        }
        return isUserAlreadyExists;
    }
}
