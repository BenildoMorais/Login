package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.login.databinding.ActivityEmailBinding;

public class Email extends AppCompatActivity {

    private ActivityEmailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEmailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.enviaremail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destinatariList = binding.destino.getText().toString();
                String[] destinatarios = destinatariList.split(",");

                String subject = binding.subjiect.getText().toString();

                String mensagem = binding.mensagem.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, destinatarios);
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,mensagem);

                Toast.makeText(Email.this, "Funciona?", Toast.LENGTH_SHORT).show();
                intent.setType("message/rfc822");


                startActivity(Intent.createChooser(intent, "Escolha a app de Email"));
            }
        });
    }
}