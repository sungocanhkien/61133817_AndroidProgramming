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
    ImageView imageViewNha5, imageViewSo6, imageViewSo3, imageViewSo9, imageViewSo7;
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
        imageViewNha5 = findViewById(R.id.imageHome);
        imageViewSo6 = findViewById(R.id.imageViewSo6);
        imageViewSo3 = findViewById(R.id.imageViewSo4);
        imageViewSo9 = findViewById(R.id.imageViewSo9);
        imageViewSo7 = findViewById(R.id.imageViewSo7);

        imageViewNha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNha5 = new Intent(ManHinh5.this, MainActivity.class);
                startActivity(intentNha5);
                finish();
            }
        });
        View.OnClickListener chonSai = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManHinh5.this, "Sai rồi nà! Thử lại nà!", Toast.LENGTH_SHORT).show();
            }
        };
        imageViewSo6.setOnClickListener(chonSai);
        imageViewSo9.setOnClickListener(chonSai);
        imageViewSo7.setOnClickListener(chonSai);

        imageViewSo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManHinh5.this, "Đúng rồi nà! Bạn đã hoàn thành! Nhấn Home để quay về trang chủ!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}