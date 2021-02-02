package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        if (dx == dy) {
            rsl = Math.max(dx, dy);
        }
        return rsl;
    }
}