package edu.iis.mto.bsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {


    @Test
    void isInSequenceOfLengthOneTest(){
        int key = 12;
        int[] sequence = new int[] {12};
        BinarySearch bs = new BinarySearch();
        bs.create();
        SearchResult sr = bs.search(key,sequence);
        assertTrue(sr.isFound());
        assertEquals(key,sequence[sr.getPosition()]);
    }
}

