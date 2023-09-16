package Java.Collections;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if(this.contains(o))
            return true;
        else return super.add(o);
    }

    public static void main(String[] args) {
       CustomArrayList list = new CustomArrayList();
       list.add(10);
       list.add(10);
       list.add(10);
       System.out.println(list);

    }
}
