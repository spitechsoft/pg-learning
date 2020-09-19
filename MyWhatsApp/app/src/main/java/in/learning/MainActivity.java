package in.learning;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.drm.DrmStore;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG="MainActivity";
    Button btnSubmit,btnSubmit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.e("onCreate","called first");
        setTitle("First");

        btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit2=findViewById(R.id.btnSubmit2);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ActivitySecond.class);
                intent.putExtra("first_name","Sushant");
                intent.putExtra("last_name","Singh");
                startActivityForResult(intent,10);
                //finish();
            }
        });

        btnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String url="http://www.javatpoint.com";
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }catch (Exception ex){
                    Log.e(TAG,ex.toString());
                }

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==2){
            Toast.makeText(getApplicationContext(),"Message Received from Second",Toast.LENGTH_LONG).show();
        }else if(resultCode==3){
            Toast.makeText(getApplicationContext(),"Message Received from Third",Toast.LENGTH_LONG).show();
        }
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