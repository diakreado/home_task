package ru.matlcev.sortingtask;

public class MainClass {

    public static PairMinMax findMaxSubArray(int[] inputArray) {


        int middle = (inputArray.length - 1)/2;

        return findMaxPair(inputArray,0, middle, inputArray.length - 1);
    }

    private static PairMinMax findMaxPair(int[] inputArray, int leftBorder, int middle, int rightBorder) {

        PairMinMax leftPart = findMaxInTheLeftPart(inputArray, leftBorder, middle);
        PairMinMax rightPart = findMaxInTheRightPart(inputArray, middle + 1, rightBorder);
        PairMinMax centralPart = findMaxInTheCentralPart(inputArray, leftBorder, middle, rightBorder);

        if(leftPart.compareTo(rightPart) == 1 && leftPart.compareTo(centralPart) == 1) return leftPart;
        if(rightPart.compareTo(leftPart) == 1 && rightPart.compareTo(centralPart) == 1) return rightPart;
        return centralPart;
    }

    private static PairMinMax findMaxInTheLeftPart(int[] inputArray, int leftBorder, int rightBorder) {

        if(rightBorder - leftBorder < 2) {

            return new PairMinMax(inputArray[leftBorder],inputArray[rightBorder]);
        }

        return findMaxPair(inputArray, leftBorder, (rightBorder + leftBorder)/2, rightBorder);
    }

    private static PairMinMax findMaxInTheRightPart(int[] inputArray, int leftBorder, int rightBorder) {

        if(rightBorder - leftBorder < 2) {

            return new PairMinMax(inputArray[leftBorder],inputArray[rightBorder]);
        }

        return findMaxPair(inputArray, leftBorder, (rightBorder + leftBorder)/2, rightBorder);
    }

    private static PairMinMax findMaxInTheCentralPart(int[] inputArray, int leftBorder, int middle, int rightBorder) {

        int pointMax = inputArray[middle];
        int pointMin = inputArray[middle];

        for(int i = leftBorder; i < middle; i++) {

            if(inputArray[i] < pointMin) pointMin = inputArray[i];
        }
        for(int i = middle + 1; i <= rightBorder; i++) {

            if(inputArray[i] > pointMax) pointMax = inputArray[i];
        }

        return new PairMinMax(pointMin, pointMax);
    }
}
