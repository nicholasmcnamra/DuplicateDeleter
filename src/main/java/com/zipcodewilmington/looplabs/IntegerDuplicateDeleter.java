package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] tempArray = new Integer[array.length];
        int newArrLength = 0;
        for (int i = 0; i < this.array.length; i++) {
            int count = 0;
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i] == this.array[j]) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                //need to create new array to store values that do not meet this condition
                tempArray[newArrLength] = this.array[i];
                newArrLength++;
            }
        }
        Integer[] resultArray = Arrays.copyOf(tempArray, newArrLength);

        return resultArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] tempArray = new Integer[array.length];
        int newArrLength = 0;
            for (int i = 0; i < this.array.length; i++) {
                int count = 0;
                for (int j = 0; j < this.array.length; j++) {
                    if (this.array[i] == this.array[j]) {
                        count++;
                    }
                }
                if (count != exactNumberOfDuplications) {
                    //need to create new array to store values that do not meet this condition
                    tempArray[newArrLength] = this.array[i];
                    newArrLength++;
                }
            }
        Integer[] resultArray = Arrays.copyOf(tempArray, newArrLength);

        return resultArray;
    }
}
