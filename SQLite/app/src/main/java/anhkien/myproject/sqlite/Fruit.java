package anhkien.myproject.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Fruit extends AppCompatActivity {
    SQLiteDatabase db;
    ListView listViewFruit;
    ArrayList<String> dsFruits;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewFruit = findViewById(R.id.lvSQLite_Fruit);
        dsFruits = new ArrayList<>();

        // 1. Tạo / Mở database
        db = openOrCreateDatabase("Fruits.db", MODE_PRIVATE, null);

        // 2. Xóa bảng nếu đã tồn tại, tạo bảng mới
        String sqlDropTable = "DROP TABLE IF EXISTS Fruits";
        String sqlCreateTable = "CREATE TABLE Fruits (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL)";
        db.execSQL(sqlDropTable);
        db.execSQL(sqlCreateTable);

        // 3. Insert dữ liệu mẫu
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Apple')");
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Banana')");
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Orange')");
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Mango')");
        db.execSQL("INSERT INTO Fruits (name) VALUES ('Grapes')");

        // 4. Đọc dữ liệu
        String sqlSelect = "SELECT * FROM Fruits";
        Cursor cursor = db.rawQuery(sqlSelect, null);

        while (cursor.moveToNext()) {
            // lấy dữ liệu cột 1 (cột name)
            String fruitName = cursor.getString(1);
            dsFruits.add(fruitName);
        }
        cursor.close();

        // 5. Đổ dữ liệu vào ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                dsFruits);

        listViewFruit.setAdapter(adapter);

        // 6. Đóng database (nên đóng khi không dùng nữa)
        db.close();
    }

}
