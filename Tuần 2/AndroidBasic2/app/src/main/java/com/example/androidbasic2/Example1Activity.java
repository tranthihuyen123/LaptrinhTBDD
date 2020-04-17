package com.example.androidbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Example1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);


        Intent intent = getIntent();

        // Tham số trong Intent truyền sang từ MainActivity
        String value1  = intent.getStringExtra("text1");


        // Tham số trong Intent truyền sang từ MainActivity
        String value2 = intent.getStringExtra("text2");

        // Lấy ra đối tượng trên giao diện bởi ID của nó.
        final TextView text1 = (TextView)this.findViewById(R.id.my_text1);

        // Lấy ra đối tượng trên giao diện bởi ID của nó.
        final TextView text2 = (TextView)this.findViewById(R.id.my_text2);

        text1.setText(value1);
        text2.setText(value2);
        Button button = this.findViewById(R.id.my_button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("You click button");
            }
        });
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                text2.setText("You long click button");
                return true;

            }
        });





    }
}
