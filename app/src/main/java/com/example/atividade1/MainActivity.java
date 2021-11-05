package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.atividade1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    double jarda = 91.44,calculo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculo = jarda * Integer.parseInt(binding.num.getText().toString());
                binding.resul.setText(Double.toString(calculo));
            }
        });
    }
}