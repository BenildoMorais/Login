package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final int request_code = 5;
    private ActivityMainBinding binding;

    private final String USERNAME = "Lecc31";
    private final String PASSWORD = "5432A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = binding.username.getText().toString();
                String password = binding.password.getText().toString();

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    Intent intent = new Intent(MainActivity.this, InfoUser.class);
                    intent.putExtra("keyuser",username);
                    intent.putExtra("keypassword",password);
                    startActivity(intent);

                    startActivityForResult(intent,5);

                }
            }
        });

    }

}