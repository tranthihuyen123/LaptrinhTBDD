package com.example.androidbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy ra button theo ID
        Button button1 = (Button) this.findViewById(R.id.go_button1);
        Button button2 = (Button) this.findViewById(R.id.go_button2);
        Button button3 = (Button) this.findViewById(R.id.go_button3);
        Button button4 = (Button) this.findViewById(R.id.go_button4);
        Button button5 = (Button) this.findViewById(R.id.go_button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code dể khi nhấn nút
                // Tạo một Intent:
                // (Mang nội dung sẽ gửi tới Example1Activity).
                Intent myIntent = new Intent(MainActivity.this, Example1Activity.class);

                // Các tham số gắn trên Intent (Không bắt buộc).
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                // Yêu cầu chạy Example1Activity.
                MainActivity.this.startActivity(myIntent);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Example2Activity.class);

                // Các tham số gắn trên Intent (Không bắt buộc).
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                // Yêu cầu chạy Example1Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Example3Activity.class);

                // Các tham số gắn trên Intent (Không bắt buộc).
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                // Yêu cầu chạy Example1Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Example4Activity.class);

                // Các tham số gắn trên Intent (Không bắt buộc).
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                // Yêu cầu chạy Example1Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Example5Activity.class);

                // Các tham số gắn trên Intent (Không bắt buộc).
                myIntent.putExtra("text1", "This is text");
                myIntent.putExtra("text2", "This is long text");
                // Yêu cầu chạy Example1Activity.
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}
