package hello;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

/**
 * Created by codygulley on 8/17/16.
 */


@Component
public class GenerateUID {
    private String UID;
    private int x;
    private DateFormat df = new SimpleDateFormat("yyyyMMdd");

    public String generateNewUID(){
        int max = 122;
        int min = 97;
        Random rn1 = new Random();
        Calendar calobj = Calendar.getInstance();
        this.UID ="_" + df.format(calobj.getTime());
        this.UID = this.UID + "-";
        this.UID += UUID.randomUUID().toString();
        return UID;
    }
}
