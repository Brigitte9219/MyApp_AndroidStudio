package com.sena.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DosActivity extends AppCompatActivity {

    Button btnATres;//Declarar el boton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);


        btnATres=findViewById(R.id.btnContinuar);

        RadioGroup grupoRadio = findViewById(R.id.grupoRadio);


        //BOTON CONTINUAR
        btnATres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acciones a realizar cuando se hace clic en el botón
                // Por ejemplo, inicia otra actividad y muestra un mensaje en la interfaz de usuario
                Intent intent= new Intent(DosActivity.this, TresActivity.class);
                startActivity(intent);

                // Muestra un mensaje en la interfaz de usuario
                showToast("Hiciste clic en el botón y pasaste a la página No 3");
            }
        });

        //RADIOGROUP
        grupoRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Manejar el cambio de selección de los RadioButtons
                RadioButton radioButton = findViewById(checkedId);

                if (radioButton != null) {
                    String opcionSeleccionada = radioButton.getText().toString();
                    showToast("Bienvenid@: " + opcionSeleccionada+" !");
                }
            }
        });


    }

    private void showToast(String message) {
        // Código para mostrar un mensaje en la interfaz de usuario
        Toast.makeText(DosActivity.this, message, Toast.LENGTH_SHORT).show();

    }
}