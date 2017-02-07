package com.elvis.list;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static com.elvis.list.CollectionUtils.arrayDeque;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class P05Test {
    @Test
    public void shouldReverseAList() throws Exception {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        assertThat(P05.reverse_foreach(list), is(equalTo(Arrays.asList(5,4,3,2,1))));
        list = Arrays.asList(1,2,3,4,5);
        assertThat(P05.ReverseAList(list), is(equalTo(Arrays.asList(5,4,3,2,1))));
        list = Arrays.asList(1,2,3,4,5);
        assertThat(P05.reverse_IntStream(list), is(equalTo(Arrays.asList(5,4,3,2,1))));
        ArrayDeque<Integer> numbers = arrayDeque(1,2,3,4,5);
        assertThat(P05.reverse_StreamSupport(numbers), is(equalTo(Arrays.asList(5,4,3,2,1))));
    }
}
