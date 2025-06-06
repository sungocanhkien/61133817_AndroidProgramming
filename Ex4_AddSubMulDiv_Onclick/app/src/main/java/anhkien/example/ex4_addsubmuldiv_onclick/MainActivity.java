package anhkien.example.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    }
    public void XuLyCong(View view){
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);

        String Sothu1 = editTextSo1.getText().toString();
        String Sothu2 = editTextSo2.getText().toString();

        float So1 = Float.parseFloat(Sothu1);
        float So2 = Float.parseFloat(Sothu2);

        float tong = So1 + So2;

        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);

        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyTru(View view){
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);

        String Sothu1 = editTextSo1.getText().toString();
        String Sothu2 = editTextSo2.getText().toString();

        float So1 = Float.parseFloat(Sothu1);
        float So2 = Float.parseFloat(Sothu2);

        float tru = So1 - So2;

        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);

        String chuoiKQ = String.valueOf(tru);
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View view){
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);

        String Sothu1 = editTextSo1.getText().toString();
        String Sothu2 = editTextSo2.getText().toString();

        float So1 = Float.parseFloat(Sothu1);
        float So2 = Float.parseFloat(Sothu2);

        float nhan = So1 * So2;

        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);

        String chuoiKQ = String.valueOf(nhan);
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyChia(View view){
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);

        String Sothu1 = editTextSo1.getText().toString();
        String Sothu2 = editTextSo2.getText().toString();

        float So1 = Float.parseFloat(Sothu1);
        float So2 = Float.parseFloat(Sothu2);

        float thuong = So1 / So2;

        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);

        String chuoiKQ = String.valueOf(thuong);
        editTextKQ.setText(chuoiKQ);
    }
}