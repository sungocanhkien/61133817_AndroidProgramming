package anhkien.example.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSoA;
    EditText editTextSoB;
    Button buttonTong, buttonHieu, buttonTich, buttonThuong;
    EditText textViewKQ;
    void TimView(){
        editTextSoA = (EditText) findViewById(R.id.edtSoA);
        editTextSoB = (EditText) findViewById(R.id.edtSoB);
        buttonTong = (Button) findViewById(R.id.btnTong);
        buttonHieu = (Button) findViewById(R.id.btnHieu);
        buttonTich = (Button) findViewById(R.id.btnTich);
        buttonThuong = (Button) findViewById(R.id.btnThuong);
        textViewKQ = (EditText) findViewById(R.id.edtKQ);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimView();
        buttonTong.setOnClickListener(XuLyTong);
        buttonHieu.setOnClickListener(XuLyHieu);
        buttonTich.setOnClickListener(XuLyTich);
        //buttonThuong.setOnClickListener(XuLyThuong);
        buttonThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSoA = editTextSoA.getText().toString();
                String strSoB = editTextSoB.getText().toString();

                float SoA = Float.valueOf(strSoA);
                float SoB = Float.valueOf(strSoB);

                float Thuong = SoA / SoB;
                String StrKQ = String.valueOf(Thuong);
                textViewKQ.setText(StrKQ);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    View.OnClickListener XuLyTong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = editTextSoA.getText().toString();
            String strSoB = editTextSoB.getText().toString();

            float SoA = Float.valueOf(strSoA);
            float SoB = Float.valueOf(strSoB);

            float Tong = SoA + SoB;
            String StrKQ = String.valueOf(Tong);
            textViewKQ.setText(StrKQ);
        }
    };
    View.OnClickListener XuLyHieu = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = editTextSoA.getText().toString();
            String strSoB = editTextSoB.getText().toString();

            float SoA = Float.valueOf(strSoA);
            float SoB = Float.valueOf(strSoB);

            float Hieu = SoA - SoB;
            String StrKQ = String.valueOf(Hieu);
            textViewKQ.setText(StrKQ);
        }
    };
    View.OnClickListener XuLyTich = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = editTextSoA.getText().toString();
            String strSoB = editTextSoB.getText().toString();

            float SoA = Float.valueOf(strSoA);
            float SoB = Float.valueOf(strSoB);

            float Tich = SoA * SoB;
            String StrKQ = String.valueOf(Tich);
            textViewKQ.setText(StrKQ);
        }
    };

}