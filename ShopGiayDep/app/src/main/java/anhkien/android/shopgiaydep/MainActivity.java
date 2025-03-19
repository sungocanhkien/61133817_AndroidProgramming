package anhkien.android.shopgiaydep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        EditText editTextEmail = findViewById(R.id.edtemail);
        EditText editTextPass = findViewById(R.id.edtpass);
        Button buttonLogin = findViewById(R.id.btnlogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEmail.getText().toString().equals("AnhKien") && editTextPass.getText().toString().equals(12345)){
                    Intent intentLogin = new Intent(MainActivity.this, DS_Giay_Dep.class);
                } else {
                    Toast.makeText(MainActivity.this, "Email hoặc Pass đã sai! Hãy kiểm tra lại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}