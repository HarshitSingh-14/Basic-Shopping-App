package com.example.creamixshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String msg= "com.order.multiscreen.class.msg"; // just name inreturn of <--

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void placeOrder(View view){
            Intent intent = new Intent(this, OrderActivity.class);
            EditText editText1= findViewById(R.id.item1);
            EditText editText2= findViewById(R.id.item2);
            EditText editText3= findViewById(R.id.item3);
            String message;
            message = "PLEASE WAIT..... Your items : " +editText1.getText().toString() + ",  "+
                    editText1.getText().toString()+",  "+
                     editText1.getText().toString()+ " is being ordered.                                                 It will reach you via Cash On Delivery(COD) ";
            intent.putExtra(msg,message);
            startActivity(intent);

        }

    }
