package com.example.pickerdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nombre, fecha, telefono, email, descripcion;
    Button editar;
    informacion datos;
    String[] valor;
    int[] ifecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre              = (TextView) findViewById(R.id.tVnombre);
        fecha               = (TextView) findViewById(R.id.tVfecha);
        telefono            = (TextView) findViewById(R.id.tVtelefono);
        email               = (TextView) findViewById(R.id.tVemail);
        descripcion         = (TextView) findViewById(R.id.tVdescripcion);

        editar              = (Button) findViewById(R.id.beditar);

        Bundle parametro    = getIntent().getExtras();

        ifecha              = parametro.getIntArray(getResources().getString(R.string.fecha));

        valor               = parametro.getStringArray(getResources().getString(R.string.datosactividad1));

        datos = new informacion(valor[0],("Fecha Nacimiento: "+ valor[1]),("Tel. "+valor[2]),("Email: "+valor[3]),("Descripción: "+valor[4]));

        nombre.setText(datos.getNombredepersona());
        fecha.setText(datos.getFechanacimiento());
        telefono.setText(datos.getTelefonodepersona());
        email.setText(datos.getEmaildepersona());
        descripcion.setText(datos.getDescripciondepersona());

    }


    public void onClick(View view) {

        if(view==editar){
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            intent.putExtra(getString(R.string.datosactividad2), valor);
            intent.putExtra(getString(R.string.editarfecha), ifecha);
            startActivity(intent);
            finish();
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode==KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            intent.putExtra(getString(R.string.datosactividad2), valor);
            intent.putExtra(getString(R.string.editarfecha), ifecha);
            startActivity(intent);
            finish();
        }

        return super.onKeyDown(keyCode, event);
    }


}