package anhkien.android.listview_ds_xe_oto;

import android.app.Activity;
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
        Button button5cho = findViewById(R.id.btn5cho);
        Button button7cho = findViewById(R.id.btn7cho);

        button5cho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oto5cho = new Intent(MainActivity.this, ListView_DS_oto.class);
                oto5cho.putExtra("oto", "Oto 5 chỗ");
                startActivity(oto5cho);
            }
        });
        button7cho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oto7cho = new Intent(MainActivity.this, ListView_DS_oto.class);
                oto7cho.putExtra("oto", "Oto 7 chỗ");
                startActivity(oto7cho);
            }
        });
    }
}