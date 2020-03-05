package com.example.gestionnairedenote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AjouterDevoir extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_devoir);
    }

    public void cliqueBoutonAjouterDevoir (View v) {
        setContentView(R.layout.activity_ajouter_devoir);
    }

    public void cliqueAnnuler1(View v) {
        finishAffinity();

            }
    }


