package anhkien.android.vidu_listview;

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

public class MainActivity extends AppCompatActivity {
    ListView DanhSachMonAn;
    ArrayList<String> DS_MonAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        DanhSachMonAn = findViewById(R.id.DSmonAn);
        DS_MonAn = new ArrayList<>();
        DS_MonAn.add("Canh Chua");
        DS_MonAn.add("Cá kho");
        DS_MonAn.add("Thịt kho");
        DS_MonAn.add("Rau luộc");
        DS_MonAn.add("Cá hấp");
        DS_MonAn.add("Cá chiên");

        ArrayAdapter<String> ds_monAn;
        ds_monAn = new ArrayAdapter<String>(
                this, android.R.layout.simple_dropdown_item_1line, DS_MonAn
        );
        DanhSachMonAn.setAdapter(ds_monAn);
        DanhSachMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        });
    }
}