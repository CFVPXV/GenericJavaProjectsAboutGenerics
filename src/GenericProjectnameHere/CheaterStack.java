package GenericProjectnameHere;

import java.util.ArrayList;
import java.util.List;

public class CheaterStack<T>{


    private ArrayList<T> theStack;
    private int size = 0;

    public CheaterStack(){
        theStack = new ArrayList<T>();
    }

    public void push(T toPush){
        size++;
        theStack.add(0,toPush);

    }

    public T pop(){
        T returner = theStack.get(0);
        theStack.remove(0);
        size--;
        return returner;
    }

    public T peek(){
        return theStack.get(theStack.size() - 1);
    }
}
