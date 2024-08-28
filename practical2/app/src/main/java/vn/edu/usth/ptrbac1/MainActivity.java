package vn.edu.usth.ptrbac1;

import android.content.Intent;
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

    EditText edtA,edtB;
    Button ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
            edtA = findViewById(R.id.edtA);
            edtB = findViewById(R.id.edtB);
            ketqua = findViewById(R.id.ketqua);
            // xử lí click
            ketqua.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    khai báo Intnet
                    Intent myintent = new Intent(MainActivity.this, ResultActivity.class);
//                   lấy dữ liệu
                    int a = Integer.parseInt(edtA.getText().toString());
                    int b = Integer.parseInt(edtB.getText().toString());
//                    đóng gói dữ liệu vào Bundle
                    Bundle mybundle = new Bundle();
//                    đưa dữ liệu vào Bundle
                    mybundle.putInt("soa",a);
                    mybundle.putInt("soa",b);
//                    đưa bundle vào
                    myintent.putExtra("mypackage",mybundle);
//                    khởi động intent
                    startActivity(myintent);

                }
            });
        };
    }
