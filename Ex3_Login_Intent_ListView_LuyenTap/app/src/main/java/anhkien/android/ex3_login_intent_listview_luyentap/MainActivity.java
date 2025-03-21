package anhkien.android.ex3_login_intent_listview_luyentap;

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
        EditText editTextEmail = findViewById(R.id.edtEmail);
        EditText editTextPass = findViewById(R.id.edtPass);
        Button buttonlogin = findViewById(R.id.btnlogin);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEmail.getText().toString().equals("AnhKien") && editTextPass.getText().toString().equals("123")){
                    Intent intentlogin = new Intent(MainActivity.this, PhepTong.class);
                    startActivity(intentlogin);
                } else {
                    Toast.makeText(MainActivity.this, "Email hoặc Pass sai. Hãy nhập lại!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}