package com.example.juanjess.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btnUno;
    Button btnDos;
    Button btnTres;
    Button btnCuatro;
    Button btnCinco;
    Button btnSeis;
    Button btnSiete;
    Button btnOcho;
    Button btnNueve;
    Button btnCero;
    Button btnC;
    Button btnCE;
    Button btnMenos;
    Button btnMas;
    Button btnPor;
    Button btnEntre;
    Button btnRaiz;
    Button btnIgual;
    Button btnPunto;
    TextView Resultado;

    Double rpta,r;
    String num1,num2,num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button)findViewById(R.id.Uno);
        btnDos = (Button)findViewById(R.id.Dos);
        btnTres = (Button)findViewById(R.id.Tres);
        btnCuatro = (Button)findViewById(R.id.Cuatro);
        btnCinco = (Button)findViewById(R.id.Cinco);
        btnSeis = (Button)findViewById(R.id.Seis);
        btnSiete = (Button)findViewById(R.id.Siete);
        btnOcho = (Button)findViewById(R.id.Ocho);
        btnNueve = (Button)findViewById(R.id.Nueve);
        btnCero = (Button)findViewById(R.id.Cero);
        btnC = (Button)findViewById(R.id.C);
        btnCE = (Button)findViewById(R.id.CE);
        btnMenos = (Button)findViewById(R.id.Menos);
        btnMas = (Button)findViewById(R.id.Mas);
        btnPor = (Button)findViewById(R.id.Por);
        btnEntre = (Button)findViewById(R.id.Entre);
        btnRaiz = (Button)findViewById(R.id.Raiz);
        btnIgual = (Button)findViewById(R.id.Igual);
        btnPunto = (Button)findViewById(R.id.Punto);


        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "1";
                Resultado.setText(num1);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "2";
                Resultado.setText(num1);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "3";
                Resultado.setText(num1);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "4";
                Resultado.setText(num1);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "5";
                Resultado.setText(num1);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "6";
                Resultado.setText(num1);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "7";
                Resultado.setText(num1);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "8";
                Resultado.setText(num1);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "9";
                Resultado.setText(num1);
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Resultado.getText().toString();
                num1=num1 + "0";
                Resultado.setText(num1);
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Resultado.getText().toString().contains(".")){
                    num1 = Resultado.getText().toString();
                    num1 = num1 + ".";
                    Resultado.setText(num1);
                }
            }
        });

        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1="";
                num2= Resultado.getText().toString();
                num3="+";
                Resultado.setText("+");
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1="";
                num2= Resultado.getText().toString();
                num3="-";
                Resultado.setText("-");
            }
        });

        btnPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1="";
                num2= Resultado.getText().toString();
                num3="x";
                Resultado.setText("x");
            }
        });

        btnEntre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1="";
                num2= Resultado.getText().toString();
                num3="/";
                Resultado.setText("/");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1="";
                Resultado.setText(num1);
                num2="";
                num3="";
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Resultado.getText().toString();
                num1=num1.substring(0,num1.length()-1);
                Resultado.setText(num1);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(num3.equals("-")){
                    rpta = Double.parseDouble(num2) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(rpta));
                }
                if(num3.equals("+")){
                    rpta = Double.parseDouble(num2) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(rpta));
                }
                if(num3.equals("/")){
                    if (Double.parseDouble(Resultado.getText().toString())==0) {
                        Resultado.setText("Error");
                    }
                     else{
                        rpta = Double.parseDouble(num2) / Double.parseDouble(Resultado.getText().toString());
                        Resultado.setText(String.valueOf(rpta));
                    }
                }

                if(num3.equals("x")){
                    rpta = Double.parseDouble(num2) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(rpta));
                }

            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=Double.parseDouble(Resultado.getText().toString());
                rpta=Math.sqrt(r);
                Resultado.setText(String.valueOf(rpta));
            }
        });

    }
}
