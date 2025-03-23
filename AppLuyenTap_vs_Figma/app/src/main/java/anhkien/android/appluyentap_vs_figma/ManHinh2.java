package anhkien.android.appluyentap_vs_figma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ManHinh2 extends AppCompatActivity {
    ImageView imageViewhome, imageViewNutTieptheo, imageViewHinhTron, imageViewHinhVuong, imageViewTamgiac, imageViewHinhNgoiSao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_hinh2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageViewhome = findViewById(R.id.imageHome);
        imageViewHinhNgoiSao = findViewById(R.id.image2ngoisao);
        imageViewHinhTron = findViewById(R.id.image2tron);
        imageViewTamgiac = findViewById(R.id.image2tamgiac);
        imageViewHinhVuong = findViewById(R.id.image2chunhat);
        imageViewNutTieptheo = findViewById(R.id.imageTiepTheo);
        imageViewNutTieptheo.setVisibility(View.GONE); //Ẩn nút tiếp theo

        imageViewhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentManHinh2 = new Intent(ManHinh2.this, MainActivity.class);
                startActivity(intentManHinh2);
                finish();
            }
        });
        View.OnClickListener chonSai = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManHinh2.this, "Sai rồi! Hãy thử lại nà!", Toast.LENGTH_SHORT).show();
            }
        };
        imageViewHinhVuong.setOnClickListener(chonSai);
        imageViewHinhTron.setOnClickListener(chonSai);
        imageViewHinhNgoiSao.setOnClickListener(chonSai);

        imageViewTamgiac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManHinh2.this, "Chính xác! Hãy nhấn nút Tiếp theo để tiếp tục nà!", Toast.LENGTH_SHORT).show();
                imageViewNutTieptheo.setVisibility(View.VISIBLE); //Hiển thị nút "Tiếp theo"
            }
        });
        imageViewNutTieptheo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentManHinh2 = new Intent(ManHinh2.this, ManHinh3.class);
                startActivity(intentManHinh2);
            }
        });
    }
}