package com.taewon.diary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button btnSave;
    EditText edtDiary;
    CalendarView calView;
    String fileName; // 저장할 파일 이름
    String content; // 일기 내용을 담을 변수
    String btnText;
    int cYear,cMonth,cDay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 일기장");
        btnSave = findViewById(R.id.btnSave);
        edtDiary = findViewById(R.id.edtDiary);
        calView = findViewById(R.id.calView);
        Calendar cal = Calendar.getInstance();
        cYear = cal.get(Calendar.YEAR);
        cMonth = cal.get(Calendar.MONTH)+1;
        cDay = cal.get(Calendar.DAY_OF_MONTH);
        fileName = cYear+"_"+cMonth+"_"+cDay+".txt";
        content = readDiary(fileName);
        edtDiary.setText(content);

        //달력에 날짜를 선택
        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                fileName = year+"_"+(month+1)+"_"+dayOfMonth+".txt";
                content = readDiary(fileName);
                edtDiary.setText(content);
            }
        });
        //저장하기 버튼 메서드
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream fost = openFileOutput(fileName, Context.MODE_PRIVATE);
                    content = edtDiary.getText().toString();
                    fost.write(content.getBytes());
                    fost.close();
                    if(btnSave.getText().toString().equals("수정하기")){
                        btnText="가 수정되었습니다.";
                    }else{
                        btnText="가 저장되었습니다.";
                    }
                    Toast.makeText(getApplicationContext(),fileName+btnText,Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(),"파일을 저장할 수 없습니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }//onCreate

    //일기를 읽어오는 메서드
    String readDiary(String fname){
        String diaryStr="";
        try {
            FileInputStream fileis = openFileInput(fname);
            byte[] ch = new byte[fileis.available()];
            fileis.read(ch);
            diaryStr = (new String(ch)).trim();
            fileis.close();
            btnSave.setText("수정하기");
        } catch (IOException e) {
            edtDiary.setHint("일기없음");
            edtDiary.setText("");
            btnSave.setText("저장하기");
        }

        return diaryStr;
    }
}