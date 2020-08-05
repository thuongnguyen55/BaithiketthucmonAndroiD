package com.example.baithiketthucmon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNhap = (EditText) findViewById(R.id.editNhap);
    }
    public void onClick(View view) {
        int n = Integer.parseInt(editNhap.getText().toString());
        double s = 0f;

        for (int i=1; i<=n ; i++)
            s += (double)i/ (double)n;

        //Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra( "qString", String.valueOf(s));
        startActivity(intent);
    }
}