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
Movimiento: 8
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movimientos {
    int V;
    int H;
    int Piezas;
    List<ArrayList<Piezas>> list;
    int typePieza = 8;

    public Movimientos(List<ArrayList<com.ajedrez.Piezas>> list, int V, int H) {
        this.V=V;
        this.H=H;
        this.list=list;
    }

    public List<ArrayList<Piezas>> movimientos() {

        Piezas = list.get(V).get(H).getTipoPieza();

        //Cañon
        if(Piezas == 6){
            for(int v = 0; v < 10;v++){
                for(int h = 0; h < 9;h++){
                    int forCanon;
                        list.get(V).get(H).setTipoPieza(6);
                    //Horizontal Derecha
                    for(forCanon = H +1 ; forCanon <= 8;forCanon++ ){
                        if (list.get(V).get(forCanon).getTipoPieza() != 0){
                            break;
                        }
                        list.get(V).get(forCanon).setTipoPieza(typePieza);
                    }

                    //Horizontal Izquierda
                    for(forCanon = H -1 ; forCanon >= 0; forCanon-- ){
                        if (list.get(V).get(forCanon).getTipoPieza() != 0){
                            break;
                        }
                        list.get(V).get(forCanon).setTipoPieza(typePieza);
                    }

                    //Vertical Arriba
                    for(forCanon = V -1 ; forCanon >= 0; forCanon-- ){
                        if (list.get(forCanon).get(H).getTipoPieza() != 0){
                            break;
                        }
                        list.get(forCanon).get(H).setTipoPieza(typePieza);
                    }

                    //Vertical Abajo
                    for(forCanon = V +1 ; forCanon <= 9; forCanon++ ){
                        if (list.get(forCanon).get(H).getTipoPieza() != 0){
                            break;
                        }
                        list.get(forCanon).get(H).setTipoPieza(typePieza);
                    }
                }
            }
        }
        return list;
    }
}

