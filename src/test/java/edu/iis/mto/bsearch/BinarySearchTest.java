package edu.iis.mto.bsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    int key = 12;
    int wrongKey = 13;
    int[] sequenceOfLengthOne = new int[] {12};
    int[] longSequence = new int[] {12,15,52,127,500};
    BinarySearch bs = new BinarySearch().create();


    @Test
    void isInSequenceOfLengthOneTest(){
        SearchResult sr = bs.search(key,sequenceOfLengthOne);
        assertTrue(sr.isFound());
        assertEquals(key,sequenceOfLengthOne[sr.getPosition()]);
    }

    @Test
    void isNotInSequenceOfLengthOneTest(){
        SearchResult sr = bs.search(wrongKey,sequenceOfLengthOne);
        assertFalse(sr.isFound());
        assertEquals(-1,sr.getPosition());
    }

    @Test
    void isFirstElementOfSequenceTest(){
        SearchResult sr = bs.search(key,longSequence);
        assertTrue(sr.isFound());
        assertEquals(key,longSequence[sr.getPosition()]);
    }

    @Test
    void isLastElementOfSequenceTest(){
        key=500;
        SearchResult sr = bs.search(key,longSequence);
        assertTrue(sr.isFound());
        assertEquals(key,longSequence[sr.getPosition()]);
    }

    @Test
    void isCenterElementOfSequenceTest(){
        key=52;
        SearchResult sr = bs.search(key,longSequence);
        assertTrue(sr.isFound());
        assertEquals(key,longSequence[sr.getPosition()]);
    }
}

