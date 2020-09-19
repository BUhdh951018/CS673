package com.team3.weekday;

import com.team3.weekday.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author yangke
 * @title: DataBus
 * @projectName weekday
 * @date 2020-09-16
 */

@Component
public class DataBus {

    @Autowired
    private IUserService userService;

    public IUserService userService(){
        return userService;
    }
}
