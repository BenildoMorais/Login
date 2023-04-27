package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.login.databinding.ActivityInfoUserBinding;

public class InfoUser extends AppCompatActivity {

    private ActivityInfoUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();

        binding.username.setText(intent.getStringExtra("keyuser").toString());
        binding.password.setText(intent.getStringExtra("keypassword").toString());

        binding.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoUser.this, Home.class);
                startActivity(intent);
            }
        });

    }

}