package com.qptech.misssaigon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    //TODO
    // OrderItemList Formatierung Nummer und Preis

    private List<OrderItem> menu;
    private float sum = 0;
    private List<OrderItem> currentOrderList;
    private List<View> currentOrderListViewItem;
    private int mulitplicationFactor = 1;

    private List<OrderItem> initMenu() {
        List<OrderItem> menu = new ArrayList<>();
        menu.add(new OrderItem("1", 3.6F));
        menu.add(new OrderItem("2", 2.8F));
        menu.add(new OrderItem("3", 4.2F));
        menu.add(new OrderItem("4", 5.1F));

        menu.add(new OrderItem("6", 3.9F));
        menu.add(new OrderItem("7", 5.1F));
        menu.add(new OrderItem("8", 5.1F));
        menu.add(new OrderItem("8g", 5.8F));
        menu.add(new OrderItem("8h", 5.8F));

        menu.add(new OrderItem("9", 7.7F));
        menu.add(new OrderItem("10", 7.9F));
        menu.add(new OrderItem("11", 7.3F));
        menu.add(new OrderItem("12", 7.7F));
        menu.add(new OrderItem("13", 7.3F));
        menu.add(new OrderItem("14", 7.9F));
        menu.add(new OrderItem("15", 7.9F));
        menu.add(new OrderItem("15a", 8.3F));
        menu.add(new OrderItem("19", 7.9F));

        menu.add(new OrderItem("20", 8.3F));
        menu.add(new OrderItem("20g", 11.4F));
        menu.add(new OrderItem("22", 10.5F));
        menu.add(new OrderItem("23", 11.0F));
        menu.add(new OrderItem("24", 9.7F));
        menu.add(new OrderItem("25", 12.5F));
        menu.add(new OrderItem("26", 9.7F));

        menu.add(new OrderItem("20b", 8.8F));
        menu.add(new OrderItem("22b", 11.0F));
        menu.add(new OrderItem("23b", 11.5F));
        menu.add(new OrderItem("24b", 10.2F));
        menu.add(new OrderItem("25b", 12.80F));

        menu.add(new OrderItem("30", 8.3F));
        menu.add(new OrderItem("30g", 11.4F));
        menu.add(new OrderItem("32", 10.5F));
        menu.add(new OrderItem("33", 11.0F));
        menu.add(new OrderItem("34", 9.7F));
        menu.add(new OrderItem("35", 12.5F));
        menu.add(new OrderItem("36", 9.7F));

        menu.add(new OrderItem("40", 9.7F));
        menu.add(new OrderItem("41", 9.9F));
        menu.add(new OrderItem("42", 9.9F));
        menu.add(new OrderItem("42a", 10.1F));
        menu.add(new OrderItem("43", 8.7F));
        menu.add(new OrderItem("43b", 11.9F));
        menu.add(new OrderItem("44", 8.7F));
        menu.add(new OrderItem("44b", 11.9F));
        menu.add(new OrderItem("46", 9.9F));
        menu.add(new OrderItem("47", 9.7F));
        menu.add(new OrderItem("49", 9.9F));

        menu.add(new OrderItem("60", 13.1F));
        menu.add(new OrderItem("61", 13.3F));
        menu.add(new OrderItem("62", 10.3F));
        menu.add(new OrderItem("62b", 13.3F));
        menu.add(new OrderItem("63", 10.3F));
        menu.add(new OrderItem("63b", 13.3F));
        menu.add(new OrderItem("68", 13.3F));
        menu.add(new OrderItem("68a", 13.5F));
        menu.add(new OrderItem("69", 13.3F))
        ;
        menu.add(new OrderItem("64", 10.9F));
        menu.add(new OrderItem("65", 10.9F));
        menu.add(new OrderItem("66", 10.9F));
        menu.add(new OrderItem("67", 10.9F));

        menu.add(new OrderItem("70", 11.6F));
        menu.add(new OrderItem("71", 11.8F));
        menu.add(new OrderItem("72", 11.8F));
        menu.add(new OrderItem("72a", 12.0F));
        menu.add(new OrderItem("76", 11.8F));
        menu.add(new OrderItem("79", 11.8F));

        menu.add(new OrderItem("80", 10.7F));
        menu.add(new OrderItem("81", 10.9F));
        menu.add(new OrderItem("82", 10.9F));
        menu.add(new OrderItem("82a", 11.2F));
        menu.add(new OrderItem("86", 10.9F));
        menu.add(new OrderItem("87", 10.9F));
        menu.add(new OrderItem("89", 10.9F));

        menu.add(new OrderItem("Groß", 1.9F));
        menu.add(new OrderItem("Beilage", 4.9F));
        menu.add(new OrderItem("Soße", 1.3F));
        menu.add(new OrderItem("Reis / statt Reis", 3.4F));
        menu.add(new OrderItem("Getränk", 1.9F));
        menu.add(new OrderItem("Getränk mit Pfand", 2.05F));
        menu.add(new OrderItem("Bier mit Pfand", 2.0F));
        return menu;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout wrapper = findViewById(R.id.wrapper);
        wrapper.setBackgroundColor(Color.parseColor("#80e6e6e6"));
        currentOrderList = new ArrayList<>();
        currentOrderListViewItem = new ArrayList<>();
        menu = initMenu();
        setListener();
        TextView tvDisplay = findViewById(R.id.tvDisplay);
        tvDisplay.setText("1x");
    }

    private void displayOrderNumber(String newValue){
        final TextView tvDisplay = findViewById(R.id.tvDisplay);
        final String currentDisplayValue = tvDisplay.getText().toString();
        String newDisplayValue="";
        if(currentDisplayValue.contains("  ")) {
            String[] parts = currentDisplayValue.split("  ");
            newDisplayValue = mulitplicationFactor+"x"+"  "+parts[1]+newValue;
        }else {
            newDisplayValue = mulitplicationFactor+"x"+"  "+newValue;
        }
        tvDisplay.setText(newDisplayValue);
        tvDisplay.setTypeface(tvDisplay.getTypeface(), Typeface.BOLD);
    }

    private void displayMultiplication(){
        final TextView tvDisplay = findViewById(R.id.tvDisplay);
        final String currentDisplayValue = tvDisplay.getText().toString();
        String newDisplayValue="";

        if(currentDisplayValue.length() == 0) newDisplayValue = mulitplicationFactor+"x";
        else if(currentDisplayValue.contains("  ")) {
            String[] parts = currentDisplayValue.split("  ");
            newDisplayValue = mulitplicationFactor+"x"+"  "+parts[1];
        }else {
            newDisplayValue = mulitplicationFactor+"x";
        }
/*
        if(currentDisplayValue.contains("  ")) {
            String[] parts = currentDisplayValue.split("  ");
            newDisplayValue = mulitplicationFactor+"x"+"  "+parts[1];
        }else {
            newDisplayValue = mulitplicationFactor+"x"+"  "+currentDisplayValue;
        }*/
        tvDisplay.setText(newDisplayValue);
        tvDisplay.setTypeface(tvDisplay.getTypeface(), Typeface.BOLD);
    }

    private void addItemToOrderList(TextView tvDisplay, String value) {
        String currentValue = value;
        if(tvDisplay != null && currentValue == null) {
            currentValue = tvDisplay.getText().toString();
            if(!currentValue.contains("  ")) return;
            String[] parts = currentValue.split("  ");
            currentValue = parts[1];
        }
        for (OrderItem orderItem : menu) {
            final String itemNumber = orderItem.getNumber();
            if(itemNumber.equals(currentValue)){
                final float itemPrice = orderItem.getPrice();
                OrderItem orderItemArrayList = new OrderItem(itemNumber, itemPrice);
                currentOrderList.add(orderItemArrayList);
                LinearLayout linearLayout = (LinearLayout)findViewById(R.id.orderList);
                LinearLayout itemWrapper = configureOrderItemTextView(itemNumber, itemPrice);
                currentOrderListViewItem.add(itemWrapper);
                linearLayout.addView(itemWrapper);
                TextView tvSummeDisplay = findViewById(R.id.tvSummeDisplay);

                sum = sum + itemPrice;
                String sumText = String.format("%.2f", sum)+" €";
                SpannableString content = new SpannableString(sumText);
                content.setSpan(new UnderlineSpan(), 0, sumText.length(), 0);
                tvSummeDisplay.setText(content);
                tvSummeDisplay.setTypeface(tvDisplay.getTypeface(), Typeface.BOLD);
                ScrollView scrollView = findViewById(R.id.scrollView);
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(View.FOCUS_DOWN);
                    }
                });
            }
        }
    }

    private LinearLayout configureOrderItemTextView(String number, float price) {
        TextView tvNumber = new TextView(this);
        String itemNumber = number+".";
        tvNumber.setText(itemNumber);
        tvNumber.setTextAppearance(getApplicationContext(),R.style.orderItem);
        TextView tvPrice = new TextView(this);
        String itemPrice = String.format("%.2f", price)+" €";
        tvPrice.setText(itemPrice);
        tvPrice.setTextAppearance(getApplicationContext(),R.style.orderItem);
        LinearLayout itemWrapper = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(40,0,200,0);
        tvNumber.setLayoutParams(params);
        itemWrapper.setOrientation(LinearLayout.HORIZONTAL);
        itemWrapper.addView(tvNumber);
        itemWrapper.addView(tvPrice);
        return itemWrapper;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onTouch(final View v, final MotionEvent event) {
        switch (v.getId()) {
        case R.id.btn0:
        case R.id.btn1:
        case R.id.btn2:
        case R.id.btn3:
        case R.id.btn4:
        case R.id.btn5:
        case R.id.btn6:
        case R.id.btn7:
        case R.id.btn8:
        case R.id.btn9:
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                v.setBackgroundResource(R.drawable.rounded_textview);
            }
            else if (event.getAction() == MotionEvent.ACTION_UP) {
                v.setBackgroundColor(0x00000000);
            }
            break;
        case R.id.btnA:
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                v.setBackgroundColor(Color.parseColor("#80cc0202"));
            }
            else if (event.getAction() == MotionEvent.ACTION_UP) {
                v.setBackgroundColor(Color.parseColor("#80FF0000"));
            }
            break;
        case R.id.btnB:
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                v.setBackgroundColor(Color.parseColor("#80c7645a"));
            }
            else if (event.getAction() == MotionEvent.ACTION_UP) {
                v.setBackgroundColor(Color.parseColor("#80FA8072"));
            }
            break;
        case R.id.btnH:
        case R.id.btnG:
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                v.setBackgroundColor(Color.parseColor("#80b4c98b"));
            }
            else if (event.getAction() == MotionEvent.ACTION_UP) {
                v.setBackgroundColor(Color.parseColor("#80DAF7A6"));
            }
            break;
        case R.id.btnSubmit:
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                v.setBackgroundColor(Color.parseColor("#3a873a"));
            }
            else if (event.getAction() == MotionEvent.ACTION_UP) {
                v.setBackgroundColor(Color.parseColor("#46a646"));
            }
            break;
        case R.id.btnDone:
        case R.id.btnDelete:
        case R.id.btnGroß:
        case R.id.btnBeilage:
        case R.id.btnSoße:
        case R.id.btnGetränk:
        case R.id.btnGetränkP:
        case R.id.btnBier:
        case R.id.btnReis:
        case R.id.btnDeleteLast:
            changeColorMainButtons(v, event);
            break;

        }


        return false;
    }

    private void changeColorMainButtons(final View v, final MotionEvent event){
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            v.setBackgroundColor(Color.parseColor("#80969696"));
        }
        else if (event.getAction() == MotionEvent.ACTION_UP) {
            v.setBackgroundColor(Color.parseColor("#80ababab"));
        }
    }

    @SuppressLint("ClickableViewAccessibility")
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
        btnA.setBackgroundColor(Color.parseColor("#80FF0000"));
        TextView btnB = findViewById(R.id.btnB);
        btnB.setBackgroundColor(Color.parseColor("#80FA8072"));
        TextView btnG = findViewById(R.id.btnG);
        btnG.setBackgroundColor(Color.parseColor("#80DAF7A6"));
        TextView btnH = findViewById(R.id.btnH);
        btnH.setBackgroundColor(Color.parseColor("#80DAF7A6"));
        TextView btnDelete = findViewById(R.id.btnDelete);
        btnDelete.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnDone = findViewById(R.id.btnDone);
        btnDone.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnSumbit = findViewById(R.id.btnSubmit);
        btnSumbit.setBackgroundColor(Color.parseColor("#46a646"));
        TextView btnGross = findViewById(R.id.btnGroß);
        btnGross.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnBeilage = findViewById(R.id.btnBeilage);
        btnBeilage.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnSosse = findViewById(R.id.btnSoße);
        btnSosse.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnReis = findViewById(R.id.btnReis);
        btnReis.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnDeleteLast = findViewById(R.id.btnDeleteLast);
        btnDeleteLast.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnGetränk = findViewById(R.id.btnGetränk);
        btnGetränk.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnGetränkP = findViewById(R.id.btnGetränkP);
        btnGetränkP.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnBier = findViewById(R.id.btnBier);
        btnBier.setBackgroundColor(Color.parseColor("#80ababab"));
        TextView btnX1 = findViewById(R.id.btn_plus1);
        TextView btnX2 = findViewById(R.id.btn_minus1);


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
        btnDelete.setOnClickListener(listener);
        btnDone.setOnClickListener(listener);
        btnSumbit.setOnClickListener(listener);
        btnGross.setOnClickListener(listener);
        btnBeilage.setOnClickListener(listener);
        btnSosse.setOnClickListener(listener);
        btnReis.setOnClickListener(listener);
        btnDeleteLast.setOnClickListener(listener);
        btnGetränk.setOnClickListener(listener);
        btnGetränkP.setOnClickListener(listener);
        btnBier.setOnClickListener(listener);
        btnX1.setOnClickListener(listener);
        btnX2.setOnClickListener(listener);

        btn0.setOnTouchListener(this);
        btn1.setOnTouchListener(this);
        btn2.setOnTouchListener(this);
        btn3.setOnTouchListener(this);
        btn4.setOnTouchListener(this);
        btn5.setOnTouchListener(this);
        btn6.setOnTouchListener(this);
        btn7.setOnTouchListener(this);
        btn8.setOnTouchListener(this);
        btn9.setOnTouchListener(this);
        btnA.setOnTouchListener(this);
        btnB.setOnTouchListener(this);
        btnG.setOnTouchListener(this);
        btnH.setOnTouchListener(this);
        btnDelete.setOnTouchListener(this);
        btnDone.setOnTouchListener(this);
        btnSumbit.setOnTouchListener(this);
        btnGross.setOnTouchListener(this);
        btnBeilage.setOnTouchListener(this);
        btnSosse.setOnTouchListener(this);
        btnReis.setOnTouchListener(this);
        btnDeleteLast.setOnTouchListener(this);
        btnGetränk.setOnTouchListener(this);
        btnGetränkP.setOnTouchListener(this);
        btnBier.setOnTouchListener(this);
        btnX1.setOnTouchListener(this);
        btnX2.setOnTouchListener(this);
    }

    View.OnClickListener listener = v -> {
        TextView tvDisplay = findViewById(R.id.tvDisplay);
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
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, null);
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnB){
            displayOrderNumber("b");
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, null);
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnG){
            displayOrderNumber("g");
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, null);
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnH){
            displayOrderNumber("h");
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, null);
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnGroß){
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, null);
                addItemToOrderList(tvDisplay, "Groß");
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnBeilage){
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, "Beilage");
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnSoße){
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, "Soße");
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnReis){
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, "Reis / statt Reis");
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnGetränk){
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, "Getränk");
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnGetränkP){
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, "Getränk mit Pfand");
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnBier){
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, "Bier mit Pfand");
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btnDelete){
            tvDisplay.setText(this.mulitplicationFactor+"x");
        }
        if(v.getId() == R.id.btnDeleteLast){
            LinearLayout linearLayout = (LinearLayout)findViewById(R.id.orderList);
            if(currentOrderList.size()>0) {
                linearLayout.removeView(currentOrderListViewItem.get(currentOrderListViewItem.size()-1));
                OrderItem item = currentOrderList.get(currentOrderList.size()-1);
                TextView tvSummeDisplay = findViewById(R.id.tvSummeDisplay);
                sum = sum - item.getPrice();
                String sumText = String.format("%.2f", sum)+" €";
                tvSummeDisplay.setText(sumText);
                currentOrderList.remove(currentOrderList.size()-1);
                currentOrderListViewItem.remove(currentOrderListViewItem.size()-1);
            }


        }
        if(v.getId() == R.id.btnDone){
            LinearLayout linearLayout = (LinearLayout)findViewById(R.id.orderList);
            TextView tvSummeDisplay = findViewById(R.id.tvSummeDisplay);
            linearLayout.removeAllViews();
            tvSummeDisplay.setText("");
            sum = 0;
            currentOrderList.clear();
            currentOrderListViewItem.clear();
        }
        if(v.getId() == R.id.btnSubmit){
            for(int i = 0; i<mulitplicationFactor; i++) {
                addItemToOrderList(tvDisplay, null);
            }
            tvDisplay.setText("1x");
            this.mulitplicationFactor = 1;
        }
        if(v.getId() == R.id.btn_plus1){
            this.mulitplicationFactor++;
            displayMultiplication();
        }
        if(v.getId() == R.id.btn_minus1){
            if(this.mulitplicationFactor == 1) return;
            this.mulitplicationFactor--;
            displayMultiplication();
        }
    };
}