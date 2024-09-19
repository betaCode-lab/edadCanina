package com.example.edadcanina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText age;
    private TextView textResult;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        age = findViewById(R.id.age);
        textResult = findViewById(R.id.text_result);
        btnCalculate = findViewById(R.id.btnCalcular);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!age.getText().toString().isEmpty()){
                    int dogAge = Integer.parseInt(age.getText().toString());
                    int result = dogAge * 7;
                    String resultStr = "La edad del can es " + result + " años.";
                    textResult.setText(resultStr);
                } else {
                    Toast.makeText(MainActivity.this, "La edad es obligatoria.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}