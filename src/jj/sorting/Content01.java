package jj.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Content01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1, 21, 99, 47, 36, 77}; // Collections.reverseOrder() 쓰려면 Integer이여야함, int면 딴거 써야함
		
		// 내림차순
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr)); // [99, 77, 47, 36, 21, 1]
		
		// 오름차순
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); // [1, 21, 36, 47, 77, 99]
		
		// Lambda를 이용한 구현
		Arrays.sort(arr, (i1, i2) -> i2 - i1);
		System.out.println(Arrays.toString(arr)); // [99, 77, 47, 36, 21, 1]
		
		// 내림차순 Comparator를 직접 구현
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		});
		System.out.println(Arrays.toString(arr)); // [99, 77, 47, 36, 21, 1]

		int[] arr1 = {1, 21, 99, 47, 36, 77}; 
		Arrays.sort(arr1, 0, 4); // index 0 에서 index 4 까지만 정렬
		System.out.println(Arrays.toString(arr1)); // [1, 21, 47, 99, 36, 77]
		
		String[] arr2 = {"Apple", "Kaya", "Orange", "Banana", "Melon", "Chock"};
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2)); // [Apple, Banana, Chock, Kaya, Melon, Orange]
		
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2)); // [Orange, Melon, Kaya, Chock, Banana, Apple]
		
		// 문자열 길이를 비교, Lambda를 이용한 구현
		Arrays.sort(arr2, (s1, s2) -> s1.length() - s2.length());
		System.out.println(Arrays.toString(arr2)); // [Kaya, Melon, Chock, Apple, Orange, Banana]
		
		// 문자열 길이를 비교하는 Comparator 구현
		Arrays.sort(arr2, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		System.out.println(Arrays.toString(arr2)); // [Kaya, Melon, Chock, Apple, Orange, Banana]

		
		// 객체를 갖고 있는 배열도 정렬할 수 있다. 클래스에 Comparable을 구현하여 비교할 수 있게 해야 한다.
		Fruit[] arr3 = {
				new Fruit("Apple", 100),
				new Fruit("Kiwi", 500),
			    new Fruit("Orange", 200),
			    new Fruit("Banana", 50),
			    new Fruit("Watermelon", 880),
			    new Fruit("Cherry", 10)
		};
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		// [{name: Cherry, price: 10}, {name: Banana, price: 50}, {name: Apple, price: 100}, {name: Orange, price: 200}, {name: Kiwi, price: 500}, {name: Watermelon, price: 880}]

	}

}

class Fruit implements Comparable<Fruit>{
	private String name;
    private int price;
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
    	return "{name: " + name + ", price: " + price + "}";
    }
    
    @Override
    public int compareTo(Fruit fruit) {
    	return this.price - fruit.price;
    }
}
