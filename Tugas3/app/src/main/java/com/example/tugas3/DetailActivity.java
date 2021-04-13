package com.example.tugas3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity{
    ImageView ivPict;
    TextView tvDetail,tvJudul, tvMaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivPict = findViewById(R.id.iv_pict);
        tvJudul = findViewById(R.id.tv_judul);
        tvMaker = findViewById(R.id.tv_maker);
        tvDetail = findViewById(R.id.tv_detail);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("judul") && getIntent().hasExtra("maker")){
            Integer image = getIntent().getIntExtra("image",0);
            String judul = getIntent().getStringExtra("judul");
            String maker = getIntent().getStringExtra("maker");
            String detail = getIntent().getStringExtra("detail");

            setDataActivity(image, judul, maker, detail);
        }
    }

    private void setDataActivity(Integer imageTeam, String namaTeam, String courtTeam, String detailTeam){
        Glide.with(this).asBitmap().load(imageTeam).into(ivPict);

        tvJudul.setText(namaTeam);

        tvMaker.setText(courtTeam);

        tvDetail.setText(detailTeam);
    }
}
