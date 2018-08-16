package com.example.vgagnon.yevos;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class Diebold_Call_In extends AppCompatActivity {
    EditText time;
    EditText time2;
    EditText time3;
    EditText time4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diebold__call__in);


        //  initiate the edit text
        time = findViewById(R.id.heureDepart);

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
                        } else if (selectedMinute == 0){
                            time.setText(selectedHour + ":00");
                        } else {
                            time.setText(selectedHour + ":" + selectedMinute);
                        }
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });
        time2 = findViewById(R.id.heureDebut);
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
                        } else if (selectedMinute == 0){
                            time2.setText(selectedHour + ":00");
                        } else {
                            time2.setText(selectedHour + ":" + selectedMinute);
                        }
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });


        time3 = findViewById(R.id.heureFin);
        time3.setOnClickListener(new View.OnClickListener() {
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
                            time3.setText(selectedHour + ":01");
                        } else if (selectedMinute == 2){
                            time3.setText(selectedHour + ":02");
                        } else if (selectedMinute == 3){
                            time3.setText(selectedHour + ":03");
                        } else if (selectedMinute == 4){
                            time3.setText(selectedHour + ":04");
                        } else if (selectedMinute == 5){
                            time3.setText(selectedHour + ":05");
                        } else if (selectedMinute == 6){
                            time3.setText(selectedHour + ":06");
                        } else if (selectedMinute == 7){
                            time3.setText(selectedHour + ":07");
                        } else if (selectedMinute == 8){
                            time3.setText(selectedHour + ":08");
                        } else if (selectedMinute == 9){
                            time3.setText(selectedHour + ":09");
                        } else if (selectedMinute == 0){
                            time3.setText(selectedHour + ":00");
                        } else {
                            time3.setText(selectedHour + ":" + selectedMinute);
                        }
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });


        time4 = findViewById(R.id.heureRetour);
        time4.setOnClickListener(new View.OnClickListener() {
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
                            time4.setText(selectedHour + ":01");
                        } else if (selectedMinute == 2){
                            time4.setText(selectedHour + ":02");
                        } else if (selectedMinute == 3){
                            time4.setText(selectedHour + ":03");
                        } else if (selectedMinute == 4){
                            time4.setText(selectedHour + ":04");
                        } else if (selectedMinute == 5){
                            time4.setText(selectedHour + ":05");
                        } else if (selectedMinute == 6){
                            time4.setText(selectedHour + ":06");
                        } else if (selectedMinute == 7){
                            time4.setText(selectedHour + ":07");
                        } else if (selectedMinute == 8){
                            time4.setText(selectedHour + ":08");
                        } else if (selectedMinute == 9){
                            time4.setText(selectedHour + ":09");
                        } else if (selectedMinute == 0){
                            time4.setText(selectedHour + ":00");
                        } else {
                            time4.setText(selectedHour + ":" + selectedMinute);
                        }
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

    }
    public void sendEmail(View view) {
        Spinner s = findViewById(R.id.spinner3);
        String text = s.getSelectedItem().toString();
        EditText nomClient = findViewById(R.id.nomEta);
        String nomCli = nomClient.getText().toString();
        EditText nomTech = findViewById(R.id.nomTech);
        String nomTec = nomTech.getText().toString();
        EditText heureDepart = findViewById(R.id.heureDepart);
        String heureDep = heureDepart.getText().toString();
        EditText heureDebut = findViewById(R.id.heureDebut);
        String heureDeb = heureDebut.getText().toString();
        EditText heureFin = findViewById(R.id.heureFin);
        String heureFi = heureFin.getText().toString();
        EditText nomModule = findViewById(R.id.nomModule);
        String nomMod = nomModule.getText().toString();
        EditText numDiebold = findViewById(R.id.numDiebold);
        String numDie = numDiebold.getText().toString();
        EditText numDesjardins = findViewById(R.id.numDesj);
        String numDesj = numDesjardins.getText().toString();
        EditText textTravail = findViewById(R.id.textTravail);
        String textTra = textTravail.getText().toString();
        EditText textPiece1 = findViewById(R.id.textPiece1);
        String textPie1 = textPiece1.getText().toString();
        EditText textPiece2 = findViewById(R.id.textPiece2);
        String textPie2 = textPiece2.getText().toString();
        EditText textPiece3 = findViewById(R.id.textPiece3);
        String textPie3 = textPiece3.getText().toString();

        if (text.equals("Call in")) {
            text = "Compucom";
        } else if (text.equals("Mise a jour")) {
            text = "Compucom";
        } else if (text.equals("Suspend")) {
            text = "Compucom";
        } else if (text.equals("Fermeture")) {
            StringBuilder body = new StringBuilder();
            body.append("Fermeture Complete: Oui");
            body.append("\n\nNom du Client: " + nomCli);
            body.append("\n# Ref Diebold: " + numDie);
            body.append("\n\nDepart: " + heureDep);
            body.append("\nArrive: " + heureDeb);
            body.append("\nComplete: " + heureFi);
            body.append("\n\n# Piece: ");
            if (!textPie1.isEmpty()){
                body.append("\n" + textPie1);
            }
            if (!textPie2.isEmpty()){
                body.append("\n" + textPie2);
            }
            if (!textPie3.isEmpty()){
                body.append("\n" + textPie3);
            }
            body.append("\n\nModule: " + nomMod);
            body.append("\n\nNom du Tech: " + nomTec);
            body.append("\n\n Text de Fermeture: ");
            body.append("\n" + textTra);
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("message/rfc822");
            i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"mtl_escalation@dieboldnixdorf.com"});
            i.putExtra(Intent.EXTRA_CC  , new String[]{"dispatch1@bureautech.ca"});
            i.putExtra(Intent.EXTRA_SUBJECT, "Fermeture appel " + numDie);
            i.putExtra(Intent.EXTRA_TEXT   , body.toString());
            try {
                startActivity(Intent.createChooser(i, "Send mail..."));
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(Diebold_Call_In.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
            }
        } else if (text.equals("Maxwell")) {
            text = "Compucom";
        } else if (text.equals("Multitech")) {
            text = "Compucom";
        } else if (text.equals("MSC")) {
            text = "Compucom";
        } else if (text.equals("NCR")) {
            text = "Compucom";
        } else if (text.equals("Progitech")) {
            text = "Compucom";
        } else if (text.equals("Ricoh")) {
            text = "Compucom";
        }
    }
    public void sendEmailDesj(View view) {
        Spinner s = findViewById(R.id.spinner3);
        String text = s.getSelectedItem().toString();
        EditText nomTech = findViewById(R.id.nomTech);
        String nomTec = nomTech.getText().toString();
        EditText numDesjardins = findViewById(R.id.numDesj);
        String numDesj = numDesjardins.getText().toString();
        nomTec = nomTec.toUpperCase();
        EditText heureDebut = findViewById(R.id.heureDebut);
        String heureDeb = heureDebut.getText().toString();
        EditText heureFin = findViewById(R.id.heureFin);
        String heureFi = heureFin.getText().toString();
        EditText textTravail = findViewById(R.id.textTravail);
        String textTra = textTravail.getText().toString();
        textTra = textTra.toUpperCase();

        if (text.equals("Call in")) {
            text = "Compucom";
        } else if (text.equals("Mise a jour")) {
            text = "Compucom";
        } else if (text.equals("Suspend")) {
            text = "Compucom";
        } else if (text.equals("Fermeture")) {
            StringBuilder body = new StringBuilder();
            body.append(heureDeb);
            body.append("\n" + heureFi);
            body.append("\n" + nomTec);
            body.append("\n" + textTra);
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("message/rfc822");
            i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"fermeture_tech.gm@desjardins.com"});
            i.putExtra(Intent.EXTRA_CC  , new String[]{"dispatch1@bureautech.ca"});
            i.putExtra(Intent.EXTRA_SUBJECT, numDesj);
            i.putExtra(Intent.EXTRA_TEXT   , body.toString());
            try {
                startActivity(Intent.createChooser(i, "Send mail..."));
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(Diebold_Call_In.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
            }
        } else if (text.equals("Maxwell")) {
            text = "Compucom";
        } else if (text.equals("Multitech")) {
            text = "Compucom";
        } else if (text.equals("MSC")) {
            text = "Compucom";
        } else if (text.equals("NCR")) {
            text = "Compucom";
        } else if (text.equals("Progitech")) {
            text = "Compucom";
        } else if (text.equals("Ricoh")) {
            text = "Compucom";
        }
    }


}
