package tr.com.hanifekurnaz.proje;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Hanf on 2.12.2016.
 */

public class GecisEkran extends Activity{
    private LinearLayout layout;
    private ImageView logo;
    private TextView yazi;
    private Intent intent;
    private String isim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layout= new LinearLayout(this);
        logo=new ImageView(this);
        yazi=new TextView(this);
        intent=getIntent(); // gelen intenti aldık
        isim=intent.getStringExtra("kullaniciAdi");
        yazi.setText("Hoşgeldiniz Sn. " + isim); // intent kısmı Hanife Kurnaz olarak döner
        logo.setImageResource(R.drawable.passolig); // resim ataması
        layout.setOrientation(LinearLayout.VERTICAL); // ekran düzenini alt alta yaptık
        layout.addView(logo); // Layouta eleman ekledik. XMLde sürükle bırak işleminin aynısı
        layout.addView(yazi);
        //Hazır durumda
        setContentView(layout); // üstte oluşturduğumuz linerlayoutu parametre olarak verdik.
    }
}
