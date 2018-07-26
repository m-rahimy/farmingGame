package util;

public class Pair<T,E>{

	T a;
	E b;
	public Pair(T t, E e){
		this.a = t;
		this.b = e;	
	}

	public T getA(){
		return a;
	}

	public E getB(){
		return b;
	}

	
}