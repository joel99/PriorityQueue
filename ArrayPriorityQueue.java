import java.util.ArrayList;

public class ArrayPriorityQueue<T> implements PriorityQueue{
    
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
	    if (_arrayList.get(lowest).compareTo(_arrayList.get(i)) > 0){
		lowest = i;
	    }
	}
	_arrayList.get(lowest);
	
    }

    public T removeMin(){
        int lowest = 0;
	for (int i = 1; i < _arrayList.size(); i++){
	    if (_arrayList.get(lowest).compareTo(_arrayList.get(i)) > 0){
		lowest = i;
	    }
	}
	_arrayList.remove(lowest);
    }
}
