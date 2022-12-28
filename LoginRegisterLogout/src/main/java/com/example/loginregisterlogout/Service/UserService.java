package com.example.loginregisterlogout.Service;

import com.example.loginregisterlogout.Dto.UserDto;
import com.example.loginregisterlogout.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    User findByEmail(String email);

    List<UserDto> findAllUser();
}
