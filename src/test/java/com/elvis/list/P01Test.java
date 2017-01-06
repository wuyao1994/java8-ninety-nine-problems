package com.elvis.list;

import static com.elvis.list.CollectionUtils.linkedList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;

import java.util.LinkedList;

import org.junit.Test;

public class P01Test{
    @Test
    public void findLastElementsFromAListofAlphabets() {
        LinkedList<String> alphabets = linkedList("a","b","c","d");
        assertThat(P01.last(alphabets),is(equalTo("d")));
    }
    
    @Test
    public void findLast1ElementsFromAListofAlphabets() {
        assertThat(P01.last1(asList("a", "b", "c", "d")), is(equalTo("d")));
    }
    
    @Test
    public void findLast2ElementsFromAListofAlphabets() {
        assertThat(P01.lastRecursive(asList("a","b","c","d")), is(equalTo("d")));
    }
}
