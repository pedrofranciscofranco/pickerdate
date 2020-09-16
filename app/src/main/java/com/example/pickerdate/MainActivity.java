package com.example.pickerdate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener  {

    EditText texto2, telefono, email, descripcion;
    DatePicker sirve;
    Button cancelar, ok, siguiente;
    informacion muestra;
    String[] valor;
    int[] fecha;
    int dia=1, mes=0, ano=1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        texto2          =  findViewById(R.id.editTextTextPersonName);
        telefono        = findViewById(R.id.editTextTextTelefono);
        email           = findViewById(R.id.editTextTextEmail);
        descripcion     = findViewById(R.id.editTextTextDescripcion);

        cancelar        = findViewById(R.id.cancelar);
        ok              = findViewById(R.id.Ok);
        siguiente       = findViewById(R.id.siguiente);

        sirve           = findViewById(R.id.sirve);
        ano             =sirve.getYear();
        dia             =sirve.getDayOfMonth();
        mes             =sirve.getMonth();

        fecha= new int[]{dia, mes, ano};


        Bundle parametro2 = getIntent().getExtras();
        if(parametro2 !=null){
            valor = parametro2.getStringArray(getResources().getString(R.string.datosactividad2));
            muestra = new informacion(valor[0], valor[1], valor[2], valor[3],valor[4]);
            texto2.setText(muestra.getNombredepersona());
            telefono.setText(muestra.getTelefonodepersona());
            email.setText(muestra.getEmaildepersona());
            descripcion.setText(muestra.getDescripciondepersona());

            fecha = parametro2.getIntArray(getResources().getString(R.string.editarfecha));
            sirve.updateDate(fecha[2],fecha[1],fecha[0]);

        }


    }


    @Override
    public void onClick(View view) {

        if (view==ok ){

            ano=sirve.getYear();
            dia = sirve.getDayOfMonth();
            mes= sirve.getMonth();

            fecha= new int[]{dia, mes, ano};

        }

        if (view==cancelar ){

            sirve.updateDate(fecha[2],fecha[1],fecha[0]);

        }

        if (view==siguiente){

            muestra = new informacion(texto2.getText().toString(),dia+"/"+(mes+1)+"/"+ano,telefono.getText().toString(),email.getText().toString(),descripcion.getText().toString());

            valor = new String[]{muestra.getNombredepersona(), muestra.getFechanacimiento(), muestra.getTelefonodepersona(), muestra.getEmaildepersona(), muestra.getDescripciondepersona()};

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra(getString(R.string.datosactividad1), valor);
            intent.putExtra(getString(R.string.fecha), fecha);
            startActivity(intent);
            finish();

        }


    }

 }