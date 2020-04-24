package sg.edu.rp.c346.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");

        TextView tv1 = findViewById(R.id.textView1);
        TextView tv3 = findViewById(R.id.textView3);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv4 = findViewById(R.id.textView4);

        tv1.setText("Read up on materials before class: "+info[0]);
        tv2.setText("Arrive on time so as not to miss important part of the lesson: "+info[1]);
        tv3.setText("Attempt the problem myself: "+info[2]);
        tv4.setText("Reflection: "+info[3]);

        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Summary.this, MainActivity.class);
                startActivity(j);
            }
        });


    }
}
