package codePractice;
import java.util.*;
public class arrayvect {

	public static void main(String[] args) {
Vector v1 = new Vector();
v1.add(1);
v1.add(2);
v1.add(0,3); // add at specific index
v1.add("john");
for(int i = 0; i < 10; i++) {
	v1.add(i,i*i);
}

v1.add(14,20);
v1.add(15,15);
v1.add(" ");//adding null values are allowed and duplicates are also allowed

Vector v2 = new Vector();
v2.add("ram");
v2.add("rahim");

for(int j = 0 ;j < v2.size(); j++) {
	v1.add(v2.get(j));	
}

Vector<Comparable> v3 = new Vector();
v3.addAll(v1);//adding all v1 elements into v1

for(int i = 0; i < v3.size(); i++) {
	System.out.println(v3.get(i));
}


Vector v4 = new Vector(20);// change the default capacity of a list
Object[] arr1 = new Object[] {1,23,45};
Vector v5 = new Vector(Arrays.asList(arr1));//passing array to a list
System.out.println(v5);
v1.remove("rahim");
v1.remove(1);


v1.removeAll(v3);// remove intersection of v1 and v3 elements
v2.clear(); // remove entire list
System.out.println(v3.contains("john")); //verification of elements in vector 
System.out.println(v3.containsAll(v1)); // verification of multiple elements with order is not mandatory
v3.set(1, "ud");//update at a particular index
System.out.println(v3.indexOf("ud")); // displays index of an element
System.out.println(v3.lastIndexOf(49)); // displays last index of a value
System.out.println(v3.firstElement());// displays first element in list
System.out.println(v3.lastElement());//displays last element in list
System.out.println(v3.isEmpty());// checking the list is empty or not
Object[] arr = v3.toArray(); // converting into array
System.out.println(Arrays.toString(arr));// converting into string

Vector<Integer> v6 = new Vector<>(); //Generic, for adding a specific type of elements into vector
v6.add(1);
v6.add(null); // allows null values into vector of having integer type
v6.add(1); // allows duplicate values into vector having integer type
System.out.println("v6 element is:"+v6.get(0));

System.out.println(v3);
System.out.println(v1);
System.out.println("size :"+v1.size());
System.out.println("Capacity :"+v1.capacity());
System.out.println(v2);
System.out.println(v4.capacity());
	}

}
