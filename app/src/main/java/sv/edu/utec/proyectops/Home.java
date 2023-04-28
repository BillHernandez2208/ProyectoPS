package sv.edu.utec.proyectops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button Vcategorias,rdama,rhombre,rkids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        this.setTitle("Home");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Vcategorias = findViewById(R.id.btnVC);
        rdama = findViewById(R.id.btnRD);
        rhombre = findViewById(R.id.btnRH);
        rkids = findViewById(R.id.btnRN);


        Vcategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(getApplicationContext(),Categorias.class);
                startActivity(intento);
            }
        });

        rdama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(getApplicationContext(),RelojDamas.class);
                startActivity(intento);
            }
        });

        rhombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(getApplicationContext(),RelojHombre.class);
                startActivity(intento);
            }
        });

        rkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(getApplicationContext(),RelojKids.class);
                startActivity(intento);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }

}

