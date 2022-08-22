package ezen0816_Collection.sec05.exam04_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		/*
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		//Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));		
		treeSet.add(new Fruit("딸기", 6000));
		*/
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		// 비교기준이 되는 클래스 타입으로 객체 생성 -> new DescendingComparator();
		// 즉 비교기준을 내 마음대로 정의하고 그 비교기준을 넣어준다고 생각
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));		
		treeSet.add(new Fruit("딸기", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
