package com.kevin.hackerrank;

public class SmallestSubstring
{

  public int check(String s)
  {
    final StringBuilder sb = new StringBuilder();
    s.chars().distinct().forEach(c -> sb.append((char) c));
    String distinctLetters = sb.toString();

    int smallest = s.length();
    for (int i = 0; i < s.length(); i++)
    {
      for (int j = i; j < s.length(); j++)
      {
        String substring = s.substring(i, j);
        if (containsAll(substring, distinctLetters) && substring.length() < smallest)
        {
          smallest = substring.length();
        }
      }
    }
    return smallest;
  }

  private boolean containsAll(String substring, String distinctLetters)
  {
    return distinctLetters.chars().allMatch(c -> substring.indexOf(c) > -1);
  }

}
