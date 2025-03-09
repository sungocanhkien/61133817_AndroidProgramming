package anhkien.android.chuvi_dientich_tronvuongtamgiac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        Button btnHinhTron = findViewById(R.id.btnHinhTron);
        Button btnHinhVuong = findViewById(R.id.btnHinhVuong);
        Button btnHinhTamGiac = findViewById(R.id.btnHinhTamGiac);
        Button btnHinhChuNhat = findViewById(R.id.btnHinhChuNhat);

        btnHinhTron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HinhTron.class);
                startActivity(intent);
            }
        });
    }
}