package com.example.gestionnairedenote;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }

    public void cliqueButtonEnseignant (View v) {
        setContentView(R.layout.activity_main_enseignant);
    }

    public void cliqueButtonEtudiant (View v) {
        setContentView(R.layout.activity_main_etudiant);
    }

    public void cliqueButtonAdm (View v){
        setContentView(R.layout.activity_main_adm);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principale, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case (R.id.itemAcceuil):
                setContentView(R.layout.activity_main);
                return true;
            case (R.id.itemAdm):
                setContentView(R.layout.activity_main);
                return true;
            case (R.id.itemEnseignant):
                setContentView(R.layout.activity_main_enseignant);
                return true;
            case (R.id.itemEtudiant):
                setContentView(R.layout.activity_main_etudiant);
                return true;
            case (R.id.itemQuitter):
                System.exit(0);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
