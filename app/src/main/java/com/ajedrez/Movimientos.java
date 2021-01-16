package com.ajedrez;

/*
Vacio:0
Torre: 1
Caballo:2
Elefante:3
Alfil: 4
Rey:5
Cañon: 6
Peon: 7
 */

import java.util.ArrayList;
import java.util.List;

public class Movimientos {
    int V;
    int H;
    int TypePieza;
    Boolean ColorPieza;
    boolean onlyOne;
    List<ArrayList<Piezas>> list;
    Boolean typePieza = true;

    public Movimientos(List<ArrayList<com.ajedrez.Piezas>> list, int V, int H) {
        this.V=V;
        this.H=H;
        this.list=list;
    }

    public List<ArrayList<Piezas>> movimientos() {

        TypePieza = list.get(V).get(H).getTipoPieza();
        ColorPieza = list.get(V).get(H).isColor();


        //Cañon
        if(TypePieza == 6){
            for(int v = 0; v < 10;v++){
                for(int h = 0; h < 9;h++){
                    int forCanon;
                    list.get(V).get(H).setTipoPieza(6);
                    //Horizontal Derecha
                    onlyOne = true;
                    for(forCanon = H +1 ; forCanon <= 8;forCanon++ ){
                        if (list.get(V).get(forCanon).isColor() == ColorPieza){
                            break;
                        }
                        if (onlyOne) {
                            list.get(V).get(forCanon).setEat(typePieza);
                            if (list.get(V).get(forCanon).isColor() != ColorPieza && list.get(V).get(forCanon).isColor() != null){
                                onlyOne = false;
                        }
                        }
                    }

                    //Horizontal Izquierda
                    onlyOne = true;
                    for(forCanon = H -1 ; forCanon >= 0; forCanon-- ){
                        if (list.get(V).get(forCanon).isColor() == ColorPieza){
                            break;
                        }
                        if (onlyOne) {
                            list.get(V).get(forCanon).setEat(typePieza);
                            if (list.get(V).get(forCanon).isColor() != ColorPieza && list.get(V).get(forCanon).isColor() != null){
                                onlyOne = false;
                            }
                        }
                    }

                    //Vertical Arriba
                    onlyOne = true;
                    for(forCanon = V -1 ; forCanon >= 0; forCanon-- ){
                        if (list.get(forCanon).get(H).isColor() == ColorPieza){
                            break;
                        }
                        if (onlyOne) {
                            list.get(forCanon).get(H).setEat(typePieza);
                            if (list.get(forCanon).get(H).isColor() != ColorPieza && list.get(forCanon).get(H).isColor() != null){
                                onlyOne = false;
                            }
                        }
                    }

                    //Vertical Abajo
                    onlyOne = true;
                    for(forCanon = V +1 ; forCanon <= 9; forCanon++ ){
                        if (list.get(forCanon).get(H).isColor() == ColorPieza){
                            break;
                        }
                        if (onlyOne) {
                            list.get(forCanon).get(H).setEat(typePieza);
                            if (list.get(forCanon).get(H).isColor() != ColorPieza && list.get(forCanon).get(H).isColor() != null){
                                onlyOne = false;
                            }
                        }
                    }
                }
            }
        }
        return list;
    }
}

