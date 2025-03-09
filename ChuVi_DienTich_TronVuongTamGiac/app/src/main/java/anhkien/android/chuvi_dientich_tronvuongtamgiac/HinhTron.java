package anhkien.android.chuvi_dientich_tronvuongtamgiac;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HinhTron extends AppCompatActivity {
    EditText editTextHinhTron, editTextKQhinhTron;
    Button buttonHinhTron;

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
        buttonHinhTron = findViewById(R.id.btnHinhTron);
    }
}