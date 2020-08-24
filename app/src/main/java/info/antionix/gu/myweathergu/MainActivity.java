package info.antionix.gu.myweathergu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button btnFind;

    private static final String DATENOW = "DATENOW";
    private static final String TTHU = "TTHU";
    private static final String TTUE = "TTUE";
    private static final String TSAT = "TSAT";
    private static final String TSUN = "TSUN";
    private static final String TMON = "TMON";
    private static final String TFRI = "TFRI";
    private static final String TWEN = "TWEN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            initData();
        }

        btnFind = findViewById(R.id.imageButton);
        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectCityActivity.class);
                startActivity(intent);
            }
        });

        String text = String.format("[%s]-%s", this.getClass().getName(), "onCreate()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);

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

        TextView tWen = findViewById(R.id.temperatureWED);
        tWen.setText(String.format("%d", new Random().nextInt(30)));
    }

    @Override
    protected void onStart() {
        super.onStart();
        String text = String.format("[%s]-%s", this.getClass().getName(), "onStart()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String text = String.format("[%s]-%s", this.getClass().getName(), "onStop()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String text = String.format("[%s]-%s", this.getClass().getName(), "onDestroy()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String text = String.format("[%s]-%s", this.getClass().getName(), "onPause()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        String text = String.format("[%s]-%s", this.getClass().getName(), "onPostResume()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String text = String.format("[%s]-%S", this, "onRestart()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String text = String.format("[%s]-%S", this, "onRestart()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);

        TextView currentDate = findViewById(R.id.current_date);
        outState.putString(DATENOW, (String) currentDate.getText());

        TextView tMon = findViewById(R.id.temperatureMON);
        outState.putString(TMON, (String) tMon.getText());

        TextView tThu = findViewById(R.id.temperatureTHU);
        outState.putString(TTHU, (String) tThu.getText());

        TextView tTue = findViewById(R.id.temperatureTUE);
        outState.putString(TTUE, (String) tTue.getText());

        TextView tSat = findViewById(R.id.temperatureSAT);
        outState.putString(TSAT, (String) tSat.getText());

        TextView tSun = findViewById(R.id.temperatureSUN);
        outState.putString(TSUN, (String) tSun.getText());

        TextView tFri = findViewById(R.id.temperatureFRI);
        outState.putString(TFRI, (String) tFri.getText());

        TextView tWen = findViewById(R.id.temperatureWED);
        outState.putString(TWEN, (String) tWen.getText());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String text = String.format("[%s]-%S", this, "onRestart()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);

        TextView currentDate = findViewById(R.id.current_date);
        currentDate.setText(savedInstanceState.getString(DATENOW));

        TextView tMon = findViewById(R.id.temperatureMON);
        tMon.setText(savedInstanceState.getString(TMON));

        TextView tThu = findViewById(R.id.temperatureTHU);
        tThu.setText(savedInstanceState.getString(TTHU));

        TextView tTue = findViewById(R.id.temperatureTUE);
        tTue.setText(savedInstanceState.getString(TTUE));

        TextView tSat = findViewById(R.id.temperatureSAT);
        tSat.setText(savedInstanceState.getString(TSAT));

        TextView tSun = findViewById(R.id.temperatureSUN);
        tSun.setText(savedInstanceState.getString(TSUN));

        TextView tFri = findViewById(R.id.temperatureFRI);
        tFri.setText(savedInstanceState.getString(TFRI));

        TextView tWen = findViewById(R.id.temperatureWED);
        tWen.setText(savedInstanceState.getString(TWEN));
    }
}
