package com.creacionesyazmin.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 40, 40, 40);

        TextView titulo = new TextView(this);
        titulo.setText("CREACIONES YAZMIN");
        titulo.setTextSize(28);
        titulo.setTextColor(Color.BLACK);
        titulo.setGravity(Gravity.CENTER);

        TextView bienvenida = new TextView(this);
        bienvenida.setText("Bienvenida a nuestra tienda");
        bienvenida.setTextSize(18);
        bienvenida.setGravity(Gravity.CENTER);
        bienvenida.setPadding(0, 30, 0, 0);

        layout.addView(titulo);
        layout.addView(bienvenida);

        setContentView(layout);
    }
}
