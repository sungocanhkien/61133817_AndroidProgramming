package anhkien.android.ex7_intentlogin_luyentap;

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
        EditText editTextemail = findViewById(R.id.edtemail);
        EditText editTextpass = findViewById(R.id.edtpass);
        Button buttonlogin = findViewById(R.id.btnlogin);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextemail.getText().toString().equals("AnhKien") && editTextpass.getText().toString().equals("123")){
                    Intent intentLogin = new Intent(MainActivity.this,Result.class);
                    intentLogin.putExtra("email", "AnhKien");
                    startActivity(intentLogin);
                } else {
                    Toast.makeText(MainActivity.this, "Email hoặc Pass sai! Hãy nhập lại!", Toast.LENGTH_SHORT).show();
                    editTextemail.setText("");
                    editTextpass.setText("");
                }
            }
        });
    }
}