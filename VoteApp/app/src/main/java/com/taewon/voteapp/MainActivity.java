package com.taewon.voteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnResult;
    ImageView[] imgs = new ImageView[9];
    Integer[] rimgID = {R.id.img1,R.id.img2,R.id.img3,R.id.img4,R.id.img5,R.id.img6,R.id.img7,
            R.id.img8,R.id.img9};
    int votecount[] = new int[9];
    String imgName[] = {"독서하는 소녀","꽃장식 모자 소녀","부채를 든 소녀","이레느깡 단 베르앙",
            "잠자는 소녀","테라스의 두 자매","피아노 레슨","피아노 앞의 소녀들","해변에서"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = findViewById(R.id.btnResult);
        for(int i=0;i<rimgID.length;i++){
            imgs[i] = findViewById(rimgID[i]);
            votecount[i] = 0;
        }
        //메소드 기능 처리
        for(int i=0;i<imgs.length;i++){
            final int index = i;
            imgs[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    votecount[index]++;
                    Toast.makeText(getApplicationContext(),imgName[index]+" : 총 "+votecount[index]+
                            "표",Toast.LENGTH_SHORT).show();
                }
            });
        }
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent = new Intent(getApplicationContext(),VoteResultActivity.class);
                mintent.putExtra("VoteCount",votecount);
                mintent.putExtra("ImageName",imgName);
                mintent.putExtra("imgNameID",rimgID);
                startActivity(mintent);
            }
        });

    }
}