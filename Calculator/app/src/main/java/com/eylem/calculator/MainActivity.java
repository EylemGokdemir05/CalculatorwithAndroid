package com.eylem.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.txt_sayi1);
        editText2=findViewById(R.id.txt_sayi2);
        textView=findViewById(R.id.txt_sonuc);
    }

    public void topla(View view){

        if(editText1.getText().toString().matches("") || editText2.getText().toString().matches("")){
            textView.setText("Lütfen sayı girin!");
        }
        else{
            int sayi1=Integer.parseInt(editText1.getText().toString());
            int sayi2=Integer.parseInt(editText2.getText().toString());
            int sonuc=sayi1+sayi2;
            textView.setText("Sonuç:"+sonuc);
        }

    }
    public void cikar(View view){

        if(editText1.getText().toString().matches("") || editText2.getText().toString().matches("")){
            textView.setText("Lütfen sayı girin!");
        }
        else{
            int sayi1=Integer.parseInt(editText1.getText().toString());
            int sayi2=Integer.parseInt(editText2.getText().toString());
            int sonuc=sayi1-sayi2;
            textView.setText("Sonuç:"+sonuc);
        }

    }
    public void carp(View view){
        if(editText1.getText().toString().matches("") || editText2.getText().toString().matches("")){
            textView.setText("Lütfen sayı girin!");
        }
        else{
            int sayi1=Integer.parseInt(editText1.getText().toString());
            int sayi2=Integer.parseInt(editText2.getText().toString());
            int sonuc=sayi1*sayi2;
            textView.setText("Sonuç:"+sonuc);
        }

    }
    public void bol(View view){
        if(editText1.getText().toString().matches("") || editText2.getText().toString().matches("")){
            textView.setText("Lütfen sayı girin!");
        }
        else{
            int sayi1=Integer.parseInt(editText1.getText().toString());
            int sayi2=Integer.parseInt(editText2.getText().toString());
            int sonuc=sayi1/sayi2;
            textView.setText("Sonuç:"+sonuc);
        }

    }
}
