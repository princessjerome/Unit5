
public class TireSales {
    
    public static void main (String[] args){
        ArrayStack pole = new ArrayStack();
        //add 4 tires to pole
        pole.push(new Tire("Goodyear"));
        pole.push(new Tire("Goodyear"));
        pole.push(new Tire("Goodyear"));
        pole.push(new Tire("Goodyear"));
        //sell 2 tires
        System.out.println("Selling 2 tires");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        //add 2 more tires to pole
        pole.push(new Tire("Micheline"));
        pole.push(new Tire("Micheline"));
        //selling 3 tires
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        System.out.println(pole.pop());
    }
}
