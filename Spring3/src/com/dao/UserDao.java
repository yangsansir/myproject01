package com.dao;

import java.util.List;

import com.entities.Function;
import com.entities.User;

public interface UserDao {
public void add( User user );
public User login(String loginName,String password);
public List<Function> getFunctionByRoleId();
public  List<User> findAll(int currentPage,int pageSize);
public  User findById(Integer id);
public  void updateuser(User user);
public  void delete(User user); 
public int getTotle();
public  List<User> query(String keyWord);
}
