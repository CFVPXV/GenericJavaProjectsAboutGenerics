package GenericProjectnameHere;

import java.io.Serializable;

//Much like our most generic of Objects, T can extend objects like Number to enforce our generic to be
//certain values. Also a second generic...or more if you feel like it.
public class TripletRecord<T extends Number, E>  implements Serializable {

    private T x;
    private E y;
    private T z;

    public TripletRecord(T xp, E yp, T zp){
        x = xp;
        y = yp;
        z = zp;
    }

    public T getX(){
        return x;
    }

    public E getY(){
        return y;
    }

    public T getZ(){
        return z;
    }

    public String toString(){
        String temp = "X: " + x + " Y: " + y + " Z: " + z;
        return temp;
    }
}
