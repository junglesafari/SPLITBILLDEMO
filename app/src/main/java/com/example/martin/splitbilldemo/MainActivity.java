package com.example.martin.splitbilldemo;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.shawnlin.numberpicker.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    NumberPicker numberPicker ;
    TextView pickervalue;
    TextView nextstep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        numberPicker = findViewById(R.id.number_picker);
        pickervalue=findViewById( R.id.pickervalue );
        nextstep=findViewById( R.id.nextstep );
        numberPicker.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                Log.d("TAG", "Click on current value");

            }
        });

// OnValueChangeListener
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                //Toast.makeText( MainActivity.this,"new value = "+oldVal+", new value = "+newVal,Toast.LENGTH_SHORT ).show();
               // Log.d("TAG", String.format(Locale.US, "oldVal: %d, newVal: %d", oldVal, newVal));
                pickervalue.setText( newVal+"" );

            }
        });


    }
}
