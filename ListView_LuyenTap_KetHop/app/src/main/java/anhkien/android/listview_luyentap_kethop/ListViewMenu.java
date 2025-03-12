package anhkien.android.listview_luyentap_kethop;

import android.os.Bundle;
import android.widget.ListView;

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
            
        }
    }
}