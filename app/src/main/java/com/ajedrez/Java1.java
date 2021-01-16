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
        H0.add(new Piezas(true, 1,false));
        H0.add(new Piezas(true, 2,false));
        H0.add(new Piezas(true, 3,false));
        H0.add(new Piezas(true, 4,false));
        H0.add(new Piezas(true, 5,false));
        H0.add(new Piezas(true, 4,false));
        H0.add(new Piezas(true, 3,false));
        H0.add(new Piezas(true, 2,false));
        H0.add(new Piezas(true, 1,false));

        H1.add(new Piezas(null, 0,false));
        H1.add(new Piezas(null, 0,false));
        H1.add(new Piezas(null, 0,false));
        H1.add(new Piezas(null, 0,false));
        H1.add(new Piezas(null, 0,false));
        H1.add(new Piezas(null, 0,false));
        H1.add(new Piezas(null, 0,false));
        H1.add(new Piezas(null, 0,false));
        H1.add(new Piezas(null, 0,false));

        H2.add(new Piezas(null, 0,false));
        H2.add(new Piezas(true, 6,false));
        H2.add(new Piezas(null, 0,false));
        H2.add(new Piezas(null, 0,false));
        H2.add(new Piezas(null, 0,false));
        H2.add(new Piezas(null, 0,false));
        H2.add(new Piezas(null, 0,false));
        H2.add(new Piezas(true, 6,false));
        H2.add(new Piezas(null, 0,false));

        H3.add(new Piezas(true, 7,false));
        H3.add(new Piezas(null, 0,false));
        H3.add(new Piezas(true, 7,false));
        H3.add(new Piezas(null, 0,false));
        H3.add(new Piezas(true, 7,false));
        H3.add(new Piezas(null, 0,false));
        H3.add(new Piezas(true, 7,false));
        H3.add(new Piezas(null, 0,false));
        H3.add(new Piezas(true, 7,false));

        H4.add(new Piezas(null, 0,false));
        H4.add(new Piezas(null, 0,false));
        H4.add(new Piezas(null, 0,false));
        H4.add(new Piezas(null, 0,false));
        H4.add(new Piezas(null, 0,false));
        H4.add(new Piezas(null, 0,false));
        H4.add(new Piezas(null, 0,false));
        H4.add(new Piezas(null, 0,false));
        H4.add(new Piezas(null, 0,false));


        //Rojo
        H5.add(new Piezas(null, 0,false));
        H5.add(new Piezas(null, 0,false));
        H5.add(new Piezas(null, 0,false));
        H5.add(new Piezas(null, 0,false));
        H5.add(new Piezas(null, 0,false));
        H5.add(new Piezas(null, 0,false));
        H5.add(new Piezas(null, 0,false));
        H5.add(new Piezas(null, 0,false));
        H5.add(new Piezas(null, 0,false));

        H6.add(new Piezas(false, 7,false));
        H6.add(new Piezas(null, 0,false));
        H6.add(new Piezas(false, 7,false));
        H6.add(new Piezas(null, 0,false));
        H6.add(new Piezas(false, 7,false));
        H6.add(new Piezas(null, 0,false));
        H6.add(new Piezas(false, 7,false));
        H6.add(new Piezas(null, 0,false));
        H6.add(new Piezas(false, 7,false));

        H7.add(new Piezas(null, 0,false));
        H7.add(new Piezas(false, 6,false));
        H7.add(new Piezas(null, 0,false));
        H7.add(new Piezas(null, 0,false));
        H7.add(new Piezas(null, 0,false));
        H7.add(new Piezas(null, 0,false));
        H7.add(new Piezas(null, 0,false));
        H7.add(new Piezas(false, 6,false));
        H7.add(new Piezas(null, 0,false));

        H8.add(new Piezas(null, 0,false));
        H8.add(new Piezas(null, 0,false));
        H8.add(new Piezas(null, 0,false));
        H8.add(new Piezas(null, 0,false));
        H8.add(new Piezas(null, 0,false));
        H8.add(new Piezas(null, 0,false));
        H8.add(new Piezas(null, 0,false));
        H8.add(new Piezas(null, 0,false));
        H8.add(new Piezas(null, 0,false));

        H9.add(new Piezas(false, 1,false));
        H9.add(new Piezas(false, 2,false));
        H9.add(new Piezas(false, 3,false));
        H9.add(new Piezas(false, 4,false));
        H9.add(new Piezas(false, 5,false));
        H9.add(new Piezas(false, 4,false));
        H9.add(new Piezas(false, 3,false));
        H9.add(new Piezas(false, 2,false));
        H9.add(new Piezas(false, 1,false));

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
}