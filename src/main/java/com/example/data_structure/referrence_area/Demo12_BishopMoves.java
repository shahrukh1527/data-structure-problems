package com.example.data_structure.referrence_area;

public class Demo12_BishopMoves {
    // Helper: Checks if two squares are the same color
    private static boolean sameColor(int r1, int c1, int r2, int c2) {
        return (r1 + c1) % 2 == (r2 + c2) % 2;
    }

    // Helper: Checks if two positions are on the same diagonal
    private static boolean onSameDiagonal(int r1, int c1, int r2, int c2) {
        return Math.abs(r1 - r2) == Math.abs(c1 - c2);
    }

    /**
     * Returns an array: [isReachable ("YES"/"NO"), minMoves (integer)]
     */
    public static Object[] bishopMinMoves(int r1, int c1, int r2, int c2) {
        // Same location
        if (r1 == r2 && c1 == c2) {
            return new Object[]{"YES", 0};
        }
        // Different colored squares — unreachable
        if (!sameColor(r1, c1, r2, c2)) {
            return new Object[]{"NO", -1};
        }
        // Same diagonal — one move
        if (onSameDiagonal(r1, c1, r2, c2)) {
            return new Object[]{"YES", 1};
        }
        // Otherwise — same color but not diagonal — two moves
        return new Object[]{"YES", 2};
    }

    public static void main(String[] args) {
        // Sample usages
        int[][] tests = {
                {4, 4, 6, 6},  // reachable in 1 move
                {4, 4, 5, 6},  // reachable in 2 moves
                {4, 4, 5, 5},  // same square color, diagonal?
                {4, 4, 5, 7}   // different color — not reachable
        };

        for (int[] t : tests) {
            Object[] res = bishopMinMoves(t[0], t[1], t[2], t[3]);
            System.out.printf("From (%d, %d) to (%d, %d): %s, moves = %d%n",
                    t[0], t[1], t[2], t[3], res[0], res[1]);
        }
    }
}