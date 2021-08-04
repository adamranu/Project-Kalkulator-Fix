package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText editNama, editPass;
    Button submit, submit2, submit3, submit4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama    = findViewById(R.id.editNama);
        editPass    = findViewById(R.id.editPass);
        submit      = findViewById(R.id.submit);
        submit2     = findViewById(R.id.submit2);
        submit3     = findViewById(R.id.submit3);
        submit4     = findViewById(R.id.submit4);
        textView    = findViewById(R.id.textHasil);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = editNama.getText().toString();
                String input2 = editPass.getText().toString();

                Kali(
                        Float.parseFloat(input1), Float.parseFloat(input2)
                );
            }
        });

        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = editNama.getText().toString();
                String input2 = editPass.getText().toString();

                Bagi(
                        Float.parseFloat(input1), Float.parseFloat(input2)
                );
            }
        });

        submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = editNama.getText().toString();
                String input2 = editPass.getText().toString();

                Tambah(
                        Float.parseFloat(input1), Float.parseFloat(input2)
                );
            }
        });

        submit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = editNama.getText().toString();
                String input2 = editPass.getText().toString();

                Kurang(
                        Float.parseFloat(input1), Float.parseFloat(input2)
                );
            }
        });
    }

    private void Kali(float input1, float input2){
        float kali = input1*input2;
        textView.setText(String.valueOf(kali));
    }

    private void Bagi(float input1, float input2){
        float bagi = input1/input2;
        textView.setText(String.valueOf(bagi));
    }

    private void Tambah(float input1, float input2){
        float tambah = input1+input2;
        textView.setText(String.valueOf(tambah));
    }

    private void Kurang(float input1, float input2){
        float kurang = input1-input2;
        textView.setText(String.valueOf(kurang));
    }
}