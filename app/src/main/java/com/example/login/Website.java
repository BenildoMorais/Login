package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.login.databinding.ActivityWebsiteBinding;

public class Website extends AppCompatActivity {

    private ActivityWebsiteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebsiteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Uri = binding.website.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://www.ovagames.com/"));
                startActivity(intent);
            }
        });
    }
}