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

public class ManHinh3 extends AppCompatActivity {
    ImageView imageViewNha, imageViewVuong, imageViewTron, imageViewTam, imageViewSao, imageViewTTheo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_hinh3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageViewNha = findViewById(R.id.imageHome);
        imageViewSao = findViewById(R.id.image2ngoisao);
        imageViewTam = findViewById(R.id.image2tamgiac);
        imageViewTron = findViewById(R.id.image2tron);
        imageViewVuong = findViewById(R.id.image2chunhat);
        imageViewTTheo = findViewById(R.id.imageTiepTheo);
        imageViewTTheo.setVisibility(View.GONE);

        imageViewNha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMain = new Intent(ManHinh3.this, MainActivity.class);
                startActivity(intentMain);
                finish();
            }
        });
        View.OnClickListener chonSai = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManHinh3.this, "Sai rồi nà! Hãy chọn lại nà!", Toast.LENGTH_SHORT).show();
            }
        };
        imageViewTam.setOnClickListener(chonSai);
        imageViewSao.setOnClickListener(chonSai);
        imageViewTron.setOnClickListener(chonSai);

        imageViewVuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManHinh3.this, "Đúng rồi nà! Nhấn tiếp theo để tiếp tục nà!", Toast.LENGTH_SHORT).show();
                imageViewTTheo.setVisibility(View.VISIBLE);
            }
        });
        imageViewTTheo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentManHinh3 = new Intent(ManHinh3.this, ManHinh4.class);
                startActivity(intentManHinh3);
            }
        });
    }
}