package anhkien.android.luyentap_tonghop_my;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau3_CarDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau3_car_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imgCar = findViewById(R.id.img_car_detail);
        TextView txtCarName = findViewById(R.id.txt_car_name);
        TextView txtCarDesc = findViewById(R.id.txt_car_detail);

        // Nhận dữ liệu từ Intent
        Intent intent = getIntent();
        String carName = intent.getStringExtra("car_name");
        int carImage = intent.getIntExtra("car_image", 0);
        String carDesc = intent.getStringExtra("car_desc");

        // Gán dữ liệu lên giao diện
        txtCarName.setText(carName);
        imgCar.setImageResource(carImage);
        txtCarDesc.setText(carDesc);
    }
}