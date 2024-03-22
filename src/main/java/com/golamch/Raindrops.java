package com.golamch;

public class Raindrops {

    public String plingPlangPlong(int n) {

        if (n == 0 || buildRaindropSounds(findRemainders(n)).equals("")) {
            return Integer.toString(n);
        } else {
            return buildRaindropSounds(findRemainders(n));
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

    /**
     * Returns a string depending on the list of remainders passed to the method. The resulting string will either be
     * empty, Pling, Plang, Plong, or a combination (preserving the listed order).
     * @param remaindersList this integer array is the result from checking the remainders when dividing an inetger by
     *                       3, 5 & 7.
     * @return a string which is either empty or a combination of Pling, Plang or Plong
     */
    private String buildRaindropSounds(int[] remaindersList) {
        String[] dropletSounds = {"Pling", "Plang", "Plong"};

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= remaindersList.length - 1; i++) {
            if (remaindersList[i] == 0) {
                stringBuilder.append(dropletSounds[i]);
            }
        }

        return stringBuilder.toString();
    }

}
