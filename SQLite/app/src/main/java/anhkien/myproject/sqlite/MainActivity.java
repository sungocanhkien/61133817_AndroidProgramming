package anhkien.myproject.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewFruits;
    ArrayList<String> fruitsList;
    ArrayAdapter<String> fruitsAdapter;
    SQLiteDatabase db; // SQLiteDatabase khai báo ở đây luôn

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
        // 1. Ánh xạ ListView
        listViewFruits = findViewById(R.id.lvSQLite_Fruit);

        // 2. Tạo hoặc mở database Fruits.db
        db = openOrCreateDatabase("Fruits.db", MODE_PRIVATE, null);

        // 3. Tạo bảng nếu chưa có
        String sqlDropTable = "DROP TABLE IF EXISTS Fruits"; // Xóa bảng nếu đã tồn tại
        String sqlCreateTable = "CREATE TABLE Fruits (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL)";

        db.execSQL(sqlDropTable); // Xóa
        db.execSQL(sqlCreateTable); // Tạo bảng mới

        // 4. Thêm dữ liệu mẫu
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Apple')");
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Banana')");
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Orange')");
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Mango')");
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Grapes')");

        // 5. Tạo ArrayList để chứa dữ liệu
        fruitsList = new ArrayList<>();

        // 6. Đọc dữ liệu từ bảng Fruits
        Cursor cursor = db.rawQuery("SELECT * FROM Fruits", null);

        while (cursor.moveToNext()) {
            // Lấy tên trái cây ở cột name
            String fruitName = cursor.getString(1); // Cột 1 là 'name'
            fruitsList.add(fruitName);
        }
        cursor.close(); // Đóng cursor

        // 7. Đưa dữ liệu vào ListView
        fruitsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fruitsList);
        listViewFruits.setAdapter(fruitsAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (db != null && db.isOpen()) {
            db.close(); // Đóng database khi activity bị hủy
        }
    }
}