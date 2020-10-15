package com.example.multicont;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.multicont.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    int contadorAll, contador1, contador2, contador3, contador4;
    int resetAll, reset1, reset2, reset3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.augmentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1++;
                binding.contador1.setText(String.valueOf(contador1));

                contadorAll++;
                binding.contadorAll.setText(String.valueOf(contador1 + contador2 + contador3 + contador4));
            }
        });
        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              contador1 = 0;
              contadorAll = 0;
              binding.contador1.setText(String.valueOf(contador1));
              binding.contadorAll.setText(String.valueOf(contadorAll + contador2 + contador3 + contador4));
            }
        });
        binding.augmentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                binding.contador2.setText(String.valueOf(contador2));

                contadorAll++;
                binding.contadorAll.setText(String.valueOf(contador1 + contador2 + contador3 + contador4));
            }
        });
        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2 = 0;
                contadorAll = 0;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadorAll.setText(String.valueOf(contadorAll + contador1 + contador3 + contador4));
            }
        });
        binding.augmentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                binding.contador3.setText(String.valueOf(contador3));

                contadorAll++;
                binding.contadorAll.setText(String.valueOf(contador1 + contador2 + contador3 + contador4));
            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            contador3 = 0;
            contadorAll = 0;
            binding.contador3.setText(String.valueOf(contador3));
            binding.contadorAll.setText(String.valueOf(contadorAll + contador1 + contador2 + contador4));
            }
        });

        binding.augmentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                binding.contador4.setText(String.valueOf(contador4));

                contadorAll++;
                binding.contadorAll.setText(String.valueOf(contador1 + contador2 + contador3 + contador4));
            }
        });

        binding.reset4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador4 = 0;
                contadorAll = 0;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorAll.setText(String.valueOf(contadorAll + contador1 + contador2 + contador3));
            }
        });

        binding.resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                contadorAll = 0;

                binding.contadorAll.setText(String.valueOf(contadorAll));
                binding.contador1.setText(String.valueOf(contador1));
                binding.contador2.setText(String.valueOf(contador2));
                binding.contador3.setText(String.valueOf(contador3));
                binding.contador4.setText(String.valueOf(contador4));
            }
        });
    }
}