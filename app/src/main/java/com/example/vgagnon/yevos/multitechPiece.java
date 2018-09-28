package com.example.vgagnon.yevos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class multitechPiece extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitech_piece);
    }



    public void ajoutPiece(View view) {
        Spinner operation = findViewById(R.id.spinOperation);
        String textOperation = operation.getSelectedItem().toString();
        Spinner type = findViewById(R.id.spinType);
        String textType = type.getSelectedItem().toString();
        EditText serie = findViewById(R.id.textSerie);
        String textSerie = serie.getText().toString();

        EditText marchand = findViewById(R.id.textMarchand);
        String textMarchand = marchand.getText().toString();

        if (textOperation.equals("Install")) {
            textOperation = "I";
        } else if (textOperation.equals("Deinstall")) {
            textOperation = "D";
        } else if (textOperation.equals("Repair on site")) {
            textOperation = "C";
        } else if (textOperation.equals("DOA")) {
            textOperation = "X";
        } else if (textOperation.equals("Lost")) {
            textOperation = "P";
        }

        if (textMarchand.length() > 0){
            if (textMarchand.substring(0,1).equals("B")){
                textMarchand = textMarchand.substring(1);
            }
        }
        if (textMarchand.length() == 6) {
            textMarchand = textMarchand + "00";
        }



        StringBuilder body = new StringBuilder();
        body.append(textOperation);
        body.append(" (Ingenico " + textType + ")");
        body.append(" (" + textMarchand + ")");
        body.append(" (" + textSerie + ")");

      /*  Intent intent = new Intent(getBaseContext(), Multitech_Call_In.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        intent.putExtra("EXTRA_SESSION_ID", body.toString());
        startActivityIfNeeded(intent,0);*/

        Intent intent = new Intent();
        intent.putExtra("KEY_RESPONSE", body.toString());
        setResult(RESULT_OK, intent);
        finish();


    }

    public void boutCancel(View view) {

        finish();


    }

}
