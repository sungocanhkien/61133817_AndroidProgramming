package anhkien.android.listview_ds_xe_oto;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListView_ChiTiet_xeOTO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_chi_tiet_xe_oto);
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

        switch (TenOto){
            case "Toyota Corolla Altis":
                textViewchitietoto.setText("Toyota Corolla Altis là mẫu sedan phổ biến với thiết kế sang trọng.");
                break;
            case "Honda Civic":
                textViewchitietoto.setText("Honda Civic có phong cách thể thao, phù hợp với người trẻ.");
                break;
            case "Mazda 3":
                textViewchitietoto.setText("Mazda 3 là dòng xe 5 chỗ hiện đại, nhiều công nghệ tiên tiến.");
                break;
            case "Toyota Fortuner":
                textViewchitietoto.setText("Toyota Fortuner là SUV 7 chỗ mạnh mẽ, bền bỉ.");
                break;
            case "Ford Everest":
                textViewchitietoto.setText("Ford Everest sở hữu động cơ mạnh mẽ và khả năng off-road tốt.");
                break;
            case "Mitsubishi Xpander":
                textViewchitietoto.setText("Mitsubishi Xpander là mẫu SUV 7 chỗ đô thị với giá thành hợp lý.");
                break;
        }
    }
}