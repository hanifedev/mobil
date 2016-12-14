package tr.com.hanifekurnaz.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final List<Kisi> kisiler=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kisiler.add(new Kisi("Ahmet Yilmaz", false));
        kisiler.add(new Kisi("Ayse Kucuk", true));
        kisiler.add(new Kisi("Fatma Bulgurcu", true));
        kisiler.add(new Kisi("İzzet Altinmese", false));
        kisiler.add(new Kisi("Melek Subasi", true));
        kisiler.add(new Kisi("Selin Serdilli",true));
        kisiler.add(new Kisi("Halil İbrahim", false));

        final ListView listemiz=(ListView) findViewById(R.id.liste);
        OzelAdaptor adaptorumuz=new OzelAdaptor(this,kisiler);
        listemiz.setAdapter(adaptorumuz); // listviewe adaptor tanımladık
        listemiz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), // hangi elemana tıkladıysa ismini yazdıracak, kisiler.get deyince kisiler sınıfından bir nesne donuyor
                        kisiler.get(i).getIsim(),
                        Toast.LENGTH_LONG).show(); // Uzun süre ekrana yazar

            }
        });
    }
}
