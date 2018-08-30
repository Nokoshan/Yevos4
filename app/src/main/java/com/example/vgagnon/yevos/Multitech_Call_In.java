package com.example.vgagnon.yevos;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Locale;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.View;
import android.graphics.Canvas;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;


public class Multitech_Call_In extends AppCompatActivity {
    EditText time;
    EditText time2;
    EditText time3;
    EditText time4;
    private RecyclerView recyclerView;
    private ArrayList<Model> imageModelArrayList;
    private Adapter adapter;
    private Paint p = new Paint();

    private String[] myImageNameList = new String[]{"Benz", "Bike",
            "Car","Carrera"
            ,"Ferrari","Harly",
            "Lamborghini","Silver","test","fdsfdsa"};


    Context context = this;
    EditText editDate;
    Calendar myCalendar = Calendar.getInstance();
    String dateFormat = "MM dd yyyy";
    DatePickerDialog.OnDateSetListener date;
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, Locale.GERMAN);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitech__call__in);

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
                mTimePicker = new TimePickerDialog(Multitech_Call_In.this, new TimePickerDialog.OnTimeSetListener() {
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
                mTimePicker = new TimePickerDialog(Multitech_Call_In.this, new TimePickerDialog.OnTimeSetListener() {
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
                mTimePicker = new TimePickerDialog(Multitech_Call_In.this, new TimePickerDialog.OnTimeSetListener() {
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
                mTimePicker = new TimePickerDialog(Multitech_Call_In.this, new TimePickerDialog.OnTimeSetListener() {
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




        editDate = findViewById(R.id.textDate);

// init - set date to current date
        long currentdate = System.currentTimeMillis();
        String dateString = sdf.format(currentdate);
        editDate.setText(dateString);

// set calendar date and update editDate
        date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateDate();
            }

        };

// onclick - popup datepicker
        editDate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(context, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });




        recyclerView =  findViewById(R.id.recycler);
       // ArrayList<Model> list = new ArrayList<>();
        imageModelArrayList = populateList();

        adapter = new Adapter(this,imageModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        enableSwipe();
    }

    private void updateDate() {
        editDate.setText(sdf.format(myCalendar.getTime()));
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            String textPiece = data.getStringExtra("KEY_RESPONSE");
            Model imageModel = new Model();
            imageModel.setName(textPiece);
            imageModelArrayList.add(imageModel);
            adapter.notifyItemInserted(imageModelArrayList.size());
        }
    }
    private void enableSwipe(){
        ItemTouchHelper.SimpleCallback simpleItemTouchCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();

                if (direction == ItemTouchHelper.LEFT){
                 //   final Model deletedModel = imageModelArrayList.get(position);
                 //   final int deletedPosition = position;
                    adapter.removeItem(position);
                    // showing snack bar with Undo option
                  /*  Snackbar snackbar = Snackbar.make(getWindow().getDecorView().getRootView(), " removed from Recyclerview!", Snackbar.LENGTH_LONG);
                    snackbar.setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // undo is selected, restore the deleted item
                            adapter.restoreItem(deletedModel, deletedPosition);
                        }
                    });
                    snackbar.setActionTextColor(Color.YELLOW);
                    snackbar.show();*/
                } else {
                  //  final Model deletedModel = imageModelArrayList.get(position);
                  //  final int deletedPosition = position;
                    adapter.removeItem(position);
                    // showing snack bar with Undo option
                  /*  Snackbar snackbar = Snackbar.make(getWindow().getDecorView().getRootView(), " removed from Recyclerview!", Snackbar.LENGTH_LONG);
                    snackbar.setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            // undo is selected, restore the deleted item
                            adapter.restoreItem(deletedModel, deletedPosition);
                        }
                    });
                    snackbar.setActionTextColor(Color.YELLOW);
                    snackbar.show();*/
                }
            }

            @Override
            public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {

                Bitmap icon;
                if(actionState == ItemTouchHelper.ACTION_STATE_SWIPE){

                    View itemView = viewHolder.itemView;
                    float height = (float) itemView.getBottom() - (float) itemView.getTop();
                    float width = height / 3;

                    if(dX > 0){
                        p.setColor(Color.parseColor("#D32F2F"));
                        RectF background = new RectF((float) itemView.getLeft(), (float) itemView.getTop(), dX,(float) itemView.getBottom());
                        c.drawRect(background,p);
                        //icon = BitmapFactory.decodeResource(getResources(), R.drawable.delete);
                        RectF icon_dest = new RectF((float) itemView.getLeft() + width ,(float) itemView.getTop() + width,(float) itemView.getLeft()+ 2*width,(float)itemView.getBottom() - width);
                        //c.drawBitmap(icon,null,icon_dest,p);
                    } else {
                        p.setColor(Color.parseColor("#D32F2F"));
                        RectF background = new RectF((float) itemView.getRight() + dX, (float) itemView.getTop(),(float) itemView.getRight(), (float) itemView.getBottom());
                        c.drawRect(background,p);
                        //icon = BitmapFactory.decodeResource(getResources(), R.drawable.delete);
                        RectF icon_dest = new RectF((float) itemView.getRight() - 2*width ,(float) itemView.getTop() + width,(float) itemView.getRight() - width,(float)itemView.getBottom() - width);
                        //c.drawBitmap(icon,null,icon_dest,p);
                    }
                }
                super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
            }
        };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    private ArrayList<Model> populateList(){

        ArrayList<Model> list = new ArrayList<>();
       /* int arrayNum =  myImageNameList.length;
        for(int i = 0; i < arrayNum; i++){
            Model imageModel = new Model();
            imageModel.setName(myImageNameList[i]);
            list.add(imageModel);
        }*/

        return list;
    }
    public void ajoutPiece (View view){
        Intent intent = new Intent(this, multitechPiece.class);
        startActivityForResult(intent,1);

    }




}


