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
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Java1 test1 = new Java1();
    List<ArrayList<Piezas>> list = new Java1().start();
    Piezas oldPieza;

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
                int finalI = i;
                int finalJ = j;


                btn1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {

                        Toast.makeText(view.getContext(), "Button clicked index = " + id_, Toast.LENGTH_SHORT).show();



                        Piezas getPieza = test1.getObjectPieza(finalJ,finalI,list);
                        Log.d("new", String.valueOf(getPieza.getTipoPieza()));
                        if(oldPieza != null) {
                            Log.d("old", String.valueOf(oldPieza.getTipoPieza()));
                            int[][] ArrayMovimientosOld = new Movimientos().movimientos(oldPieza.getX(), oldPieza.getY(), oldPieza.getTipoPieza(), oldPieza.getTipoPieza(),8);
                            int[][] ArrayMovimientos = new Movimientos().movimientos(getPieza.getX(), getPieza.getY(), getPieza.getTipoPieza(), oldPieza.getTipoPieza(),8);
                            Log.d("arrayTablero", Arrays.deepToString(ArrayMovimientos));
                            Log.d("arrayTableroOld", Arrays.deepToString(ArrayMovimientosOld));
                            Check(ArrayMovimientosOld,true);
                            Check(ArrayMovimientos,false);
                        }
                        oldPieza = test1.getObjectPieza(finalJ,finalI,list);

                    }
                });
            }
        }
    }
    public ImageView Draw(int jDraw, int iDraw,int[][]ArrayMovimientos, boolean old){
        //Java1 test1 = new Java1();

        ImageView myButton = findViewById(Integer.parseInt(jDraw+""+iDraw));
        int Piezaif = test1.getObjectPieza(jDraw, iDraw,list).getTipoPieza();
        boolean PiezaColor = test1.getObjectPieza(jDraw, iDraw,list).isColor();

        if (ArrayMovimientos != null || Piezaif == 0){
            if(ArrayMovimientos[jDraw][iDraw] == 8) {
                if(old) {
                    test1.getObjectPieza(jDraw, iDraw, list).setTipoPieza(0);
                    Piezaif = test1.getObjectPieza(jDraw, iDraw, list).getTipoPieza();
                } else {

                    test1.getObjectPieza(jDraw, iDraw, list).setTipoPieza(8);
                    Piezaif = test1.getObjectPieza(jDraw, iDraw, list).getTipoPieza();
                }
            }
        }

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
        if (Piezaif == 8){
                myButton.setImageResource(R.drawable.ic_cruzmovimiento);
        }
        return myButton;
    }

    public void Check(int[][]ArrayMovimientos, boolean old) {
        for (int j = 0; j < 10; j++) {

            for (int i = 0; i <= 8; i++) {
                Draw(j, i, ArrayMovimientos, old);
            }
        }
    }
}