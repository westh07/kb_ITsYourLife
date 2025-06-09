package org.scoula.main;

import org.scoula.beans.Person2;
import org.scoula.config.ProjectConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        Person2 person2 = context.getBean(Person2.class);

        System.out.println("person2.getName() = " + person2.getName());
        System.out.println("person2.getParrot() = " + person2.getParrot());
    }
}
