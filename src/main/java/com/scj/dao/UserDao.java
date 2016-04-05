package com.scj.dao;


import com.scj.model.User;

import java.util.List;

public interface UserDao {
	//添加用户信息
	void insertUser(User user)throws Exception;
	//删除用户
	void deleteUser(int id)throws Exception;
	//更新用户
	void updateUser(User user)throws Exception;
	//根据用户id查询用户信息
	User findUserById(int id) throws Exception;
	//查询用户列表
	List<User> findUserByName(String name) throws Exception;
}
