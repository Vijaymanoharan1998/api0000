package org.encap;

import java.util.ArrayList;
import java.util.List;

public class Tas2 {
	public static void main(String[] args) {
		Tas1 e = new Tas1( 10 ,23 ,"vijay");
	
	List<Tas1> li = new ArrayList<Tas1>();
    li.add(e);

System.out.println("id is"+li.get(0).getid());
System.out.println("age is"+li.get(0).getAge());
System.out.println("name is"+li.get(0).getName());

System.out.println("name");


System.out.println("ffff");

System.out.println("vijay");

System.out.println("gggg");

	
	

}
}