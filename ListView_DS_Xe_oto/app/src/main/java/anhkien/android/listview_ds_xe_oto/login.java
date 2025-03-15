package anhkien.android.listview_ds_xe_oto;

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

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText editTextusername = findViewById(R.id.myusernam);
        EditText editTextpass = findViewById(R.id.password);
        Button buttonbtn = findViewById(R.id.loginbtn);

        buttonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextusername.getText().toString().equals("AnhKien")&& editTextpass.getText().toString().equals("12345")){
                    Intent intentLogin = new Intent(login.this, MainActivity.class);
                    startActivity(intentLogin);
                } else {
                    Toast.makeText(login.this, "Login Failed!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}