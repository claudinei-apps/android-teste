package br.teste.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

// Tela de teste: só mostra que o build do GitHub funcionou.
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView texto = new TextView(this);
        texto.setText("Olá! Build de teste do GitHub funcionando.");
        texto.setTextSize(22);
        texto.setTextColor(Color.BLACK);
        texto.setGravity(Gravity.CENTER);
        texto.setPadding(48, 48, 48, 48);
        setContentView(texto);
    }
}
