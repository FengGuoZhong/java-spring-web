package com.gg.mapper;

import com.gg.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUser(int id);
}
