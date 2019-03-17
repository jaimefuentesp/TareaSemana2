package com.jaimefuentesp.tareasemana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonSiguiente = findViewById(R.id.botonSiguiente);
        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textoNombre= (EditText) findViewById(R.id.txtInputNombre);
                EditText textoTelef= (EditText) findViewById(R.id.txtInputTelefono);
                EditText textoMail= (EditText) findViewById(R.id.txtInputEmail);
                EditText textoDesc= (EditText) findViewById(R.id.txtInputDescContacto);
                DatePicker dpFecha = (DatePicker) findViewById(R.id.dpFecha);
                String fecha;
                //Toast.makeText(getBaseContext(),textoNombre.getText().toString(), Toast.LENGTH_SHORT).show
                Intent intentConfirmacion =new Intent(MainActivity.this,Confimacion.class);
                intentConfirmacion.putExtra(getResources().getString(R.string.nombre),textoNombre.getText().toString());
                intentConfirmacion.putExtra(getResources().getString(R.string.telefono),textoTelef.getText().toString());
                intentConfirmacion.putExtra(getResources().getString(R.string.mail),textoMail.getText().toString());
                intentConfirmacion.putExtra(getResources().getString(R.string.descripcion),textoDesc.getText().toString());
                fecha = Integer.toString(dpFecha.getDayOfMonth()) +"/"+ Integer.toString(dpFecha.getMonth()+1)+"/"+Integer.toString(dpFecha.getYear());
                intentConfirmacion.putExtra(getResources().getString(R.string.fechaNac),fecha);
                startActivity(intentConfirmacion);
                //finish()
            }
        });
    }
}
