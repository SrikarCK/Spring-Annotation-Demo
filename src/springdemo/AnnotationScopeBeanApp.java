package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeBeanApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("Are both objects same: "+result);
        System.out.println("Memory location of theCoach object "+theCoach);
        System.out.println("Memory Location of alphaCoach object "+alphaCoach);

        context.close();
    }
}
