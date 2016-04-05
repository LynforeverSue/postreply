package com.scj;


import com.scj.mapper.PostMapper;
import com.scj.mapper.UserMapper;
import com.scj.model.Post;
import com.scj.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMapperTest {
    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
    @Test
    public void testFindUserById() throws Exception{
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindUserById2() throws Exception{
        PostMapper postMapper = (PostMapper) applicationContext.getBean("postMapper");
        Post post = postMapper.selectByPrimaryKey(1);
        System.out.println(post.getAuthor());
    }
}
