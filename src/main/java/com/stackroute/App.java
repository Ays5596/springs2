package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     System.out.println( "Hello World!" );
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("context is called!");
        Actor act = context.getBean("actor",Actor.class);
        System.out.println("bean created for actor "+act);
        act.test();
        Movie mov = context.getBean("movie", Movie.class);
        mov.disp();
        Movie mov1 = context.getBean("movie", Movie.class);
        System.out.println(mov==mov1);
    }
}
