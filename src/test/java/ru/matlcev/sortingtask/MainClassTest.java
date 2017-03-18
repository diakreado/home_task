package ru.matlcev.sortingtask;

import org.junit.Test;

import static org.junit.Assert.*;


public class MainClassTest {

    @Test
    public void verifySorting() throws Exception {

        int[] inputData0 = {477,301,392,436,426,65,425,47,490,475,240,294,425,443,192,107,432,248,93,151};
        assertTrue(MainClass.findMaxSubArray(inputData0).equals(47,490));

        int[] inputData1 = {96,18,86,94,22,36,17,25,17,3,88,71,3,2,55,86,44,44,23,5,65,33,73,81,86};
        assertTrue(MainClass.findMaxSubArray(inputData1).equals(3,88));

        int[] inputData2 = {91,55,70,63,30,81,59,44,68,60,95,41,33};
        assertTrue(MainClass.findMaxSubArray(inputData2).equals(30,95));

        int[] inputData3 = {106,64,57,46,134,106,107,20,86,65,67,28,122,64};
        assertTrue(MainClass.findMaxSubArray(inputData3).equals(20,122));

        int[] inputData4 = {100,200,200,10,20,111,110,1};
        assertTrue(MainClass.findMaxSubArray(inputData4).equals(10,111));

        int[] inputData5 = {5,10};
        assertTrue(MainClass.findMaxSubArray(inputData5).equals(5,10));

        int[] inputData6 = {5,1,5};
        assertTrue(MainClass.findMaxSubArray(inputData6).equals(1,5));

        int[] inputData7 = {10,11,7,10,6};
        assertTrue(MainClass.findMaxSubArray(inputData7).equals(7,10));

        int[] inputData8 = {100,113,110,85,105,102,86,63,81,101,84,106,101,79,94};
        assertTrue(MainClass.findMaxSubArray(inputData8).equals(63,106));

        int[] inputData9 = {23,42,13,124,108,49,53,47,80,79,37,61,55,102,68,30};
        assertTrue(MainClass.findMaxSubArray(inputData9).equals(13,124));

        int[] inputData10 = {58,7,3,63,127,56,3,130,42,172,45,64,76,12,37,154,148,42,189,154,
                2,153,62,175,49,129,113,173,88,170,4,60,23,26,26,47,38,171,38,165,189,81,6,30,157,156,7,123,81,91};
        assertTrue(MainClass.findMaxSubArray(inputData10).equals(2,189));
   }
}