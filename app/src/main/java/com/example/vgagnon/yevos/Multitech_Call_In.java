package com.example.vgagnon.yevos;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.RectF;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.graphics.Canvas;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.widget.EditText;


public class Multitech_Call_In extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Model> imageModelArrayList;
    private Adapter adapter;
    private Paint p = new Paint();

    private String[] myImageNameList = new String[]{"Benz", "Bike",
            "Car","Carrera"
            ,"Ferrari","Harly",
            "Lamborghini","Silver","test","fdsfdsa"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitech__call__in);
        recyclerView =  findViewById(R.id.recycler);
       // ArrayList<Model> list = new ArrayList<>();
        imageModelArrayList = populateList();

        adapter = new Adapter(this,imageModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        enableSwipe();
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


