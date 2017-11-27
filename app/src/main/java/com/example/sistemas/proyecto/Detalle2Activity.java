package com.example.sistemas.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle2Activity extends AppCompatActivity {

    ImageView foto;
    TextView titulo;
    TextView detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle2);

        foto = (ImageView) findViewById(R.id.imgFoto);
        titulo = (TextView) findViewById(R.id.txtTitulo);
        detalle = (TextView) findViewById(R.id.txtDescripcion);

        Datos obj = (Datos) getIntent().getExtras().getSerializable("objeto");

        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDetalle());
        foto.setImageResource(obj.getImagen());


    }
}
