package com.qptech.misssaigon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();

    }

    private void setListener(){
        TextView btn0 = findViewById(R.id.btn0);
        TextView btn1 = findViewById(R.id.btn1);
        TextView btn2 = findViewById(R.id.btn2);
        TextView btn3 = findViewById(R.id.btn3);
        TextView btn4 = findViewById(R.id.btn4);
        TextView btn5 = findViewById(R.id.btn5);
        TextView btn6 = findViewById(R.id.btn6);
        TextView btn7 = findViewById(R.id.btn7);
        TextView btn8 = findViewById(R.id.btn8);
        TextView btn9 = findViewById(R.id.btn9);
        TextView btnA = findViewById(R.id.btnA);
        TextView btnB = findViewById(R.id.btnB);
        TextView btnG = findViewById(R.id.btnG);
        TextView btnH = findViewById(R.id.btnH);
        TextView btnBack = findViewById(R.id.btnBack);
        TextView btnDone = findViewById(R.id.btnDone);
        TextView btnSumbit = findViewById(R.id.btnSubmit);
        btn0.setOnClickListener(listener);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btnA.setOnClickListener(listener);
        btnB.setOnClickListener(listener);
        btnG.setOnClickListener(listener);
        btnH.setOnClickListener(listener);
        btnBack.setOnClickListener(listener);
        btnDone.setOnClickListener(listener);
        btnSumbit.setOnClickListener(listener);
    }

    private void displayOrderNumber(String newValue){
        TextView tvDisplay = findViewById(R.id.tvDisplay);
        String currentDisplayValue = tvDisplay.getText().toString();
        String newDisplayValue = currentDisplayValue + newValue;
        tvDisplay.setText(newDisplayValue);
    }

    private void displaySum(){

    }

    View.OnClickListener listener = v -> {
        if(v.getId() == R.id.btn0){
            displayOrderNumber("0");
        }
        if(v.getId() == R.id.btn1){
            displayOrderNumber("1");
        }
        if(v.getId() == R.id.btn2){
            displayOrderNumber("2");
        }
        if(v.getId() == R.id.btn3){
            displayOrderNumber("3");
        }
        if(v.getId() == R.id.btn4){
            displayOrderNumber("4");
        }
        if(v.getId() == R.id.btn5){
            displayOrderNumber("5");
        }
        if(v.getId() == R.id.btn6){
            displayOrderNumber("6");
        }
        if(v.getId() == R.id.btn7){
            displayOrderNumber("7");
        }
        if(v.getId() == R.id.btn8){
            displayOrderNumber("8");
        }
        if(v.getId() == R.id.btn9){
            displayOrderNumber("9");
        }
        if(v.getId() == R.id.btnA){
            displayOrderNumber("a");
        }
        if(v.getId() == R.id.btnB){
            displayOrderNumber("b");
        }
        if(v.getId() == R.id.btnG){
            displayOrderNumber("g");
        }
        if(v.getId() == R.id.btnH){
            displayOrderNumber("h");
        }
        if(v.getId() == R.id.btnBack){
            TextView tvDisplay = findViewById(R.id.tvDisplay);
            String currentDisplayValue = tvDisplay.getText().toString();
            StringBuffer sb = new StringBuffer(currentDisplayValue);
            sb.deleteCharAt(sb.length()-1);
            tvDisplay.setText(sb);
        }
        if(v.getId() == R.id.btnDone){

        }
        if(v.getId() == R.id.btnSubmit){
            //TODO:
            // Add item to orderlist
            // Summe ausrechnen
        }


    };


}