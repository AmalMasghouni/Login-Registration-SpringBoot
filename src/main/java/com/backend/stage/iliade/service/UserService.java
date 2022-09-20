package com.backend.stage.iliade.service;

import com.backend.stage.iliade.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public void SavedUser(User user);

    public boolean UserIsAlreadySaved(User user);
}
