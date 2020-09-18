package in.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.e("onCreate","called first");

        setTitle("Sayan");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","called second");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume","called third");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause","called fourth");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","called fifth");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop","called sixth");
    }

}