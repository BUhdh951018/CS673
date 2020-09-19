package com.team3.weekday.service;

import com.team3.weekday.db.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author yangke
 * @title: IUserService
 * @projectName weekday
 * @date 2020-09-15
 */
public interface IUserService {

    User creatUser(String username, String password);

    void removeUser(Long id);

    User updateUser(User user);

    User getUserById(Long id);

    Page<User> listUsersByNameLike(String name, Pageable pageable);
}
