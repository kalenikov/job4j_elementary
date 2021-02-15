package ru.job4j.array;

import java.util.Arrays;
import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        int[][] array = new int[places.length][places.length];
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places.length; j++) {
                array[i][j] = places[i][j] == null ? 0 : 1;
                try {
                    if (places[i][j] == null && places[i + 1][j] == null && places[i][j + 1] == null) {
                        return new Place(i, j);
                    }
                } catch (Exception exception) {
                }
            }
        }
        System.out.println(Arrays.deepToString(array).replace("],", "],\n"));
        return null;
    }

    public static class Place {
        private int row;
        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }

        @Override
        public String toString() {
            return "" + this.row + " " + this.cell;
        }
    }
}