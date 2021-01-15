package com.ajedrez;

import java.util.ArrayList;
import java.util.List;

public class Java1 {

    public List<ArrayList<Piezas>> start() {
        List<ArrayList<Piezas>> V;
        ArrayList<Piezas> H0;
        ArrayList<Piezas> H1;
        ArrayList<Piezas> H2;
        ArrayList<Piezas> H3;
        ArrayList<Piezas> H4;
        ArrayList<Piezas> H5;
        ArrayList<Piezas> H6;
        ArrayList<Piezas> H7;
        ArrayList<Piezas> H8;
        ArrayList<Piezas> H9;

        V = new ArrayList<>();
        H0 = new ArrayList<>();
        H1 = new ArrayList<>();
        H2 = new ArrayList<>();
        H3 = new ArrayList<>();
        H4 = new ArrayList<>();
        H5 = new ArrayList<>();
        H6 = new ArrayList<>();
        H7 = new ArrayList<>();
        H8 = new ArrayList<>();
        H9 = new ArrayList<>();

        //Negro
        H0.add(new Piezas(true, 1,0,0));
        H0.add(new Piezas(true, 2,0,1));
        H0.add(new Piezas(true, 3,0,2));
        H0.add(new Piezas(true, 4,0,3));
        H0.add(new Piezas(true, 5,0,4));
        H0.add(new Piezas(true, 4,0,5));
        H0.add(new Piezas(true, 3,0,6));
        H0.add(new Piezas(true, 2,0,7));
        H0.add(new Piezas(true, 1,0,8));

        H1.add(new Piezas(true, 0,1,0));
        H1.add(new Piezas(true, 0,1,1));
        H1.add(new Piezas(true, 0,1,2));
        H1.add(new Piezas(true, 0,1,3));
        H1.add(new Piezas(true, 0,1,4));
        H1.add(new Piezas(true, 0,1,5));
        H1.add(new Piezas(true, 0,1,6));
        H1.add(new Piezas(true, 0,1,7));
        H1.add(new Piezas(true, 0,1,8));

        H2.add(new Piezas(true, 0,2,0));
        H2.add(new Piezas(true, 6,2,1));
        H2.add(new Piezas(true, 0,2,2));
        H2.add(new Piezas(true, 0,2,3));
        H2.add(new Piezas(true, 0,2,4));
        H2.add(new Piezas(true, 0,2,5));
        H2.add(new Piezas(true, 0,2,6));
        H2.add(new Piezas(true, 6,2,7));
        H2.add(new Piezas(true, 0,2,8));

        H3.add(new Piezas(true, 7,3,0));
        H3.add(new Piezas(true, 0,3,1));
        H3.add(new Piezas(true, 7,3,2));
        H3.add(new Piezas(true, 0,3,3));
        H3.add(new Piezas(true, 7,3,4));
        H3.add(new Piezas(true, 0,3,5));
        H3.add(new Piezas(true, 7,3,6));
        H3.add(new Piezas(true, 0,3,7));
        H3.add(new Piezas(true, 7,3,8));

        H4.add(new Piezas(true, 0,4,0));
        H4.add(new Piezas(true, 0,4,1));
        H4.add(new Piezas(true, 0,4,2));
        H4.add(new Piezas(true, 0,4,3));
        H4.add(new Piezas(true, 0,4,4));
        H4.add(new Piezas(true, 0,4,5));
        H4.add(new Piezas(true, 0,4,6));
        H4.add(new Piezas(true, 0,4,7));
        H4.add(new Piezas(true, 0,4,8));


        //Rojo
        H5.add(new Piezas(false, 0,5,0));
        H5.add(new Piezas(false, 0,5,1));
        H5.add(new Piezas(false, 0,5,2));
        H5.add(new Piezas(false, 0,5,3));
        H5.add(new Piezas(false, 0,5,4));
        H5.add(new Piezas(false, 0,5,5));
        H5.add(new Piezas(false, 0,5,6));
        H5.add(new Piezas(false, 0,5,7));
        H5.add(new Piezas(false, 0,5,8));

        H6.add(new Piezas(false, 7,6,0));
        H6.add(new Piezas(false, 0,6,1));
        H6.add(new Piezas(false, 7,6,2));
        H6.add(new Piezas(false, 0,6,3));
        H6.add(new Piezas(false, 7,6,4));
        H6.add(new Piezas(false, 0,6,5));
        H6.add(new Piezas(false, 7,6,6));
        H6.add(new Piezas(false, 0,6,7));
        H6.add(new Piezas(false, 7,6,8));

        H7.add(new Piezas(false, 0,7,0));
        H7.add(new Piezas(false, 6,7,1));
        H7.add(new Piezas(false, 0,7,2));
        H7.add(new Piezas(false, 0,7,3));
        H7.add(new Piezas(false, 0,7,4));
        H7.add(new Piezas(false, 0,7,5));
        H7.add(new Piezas(false, 0,7,6));
        H7.add(new Piezas(false, 6,7,7));
        H7.add(new Piezas(false, 0,7,8));

        H8.add(new Piezas(false, 0,8,0));
        H8.add(new Piezas(false, 0,8,1));
        H8.add(new Piezas(false, 0,8,2));
        H8.add(new Piezas(false, 0,8,3));
        H8.add(new Piezas(false, 0,8,4));
        H8.add(new Piezas(false, 0,8,5));
        H8.add(new Piezas(false, 0,8,6));
        H8.add(new Piezas(false, 0,8,7));
        H8.add(new Piezas(false, 0,8,8));

        H9.add(new Piezas(false, 1,9,0));
        H9.add(new Piezas(false, 2,9,1));
        H9.add(new Piezas(false, 3,9,2));
        H9.add(new Piezas(false, 4,9,3));
        H9.add(new Piezas(false, 5,9,4));
        H9.add(new Piezas(false, 4,9,5));
        H9.add(new Piezas(false, 3,9,6));
        H9.add(new Piezas(false, 2,9,7));
        H9.add(new Piezas(false, 1,9,8));

        V.add(H0);
        V.add(H1);
        V.add(H2);
        V.add(H3);
        V.add(H4);
        V.add(H5);
        V.add(H6);
        V.add(H7);
        V.add(H8);
        V.add(H9);

        return V;
    }

    public Piezas getObjectPieza(int j, int i, List<ArrayList<Piezas>> V){

        int j1 = -1;
        int i1 = -1;

        for (ArrayList<Piezas> obj : V) {
            j1++;
            if (j == j1){
                for (Piezas job : obj) {
                    i1++;
                    if(i == i1){
                        return job;
                    }
                }
            }
        }

        return null;
    }
}