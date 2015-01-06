
import java.util.ArrayList;


public class Unit5 {
    
    static ArrayList al = new ArrayList();
    
    public static void main(String[] args) {
        //adds to 0 pos
        al.add("A");
        //bumps "A" down the list, "B" now at 0
        al.add(0, "B");
        //adds to bottom of list
        al.add("BANANA");
        al.add("PEAR");
        al.add(1, "ORANGE");
        
        //change banana to kiwi
        System.out.println("BANANA is at: " + al.indexOf("BANANA"));
        al.set(3, "KIWI");
        //remove "A" and "B"
        //"B" removed first, by index
        al.remove(0);
        //"A" removed by string
        al.remove("A");
        
        //sorts the arraylist
        al.sort(null);
        
        //displays the whole array list
        show();
    }
    
    public static void show(){
        for(int x=0;x<al.size();x++){
            String letter = String.valueOf(al.get(x));
            System.out.println("Value at " + x + "->" + letter);
        }
    }
    
}
