package anhkien.android.luyentap_tonghop_my;

import android.annotation.SuppressLint;
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
    Button buttonC1, buttonC2, buttonC3, buttonC4;
    @SuppressLint("MissingInflatedId")
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
        buttonC1 = findViewById(R.id.btnCau1);
        buttonC2 = findViewById(R.id.btnCau2);
        buttonC3 = findViewById(R.id.btnCau3);
        buttonC4 = findViewById(R.id.btnCau4);
        buttonC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCau1 = new Intent(MainActivity.this, Cau1.class);
                startActivity(intentCau1);
            }
        });
        buttonC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCau1 = new Intent(MainActivity.this, Cau2.class);
                startActivity(intentCau1);
            }
        });
        buttonC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCau3 = new Intent(MainActivity.this, Cau3.class);
                startActivity(intentCau3);
            }
        });
        buttonC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCau4 = new Intent(MainActivity.this, Cau4.class);
                startActivity(intentCau4);
                finish();
            }
        });
    }
}