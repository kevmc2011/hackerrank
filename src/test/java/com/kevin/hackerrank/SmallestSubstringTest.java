package com.kevin.hackerrank;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SmallestSubstringTest
{

  @Test
  public void shouldReturn2IfTheOriginalStringOnlyHasTwoCharacters() throws Exception
  {
    assertThat(new SmallestSubstring().check("ab"), is(equalTo(2)));
  }

  @Test
  public void shouldReturn2IfTheStringHasTwoRepeatedCharacters() throws Exception
  {
    assertThat(new SmallestSubstring().check("aba"), is(equalTo(2)));
  }

  @Test
  public void shouldReturn5IfTheSMallestSubstringIsInTheMiddle() throws Exception
  {
    assertThat(new SmallestSubstring().check("aaaabcabccdccc"), is(equalTo(5)));
  }

  @Test
  public void shouldReturn2IfOnlyOneDifferentChar() throws Exception
  {
    assertThat(new SmallestSubstring().check("aaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"), is(equalTo(2)));
  }

}
