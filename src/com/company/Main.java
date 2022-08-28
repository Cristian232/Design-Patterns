package com.company;


import com.company.Creational.SimpleFactory.Post;
import com.company.Creational.SimpleFactory.PostFactory;

public class Main {

    public static void main(String[] args) {

        Post post = PostFactory.createPost("news");
        System.out.println(post);



    }

}
