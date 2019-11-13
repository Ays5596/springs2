package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("movie")
public class Movie {

    private Actor hr;

    public Movie(Actor hr) {
        this.hr = hr;
    }

    public void disp(){
        System.out.println(hr);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "hr=" + hr +
                '}';
    }
}
