package com.jaimefuentesp.tareasemana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class Confimacion extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvMail;
    private TextView tvDesripcion;
    private TextView tvFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confimacion);

        Bundle parametros = getIntent().getExtras();

        String nombre=parametros.getString(getResources().getString(R.string.nombre));
        String telefono=parametros.getString(getResources().getString(R.string.telefono));
        String email=parametros.getString(getResources().getString(R.string.mail));
        String descripcion=parametros.getString(getResources().getString(R.string.descripcion));
        String fecha=parametros.getString(getResources().getString(R.string.fechaNac));

        tvNombre =(TextView) findViewById(R.id.lnlConfirNombre);
        tvTelefono =(TextView) findViewById(R.id.lnlConfirTelefono);
        tvMail =(TextView) findViewById(R.id.lnlConfirMail);
        tvDesripcion =(TextView) findViewById(R.id.lnlConfirDesc);
        tvFecha =(TextView) findViewById(R.id.lnlConfirFecha);

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvMail.setText(email);
        tvDesripcion.setText(descripcion);
        tvFecha.setText(fecha);

        Button botonEditar = findViewById(R.id.botonEditar);
        botonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                //Toast.makeText(getBaseContext(),textoNombre.getText().toString(), Toast.LENGTH_SHORT).show();
                //Intent intentMain =new Intent(Confimacion.this,MainActivity.class);
                //startActivity(intentMain);
            }
        });
    }
}
