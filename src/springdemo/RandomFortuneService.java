package springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortune = {"Make your Day Bright",
            "Work Hard and keep upto the mark",
            "Just Do It: Yes you can and will."};

    private Random myRandom = new Random();
    @Override
    public String getFortune() {

        int random = myRandom.nextInt(fortune.length);
        String result = fortune[random];
        return result;
    }
}
