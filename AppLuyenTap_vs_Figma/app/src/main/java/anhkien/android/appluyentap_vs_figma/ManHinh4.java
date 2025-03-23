package anhkien.android.appluyentap_vs_figma;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ManHinh4 extends AppCompatActivity {
    ImageView imageViewNha4, imageViewTTheo4, imageViewSo6, imageViewSo4, imageViewSo9, imageViewSo7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_hinh4);
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
    }
}