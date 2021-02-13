package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
      	int[] rsl = new int[data.length];
    	for(int x = 0; x < data.length; x++)
          for(int y = 0; y < data.length; y++)
            if (x == data.length - y - 1) rsl[x]=data[x][y];
      return rsl;
    }
}
