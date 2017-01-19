package com.elvis.list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class P04Test {
    @Test
    public void listOfEmptyListShouldBe0() throws Exception {
        int length1 = P04.length(Collections.emptyList());
        long length2 = P04.lengthStream(Collections.emptyList());
        int length3 = P04.lengthRecursive(Collections.emptyList());
        assertThat(length1, is(equalTo(0)));
        assertThat(length2, is(equalTo((long)0)));
        assertThat(length3, is(equalTo(0)));
    }
    
    @Test
    public void shouldfindNoEmptyOfList() throws Exception {
        int length1 = P04.length(Arrays.asList(1,2,3,4,5));
        long length2 = P04.lengthStream(Arrays.asList(1,2,3,4,5,6));
        int lennth3 = P04.lengthRecursive(Arrays.asList(1,2,4,5,6,7,8));
        assertThat(length1, is(equalTo(5)));
        assertThat(length2, is(equalTo((long)6)));
        assertThat(lennth3, is(equalTo(7)));
    }
}
