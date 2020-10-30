package com.uso.parcial2hn17_i04_001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Respuesta extends AppCompatActivity {

    TextView  Respuesta;
    private SharedPreferences configuraciones;
    public  static final String KEY_Respuesta = "KEY_Respuesta";
    public static final String ARCHIVOR = "ConfiguracionR";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        Respuesta = findViewById(R.id.idNumeroNuevo);
        this.configuraciones = getSharedPreferences(Juegos.ARCHIVOR, MODE_PRIVATE);
        conectarServicios();
    }

    private void conectarServicios(){
        if(this.configuraciones != null){
            String aleatorio = this.configuraciones.getString(Juegos.KEY_Respuesta,"");
            Respuesta.setText(aleatorio);

        }
    }
}