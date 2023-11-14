package com.sena.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TresActivity extends AppCompatActivity {

    Button btnAUno;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        btnAUno=findViewById(R.id.btnContinua);

        btnAUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acciones a realizar cuando se hace clic en el botón
                // Por ejemplo, inicia otra actividad y muestra un mensaje en la interfaz de usuario
                Intent intent = new Intent(TresActivity.this, MainActivity.class);
                startActivity(intent);

                // Muestra un mensaje en la interfaz de usuario
                showToast("Hiciste clic en el botón y pasaste al Menu Principal");
            }
        });
    }

    private void showToast(String message) {
        // Código para mostrar un mensaje en la interfaz de usuario
        Toast.makeText(TresActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}