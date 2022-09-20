package com.backend.stage.iliade.repositry;

import com.backend.stage.iliade.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends JpaRepository<User,Long> {
    //public Role findByRole(String role);
    public  User findByEmail(String user);
}
