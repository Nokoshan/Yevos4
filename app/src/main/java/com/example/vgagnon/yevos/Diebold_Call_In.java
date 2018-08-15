package com.example.vgagnon.yevos;

import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
public class Diebold_Call_In extends AppCompatActivity {
    EditText time;
    EditText time2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diebold__call__in);


        //  initiate the edit text
        time = findViewById(R.id.editText3);

        // perform click event listener on edit text
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Diebold_Call_In.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if (selectedMinute == 1) {
                            time.setText(selectedHour + ":01");
                        } else if (selectedMinute == 2){
                            time.setText(selectedHour + ":02");
                        } else if (selectedMinute == 3){
                            time.setText(selectedHour + ":03");
                        } else if (selectedMinute == 4){
                            time.setText(selectedHour + ":04");
                        } else if (selectedMinute == 5){
                            time.setText(selectedHour + ":05");
                        } else if (selectedMinute == 6){
                            time.setText(selectedHour + ":06");
                        } else if (selectedMinute == 7){
                            time.setText(selectedHour + ":07");
                        } else if (selectedMinute == 8){
                            time.setText(selectedHour + ":08");
                        } else if (selectedMinute == 9){
                            time.setText(selectedHour + ":09");
                        } else {
                            time.setText(selectedHour + ":" + selectedMinute);
                        }
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });
        time2 = findViewById(R.id.editText4);
        time2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Diebold_Call_In.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if (selectedMinute == 1) {
                            time2.setText(selectedHour + ":01");
                        } else if (selectedMinute == 2){
                            time2.setText(selectedHour + ":02");
                        } else if (selectedMinute == 3){
                            time2.setText(selectedHour + ":03");
                        } else if (selectedMinute == 4){
                            time2.setText(selectedHour + ":04");
                        } else if (selectedMinute == 5){
                            time2.setText(selectedHour + ":05");
                        } else if (selectedMinute == 6){
                            time2.setText(selectedHour + ":06");
                        } else if (selectedMinute == 7){
                            time2.setText(selectedHour + ":07");
                        } else if (selectedMinute == 8){
                            time2.setText(selectedHour + ":08");
                        } else if (selectedMinute == 9){
                            time2.setText(selectedHour + ":09");
                        } else {
                            time2.setText(selectedHour + ":" + selectedMinute);
                        }
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

    }
}
