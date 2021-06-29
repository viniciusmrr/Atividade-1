package javaapplication1;

import java.util.ArrayList;

public class Loops {

    ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {
        Loops loops = new Loops();

        loops.items.add("A");
        loops.items.add("B");
        loops.items.add("C");
        loops.items.add("D");
        loops.items.add("E");
        loops.items.add("F");
        loops.items.add("G");
        loops.items.add("H");
        
        loops.loopForSimples();
        loops.loopForIterador();
        loops.loopWhile();
        
        System.out.println("ainda bem!!!");
        
        
    }

    public void loopForSimples() {
        //index = index + 1
        for (int index = 0; index < items.size(); index +=1) {
            System.out.println("Index = " + index
            + " com valor = " + items.get(index));
            
        }
    }
    public void loopForIterador() {
        for (String item: items) {
            System.out.println(item);
        }
    }
    
    public void loopWhile() {
        boolean continuarRodando = true;
        while (continuarRodando) {
            if (items.size() == 0) {
                continuarRodando = false;
            } else {
                String paraRemover = items.get(0);
                System.out.println("para remover = " + paraRemover);
                items.remove(paraRemover);
            }
        }
    }
}
