package com.kevin.hackerrank;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest
{

  @Test
  public void shouldPrintTheNumberIfItsNotAMultipleOf3Or5() throws Exception
  {
    assertThat(new FizzBuzz().print(2), is(equalTo("1,2")));
  }

  @Test
  public void shouldPrintFizzIfItsAMultipleOf3ButNot5() throws Exception
  {
    assertThat(new FizzBuzz().print(4), is(equalTo("1,2,Fizz,4")));
  }

  @Test
  public void shouldPrintBuzzIfItsAMultipleOf5ButNot3() throws Exception
  {
    assertThat(new FizzBuzz().print(5), is(equalTo("1,2,Fizz,4,Buzz")));
  }

  @Test
  public void shouldPrintFizzBuzzIfItsAMultipleOf5And3() throws Exception
  {
    assertThat(new FizzBuzz().print(15), is(equalTo("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz")));
  }

}
