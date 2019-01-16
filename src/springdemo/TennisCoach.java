package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//This will create a default bean-id with similar to class name as "tennisCoach"
@Component
//Creating the Custom or Explicit bean-id
//@Component("thatSillyCoach")//(Bean-id)
public class TennisCoach implements Coach {

    //private FortuneService fortuneService;

    //AutoWired with field injection -- this is done with java tech called "Reflection".
    //Non need for setter methods

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //Define init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("from method doMyStartupStuff() method.");
    }
    //Define destroy method

    @PreDestroy
    public void cleanupMyStuff(){
        System.out.println("From method cleanupMyStuff() method.");
    }




    //Autowired with constructor injection example.
//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }

    public TennisCoach(){
        System.out.println(">> TennisCoach: inside the default constructor.");
    }

    //Autowired with method injection example.
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService){
//        this.fortuneService = theFortuneService;
//    }

    //Autowired with setter injection example
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside the setFortuneService() method.");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getCustomMessage() {
        return "Thank You. Have Good Day!";
    }
}
