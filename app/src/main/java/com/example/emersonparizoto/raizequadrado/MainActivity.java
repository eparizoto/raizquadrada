package com.example.emersonparizoto.raizequadrado;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "RaizEQuadrado";

    //Used to load the 'mynativelib' library on application startup.
    static {
        System.loadLibrary("mynativelibJNI");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewQuad = (TextView)findViewById(R.id.textViewQu);
        textViewQuad.setText(String.valueOf(quadrado(5)));
        Log.d(TAG, "Quadrado = " + quadrado(5));

        TextView textViewRaiz = (TextView)findViewById(R.id.textViewRq);
        textViewRaiz.setText(String.valueOf(raiz(49)));
        Log.d(TAG, "Raiz = " + raiz(49));
    }

    public native double quadrado(int number);
    public native double raiz(int number);
}
