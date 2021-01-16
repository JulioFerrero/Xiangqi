package com.ajedrez;

import java.util.ArrayList;
import java.util.List;

public class clean {
    List<ArrayList<Piezas>> list;
    public clean (List<ArrayList<Piezas>> list){
        this.list = list;
    }
    public List<ArrayList<Piezas>> eraseEat(){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (list.get(i).get(j).isEat()){
                    list.get(i).get(j).setEat(false);
                }
            }
        }
        return list;
    }
}
