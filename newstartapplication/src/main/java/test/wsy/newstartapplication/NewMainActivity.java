package test.wsy.newstartapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.wsy.testapplication.MainActivity;

public class NewMainActivity extends AppCompatActivity {

    //更改的内容

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);

        findViewById(R.id.btn_jumpold).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewMainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
