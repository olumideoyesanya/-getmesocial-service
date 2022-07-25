package com.example.getmesocialservice.repository;


import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser(){
        User user = new User("Femi","Canada", 13,"https://d1lhri34tovdcj.cloudfront.net/prod/mom365/featured-images/istock_90635409.jpg");
        return user;
    }
}
