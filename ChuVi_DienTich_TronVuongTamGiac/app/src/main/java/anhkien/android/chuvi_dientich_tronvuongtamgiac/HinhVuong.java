package anhkien.android.chuvi_dientich_tronvuongtamgiac;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HinhVuong extends AppCompatActivity {
    EditText editTextHinhVuong;
    EditText editTextKQ_CV_hinhVuong, editTextKQ_DT_hinhVuong;
    Button btnHinhVuong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hinh_vuong);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextHinhVuong = findViewById(R.id.edtHinhVuong);
        editTextKQ_CV_hinhVuong = findViewById(R.id.KQ_chuvi_hinhVuong);
        editTextKQ_DT_hinhVuong = findViewById(R.id.KQ_DT_hinhVuong);
        btnHinhVuong = findViewById(R.id.btnHinhVuong);

        btnHinhVuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhCV_DT_hinhVuong();
            }
        });
    }
    void TinhCV_DT_hinhVuong(){
        String canh = editTextHinhVuong.getText().toString();
        if (canh.isEmpty()){
            Toast.makeText(this, "Hãy nhập cạnh hình vuông!", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            double canhHV = Double.parseDouble(canh);
            if (canhHV<=0){
                Toast.makeText(this, "Cạnh phải là số dương!", Toast.LENGTH_SHORT).show();
                return;
            }
            double chuVi = 4 * canhHV;
            double dienTich = canhHV * canhHV;
            editTextKQ_CV_hinhVuong.setText(String.format("Chu vi: %.2f", chuVi));
            editTextKQ_DT_hinhVuong.setText(String.format("Diện tích: %.2f", dienTich));
        } catch (NumberFormatException e){
            Toast.makeText(this, "Hãy nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
        }
    }
}