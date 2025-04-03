package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Double> siffror = new ArrayList<Double>();

    private TextView textname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textname = findViewById(R.id.textname);
        siffror.add(23.4);
        siffror.add(25.4);
        siffror.add(29.0);
        siffror.add(99.9);
        siffror.add(26.6);
        siffror.add(3.8);
        siffror.add(90.2);
        siffror.add(44.6);
        siffror.add(55.4);
        siffror.add(21.4);
    }

    public void buttonClickHandler(View view){
        calculate();
    }
    void calculate(){
        Statistics calcMean = new Statistics();
        double mean = calcMean.calcalc(siffror);
        textname.setText("Mean: " + mean);
    }
}