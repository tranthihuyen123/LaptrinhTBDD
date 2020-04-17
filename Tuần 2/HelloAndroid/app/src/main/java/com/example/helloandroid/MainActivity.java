package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //đầu tiên nó khai báo 1 cái TAG cái này giống như 1 biến v á kiểu string
    // cái này dùng để chứa cái nó báo về ví dụ trong C# là m ghi console.write("gì đó") để in ra màn hình
    // còn cái này nó khai báo biến rồi mới để thông điệp dô biến đó rồi mới in ra :D
    // hiểu gì ko. hong lát sẽ hiểu :D
    public static final String TAG ="MyMessage";

    //đây là hàm  onCreate đọc tên là biết lúc mới tạo nó sẽ gọi hàm này chạy
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Print Log
        //nè cái TAG đem xuống
        // má ko biết giải thích sao luôn :V nó thuôc 1 phạm trù mà phải tưởng tượng mới ra đc chạy thử cho m xem
       Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Print Log
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Print Log
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Print Log
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Print Log
        Log.i(TAG,"onResume");      }

    @Override
    protected void onStart() {
        super.onStart();
        // Print Log
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // Print Log
        Log.i(TAG,"onRestart");      }


    }

