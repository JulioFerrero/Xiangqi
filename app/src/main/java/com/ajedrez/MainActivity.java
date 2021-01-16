package com.ajedrez;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ArrayList<Piezas>> list = new Java1().start();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //LinearLayout ll = (LinearLayout)findViewById(R.id.buttonlayout);
        setContentView(R.layout.activity_main);



        for (int j = 0; j < 10; j++) {
            LinearLayout ll = findViewById(getResources().getIdentifier("linear"+j, "id", getPackageName()));

            for (int i = 0; i <= 8; i++) {
                ImageView myButton = new ImageView(this);
                myButton.setLayoutParams(new LinearLayout.LayoutParams(0, 120, 10f));
                myButton.setId(Integer.parseInt(j+""+i));
                final int id_ = myButton.getId();
                ll.addView(myButton);

                ImageView btn1 = findViewById(id_);

                int finalJ = j;
                int finalI = i;
                btn1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {

                        Toast.makeText(view.getContext(), "Button clicked index = " + id_, Toast.LENGTH_SHORT).show();

                        list = new Movimientos(list, finalJ, finalI).movimientos();
                        Draw(list);
                    }
                });
            }
        }
        Draw(list);
    }
    public void Draw(List<ArrayList<Piezas>> list){

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {

                ImageView myButton = findViewById(Integer.parseInt(i + "" + j));
                int Piezaif = list.get(i).get(j).getTipoPieza();
                boolean PiezaColor = list.get(i).get(j).isColor();

                if (Piezaif == 0) {
                    myButton.setImageResource(R.drawable.ic_cruz);
                }
                if (Piezaif == 1) {
                    if (PiezaColor) {
                        myButton.setImageResource(R.drawable.br);
                    } else {
                        myButton.setImageResource(R.drawable.rr);
                    }
                }
                if (Piezaif == 2) {
                    if (PiezaColor) {
                        myButton.setImageResource(R.drawable.bn);
                    } else {
                        myButton.setImageResource(R.drawable.rn);
                    }
                }
                if (Piezaif == 3) {
                    if (PiezaColor) {
                        myButton.setImageResource(R.drawable.bb);
                    } else {
                        myButton.setImageResource(R.drawable.rb);
                    }
                }
                if (Piezaif == 4) {
                    if (PiezaColor) {
                        myButton.setImageResource(R.drawable.ba);
                    } else {
                        myButton.setImageResource(R.drawable.ra);
                    }
                }
                if (Piezaif == 5) {
                    if (PiezaColor) {
                        myButton.setImageResource(R.drawable.bk);
                    } else {
                        myButton.setImageResource(R.drawable.rk);
                    }
                }
                if (Piezaif == 6) {
                    if (PiezaColor) {
                        myButton.setImageResource(R.drawable.bc);
                    } else {
                        myButton.setImageResource(R.drawable.rc);
                    }
                }
                if (Piezaif == 7) {
                    if (PiezaColor) {
                        myButton.setImageResource(R.drawable.bp);
                    } else {
                        myButton.setImageResource(R.drawable.rp);
                    }
                }
                if (Piezaif == 8) {
                    myButton.setImageResource(R.drawable.ic_cruzmovimiento);
                }
            }
        }
    }
}