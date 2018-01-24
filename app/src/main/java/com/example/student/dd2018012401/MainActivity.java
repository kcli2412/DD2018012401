package com.example.student.dd2018012401;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        File f = Environment.getExternalStorageDirectory();
        Log.d("FILE", f.getAbsolutePath());
    }

    public void click2(View v)
    {
//        File f = getExternalFilesDir();
    }
}
