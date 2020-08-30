package info.antionix.gu.myweathergu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SelectCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);

        String text = String.format("[%s]-%s", this, "onCreate()");
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        Log.d("", text);
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
}
