package com.ajedrez;

public class Piezas {
    private final boolean Color;
    private int TipoPieza;
    private int X;
    private int Y;

    public Piezas(boolean Color, int TipoPieza,int X, int Y) {
        this.Color=Color;
        this.TipoPieza=TipoPieza;
        this.X=X;
        this.Y=Y;
    }

    public int getTipoPieza() {
        return TipoPieza;
    }

    public boolean isColor() {
        return Color;
    }

    public void setTipoPieza(int tipoPieza) {
        TipoPieza = tipoPieza;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}