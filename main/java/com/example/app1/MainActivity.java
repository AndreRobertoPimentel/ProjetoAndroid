package com.example.app1;



import static com.example.app1.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //metodo abaixo vincula xml com arquivo do java .
        //a MainActivity.java ira ficar responsavel pela activity_main.xml
        setContentView(R.layout.activity_main);

        //Criar objeto do tipo de componente que esta na tela

        //O findViewByid procura na tela o id informado
        EditText campoEntrada = findViewById(text);

        Button btParImpar = findViewById(R.id.btParImpar);

        Button btNPrimo = findViewById(R.id.btNPrimo);

        Button btFatorial = findViewById(R.id.btFatorial);

        //adicionar evento de onClick no botaoMensagem

        btParImpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperar o texto no campo entrada
                String texto = campoEntrada.getText().toString();
                int numero = Integer.parseInt(texto);


                String resultado;

                if (numero % 2 == 0) {
                    resultado = "O número é par.";
                } else {
                    resultado = "O número é ímpar.";
                }
                //exibir o texto  no  toast
                Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_SHORT).show();
            }

        });
        //adicionar evento de onClick no botaoMensagem
        btNPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperar o texto no campo entrada
                String texto = campoEntrada.getText().toString();
                int numero = Integer.parseInt(texto);
                boolean ehPrimo = true;

                if (numero <= 1) {
                    ehPrimo = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            ehPrimo = false;
                            break;
                        }
                    }
                }
                //exibir o texto  no  toast
                String resultado = ehPrimo ? "O número é primo." : "O número não é primo.";
                Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_SHORT).show();
            }


        });
        //adicionar evento de onClick no botaoMensagem
        btFatorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperar o texto no campo entrada
                String texto = campoEntrada.getText().toString();
                int numero = Integer.parseInt(texto);
                int fatorial = 1;

                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                //exibir o texto  no  toast
                String resultado = "O fatorial de " + numero + " é " + fatorial;
                Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_LONG).show();
            }

        });
    }
}