package anhkien.android.ex5_next_inline_anonymous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSoA;
    EditText editTextSoB;
    Button buttonTong, buttonHieu, buttonTich, buttonThuong;
    EditText editTextKQ;
    void TimView(){
        editTextSoA = (EditText) findViewById(R.id.edtSoA);
        editTextSoB = (EditText) findViewById(R.id.edtSoB);
        editTextKQ = (EditText) findViewById(R.id.edtKQ);
        buttonTong = (Button) findViewById(R.id.btnTong);
        buttonHieu = (Button) findViewById(R.id.btnHieu);
        buttonTich = (Button) findViewById(R.id.btnTich);
        buttonThuong = (Button) findViewById(R.id.btnThuong);
    }

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
        TimView();
        buttonTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTong();
            }
        });
        buttonHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyHieu();
            }
        });
        buttonTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTich();
            }
        });
        buttonThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyThuong();
            }
        });
    }
    void XuLyTong(){
        String strSoA = editTextSoA.getText().toString();
        String strSoB = editTextSoB.getText().toString();

        float SoA = Float.parseFloat(strSoA);
        float SoB = Float.parseFloat(strSoB);

        float Tong = SoA + SoB;
        String StrKQ = String.valueOf(Tong);
        editTextKQ.setText(StrKQ);
    }
    void XuLyHieu(){
        String strSoA = editTextSoA.getText().toString();
        String strSoB = editTextSoB.getText().toString();

        float SoA = Float.parseFloat(strSoA);
        float SoB = Float.parseFloat(strSoB);

        float Hieu = SoA - SoB;
        String StrKQ = String.valueOf(Hieu);
        editTextKQ.setText(StrKQ);
    }
    void XuLyTich(){
        String strSoA = editTextSoA.getText().toString();
        String strSoB = editTextSoB.getText().toString();

        float SoA = Float.parseFloat(strSoA);
        float SoB = Float.parseFloat(strSoB);

        float Tich = SoA * SoB;
        String StrKQ = String.valueOf(Tich);
        editTextKQ.setText(StrKQ);
    }
    void XuLyThuong(){
        String strSoA = editTextSoA.getText().toString();
        String strSoB = editTextSoB.getText().toString();

        float SoA = Float.parseFloat(strSoA);
        float SoB = Float.parseFloat(strSoB);

        float Thuong = SoA / SoB;
        String StrKQ = String.valueOf(Thuong);
        editTextKQ.setText(StrKQ);
    }
}