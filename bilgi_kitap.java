package tr.com.hanifekurnaz.myapplication;

import java.util.Random;

/**
 * Created by Hanf on 25.11.2016.
 */

public class bilgi_kitap {
    Random r=new Random();
    String [] bilgiler= {"Baykuşlar mavi rengini görebilen tek kuştur",
            "Karıncalar kendi ağırlığının 40 katını taşıyabilir.",
            "Yavru balinalar 5m doğabilir",
            "Yarasalar doğurabilir."};
    public String bilgiAl(){
        return bilgiler[r.nextInt(bilgiler.length)];
    }
}
