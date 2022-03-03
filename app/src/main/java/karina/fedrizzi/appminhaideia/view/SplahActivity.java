package karina.fedrizzi.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import karina.fedrizzi.appminhaideia.R;
import karina.fedrizzi.appminhaideia.model.Cliente;

public class SplahActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";
    int tempoDeEspera = 1000 * 5;

    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        Log.d(TAG, "onCreate: Tela splash carregada...");
        
        trocarTela();
    }

    private void trocarTela() {
        Log.d(TAG, "trocarTela: mudando de tela....");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objCliente = new Cliente("Karina",
                        "karina.fedrizzi912gmail.com",
                        "67981456", 30,
                        true);

                Log.d(TAG, "trocarTela: esperando um tempo ....");

                Intent trocarDeTela  = new Intent(SplahActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome",objCliente.getNome());
                bundle.putString("email",objCliente.getEmail());

                trocarDeTela.putExtras(bundle);

                startActivity(trocarDeTela);
                finish();
            }
        }, tempoDeEspera);
    }
}