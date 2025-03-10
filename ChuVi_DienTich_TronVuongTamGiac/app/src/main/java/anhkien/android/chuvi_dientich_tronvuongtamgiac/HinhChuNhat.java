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

public class HinhChuNhat extends AppCompatActivity {
    EditText editTextChuVi_HCNhat,editTextDienTich_HCNhat, editTextChieuDai, editTextChieuRong;
    Button btnTinh_HCNhat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hinh_chu_nhat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextChieuDai = findViewById(R.id.edtChieuDai);
        editTextChieuRong = findViewById(R.id.edtChieuRong);
        editTextChuVi_HCNhat = findViewById(R.id.KQ_chuvi_hinhCNhat);
        editTextDienTich_HCNhat = findViewById(R.id.KQ_DT_hinhCNhat);
        btnTinh_HCNhat = findViewById(R.id.btnHinhChuNhat);

        btnTinh_HCNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tinh_ChuVi_DienTich_HCNhat();
            }
        });
    }
    void Tinh_ChuVi_DienTich_HCNhat(){
        String strChieuDai = editTextChieuDai.getText().toString().trim();
        String strChieuRong = editTextChieuRong.getText().toString().trim();
        if(strChieuDai.isEmpty() || strChieuRong.isEmpty()){
            Toast.makeText(this, "Vui lòng nhập 2 cạnh", Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            double chieuDai = Double.parseDouble(strChieuDai);
            double chieuRong = Double.parseDouble(strChieuRong);
            if(chieuDai<=0 || chieuRong<= 0){
                Toast.makeText(this, "Cạnh là số dương!", Toast.LENGTH_SHORT).show();
                return;
            }
            double chuVi = 2 * (chieuDai + chieuRong);
            double dienTich = chieuDai* chieuRong;
            
        }
    }
}