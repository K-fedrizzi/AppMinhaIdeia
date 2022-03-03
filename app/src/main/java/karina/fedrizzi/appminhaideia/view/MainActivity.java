package karina.fedrizzi.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import karina.fedrizzi.appminhaideia.R;
import karina.fedrizzi.appminhaideia.model.Cliente;


public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    Cliente objCliente;
    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela Principal Carregada.... ");

        Bundle bundle = getIntent().getExtras();

        Log.d(TAG, "onCreate: Nome... "+ bundle.getString("nome"));
        Log.d(TAG, "onCreate: Email..."+ bundle.getString("email"));

       txtNome = findViewById(R.id.txtNome);
       txtNome.setText("Bem vindo..."+ bundle.getString("nome"));
    }
}