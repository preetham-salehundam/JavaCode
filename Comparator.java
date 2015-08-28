package com.test1;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.Iterator;//if iterator is used


public abstract class comparator implements Comparator{
	public static void main(String[] args){
		Vector<Integer> v = new Vector<Integer>(10);
		v.add(30);
		v.add(10);
		v.add(20);
		System.out.println(v);
		Comparator<Integer> c = Collections.reverseOrder();/*returns a reference to C which when send as parameter to sort() will sort the unsorted Vector in descending order*/
		Comparator a = Collections.reverseOrder(c);/*reverses the order of the Comparator hence return ref which when fed to sort() gives ascending order*/
		Collections.sort(v,c);
		System.out.println(v);
		Collections.sort(v,a);
		System.out.println(v);
		
	}

}
