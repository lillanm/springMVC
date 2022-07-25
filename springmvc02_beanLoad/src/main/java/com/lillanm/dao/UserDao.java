package com.lillanm.dao;

import org.apache.ibatis.annotations.Insert;
import com.lillanm.pojo.User;
public interface UserDao {

    @Insert("insert into tbl_user(name,age)values(#{name},#{age})")
    public void save(User user);
}
