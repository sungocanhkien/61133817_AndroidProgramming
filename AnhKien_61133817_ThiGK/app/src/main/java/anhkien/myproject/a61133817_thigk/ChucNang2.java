package anhkien.myproject.a61133817_thigk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang2 extends AppCompatActivity {
    private EditText edtNgay, edtThang, edtNam, edtKQ;
    private Button btnktra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtNgay = findViewById(R.id.ngay);
        edtThang = findViewById(R.id.thang);
        edtNam = findViewById(R.id.nam);
        edtKQ = findViewById(R.id.kq);
        btnktra = findViewById(R.id.ktra);

        // Bắt sự kiện khi nhấn nút Kiểm tra
        btnktra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDate();
            }
        });
    }

    private void checkDate() {
        // Lấy dữ liệu nhập vào từ EditText
        String ngayStr = edtNgay.getText().toString();
        String thangStr = edtThang.getText().toString();
        String namStr = edtNam.getText().toString();

        // Kiểm tra xem người dùng đã nhập đủ chưa
        if (ngayStr.isEmpty() || thangStr.isEmpty() || namStr.isEmpty()) {
            edtKQ.setText("Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        // Chuyển đổi sang số nguyên
        int ngay = Integer.parseInt(ngayStr);
        int thang = Integer.parseInt(thangStr);
        int nam = Integer.parseInt(namStr);

        // Kiểm tra kết quả
        if (ngay == 30 && thang == 4 && nam == 1975) {
            edtKQ.setText("Chính xác!");
        } else {
            edtKQ.setText("Sai, hãy thử lại!");
        }
    }
}