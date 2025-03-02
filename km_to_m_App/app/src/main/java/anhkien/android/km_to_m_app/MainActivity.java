package anhkien.android.km_to_m_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText1;
    private EditText editText2;

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
        button=findViewById(R.id.btn);
        editText1=findViewById(R.id.edtkm);
        editText2=findViewById(R.id.edtm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText1.getText().toString().trim();
                if(s.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập số km!", Toast.LENGTH_SHORT).show();
                    return;
                }
                try {
                    int km = Integer.parseInt(s);
                    int m = 1000*km;
                    editText2.setText("Giá trị quy đổi:"+ m + "m");
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Hãy nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}