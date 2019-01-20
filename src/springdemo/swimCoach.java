package springdemo;

public class swimCoach implements Coach {

    private FortuneService fortuneService;

    public swimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getCustomMessage() {
        return null;
    }
}
