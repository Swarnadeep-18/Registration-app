package com.example.registration;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText Email, password;

    RadioButton android, java;

    CheckBox cprogramming, skilljava, python;

    Spinner legspin;

    Button lastbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        android = findViewById(R.id.android);
        java = findViewById(R.id.java);
        cprogramming = findViewById(R.id.cprogramming);
        skilljava = findViewById(R.id.skilljava);
        python = findViewById(R.id.python);
        legspin = findViewById(R.id.legspin);
        lastbutton = findViewById(R.id.lastbutton);

        lastbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = Email.getText().toString();
                String pass = password.getText().toString();

                String course="";

                if (android.isChecked()){
                    course="android";
                }
                if (java.isChecked()){
                    course="java";
                }

                String skill="";

                if (cprogramming.isChecked()){
                    skill="cprogramming";
                }

                if (skilljava.isChecked()){
                    skill="skilljava";
                }

                if (python.isChecked()){
                    skill="python";
                }

                String dpt = legspin.getSelectedItem().toString();
                String display = mail+"\n"+pass+"\n"+course+"\n"+skill;
                Toast.makeText(MainActivity.this,display, Toast.LENGTH_SHORT).show();
            }
        });




    }
}