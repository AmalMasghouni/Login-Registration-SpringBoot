package com.backend.stage.iliade.repositry;

import com.backend.stage.iliade.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositry extends JpaRepository<Role, Long> {
    public Role findByRole(String role);
}
