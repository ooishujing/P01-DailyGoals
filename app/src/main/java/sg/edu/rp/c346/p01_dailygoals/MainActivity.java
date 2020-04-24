package sg.edu.rp.c346.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1st qns
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);
                int selectrb1 = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = (RadioButton) findViewById(selectrb1);
                // 2nd qns
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.rg2);
                int selectrb2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = (RadioButton) findViewById(selectrb2);
                // 3rd qns
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.rg3);
                int selectrb3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = (RadioButton) findViewById(selectrb3);
                // 4th qns
                EditText et = (EditText) findViewById(R.id.et) ;


                String[] info = {rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString(),et.getText().toString()};

                Intent i = new Intent(MainActivity.this, Summary.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });
    }
}
