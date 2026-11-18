package com.spring.learn.dependencyInj;

import org.springframework.stereotype.Component;

@Component
public class School {

    private Teachers teachers;

    /*Constructor Injection of Teachers Class Bean*/
    public School(Teachers teachers) {
        this.teachers = teachers;
    }

    public void teach() {


        teachers.setId(1);
        teachers.setName("Nikhil");
        teachers.setSubject("Social");
        System.out.println("Teacher Deatils" + teachers);
        System.out.println("Teaching in School");
    }

}
