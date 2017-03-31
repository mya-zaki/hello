package jp.myazaki.hello.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.myazaki.hello.entity.User;

@Repository
public interface UserDao extends JpaRepository <User, Integer> {
 
}