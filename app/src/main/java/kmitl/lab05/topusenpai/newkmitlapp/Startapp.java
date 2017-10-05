package kmitl.lab05.topusenpai.newkmitlapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Startapp extends AppCompatActivity {

    private ImageButton imgButton;
    private Intent intent;
    public static Activity act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startapp);
        act = this;
        imgButton = (ImageButton) findViewById(R.id.openapp);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Startapp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
