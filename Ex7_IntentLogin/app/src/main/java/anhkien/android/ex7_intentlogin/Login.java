package anhkien.android.ex7_intentlogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.regex.Pattern;

public class Login extends AppCompatActivity {
    EditText editTextEmail, editTextPass;
    Button buttonLogin;

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
        TimView();
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strEmail = editTextEmail.getText().toString();
                String strPass = editTextPass.getText().toString();
                if(strEmail.equals("anhkien@gmail.com")&& strPass.equals("123")){
                    
                }
            }
        });
    }
    public void TimView(){
        editTextEmail = findViewById(R.id.edtEmail);
        editTextPass = findViewById(R.id.edtpass);
        buttonLogin = findViewById(R.id.btnLogin);
    }
}