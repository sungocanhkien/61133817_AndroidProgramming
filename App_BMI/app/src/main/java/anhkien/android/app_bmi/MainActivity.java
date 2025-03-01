package anhkien.android.app_bmi;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText _height, _weight;
    ImageView _male, _female;
    LinearLayout malelayout, femalelayout;
    Button _btn;
    TextView _result, condition;
    float h = 0, w=0, bmi=0;
    String user = "0";
    String res;

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
        _height=findViewById(R.id.height);_weight=findViewById(R.id.weight);
        _male=findViewById(R.id.immale);
        _female=findViewById(R.id.imfemale);
        _btn=findViewById(R.id.btn);
        malelayout=findViewById(R.id.mlayout);
        femalelayout=findViewById(R.id.felayout);
        _btn=findViewById(R.id.btn);
        _result=findViewById(R.id.result);

        malelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _male.setColorFilter(getResources().getColor(com.google.android.material.R.color.design_default_color_on_primary));
                _female.setColorFilter(getResources().getColor(androidx.cardview.R.color.cardview_light_background));
                user="Male";
            }
        });
        femalelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _female.setColorFilter(getResources().getColor(com.google.android.material.R.color.design_default_color_on_primary));
                _male.setColorFilter(getResources().getColor(androidx.cardview.R.color.cardview_light_background));
                user="feMale";
            }
        });
        _btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = _height.getText().toString();
                String str2 = _weight.getText().toString();
                if(user.equals("0")){
                    Toast.makeText(MainActivity.this, "Hãy chọn giới tính của bạn!", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(str1)){
                    _height.setError("Hãy nhập chiều cao!");
                    _height.requestFocus();
                    return;
                }
                else if (TextUtils.isEmpty(str2)){
                    _weight.setError("Hãy nhập cân nặng!");
                    _weight.requestFocus();
                    return;
                }
            }
        });
    }
    private void calculate(){
        h=Float.parseFloat(_height.getText().toString());
        w=Float.parseFloat(_weight.getText().toString());
        float  hm;
        hm = h/100;
        bmi = (h/(hm*hm));
    }
}