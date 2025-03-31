package anhkien.myproject.a61133817_thigk;

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

public class ChucNang3 extends AppCompatActivity {
    private ListView listView;
    private String[] titles = {
            "Tiến về Sài Gòn", "Giải Phóng Miền Nam", "Đất nước trọn niềm vui",
            "Bài ca thống nhất", "Mùa Xuân trên TPHCM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView = findViewById(R.id.lvCN3);

        // Tạo adapter để liên kết dữ liệu với ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, titles);

        listView.setAdapter(adapter);

        // Bắt sự kiện khi nhấn vào một tiêu đề trong danh sách
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedTitle = titles[position];
                Toast.makeText(ChucNang3.this, "Bạn đã chọn: " + selectedTitle, Toast.LENGTH_SHORT).show();
            }
        });
    }
}