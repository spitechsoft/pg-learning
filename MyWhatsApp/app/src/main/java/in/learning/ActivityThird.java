package in.learning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityThird extends AppCompatActivity {

    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second");

        btnSubmit=findViewById(R.id.btnSubmit);

        if(getIntent().hasExtra("first_name")){
            String fname=getIntent().getExtras().getString("first_name");
            String lname=getIntent().getExtras().getString("last_name");
            Toast.makeText(getApplicationContext(),fname+" "+lname,Toast.LENGTH_LONG).show();

            setResult(20);
        }


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("message","Mil gaya hai");
                setResult(3);
                startActivity(intent);
            }
        });


    }
}