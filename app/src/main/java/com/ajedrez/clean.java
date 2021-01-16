package com.ajedrez;

import java.util.ArrayList;
import java.util.List;

public class clean {
    List<ArrayList<Piezas>> list;
    public clean (List<ArrayList<Piezas>> list){
        this.list = list;
    }
    public List<ArrayList<Piezas>> eraseEights(){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (list.get(i).get(j).getTipoPieza() == 8){
                    list.get(i).get(j).setTipoPieza(0);
                }
            }
        }
        return list;
    }
}
