package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //Read Spring Config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

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
