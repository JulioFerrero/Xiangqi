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

public class Movimientos {
    int V;
    int H;
    int Piezas;
    int[][] Tabla = new int[10][9];
    int oldPieza;
    int typePieza;

    public int[][] movimientos(int V, int H, int Piezas, int OldPieza, int typePieza){
        this.V=V;
        this.H=H;
        this.Piezas=Piezas;
        this.oldPieza=OldPieza;
        this.typePieza=typePieza;

        //Cañon
        if(Piezas == 6){
            for(int v = 0; v < 10;v++){
                for(int h = 0; h < 9;h++){
                    int forCanon;
                        Tabla[V][H]=6;
                    //Horizontal Derecha
                    for(forCanon = H +1 ; forCanon <= 8;forCanon++ ){
                        if (Tabla[V][forCanon] != 0){
                            break;
                        }
                        Tabla[V][forCanon] = typePieza;
                    }

                    //Horizontal Izquierda
                    for(forCanon = H -1 ; forCanon >= 0; forCanon-- ){
                        if (Tabla[V][forCanon] != 0){
                            break;
                        }
                        Tabla[V][forCanon] = typePieza;
                    }

                    //Vertical Arriba
                    for(forCanon = V -1 ; forCanon >= 0; forCanon-- ){
                        if (Tabla[forCanon][H] != 0){
                            break;
                        }
                        Tabla[forCanon][H] = typePieza;
                    }

                    //Vertical Abajo
                    for(forCanon = V +1 ; forCanon <= 9; forCanon++ ){
                        if (Tabla[forCanon][H] != 0){
                            break;
                        }
                        Tabla[forCanon][H] = typePieza;
                    }
                }
            }
        }

        //Rey
        if( Piezas == 5){
            Tabla[V][H]=5;
            if(V != 0 && Tabla[V-1][H] == 0 && V-1 < 3 && H < 6 && H > 2){
                Tabla[V-1][H] = typePieza;
            }
            if( Tabla[V+1][H] == 0 && V+1 < 3 && H < 6 && H > 2 ){
                Tabla[V+1][H] = typePieza;
            }
            if( Tabla[V][H-1] == 0 && V < 3 && H-1 < 6 && H-1 > 2){
                Tabla[V][H-1] = typePieza;
            }
            if( Tabla[V][H+1] == 0 && V < 3 && H+1 < 6 && H+1 > 2) {
                Tabla[V][H+1] = typePieza;
            }
        }

        //Alfil
        if( Piezas == 4 ){
            Tabla[V][H]=4;

            if(V != 0 && Tabla[V-1][H-1] == 0 && V-1 < 3 && H-1 < 6 && H-1 > 2){
                Tabla[V-1][H-1] = typePieza;
            }
            if( Tabla[V+1][H+1] == 0 && V+1 < 3 && H+1 < 6 && H+1 > 2 ){
                Tabla[V+1][H+1] = typePieza;
            }
            if( Tabla[V+1][H-1] == 0 && V+1 < 3 && H-1 < 6 && H-1 > 2){
                Tabla[V+1][H-1] = typePieza;
            }
            if(V != 0 && Tabla[V-1][H+1] == 0 && V-1 < 3 && H+1 < 6 && H+1 > 2) {
                Tabla[V-1][H+1] = typePieza;
            }
        }


        //Muestra movimientos Array
//        System.out.println();
//        for(int v = 0; v < 5;v++){
//            for(int h = 0; h < 9;h++){
//                System.out.print(Tabla[v][h]+" ");
//            }
//            System.out.println();
//        }

        return Tabla;
    }

}

