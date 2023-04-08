package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2;
    private TextView textview;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.convertintokg);
        button2=findViewById(R.id.convertintopound);
        textview=findViewById(R.id.result);
        editText=findViewById(R.id.value);

        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(MainActivity.this, "Converting into kilogram", Toast.LENGTH_SHORT).show();
                                           String value=editText.getText().toString();
                                           int pound=Integer.parseInt(value);
                                           double kg=pound/2.2058;
                                           textview.setText("The corresponding value in kilogram is "+ kg);
                                       }
                                   }
        );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converting into pound", Toast.LENGTH_SHORT).show();
                String value=editText.getText().toString();
                int kg=Integer.parseInt(value);
                double pound=2.2058*kg;
                textview.setText("The corresponding value in pound is "+ pound);
            }
        }
        );




    }
}