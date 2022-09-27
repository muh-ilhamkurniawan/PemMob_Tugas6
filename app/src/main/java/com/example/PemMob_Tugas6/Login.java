package com.example.PemMob_Tugas6;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Login extends AppCompatActivity {
    private Button buttonSubmit;
    private EditText etAngka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonSubmit = findViewById(R.id.btnSubmit);
        etAngka = findViewById(R.id.etbilangan);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent (Login.this, MainActivity.class);
                pindah.putExtra("bilangan", etAngka.getText().toString());
                startActivity(pindah);
            }
        });
    }
}
