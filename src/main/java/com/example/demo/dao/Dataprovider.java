package com.example.demo.dao;

import com.example.demo.model.Education;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

//TODO GTB-工程实践: - Dataprovider.java:11 命名的大小不合理
public class Dataprovider {

    public static List<User> users = new ArrayList<>();
    public static List<Education> educationList = new ArrayList<>();


    static {
        users.add(new User(1,"KAMIL",24,"https://inews.gtimg.com/newsapp_match/0/3581582328/0","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi."));
        Education e1 = new Education(1,2005,"Secondary school specializing in artistic","Eos, explicabo, nam, tenetur et ab eius deserunt aspernatur ipsum ducimus quibusdam quis voluptatibus.");
        Education e2 = new Education(1,2009, "First level graduation in Graphic Design","Aspernatur, mollitia, quos maxime eius suscipit sed beatae ducimus quaerat quibusdam perferendis? Iusto, quibusdam asperiores unde repellat.");
        educationList.add(e1);
        educationList.add(e2);
    }
}
