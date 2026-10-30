package com.example.merlyvacaciones;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class VacacionesActivity extends AppCompatActivity {

    BottomNavigationView menuVacaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getIntent().getStringExtra("usuario") == null) {
            startActivity(new Intent(this, IngresoVacacionesActivity.class));
            finish();
            return;
        }

        setContentView(R.layout.activity_vacaciones);

        menuVacaciones = findViewById(R.id.menuVacaciones);
        menuVacaciones.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment pantalla = null;

                if (item.getItemId() == R.id.opcionInicio) {
                    pantalla = new InicioVacacionesFragment();
                } else if (item.getItemId() == R.id.opcionConfiguracion) {
                    pantalla = new ConfiguracionVacacionesFragment();
                }

                if (pantalla != null) {
                    mostrarPantalla(pantalla);
                    return true;
                }
                return false;
            }
        });

        if (savedInstanceState == null) {
            mostrarPantalla(new InicioVacacionesFragment());
        }
    }

    private void mostrarPantalla(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedorVacaciones, fragment)
                .commit();
    }
}
