package jp.myazaki.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.myazaki.hello.dao.UserDao;
import jp.myazaki.hello.entity.User;

@RestController
public class IndexController {
    
    @Autowired
    private UserDao userDao;
    
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
    
    @RequestMapping("/users")
    public List<User> get() {
        return userDao.findAll();
    }
    
}
