package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //Read Spring Config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get the bean from the Spring Container
        Coach tennis = context.getBean("tennisCoach",Coach.class);

        //Call the method on the bean
        System.out.println(tennis.getDailyWorkout());
        //System.out.println(tennis.getCustomMessage());
        System.out.println(tennis.getDailyFortune());

        //Close Context
        context.close();

    }
}
