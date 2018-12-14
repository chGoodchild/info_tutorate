// https://en.wikipedia.org/wiki/Generics_in_Java

import java.util.*;

public class MyTupleList<A, B, C> {	
	
    private ArrayList<MyTuple<A, B, C>> tupleList;
	
    public MyTupleList() {
        tupleList = new ArrayList<MyTuple<A, B, C>>();
    }
	
    public void addTuple(MyTuple<A, B, C> tuple) {
        tupleList.add(tuple);
    }
	
    public void showTuplelist() {
        Iterator<MyTuple<A, B, C>> it = tupleList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
