package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "AppContext.xml"
        );
        Artist artistBean = context.getBean("artist", Artist.class);

        System.out.println(artistBean.getId());
        System.out.println(artistBean.getName());
        System.out.println(artistBean.getListArtWorks());

        context.close();
    }
}
