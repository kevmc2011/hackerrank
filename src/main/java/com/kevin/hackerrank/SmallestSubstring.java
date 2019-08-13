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
        if (substring.length() < smallest && distinctLetters.chars().allMatch(c -> substring.indexOf(c) > -1))
        {
          smallest = substring.length();
        }
      }
    }
    return smallest;
  }

}
