package anhkien.android.luyentap_tonghop_my;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Cau3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Cau3_Car> danhSachXe = new ArrayList<>();
        danhSachXe.add(new Cau3_Car("Toyota Camry",R.drawable.toyota_camry, "Xe sedan rộng rãi, tiết kiệm nhiên liệu."));
        danhSachXe.add(new Cau3_Car("Honda Civic", R.drawable.honda_civic,"Thiết kế thể thao, vận hành mạnh mẽ"));
        danhSachXe.add(new Cau3_Car("Ford Focus", R.drawable.ford_focus, "Xe nhỏ gọn, phù hợp di chuyển trong đô thị."));
        Cau3_CarAdapter adapter = new Cau3_CarAdapter(danhSachXe);
        recyclerView.setAdapter(adapter);
    }
}