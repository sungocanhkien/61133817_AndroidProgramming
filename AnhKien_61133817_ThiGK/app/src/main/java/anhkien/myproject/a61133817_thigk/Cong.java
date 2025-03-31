package anhkien.myproject.a61133817_thigk;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cong extends AppCompatActivity {
    EditText editTextSoA;
    EditText editTextSoB;
    EditText editTextKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cong);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void XuLyCong(View view) {
        editTextSoA = findViewById(R.id.edtA);
        editTextSoB = findViewById(R.id.edtB);
        editTextKQ = findViewById(R.id.KQ);

        String trsA = editTextSoA.getText().toString();
        String trsB = editTextSoB.getText().toString();

        int soA = Integer.parseInt(trsA);
        int soB = Integer.parseInt(trsB);

        int tong = soA + soB;
        String StrTong = String.valueOf(tong);

        editTextKQ.setText(StrTong);
    }
}