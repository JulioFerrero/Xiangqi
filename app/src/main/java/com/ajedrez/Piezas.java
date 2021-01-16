package com.ajedrez;

public class Piezas {
    private final Boolean Color;
    private int TipoPieza;
    private boolean eat;

    public Piezas(Boolean Color, int TipoPieza, boolean eat) {
        this.Color=Color;
        this.TipoPieza=TipoPieza;
        this.eat=eat;
    }

    public int getTipoPieza() {
        return TipoPieza;
    }

    public Boolean isColor() {
        return Color;
    }

    public void setTipoPieza(int tipoPieza) {
        TipoPieza = tipoPieza;
    }

    public boolean isEat() {
        return eat;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }
}