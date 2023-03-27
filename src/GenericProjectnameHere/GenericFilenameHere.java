package GenericProjectnameHere;

public class GenericFilenameHere {

    public static void main(String[] args){

        //In short, Java Generics must represent what we think it will. JavaFX comes to mind...

        /*TripletRecord<Integer> tri = new TripletRecord<>(1, 2, 4);
        System.out.println(tri);

        TripletRecord<String> trs = new TripletRecord<>("Hello", "Yes", "Well");
        System.out.println(trs);

        TripletRecord<Double> trd = new TripletRecord<>(1.02, 2.05, 4.46);
        System.out.println(trd);*/

        CheaterStack<Integer> stk = new CheaterStack();
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());


    }
}
