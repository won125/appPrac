package com.taewon.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button[] btnNums = new Button[10];
    Integer[] btnID = {R.id.btnnum0, R.id.btnnum1, R.id.btnnum2, R.id.btnnum3,
            R.id.btnnum4, R.id.btnnum5, R.id.btnnum6, R.id.btnnum7,
            R.id.btnnum8, R.id.btnnum9};
    Button[] btnCalc = new Button[4];
    Integer[] btnCalcID = {R.id.btnsum, R.id.btnsub, R.id.btnmul, R.id.btndiv};
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView tvresult;
    EditText edtNum1, edtNum2;
    String strNum1, strNum2;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtnum1);
        edtNum2 = findViewById(R.id.edtnum2);
        for (int i = 0; i < btnNums.length; i++) {
            btnNums[i] = findViewById(btnID[i]);
        }
        for (int i = 0; i < btnCalc.length; i++) {
            btnCalc[i] = findViewById(btnCalcID[i]);
        }
        btnAdd = findViewById(R.id.btnsum);
        btnSub = findViewById(R.id.btnsub);
        btnMul = findViewById(R.id.btnmul);
        btnDiv = findViewById(R.id.btndiv);
        tvresult = findViewById(R.id.tvresult);

        for (int i = 0; i < 10; i++) {
            final int index = i;
            btnNums[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edtNum1.isFocused() == true) {
                        strNum1 = edtNum1.getText().toString() + btnNums[index].getText().toString();
                        edtNum1.setText(strNum1);
                    } else if (edtNum2.isFocused() == true) {
                        strNum2 = edtNum2.getText().toString() + btnNums[index].getText().toString();
                        edtNum2.setText(strNum2);
                    } else {
                        Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        for (int i = 0; i < 4; i++) {
            final int index = i;
            btnCalc[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    strNum1 = edtNum1.getText().toString();
                    strNum2 = edtNum2.getText().toString();
                    if(strNum1.equals("")||strNum2.equals("")){
                        Toast.makeText(getApplicationContext(), "계산할 값을 입력해주십시오.", Toast.LENGTH_SHORT).show();
                    }else {
                        switch (index) {
                            case 0:
                                result = Integer.parseInt(strNum1) + Integer.parseInt(strNum2);
                                break;
                            case 1:
                                result = Integer.parseInt(strNum1) - Integer.parseInt(strNum2);
                                break;
                            case 2:
                                result = Integer.parseInt(strNum1) * Integer.parseInt(strNum2);
                                break;
                            case 3:
                                if(strNum2.equals("0")){
                                    Toast.makeText(getApplicationContext(), "0을 제외한 값을 입력해주십시오.", Toast.LENGTH_SHORT).show();
                                }else{
                                    result = Integer.parseInt(strNum1) / Integer.parseInt(strNum2);
                                }
                                break;
                        }
                        tvresult.setText("계산 결과 : " + result);
                    }
                }
            });
        }
    }
}