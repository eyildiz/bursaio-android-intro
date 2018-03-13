package sample.eyildiz.com.iotsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTouchCounter;
    Button btnTouch;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTouchCounter = findViewById(R.id.touchCounter);
        btnTouch = findViewById(R.id.touchButton);

        txtTouchCounter.setText("Dokunma sayısı : "+counter);

        btnTouch.setOnClickListener(myListener);

    }

    View.OnClickListener myListener =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            counter++;
            txtTouchCounter.setText("Dokunma sayısı : "+counter);

        }
    };

}
