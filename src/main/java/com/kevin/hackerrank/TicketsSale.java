package com.kevin.hackerrank;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class TicketsSale
{

  public long waitingTime(List<Integer> tickets, int p)
  {
    final Queue<Map.Entry<Integer, Boolean>> waitingLine = new LinkedList<>();
    for (int i = 0; i < tickets.size(); i++)
    {
      waitingLine.add(new AbstractMap.SimpleEntry<Integer, Boolean>(tickets.get(i), i == p));
    }

    long waitingTime = 0l;
    while (waitingLine.size() > 0)
    {
      waitingTime++;
      final Entry<Integer, Boolean> person = waitingLine.remove();
      if (person.getKey() == 1 && person.getValue())
      {
        break;
      }

      if (person.getKey() > 1)
      {
        waitingLine.add(new AbstractMap.SimpleEntry<Integer, Boolean>(person.getKey() - 1, person.getValue()));
      }
    }

    return waitingTime;
  }

}
