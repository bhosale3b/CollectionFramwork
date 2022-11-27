package com.collection_framwork_StreamAPI_8;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPITest {
	public static void main(String[] args) {
	Stream<Integer>	num =Stream.of(67,8,90,4,567,89);
	
	//System.out.println(num.count());
	//num.sorted().forEach(System.out :: println);
	//num.limit(4).forEach(System.out :: println);
    Optional<Integer> o =num.findFirst();
    System.out.println(o.get());

	}

}
