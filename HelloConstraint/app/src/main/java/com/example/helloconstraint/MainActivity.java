package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    View btnCount;
    View btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        btnCount = view;
        mCount++;

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }

        btnReset.setBackgroundColor(getResources().getColor(R.color.cyan));


        if (mCount % 2 == 0){
            view.setBackgroundColor(getResources().getColor(R.color.green));
        }
        else{
            view.setBackgroundColor(getResources().getColor(R.color.purple_500));
        }
    }

    @SuppressLint("SetTextI18n")
    public void reset(View view) {
        btnReset = view;
        if (mCount != 0) {
            mCount = 0;
            mShowCount.setText(Integer.toString(mCount));
            view.setBackgroundColor(getResources().getColor(R.color.gray));
            btnCount.setBackgroundColor(getResources().getColor(R.color.purple_500));
        }
        else
        {
            Toast toast = Toast.makeText(this, R.string.toast_message2, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}