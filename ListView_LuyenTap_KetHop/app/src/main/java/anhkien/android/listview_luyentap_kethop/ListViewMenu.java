package anhkien.android.listview_luyentap_kethop;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListViewMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listViewMenu = findViewById(R.id.LVmenu);

        String MonAn = getIntent().getStringExtra("onAn");

        ArrayList<String> dsMonAn = new ArrayList<>();
        if ("Món Rán".equals(MonAn)){
            dsMonAn.add("Cá rán");
            dsMonAn.add("Tôm rán");
            dsMonAn.add("Thịt rán");
        } else if ("Món Canh".equals(MonAn)) {
            dsMonAn.add("Canh chua cá lóc ");
            dsMonAn.add("Canh khoai tây");
            dsMonAn.add("Canh bí ngô");
        }
        ArrayAdapter<String> adapterMonAn = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,dsMonAn);

        listViewMenu.setAdapter(adapterMonAn);

        listViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String chonMon = dsMonAn.get(position);
                Toast.makeText(ListViewMenu.this, "Bạn chọn món: " + dsMonAn, Toast.LENGTH_LONG).show();
            }
        });
    }

}