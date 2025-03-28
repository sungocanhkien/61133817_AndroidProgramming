package anhkien.android.luyentap_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AdapterShop adapterShop;
    ArrayList<Shop> arrayListshop;
    RecyclerView recyclerViewShop;

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
        arrayListshop = DataforRecyclerView();
        recyclerViewShop = findViewById(R.id.recyclerView);
    }
    ArrayList<Shop> DataforRecyclerView() {
        ArrayList<Shop> dsSP = new ArrayList<>();
        Shop SP1 = new Shop("giaybongro", "Giày bóng rổ");
        dsSP.add(SP1);
        dsSP.add(new Shop("giaydabong", "Giày đá bóng"));
        dsSP.add(new Shop("giayden", "Giày đen"));
        return dsSP;
    }
}