package com.wornming.repository;

import com.wornming.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wornming
 * @version 1.0
 * @since 2019/5/30 23:29
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}
