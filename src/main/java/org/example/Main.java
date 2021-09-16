package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "AppContext.xml"
        );
        Cinema cinemaBean = context.getBean("cinema", Cinema.class);

        cinemaBean.showFilms();

        context.close();
    }
}
