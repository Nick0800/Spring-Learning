package com.spring.learn.dependencyInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private Teachers teachers;

    // Here If we mention directly autowired on the field, Spring will automatically inject the School bean into this field when it creates the Student bean. if you won't
    // mention @Autowired, Spring will not inject the School bean and the school field will remain null.
//    @Autowired
//    School school;

    //@Autowired field tells Spring to inject the School bean that the container already manages.

    /* Constructor Injection */
    /*private School school;

    public Student(School school) {
        this.school = school;
    }*/

    /*Setter Injection */
    private School school;

    @Autowired
    public void setSchool(School school) {
        this.school = school;
    }

    public void code() {
        school.teach();
    }
}
