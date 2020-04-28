package com.example.izone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MemberDetail extends AppCompatActivity {
    ImageView foto;
    TextView nama, detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Profil Member");
        foto = (ImageView) findViewById(R.id.foto);
        nama = (TextView) findViewById(R.id.nama);
        detail = (TextView) findViewById(R.id.detail);
        showData();
    }

    private void showData(){
        //ambil dari intent
        String myName = getIntent().getExtras().getString("MyName");
        String myDetail = getIntent().getExtras().getString("MyDetail");
        nama.setText(myName);
        detail.setText(myDetail);
        switch (myName) {
            case "Jang Won Young":
                foto.setImageResource(R.drawable.wonyoung);
                break;
            case "Miyawaki Sakura":
                foto.setImageResource(R.drawable.sakura);
                break;
            case "Jo Yu Ri":
                foto.setImageResource(R.drawable.yuri);
                break;
            case "Choi Ye Na":
                foto.setImageResource(R.drawable.yena);
                break;
            case "Ahn Yu Jin":
                foto.setImageResource(R.drawable.yujin);
                break;
            case "Yabuki Nako":
                foto.setImageResource(R.drawable.nako);
                break;
            case "Kwon Eun Bi":
                foto.setImageResource(R.drawable.eunbi);
                break;
            case "Kang Hye Won":
                foto.setImageResource(R.drawable.hyewon);
                break;
            case "Honda Hitomi":
                foto.setImageResource(R.drawable.hitomi);
                break;
            case "Kim Chae Won":
                foto.setImageResource(R.drawable.chaewon);
                break;
            case "Kim Min Joo":
                foto.setImageResource(R.drawable.minju);
                break;
            case "Lee Chae Yeon":
                foto.setImageResource(R.drawable.chaeyeon);
                break;
        }
    }
}
