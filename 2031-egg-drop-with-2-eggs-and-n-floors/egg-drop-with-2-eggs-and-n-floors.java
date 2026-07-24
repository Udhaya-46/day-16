class Solution {
    public int twoEggDrop(int n) {
        int moves = 0;
        int floors = 0;

        while (floors < n) {
            moves++;
            floors = floors + moves;
        }

        return moves;
    }
}