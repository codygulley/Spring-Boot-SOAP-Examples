package hello;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by codygulley on 8/17/16.
 */


@Component
public class RandomGenerator {
    private String randomString;
    private BigInteger randomNumber;
    private int x;

    public String setRandomString(){
        randomString = "";
        int max = 126;
        int min = 33;
        int minLength = 5;
        int maxLength = 33;
        Random rn1 = new Random();
        int length = rn1.nextInt(maxLength - minLength + 1) + minLength;
        for(int i=5; i<=length; i++){
            Random rn = new Random();
            this.x = rn.nextInt(max - min + 1) + min;
           this.randomString = this.randomString + (char)x;
        }
        return randomString;
    }

    public BigInteger setRandomNumber(){
        int max = 10000;
        int min = 0;
        Random rn1 = new Random();
        this.x = rn1.nextInt(max - min + 1) + min;
        this.randomNumber = BigInteger.valueOf(x);
        return randomNumber;
    }

}