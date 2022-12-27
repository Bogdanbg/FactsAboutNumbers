package com.example.factsaboutnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.factsaboutnumbers.databinding.ActivityMainBinding;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<FactModel> factModels = new ArrayList<>();

    private ActivityMainBinding binding;

    private final StringBuffer URL = new StringBuffer("http://http://numbersapi.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.getFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                URL.append(binding.numberEditText.getText());
                Intent intent = new Intent(MainActivity.this, FactActivity.class);
                startActivity(intent);
            }
        });

        binding.getRandomNumberFact.setOnClickListener(view1 -> URL.append("random/math"));

    }

    private void setUpFactModels(){
        String[] numbers;
        String[] factsNumbers;

        for (int i = 0; i < numbers.length; i++){
            factModels.add(new FactModel(numbers[i],factsNumbers[i]));
        }
    }
}