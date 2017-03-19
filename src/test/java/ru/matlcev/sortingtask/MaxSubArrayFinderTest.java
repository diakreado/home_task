package ru.matlcev.sortingtask;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.matlcev.sortingtask.MaxSubArrayFinder.findMaxSubArray;


public class MaxSubArrayFinderTest {

    @Test
    public void verifySortingTest1() throws Exception {

        int[] inputData0 = {477,301,392,436,426,65,425,47,490,475,240,294,425,443,192,107,432,248,93,151};
        assertTrue(findMaxSubArray(inputData0).equals(47,490));
   }
    @Test
    public void verifySortingTest2() throws Exception {

        int[] inputData = {96,18,86,94,22,36,17,25,17,3,88,71,3,2,55,86,44,44,23,5,65,33,73,81,86};
        assertTrue(findMaxSubArray(inputData).equals(3,88));
    }
    @Test
    public void verifySortingTest3() throws Exception {

        int[] inputData = {91,55,70,63,30,81,59,44,68,60,95,41,33};
        assertTrue(findMaxSubArray(inputData).equals(30,95));
    }
    @Test
    public void verifySortingTest4() throws Exception {

        int[] inputData = {106,64,57,46,134,106,107,20,86,65,67,28,122,64};
        assertTrue(findMaxSubArray(inputData).equals(20,122));
    }
    @Test
    public void verifySortingTest5() throws Exception {

        int[] inputData = {100,200,200,10,20,111,110,1};
        assertTrue(findMaxSubArray(inputData).equals(10,111));
    }
    @Test
    public void verifySortingTest6() throws Exception {

        int[] inputData = {5,10};
        assertTrue(findMaxSubArray(inputData).equals(5,10));
    }
    @Test
    public void verifySortingTest7() throws Exception {

        int[] inputData = {5,-1,5};
        PairMinMax pairMinMax = findMaxSubArray(inputData);
        assertTrue(pairMinMax.equals(-1,5));
        assertEquals(pairMinMax.getIndexOfMaximum(), 2);
        assertEquals(pairMinMax.getIndexOfMinimum(), 1);
    }
    @Test
    public void verifySortingTest8() throws Exception {

        int[] inputData = {10,11,7,10,6};
        PairMinMax pairMinMax = findMaxSubArray(inputData);
        assertTrue(pairMinMax.equals(7,10));
        assertEquals(pairMinMax.getIndexOfMaximum(), 3);
        assertEquals(pairMinMax.getIndexOfMinimum(), 2);
    }
    @Test
    public void verifySortingTest9() throws Exception {

        int[] inputData = {100,113,110,85,105,102,86,63,81,101,84,106,101,79,94};
        assertTrue(findMaxSubArray(inputData).equals(63,106));
    }
    @Test
    public void verifySortingTest10() throws Exception {

        int[] inputData = {23,42,13,124,108,49,53,47,80,79,37,61,55,102,68,30};
        assertTrue(findMaxSubArray(inputData).equals(13,124));
    }
    @Test
    public void verifySortingTest11() throws Exception {

        int[] inputData = {58,7,3,63,127,56,3,130,42,172,45,64,76,12,37,154,148,42,189,154,
                2,153,62,175,49,129,113,173,88,170,4,60,23,26,26,47,38,171,38,165,189,81,6,30,157,156,7,123,81,91};
        assertTrue(findMaxSubArray(inputData).equals(2,189));
    }
    @Test
    public void verifySortingTest12() throws Exception {

        int[] inputData = {5,10,-1,5,11,0,24};
        assertTrue(findMaxSubArray(inputData).equals(-1,24));
    }
    @Test
    public void verifySortingTest13() throws Exception {

        int[] inputData = {457,449,13,67,321,108,98,392,166,289,399,259,92,70,190,432,259,291,11,
                123,416,101,482,379,76,302,472,86,159,83,219,269,131,402,154,332,353,359,296,439,256,
                449,367,97,422,243,428,444,493,488};
        assertTrue(findMaxSubArray(inputData).equals(11,493));
    }
    @Test
    public void verifySortingTest14() throws Exception {

        int[] inputData = {1,2,3,4,5,6,7,8,9};
        assertTrue(findMaxSubArray(inputData).equals(1,9));
    }
    @Test(expected=NotIncreasingElements.class)
    public void verifySortingTest15() throws Exception {

        int[] inputData = {9,8,7,6,5,4,3,2,1,0};
        assert(findMaxSubArray(inputData).equals(1,9));
    }
    @Test(expected=NotIncreasingElements.class)
    public void verifySortingTest16() throws Exception {

        int[] inputData = {4,4,4,4,4,4,4,4,4};
        assert(findMaxSubArray(inputData).equals(4,4));
    }
}