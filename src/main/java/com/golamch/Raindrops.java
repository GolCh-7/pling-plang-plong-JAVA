package com.golamch;

public class Raindrops {

    public String plingPlangPlong(int n) {

        int[] remainders = findRemainders(n);

        String[] dropletSounds = {"Pling", "Plang", "Plong"};

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= remainders.length - 1; i++) {
            if (remainders[i] == 0) {
                stringBuilder.append(dropletSounds[i]);
            }
        }

        // Handling special case of zero
        if (n == 0 || stringBuilder.toString().equals("")) {
            return Integer.toString(n);
        } else {
            return stringBuilder.toString();
        }
    }

    /**
     * Returns a list of the remainders when a given integer is divided by 3, 5 & 7.
     * @param n any integer
     * @return an array of the remainders from diving by 3, 5 & 7 respectively
     */
    private int[] findRemainders(int n) {
        int modThree = n % 3, modFive = n % 5, modSeven = n % 7;

        return new int[]{modThree, modFive, modSeven};
    }

}
