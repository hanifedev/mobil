package tr.com.hanifekurnaz.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView baslik;
    private TextView bilgi;
    private Button degistirButon;
    private RelativeLayout r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 =  (RelativeLayout)findViewById(R.id.activity_main);
        baslik = (TextView) findViewById(R.id.baslik);
        bilgi = (TextView) findViewById(R.id.bilgi);
        degistirButon = (Button) findViewById(R.id.sonraki);
        final bilgi_kitap kitap=new bilgi_kitap();
        final RenkPaleti renksec=new RenkPaleti();

        degistirButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String renk=renksec.RenkAl();
                r1.setBackgroundColor(Color.parseColor(renk));
                degistirButon.setTextColor(Color.parseColor(renk));
                bilgi.setText(kitap.bilgiAl());
            }
        });
    }
}
