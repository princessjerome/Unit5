public class RadioShow {
    public static void main(String[] args){
        LinkedQueue phoneline = new LinkedQueue();
        //3 people call in
        phoneline.enqueue(new Caller("Bob"));
        phoneline.enqueue(new Caller("Cindy"));
        phoneline.enqueue(new Caller("Joe"));
        //take the next caller
        System.out.println("Take next caller");
        System.out.println(phoneline.dequeue());
        //2 more people call in
        phoneline.enqueue(new Caller("Mary"));
        phoneline.enqueue(new Caller("Larry"));
        //take the next 3 caller
        System.out.println("Take next 3 callers");
        System.out.println(phoneline.dequeue());
        System.out.println(phoneline.dequeue());
        System.out.println(phoneline.dequeue());
        //who is next?
        System.out.println("Next caller will be: " + phoneline.peekFront());
        //how many callers left?
        System.out.println("Callers still waiting: " + phoneline.size());
        
    }
}
