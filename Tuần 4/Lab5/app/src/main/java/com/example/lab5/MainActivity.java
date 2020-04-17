package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // khai báo buton với 2 cái text mà m sài
        // đặt tên để dễ sài s
        // nên đặt giống C# cho nó quen
        // quên còn 1 cái mà m sài tới nữa để show kết quả
        Button btnCong = findViewById(R.id.button_cong);
        Button btnTru = findViewById(R.id.button_tru);
        Button btnNhan = findViewById(R.id.button_nhan);
        Button btnChia = findViewById(R.id.button_chia);
        final EditText txtSoA =  findViewById(R.id.editText_soa);
        final EditText txtSoB = findViewById(R.id.editText_sob);
        final TextView txtKetQua = findViewById(R.id.textView_KetQua);
        // sử lý biến cố click của từng cái
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //trong đây muốn làm gì
                // phải lấy số a+số b ko

                int soA= Integer.parseInt(txtSoA.getText().toString()); // lỗi vì kiểu của txt là kiểu string nên phải ép kiểu
                int soB = Integer.parseInt(txtSoB.getText().toString());
                int tong=soA+soB; // không hiểu khúc này nữa thì toang :(( ddm hieu
                //rồi hiện ra kết quả
                //hiện ra đâu thì gọi nó lên
                //3p????
                txtKetQua.setText(soA +" + "+ soB+" = "+tong); // hiểu ko ủa trong () để tổng thoi chứ nhưng cái đề thấy r
                //chạy thử xem chưa mở cái ai phon xx của t lên kìa

            }

        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(txtSoA.getText().toString());
                int soB = Integer.parseInt(txtSoB.getText().toString());
                int hieu = soA - soB;
                txtKetQua.setText(soA +" - " +soB+ " = "+hieu);

            }
        });
        btnNhan.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(txtSoA.getText().toString());
                int soB = Integer.parseInt(txtSoB.getText().toString());
                int tich = soA * soB;
                txtKetQua.setText(soA +" * " +soB+ " = "+tich);
            }
        }));
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(txtSoA.getText().toString());
                int soB = Integer.parseInt(txtSoB.getText().toString());
                int thuong = soA / soB;
                txtKetQua.setText(soA +" / " +soB+ " = "+thuong);
            }
        });



    }
}
