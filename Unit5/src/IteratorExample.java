
import java.util.ArrayList;
import java.util.ListIterator;


public class IteratorExample {

    static ArrayList list = new ArrayList();
    static ListIterator li;
    static int pos = 0;
    
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        li = list.listIterator();
        //move 1 over
        System.out.println("1-Move over item: " + li.next());
        pos++;
        //move 2
        System.out.println("2-Move over item: " + li.next());
        pos++;
        //move 3
        System.out.println("3-Remove something ");
        //remove takes out the last thing the iterator travelled over
        //there is a .next(), .previous()
        li.remove();
        pos--;
        //move 4
        System.out.println("4-Add b back in");
        //always to the left of the iterator
        li.add("b");
        pos++;
        //move 5
        System.out.println("5-Move over item: " + li.next());
        pos++;
        //move 6
        System.out.println("6-Move back over item: " + li.previous());
        pos--;
        //move 7
        System.out.println("7-Remove last item seen ");
        li.remove();
        //move 8
        System.out.println("8-Move back over item: " + li.previous());
        pos--;
        //move 9
        System.out.println("9-Set last thing seen to e ");
        li.set("e");
        //move 10
        System.out.println("10-Add b back in to left of li ");
        li.add("b");
        pos++;
        //move 11
        System.out.println("11-Add c back to the left of li");
        li.add("c");
        pos++;
        /* 
        move 12 throws an error as the iterator must move over an item to remove something
        System.out.println("12-Try to remove something ");
        li.remove();
        */
        //move 13
        System.out.println("13-Move over item: " + li.next());
        pos++;
        /*
        move 14 doesn't work because the iterator can't move past the end of the list
        System.out.println("14-Move over item: " + li.next());
        pos++;
        */
        showList();
    }
    
    public static void showList(){
        for(int x = 0;x < list.size();x++){
            if(x==pos)System.out.print("*");
            System.out.print(list.get(x));
        }    
        if(pos==list.size())System.out.println("*");
        System.out.println("");
    }
    
}
