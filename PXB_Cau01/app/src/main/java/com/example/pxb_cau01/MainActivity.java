package com.example.pxb_cau01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt_dn;
    EditText et_tk1,et_tk2;
    CheckBox ck_luu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_tk1 = (EditText)findViewById(R.id.editText_tk1);
        et_tk2 = (EditText)findViewById(R.id.editText_tk2);
        bt_dn = (Button) findViewById(R.id.button_dangnhap);
        ck_luu = (CheckBox)findViewById(R.id.checkBox_luu);
        bt_dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tk = et_tk1.getText().toString();
                String tk2 = et_tk2.getText().toString();
                if (!tk.isEmpty() && !tk2.isEmpty()) {
                    if (ck_luu.isChecked()) {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu"
                                , Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
