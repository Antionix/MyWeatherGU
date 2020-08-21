package info.antionix.gu.myweathergu;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button btnFind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        btnFind = findViewById(R.id.imageButton);
        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectCityActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initData() {
        TextView currentDate = findViewById(R.id.current_date);
        currentDate.setText(new SimpleDateFormat("dd.MM.yyyy").format(new Date()));

        TextView tMon = findViewById(R.id.temperatureMON);
        tMon.setText(String.format("%d", new Random().nextInt(30)));

        TextView tThu = findViewById(R.id.temperatureTHU);
        tThu.setText(String.format("%d", new Random().nextInt(30)));

        TextView tTue = findViewById(R.id.temperatureTUE);
        tTue.setText(String.format("%d", new Random().nextInt(30)));

        TextView tSat = findViewById(R.id.temperatureSAT);
        tSat.setText(String.format("%d", new Random().nextInt(30)));

        TextView tSun = findViewById(R.id.temperatureSUN);
        tSun.setText(String.format("%d", new Random().nextInt(30)));

        TextView tFri = findViewById(R.id.temperatureFRI);
        tFri.setText(String.format("%d", new Random().nextInt(30)));
    }


}
