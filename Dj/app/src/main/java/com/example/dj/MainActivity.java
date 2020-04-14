package com.example.dj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText NumberOneET, NumberTwoET;
    TextView result;
    int var1, var2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        javaconnectionwithxml();
    }


    private void javaconnectionwithxml() {
        NumberOneET = findViewById(R.id.numberOneET);
        NumberTwoET = findViewById(R.id.numberTwoET);
        result = findViewById(R.id.result);

    }

    public void add(View objView) {
        if (!NumberOneET.getText().toString().isEmpty() && (!NumberTwoET.getText().toString().isEmpty())) {
            var1 = Integer.parseInt(NumberOneET.getText().toString());
            var2 = Integer.parseInt(NumberTwoET.getText().toString());
            res = var1 + var2;
        }
        else if(NumberOneET.getText().toString().isEmpty())
        {
            Toast.makeText(this, R.string.plz_enter_value_one, Toast.LENGTH_SHORT).show();
        }
        else if(NumberTwoET.getText().toString().isEmpty())
        {
            Toast.makeText(this, R.string.plz_enter_value_two, Toast.LENGTH_SHORT).show();
        }


    }
}