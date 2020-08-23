package com.cxc.service;

import com.cxc.po.User;

/**
 * Created by cxc on 2019/10/15.
 */
public interface UserService {

    User checkUser(String username, String password);
}
