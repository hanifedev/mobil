package tr.com.hanifekurnaz.myapplication;

import java.util.Random;

/**
 * Created by Hanf on 25.11.2016.
 */

public class RenkPaleti {
    Random r=new Random();
    String [] renk= {"#FF3366",
                 "#00CCFF",
                 "#FF0000",
                 "#33FF00"};
    public String RenkAl(){
        return renk[r.nextInt(renk.length)];
    }
}
