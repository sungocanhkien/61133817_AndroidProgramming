package anhkien.android.phepnhan_1x1;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText resultEditText;
    private Button selectedButton = null; //Lưu nút được chọn
    private int selectedNumber = 0; //Số được chọn từ GridLayout
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
        resultEditText = findViewById(R.id.editTextResult);
        Button checkButton = findViewById(R.id.checkButton);
        //Khai báo mảng ID của các nút số từ 1 đến 12
        int[] buttonIDs = {
                R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6,
                R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12
        };
        //Gán sự kiện click cho các nút số
        for(int i = 0; i < buttonIDs.length; i++){
            Button numberButton = findViewById(buttonIDs[i]);
            int number = i + 1; //Giá trị số từ 1 đến 12
            numberButton.setOnClickListener(v -> {
                selectedNumber = number; //Lưu số được chọn

                //Bỏ sáng nút trước đó nếu có
                if (selectedButton != null){
                    selectedButton.setBackgroundColor(Color.parseColor("#86B8E0")); //Màu bình tường.
                }
                //Làm sáng nút hiện tại
                numberButton.setBackgroundColor(Color.YELLOW); //Màu sáng khi chọn
                selectedButton = numberButton; //Lưu nút đang được chọn
            });
        }
        //Xử lý khi nhấn nút Check
        checkButton.setOnClickListener(v -> {
            if(selectedNumber != 0){
                int result = 1 * selectedNumber; //Tính phép nhân 1
                resultEditText.setText(String.valueOf(result)); //Hiển thị kết quả.
            }
        });
    }
}