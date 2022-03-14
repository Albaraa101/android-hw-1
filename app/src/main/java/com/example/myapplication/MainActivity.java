package com.example.myapplication;

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
        EditText Q = findViewById(R.id.quizes);
         EditText h = findViewById(R.id.HW);
        EditText M = findViewById(R.id.MT);
        EditText F = findViewById(R.id.Final);
        Button Cal = findViewById(R.id.calculate);
        Button reset = findViewById(R.id.reset);
        TextView result = findViewById(R.id.TotalGrade);
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(Q.getText().toString());
                int b = Integer.parseInt(h.getText().toString());
                int c = Integer.parseInt(M.getText().toString());
                int d = Integer.parseInt(F.getText().toString());
                int total = a+b+c+d;
                result.setText("Your Total is :"+total+"%");
            }
        });


    }
}