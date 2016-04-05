package com.scj.dao.impl;

import com.scj.model.User;
import com.scj.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    public void insertUser(User user) throws Exception {
//        SqlSession sqlSession = getSqlSession();
//        sqlSession.in
    }

    public void deleteUser(int id) throws Exception {

    }

    public void updateUser(User user) throws Exception {

    }

    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = getSqlSession();
        User user = sqlSession.selectOne("test.findUserById",id);
        return user;
    }

    public List<User> findUserByName(String name) throws Exception {
        return null;
    }
}
