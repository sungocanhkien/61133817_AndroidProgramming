package anhkien.android.ex3_login_intent_listview_luyentap;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class PhepTong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_phep_tong);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText editTextSo1 = findViewById(R.id.edtso1);
        EditText editTextSo2 = findViewById(R.id.edtso2);
        Button buttontinh = findViewById(R.id.btntinh);
        Button buttonList = findViewById(R.id.btnList);

        //Khởi tạo listView
        ArrayList<String> DSpheptinh = new ArrayList<>();
        buttontinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nut1 = editTextSo1.getText().toString();
                String nut2 = editTextSo2.getText().toString();
                if (!nut1.isEmpty() && !nut2.isEmpty()){
                    int so1 =
                }
            }
        });
    }
}