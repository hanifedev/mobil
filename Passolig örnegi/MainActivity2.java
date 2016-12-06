package tr.com.hanifekurnaz.proje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText kullaniciEdit;
    private EditText parolaEdit;
    private Button girisYap;
    private String kullaniciAdi;
    private String parola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kullaniciEdit=(EditText) findViewById(R.id.kullaniciadi);
        parolaEdit=(EditText)findViewById(R.id.parola);
        girisYap=(Button)findViewById(R.id.girisyap);
        girisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kullaniciAdi=kullaniciEdit.getText().toString();
                parola=parolaEdit.getText().toString();
                if(kullaniciAdi.equals(getResources().getString(R.string.username))&&(parola.equals(getResources().getString(R.string.password))))
                {
                    Toast.makeText(getApplicationContext(),"Başarılı giriş yaptınız",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(MainActivity.this, GecisEkran.class);
                    //                    anahtar ,  değer
                    intent.putExtra("kullaniciAdi", getResources().getString(R.string.isim));
                    startActivity(intent);
                }
            }
        });

    }
}
