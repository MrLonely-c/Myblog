package com.cxc.dao;

import com.cxc.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cxc on 2019/10/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
