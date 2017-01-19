package com.elvis.list;

import java.util.Collections;
import java.util.*;
import static com.elvis.list.CollectionUtils.linkedList;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class P02Test {
    @Test
    public void shouldFindSencondElementFromAList() throws Exception{
        List<Integer> numbers = asList(1,2,3,4,5,6,7,8,9,10);
        assertThat(P02.secondList(numbers), is(equalTo(9)));
    }
    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListEmpty() {
        P02.secondList(Collections.emptyList());
    }
    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListHasSingleElemnts() {
        P02.secondList(Arrays.asList(1));
    }
    @Test
    public void shouldFindSecondElementFromALinkList() {
        LinkedList<Integer> numbers = linkedList(1,2,3,4,5,6,7,8,9,10);
        assertThat(P02.secondListRecursion(numbers), is(equalTo(9)));
    }
}
