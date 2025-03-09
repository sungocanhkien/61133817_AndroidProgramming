package anhkien.android.chuvi_dientich_tronvuongtamgiac;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HinhTron extends AppCompatActivity {
    private EditText editTextHinhTron, editTextKQhinhTron, editTextKQ_DThinhTron;
    private Button buttonHinhTron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hinh_tron);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextHinhTron = findViewById(R.id.edtHinhTron);
        editTextKQhinhTron = findViewById(R.id.KQhinhTron);
        editTextKQ_DThinhTron = findViewById(R.id.KQDThinhTron);
        buttonHinhTron = findViewById(R.id.btnHinhTron);
        buttonHinhTron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HinhTron();
            }
        });
    }
    private void HinhTron(){
        String input = editTextHinhTron.getText().toString();
        if(!input.isEmpty()){
            double banKinh = Double.parseDouble(input);
            double ChuVi = 2 * Math.PI * banKinh;
            double DienTich = Math.PI * banKinh * banKinh;
            String chuvi = "Chu vi: "  + String.format("%.2f",ChuVi);
            editTextKQhinhTron.setText(chuvi);
            String dienTich = "Diện tích: " + String.format("%.2f",DienTich);
            editTextKQ_DThinhTron.setText(dienTich);
        } else {
            editTextKQhinhTron.setText("Vui lòng nhập lại bán kính!");
            editTextKQ_DThinhTron.setText("Xin cảm ơn!");
        }
    }
}