package collectionProgram;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoList {
public static void main(String[] args) {
	List<Integer>a=new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	List<Integer>b=new ArrayList<>();
	b.add(7);
	b.add(5);
	b.add(8);
	List<Integer>c=new ArrayList<>();
	c.addAll(a);
	c.addAll(b);
	System.out.println(c);
}
}
