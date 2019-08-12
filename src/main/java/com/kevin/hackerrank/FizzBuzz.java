package com.kevin.hackerrank;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz
{

  public String print(int i)
  {
    // @formatter:off
    return IntStream.rangeClosed(1, i)
        .mapToObj(
            n -> n % 3 == 0 ? 
           (n % 5 == 0 ? "FizzBuzz" : "Fizz") : 
           (n % 5 == 0 ? "Buzz" : String.valueOf(n)))
        .collect(Collectors.joining(","));
        //.forEach(System.out::println);
    // @formatter:on
  }

}
