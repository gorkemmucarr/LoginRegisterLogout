package com.example.loginregisterlogout.Repository;

import com.example.loginregisterlogout.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String role_admin);
}
