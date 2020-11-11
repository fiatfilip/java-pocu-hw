package collections.maps;

import collections.Persoana;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Persoana> persoane = new HashMap<>();
        persoane.put("Sica", new Persoana("Vasilica"));
        persoane.put("Mishu", new Persoana("Mihail"));

        for (String nick: persoane.keySet()) {
            System.out.println(persoane.get(nick));
        }

        persoane.put("Sica", new Persoana("Ludovic"));

        for( Map.Entry<String, Persoana> entry: persoane.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
