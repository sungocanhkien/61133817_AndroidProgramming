package anhkien.android.luyentap_tonghop_my;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau2_chiTiet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2_chi_tiet);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageViewOTO = findViewById(R.id.imageXEoto);
        TextView textViewoto = findViewById(R.id.txtTenOTO);
        TextView textViewchitietoto = findViewById(R.id.txtChiTietOto);

        String TenOto = getIntent().getStringExtra("tên oto");
        textViewoto.setText(TenOto);

        int imageResource = R.drawable.ferrari;
        String chitiet = "Thông tin chưa có";

        switch (TenOto) {
            case "Toyota Corolla Altis":
                imageResource = R.drawable.toyota_coroll_a_altis;
                chitiet = "Toyota Corolla Altis là mẫu sedan phổ biến với thiết kế sang trọng.";
                break;
            case "Honda Civic":
                imageResource = R.drawable.honda_civic;
                chitiet = "Honda Civic có phong cách thể thao, phù hợp với người trẻ.";
                break;
            case "Mazda 3":
                imageResource = R.drawable.mazda_3;
                chitiet = "Mazda 3 là dòng xe 5 chỗ hiện đại, nhiều công nghệ tiên tiến.";
                break;
            case "Toyota Fortuner":
                imageResource = R.drawable.toyota_fortuner;
                chitiet = "Toyota Fortuner là SUV 7 chỗ mạnh mẽ, bền bỉ.";
                break;
            case "Ford Everest":
                imageResource = R.drawable.ford_everest;
                chitiet = "Ford Everest sở hữu động cơ mạnh mẽ và khả năng off-road tốt.";
                break;
            case "Mitsubishi Xpander":
                imageResource = R.drawable.mistsubishi_xpander;
                chitiet = "Mitsubishi Xpander là mẫu SUV 7 chỗ đô thị với giá thành hợp lý.";
                break;
        }

        // Gán thông tin và ảnh vào giao diện
        textViewchitietoto.setText(chitiet);
        imageViewOTO.setImageResource(imageResource);
    }
}