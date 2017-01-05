package com.elvis.list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.LinkedList;
import static com.elvis.list.P01.last;
import static com.elvis.list.CollectionUtils.linkedList;
import org.junit.Test;

public class P01Test{
    @Test
    public void findLastElementsFromAListofAlphabets() {
        LinkedList<String> alphabets = linkedList("a","b","c","d");
        assertThat(P01.last(alphabets),is(equalTo("d")));
    }
}
