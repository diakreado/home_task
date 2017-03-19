package ru.matlcev.sortingtask;

public class MaxSubArrayFinder {

    public static PairMinMax findMaxSubArray(int[] inputArray) throws Exception {

        int middle = (inputArray.length - 1)/2;

        PairMinMax maxPair = findMaxPair(inputArray,0, middle, inputArray.length - 1);

        if(maxPair.getDelta()  < 1) throw new NotIncreasingElements();

        return maxPair;
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

            return new PairMinMax(inputArray[leftBorder],leftBorder,inputArray[rightBorder],rightBorder);
        }

        return findMaxPair(inputArray, leftBorder, (rightBorder + leftBorder)/2, rightBorder);
    }

    private static PairMinMax findMaxInTheRightPart(int[] inputArray, int leftBorder, int rightBorder) {

        if(rightBorder - leftBorder < 2) {

            return new PairMinMax(inputArray[leftBorder],leftBorder,inputArray[rightBorder],rightBorder);
        }

        return findMaxPair(inputArray, leftBorder, (rightBorder + leftBorder)/2, rightBorder);
    }

    private static PairMinMax findMaxInTheCentralPart(int[] inputArray, int leftBorder, int middle, int rightBorder) {

        int pointMax = inputArray[middle];
        int indexMax = middle;

        int pointMin = inputArray[middle];
        int indexMin = middle;

        for(int i = leftBorder; i < middle; i++) {

            if(inputArray[i] < pointMin) {

                pointMin = inputArray[i];
                indexMin = i;
            }
        }
        for(int i = middle + 1; i <= rightBorder; i++) {

            if(inputArray[i] > pointMax) {

                pointMax = inputArray[i];
                indexMax = i;
            }
        }

        return new PairMinMax(pointMin,indexMin,pointMax,indexMax);
    }
}
