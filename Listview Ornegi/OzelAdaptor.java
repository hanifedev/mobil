package tr.com.hanifekurnaz.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hanf on 9.12.2016.
 */

public class OzelAdaptor extends BaseAdapter{
    LayoutInflater layoutInflater; //Layoutların ekrana yazdırılması icin
    List<Kisi>kisiler;
    public OzelAdaptor(Activity activity, List<Kisi>kisiler)
    {
        layoutInflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE); // Layout inflater servisi
        this.kisiler=kisiler;
    }
    @Override
    public int getCount() {
        return kisiler.size();
    }
    @Override
    public Kisi getItem(int position) { // Kisi donduruyor
        return kisiler.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView;
        satirView=layoutInflater.inflate(R.layout.satir_layout, null);
        // Aldığımız her bir satırın içindeki elemanları çektik
        TextView textView=(TextView)satirView.findViewById(R.id.isimsoyisim);
        ImageView imageView=(ImageView)satirView.findViewById(R.id.simge);
        Kisi kisi=kisiler.get(i);
        textView.setText(kisi.getIsim());
        if(kisi.isKadinMi()){
            imageView.setImageResource(R.drawable.kadin);
        }
        else
        {
            imageView.setImageResource(R.drawable.man);
        }
        return satirView; // düzenlememizi yaptiktan sonra geri dondurmemiz gerekiyor
    }
}
