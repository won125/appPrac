package com.taewon.numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //객체선언
    EditText editNumber;
    Button btnGameStart,btnConfirm,btnMenuAuto,btnFinish;
    TextView tvHint;
    ImageView imgGame;
    int mynumber; // 입력 받을 값
    int random_num; // 난수
    int count;//게임 진행 횟수
    String[] menu = {"피자","커피","분식","중국집","일식","치킨","고기","양식"};
    int choice;//난수 발생 값 저장
    Random random = new Random();
    InputMethodManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("숫자 맞추기 게임");

        //선언된 객체와 xml과 연결(선언된 작업 = 연결작업(xml위젯이름));
        editNumber = findViewById(R.id.editNumber);
        btnGameStart = findViewById(R.id.btnGameStart);
        btnConfirm = findViewById(R.id.btnConfirm);
        tvHint = findViewById(R.id.tvHint);
        tvHint.setText("게임시작버튼을 누르셔야 게임이 시작됩니다.");
        imgGame = findViewById(R.id.imgGame);
        btnMenuAuto = findViewById(R.id.btnMenuAuto);
        btnFinish = findViewById(R.id.btnFinish);
        InputMethodManager manager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);

        //메서드로 기능처리
        btnGameStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random_num = (int)(Math.random()*100)+1;
                count=0;
                btnConfirm.setEnabled(true);
                btnGameStart.setEnabled(false);
                tvHint.setText("자!! 게임이 시작되었습니다!!");
                btnMenuAuto.setVisibility(View.INVISIBLE);
            }
        });
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                mynumber = Integer.parseInt(editNumber.getText().toString());

                if(mynumber>random_num){
                    tvHint.setText("당신이 입력한 숫자가 너무 큽니다.\n 좀 더 작은 수를 입력해주십시오.(시도 횟수 : "+count+" 회)");
                    imgGame.setImageResource(R.drawable.angry);
                }else if(mynumber<random_num){
                    tvHint.setText("당신이 입력한 숫자가 너무 작습니다.\n 좀 더 큰 수를 입력해주십시오.(시도 횟수 : "+count+" 회)");
                    imgGame.setImageResource(R.drawable.angry);
                }else if(mynumber==random_num){
                    tvHint.setText("축하합니다. 정답을 맞추셨습니다!!!(시도 횟수 : "+count+" 회)");
                    imgGame.setImageResource(R.drawable.smile);
                    btnConfirm.setEnabled(false);
                    btnGameStart.setEnabled(true);
                    btnMenuAuto.setVisibility(View.VISIBLE);
                    manager.hideSoftInputFromWindow(editNumber.getWindowToken(),0);

                }else{
                    tvHint.setText("잘못된 입력입니다.");
                }
                editNumber.setText(null);
            }
        });
        //복불복 내기메뉴 자동선택 버튼
        btnMenuAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = random.nextInt(menu.length);
                tvHint.setText("당첨!! 복불복 내기 메뉴는 " + menu[choice]);
                btnMenuAuto.setVisibility(View.INVISIBLE);
            }
        });
        //앱 종료 버튼
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}