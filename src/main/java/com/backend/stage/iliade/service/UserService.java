package com.backend.stage.iliade.service;

import com.backend.stage.iliade.models.User;

public interface UserService {
    public void SavedUser(User user);
    public boolean UserIsAlreadySaved(User user);
}
