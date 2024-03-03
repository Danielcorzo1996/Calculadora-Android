package com.daniel.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2, num3, num4;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        res = findViewById(R.id.res);
    }

        public void sumar(View view) {
            double suma = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());
            res.setText(suma+"");
        }

        public void restar(View view) {
            double resta = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());
            res.setText(resta+"");
        }

        public void multiplicar(View view) {
            double multi = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
            res.setText(multi+"");
        }
        public void dividir(View view) {
            double divi = Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString());
            res.setText(divi+"");
        }
        public void factorial(View view) {

            int numero = Integer.parseInt(num3.getText().toString());
            int resultado = calcularfactorial(numero);
            res.setText(String.valueOf(resultado));

        }

        private int calcularfactorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * calcularfactorial(n - 1);
            }
        }

    public void fibonacci(View view) {

        int num = Integer.parseInt(num4.getText().toString());
        int resultado = calcularfibonacci(num);
        res.setText(String.valueOf(resultado));
    }

    private int calcularfibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularfibonacci(n - 1) + calcularfibonacci(n - 2);
        }
    }
}
