package anhkien.android.listview_ds_xe_oto;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListView_DS_oto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_ds_oto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listViewDSoto = findViewById(R.id.dsOto);

        String DStenOto = getIntent().getStringExtra("oto");

        ArrayList<String> DS_oto = new ArrayList<>();
        if ("Oto 5 chỗ".equals(DStenOto)){
            DS_oto.add("Toyota Corolla Altis");
            DS_oto.add("Honda Civic");
            DS_oto.add("Mazda 3");
        } else if ("Oto 7 chỗ".equals(DStenOto)) {
            DS_oto.add("Toyota Fortuner");
            DS_oto.add("Ford Everest");
            DS_oto.add("Mistsubishi Xpander");
        }
        ArrayAdapter<String> adapterDSoto = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, DS_oto);
        listViewDSoto.setAdapter(adapterDSoto);

        listViewDSoto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String chonOTO = DS_oto.get(position);
                
            }
        });
    }
}