package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
    	int[] rsl = new int[data.length*data.length];
        int index = 0;
        for (int[] row : data)
          for(int col: row)
            rsl[index++]=col;
      	return rsl;
    }
}
