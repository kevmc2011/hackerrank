package com.kevin.hackerrank;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class TicketsSaleTest
{

  @Test
  public void shouldBeNoWaitingTimeIfAlexIsAtTheFrontOfTheQueueAndOnlyNeedsOneTicket() throws Exception
  {
    assertThat(new TicketsSale().waitingTime(Arrays.asList(1, 2, 2), 0), is(equalTo(1l)));
  }

  @Test
  public void shouldBeWaitingFor3SecondsIfHeNeedsTwoTicketsAndTwoPeopleInTheQueue() throws Exception
  {
    assertThat(new TicketsSale().waitingTime(Arrays.asList(2, 1), 0), is(equalTo(3l)));
  }

  @Test
  public void shouldBeWaitingFor14SecondsIfHeNeedsTwoTicketsAndTwoPeopleInTheQueue() throws Exception
  {
    assertThat(new TicketsSale().waitingTime(Arrays.asList(6, 5, 3, 2, 1, 2), 2), is(equalTo(14l)));
  }

}
