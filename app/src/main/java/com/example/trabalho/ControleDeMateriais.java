package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ControleDeMateriais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_de_materiais);
    }
    public void CadastroDeMateriais(View view) {
        startActivity(new Intent(this, RcebimentoConcluido.class));

    }
}