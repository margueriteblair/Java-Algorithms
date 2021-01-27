public class CavityMap {
    public static void main(String[] args) {
        String hello = "Hello world";
        System.out.println(hello[0]);
    }

    static String[] cavityMap(String[] grid) {
        for (int i = 1; i < grid.length-1; i++) {
            for (int j = 1; j < grid[i].length()-1; j++) {
                char toReplace = grid[i].charAt(j);
                int test = Character.getNumericValue(grid[i].charAt(j));
                int above = Character.getNumericValue(grid[i-1].charAt(j));
                int below = Character.getNumericValue(grid[i+1].charAt(j));
                int left = Character.getNumericValue(grid[i].charAt(j-1));
                int right = Character.getNumericValue(grid[i].charAt(j+1));
                if (test > above && test > below && test > left && test > right) {
                    grid[i] = grid[i].replace(toReplace, 'X');
                }
            }
        }
        return grid;
    }
}