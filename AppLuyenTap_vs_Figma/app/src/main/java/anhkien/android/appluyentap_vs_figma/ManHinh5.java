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

public class ManHinh5 extends AppCompatActivity {
    ImageView imageViewNha5, imageViewTTheo5, imageViewSo6, imageViewSo3, imageViewSo9, imageViewSo7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_hinh5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageViewNha4 = findViewById(R.id.imageHome);
        imageViewSo6 = findViewById(R.id.imageViewSo6);
        imageViewSo4 = findViewById(R.id.imageViewSo4);
        imageViewSo9 = findViewById(R.id.imageViewSo9);
        imageViewSo7 = findViewById(R.id.imageViewSo7);
        imageViewTTheo4 = findViewById(R.id.imageTiepTheo);
        imageViewTTheo4.setVisibility(View.GONE);

        imageViewNha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNha4 = new Intent(ManHinh4.this, MainActivity.class);
                startActivity(intentNha4);
                finish();
            }
        });
        View.OnClickListener chonSai = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManHinh4.this, "Sai rồi nà! Thử lại nà!", Toast.LENGTH_SHORT).show();
            }
        };
        imageViewSo6.setOnClickListener(chonSai);
        imageViewSo9.setOnClickListener(chonSai);
        imageViewSo7.setOnClickListener(chonSai);

        imageViewSo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManHinh4.this, "Đúng rồi nà! Nhấn tiếp theo để tiếp tục nà!", Toast.LENGTH_SHORT).show();
                imageViewTTheo4.setVisibility(View.VISIBLE);
            }
        });
        imageViewTTheo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentManHinh4 = new Intent(ManHinh4.this, ManHinh5.class);
                startActivity(intentManHinh4);
            }
        });
    }
}