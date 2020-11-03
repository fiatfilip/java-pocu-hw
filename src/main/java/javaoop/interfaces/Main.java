package javaoop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HumanBeing> humanBeingList = new ArrayList<HumanBeing>();
        humanBeingList.add(new Child());
        humanBeingList.add(new GrownUp());
        humanBeingList.add(new Oldman());
        humanBeingList.add(new Child());

        for (HumanBeing hb: humanBeingList) {
            // hb.sayHi();
            invoquer(hb);
            if(hb instanceof Paying){
                ((Paying) hb).pay();
            }
        }

        HumanBeing hb2 = new Child();
        hb2.sayHi();
    }

    static void invoquer(HumanBeing hb){
        hb.sayHi();
    }

//    static void invoquer(Child hb){
//       hb.sayHi();
//    }
}
