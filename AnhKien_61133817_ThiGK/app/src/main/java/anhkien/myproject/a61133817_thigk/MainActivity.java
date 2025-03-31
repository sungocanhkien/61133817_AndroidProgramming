package anhkien.myproject.a61133817_thigk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button buttonCN2, buttonCN3, buttonCN4, buttonMe;
    TextView textViewlamthem;
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
        buttonCN2 = findViewById(R.id.btnCN2);
        textViewlamthem = findViewById(R.id.lthem);
        buttonCN3 = findViewById(R.id.btnCN3);
        buttonCN4 = findViewById(R.id.btnCN4);
        buttonMe = findViewById(R.id.btnMe);
        buttonCN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCN2 = new Intent(MainActivity.this, ChucNang2.class);
                startActivity(intentCN2);
            }
        });
        buttonCN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCN3 = new Intent(MainActivity.this, ChucNang3.class);
                startActivity(intentCN3);
            }
        });
        buttonCN4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCN4 = new Intent(MainActivity.this, ChucNang4.class);
                startActivity(intentCN4);
            }
        });
        buttonMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMe = new Intent(MainActivity.this, AboutMe.class);
                startActivity(intentMe);
            }
        });
        textViewlamthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlamthem = new Intent(MainActivity.this, Cong.class);
                startActivity(intentlamthem);
            }
        });
    }
}