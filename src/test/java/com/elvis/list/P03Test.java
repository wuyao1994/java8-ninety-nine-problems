package com.elvis.list;

import static com.elvis.list.CollectionUtils.linkedList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class P03Test {
    @Test
    public void findKthFromAList() throws Exception {
        assertThat(P03.kth(asList("a", "b", "c", "d"), 2), is(equalTo("c")));
    }
    @Test
    public void findKthRecursiveFromALinkList() throws Exception {
        LinkedList<Integer> list = linkedList(1,2,3,4,5);
        assertThat(P03.kthRecursive(list, 2), is(equalTo(3)));
    }
    @Test
    public void shouldFindKthFromAListByStream() throws Exception {
        List<Integer> numbers = asList(1,2,3,4,5);
        assertThat(P03.kthStream(numbers, 2), is(equalTo(3)));
    }
}
