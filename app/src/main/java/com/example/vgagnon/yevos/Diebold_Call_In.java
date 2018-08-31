package com.example.vgagnon.yevos;

import android.app.TimePickerDialog;
import android.content.Intent;
//import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;
import java.util.Calendar;

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
                        if (selectedMinute >= 1 && selectedMinute <= 14) {
                            selectedMinute = 15;
                        } else if (selectedMinute >= 16 && selectedMinute <= 29){
                                selectedMinute = 30;
                        } else if (selectedMinute >= 31 && selectedMinute <= 44) {
                            selectedMinute = 45;
                        } else if (selectedMinute >= 46 && selectedMinute <= 59) {
                            selectedMinute = 0;
                            if (selectedHour == 23) {
                                selectedHour = 0;
                            } else {
                                selectedHour = selectedHour + 1;
                            }
                        }
                        time.setText(String.format("%02d:%02d", selectedHour, selectedMinute));
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
                        if (selectedMinute >= 1 && selectedMinute <= 14) {
                            selectedMinute = 15;
                        } else if (selectedMinute >= 16 && selectedMinute <= 29){
                            selectedMinute = 30;
                        } else if (selectedMinute >= 31 && selectedMinute <= 44) {
                            selectedMinute = 45;
                        } else if (selectedMinute >= 46 && selectedMinute <= 59) {
                            selectedMinute = 0;
                            if (selectedHour == 23) {
                                selectedHour = 0;
                            } else {
                                selectedHour = selectedHour + 1;
                            }
                        }
                        time2.setText(String.format("%02d:%02d", selectedHour, selectedMinute));
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
                        if (selectedMinute >= 1 && selectedMinute <= 14) {
                            selectedMinute = 15;
                        } else if (selectedMinute >= 16 && selectedMinute <= 29){
                            selectedMinute = 30;
                        } else if (selectedMinute >= 31 && selectedMinute <= 44) {
                            selectedMinute = 45;
                        } else if (selectedMinute >= 46 && selectedMinute <= 59) {
                            selectedMinute = 0;
                            if (selectedHour == 23) {
                                selectedHour = 0;
                            } else {
                                selectedHour = selectedHour + 1;
                            }
                        }
                        time3.setText(String.format("%02d:%02d", selectedHour, selectedMinute));
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
                        if (selectedMinute >= 1 && selectedMinute <= 14) {
                            selectedMinute = 15;
                        } else if (selectedMinute >= 16 && selectedMinute <= 29){
                            selectedMinute = 30;
                        } else if (selectedMinute >= 31 && selectedMinute <= 44) {
                            selectedMinute = 45;
                        } else if (selectedMinute >= 46 && selectedMinute <= 59) {
                            selectedMinute = 0;
                            if (selectedHour == 23) {
                                selectedHour = 0;
                            } else {
                                selectedHour = selectedHour + 1;
                            }
                        }
                        time4.setText(String.format("%02d:%02d", selectedHour, selectedMinute));
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

    }
    public void sendEmail(View view) {
        Spinner s = findViewById(R.id.spinFermeture);
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
        EditText nomModule = findViewById(R.id.textResume);
        String nomMod = nomModule.getText().toString();
        EditText numDiebold = findViewById(R.id.numMultitech);
        String numDie = numDiebold.getText().toString();
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
        Spinner s = findViewById(R.id.spinFermeture);
        String text = s.getSelectedItem().toString();
        EditText nomTech = findViewById(R.id.nomTech);
        String nomTec = nomTech.getText().toString();
        EditText numDesjardins = findViewById(R.id.numIngenico);
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
