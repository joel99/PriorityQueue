//<Team Name> -- Joel Ye and Advay Sriram
//APCS2 pd10
//HW35 -- Privileged Status Gets You to the Front of the Line
//2016 - 05 - 04

import java.util.ArrayList;

public class ArrayPriorityQueue<T extends Comparable<T>> implements PriorityQueue<T>{
    
    private ArrayList<T> _arrayList;

    public ArrayPriorityQueue(){
		_arrayList = new ArrayList<T>();
    }

    public boolean isEmpty(){
	return _arrayList.size() == 0;
    }

    public void add(T x){
		_arrayList.add(x);
    }

    public T peekMin(){
        int lowest = 0;
	for (int i = 1; i < _arrayList.size(); i++){
	    if (((Comparable)(_arrayList.get(lowest))).compareTo((Comparable)_arrayList.get(i)) > 0){
		lowest = i;
	    }
	}
	return _arrayList.get(lowest);
	
    }

    public T removeMin(){
        int lowest = 0;
	for (int i = 1; i < _arrayList.size(); i++){
	    if (((Comparable)(_arrayList.get(lowest))).compareTo((Comparable)_arrayList.get(i)) > 0){
		lowest = i;
	    }
	}
	return _arrayList.remove(lowest);
    }
	
	public static void main(String[] args){
		ArrayPriorityQueue<Integer> arr = new ArrayPriorityQueue<>();
		arr.add(1);
		arr.add(3);
		arr.add(2);
		System.out.println(arr.peekMin());
		System.out.println(arr.removeMin());
		System.out.println(arr.removeMin());
	}
}
