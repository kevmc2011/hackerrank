package com.kevin.hackerrank;

public class SmallestSubstring
{

  public int check(String s)
  {
    String distinctLetters = "";
    for (int i = 0; i < s.length(); i++)
    {
      if (distinctLetters.indexOf(s.charAt(i)) == -1)
      {
        distinctLetters += s.charAt(i);
      }
    }

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
    boolean containsAll = true;
    for (int i = 0; i < distinctLetters.length(); i++)
    {
      if (substring.indexOf(distinctLetters.charAt(i)) == -1)
      {
        containsAll = false;
        break;
      }
    }
    return containsAll;
  }

}
