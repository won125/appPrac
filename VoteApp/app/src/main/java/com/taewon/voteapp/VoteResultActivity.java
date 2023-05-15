package com.taewon.voteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class VoteResultActivity extends AppCompatActivity {
    Button btnRerurn;
    TextView[] tvNames = new TextView[9];
    Integer[] tvNameID = {R.id.tvName1,R.id.tvName2,R.id.tvName3,R.id.tvName4,R.id.tvName5,
            R.id.tvName6,R.id.tvName7,R.id.tvName8,R.id.tvName9};
    RatingBar[] rBars = new RatingBar[9];
    Integer[] rBarsID = {R.id.rtBar1,R.id.rtBar2,R.id.rtBar3,R.id.rtBar4,R.id.rtBar5,
            R.id.rtBar6,R.id.rtBar7,R.id.rtBar8,R.id.rtBar9};
    Integer[] ImgNameID = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,
            R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9};
    TextView tvTop;
    ImageView imgTop;
    int[] voteResult; //투표수를 받을 배열
    String[] imgNames; //명화이름을 받을 배열
    int max=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_result);
        btnRerurn = findViewById(R.id.btnReturn);
        imgTop = findViewById(R.id.imgTop);
        tvTop = findViewById(R.id.tvTop);

        for(int i=0;i<tvNames.length;i++){
            tvNames[i] = findViewById(tvNameID[i]);
            rBars[i] = findViewById(rBarsID[i]);
        }//for
        Intent gintent = getIntent();
        voteResult = gintent.getIntArrayExtra("VoteCount");
        imgNames = gintent.getStringArrayExtra("ImageName");

        for(int i=0;i<tvNames.length;i++){
            tvNames[i].setText(imgNames[i]+"(총 "+voteResult[i]+"표)");
            rBars[i].setRating(voteResult[i]);
        }
        for(int i=1;i<tvNames.length;i++){
            if(voteResult[max]<voteResult[i]){
                max = i;
            }
        }
        tvTop.setText("최고의 명화 : "+ imgNames[max]);
        imgTop.setImageResource(ImgNameID[max]);
        btnRerurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }//oncreate
}//VoteResultActivity