package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String [] tempArray = new String [array.length];
        int newArrLength = 0;
        for (int i = 0; i < this.array.length; i++) {
            int count = 0;
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                //need to create new array to store values that do not meet this condition
                tempArray[newArrLength] = this.array[i];
                newArrLength++;
            }
        }
        String [] resultArray = Arrays.copyOf(tempArray, newArrLength);

        return resultArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String [] tempArray = new String [array.length];
        int newArrLength = 0;
        for (int i = 0; i < this.array.length; i++) {
            int count = 0;
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i].equals(this.array[j])) {
                    count++;
                }
            }
            if (count != exactNumberOfDuplications) {
                //need to create new array to store values that do not meet this condition
                tempArray[newArrLength] = this.array[i];
                newArrLength++;
            }
        }
        String [] resultArray = Arrays.copyOf(tempArray, newArrLength);

        return resultArray;
    }
}
