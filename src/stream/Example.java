package stream;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=Arrays.asList("Bob","Alice","alaka");
		name.stream().filter(names->names.startsWith("B"))
		.forEach(System.out::println);

	}

}
