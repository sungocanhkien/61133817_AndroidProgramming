package anhkien.android.listview_ds_xe_oto;

import android.os.Bundle;
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
            DS_oto.add("Toyota Camry");
            DS_oto.add("Honda Accord");
            DS_oto.add("Mazda 6");
        }
    }
}