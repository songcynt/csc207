package com.example.boundless;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.boundless.R;
import com.example.boundless.Statistics;
import com.example.boundless.MenuActivity;

public class StatisticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        TextView stats = (TextView) findViewById(R.id.stats);
        stats.setText(Statistics.printStats());
    }

    public void backToMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
