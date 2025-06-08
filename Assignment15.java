package Training;

import java.util.*;



//  1st Program

//public class Assignment15 {
//
//    public static void main(String[] args) {
//        int n = 4; // You can change this value from 1 to 9
//        List<List<String>> solutions = solveNQueens(n);
//
//        for (List<String> solution : solutions) {
//            for (String row : solution) {
//                System.out.println(row);
//            }
//            System.out.println();
//        }
//    }
//
//    public static List<List<String>> solveNQueens(int n) {
//        List<List<String>> result = new ArrayList<>();
//        char[][] board = new char[n][n];
//
//        for (char[] row : board) {
//            Arrays.fill(row, '.');
//        }
//
//        backtrack(0, board, result, n);
//        return result;
//    }
//
//    private static void backtrack(int row, char[][] board, List<List<String>> result, int n) {
//        if (row == n) {
//            result.add(constructBoard(board));
//            return;
//        }
//
//        for (int col = 0; col < n; col++) {
//            if (isSafe(row, col, board, n)) {
//                board[row][col] = 'Q';
//                backtrack(row + 1, board, result, n);
//                board[row][col] = '.';
//            }
//        }
//    }
//
//    private static boolean isSafe(int row, int col, char[][] board, int n) {
//        for (int i = 0; i < row; i++) {
//            if (board[i][col] == 'Q') return false;
//        }
//
//        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//            if (board[i][j] == 'Q') return false;
//        }
//
//        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
//            if (board[i][j] == 'Q') return false;
//        }
//
//        return true;
//    }
//
//    private static List<String> constructBoard(char[][] board) {
//        List<String> result = new ArrayList<>();
//        for (char[] row : board) {
//            result.add(new String(row));
//        }
//        return result;
//    }
//}











//  2nd Program

//public class Assignment15{
//
//    public static void main(String[] args) {
//        int n = 4;
//        int[][] maze = {
//                {1, 0, 0, 0},
//                {1, 1, 0, 1},
//                {0, 1, 0, 0},
//                {1, 1, 1, 1}
//        };
//
//        List<String> paths = findPaths(maze, n);
//
//        if (paths.isEmpty()) {
//            System.out.println("No path found.");
//        } else {
//            for (String path : paths) {
//                System.out.println(path);
//            }
//        }
//    }
//
//    public static List<String> findPaths(int[][] maze, int n) {
//        List<String> result = new ArrayList<>();
//
//        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
//            return result;
//
//        boolean[][] visited = new boolean[n][n];
//        dfs(maze, 0, 0, "", visited, result, n);
//
//        return result;
//    }
//
//    private static void dfs(int[][] maze, int x, int y, String path,
//                            boolean[][] visited, List<String> result, int n) {
//
//        if (x == n - 1 && y == n - 1) {
//            result.add(path);
//            return;
//        }
//
//        visited[x][y] = true;
//
//        // Directions: Down, Left, Right, Up
//        int[] dx = {1, 0, 0, -1};
//        int[] dy = {0, -1, 1, 0};
//        char[] dir = {'D', 'L', 'R', 'U'};
//
//        for (int i = 0; i < 4; i++) {
//            int newX = x + dx[i];
//            int newY = y + dy[i];
//
//            if (isSafe(newX, newY, maze, visited, n)) {
//                dfs(maze, newX, newY, path + dir[i], visited, result, n);
//            }
//        }
//
//        visited[x][y] = false;
//    }
//
//    private static boolean isSafe(int x, int y, int[][] maze, boolean[][] visited, int n) {
//        return (x >= 0 && y >= 0 && x < n && y < n &&
//                maze[x][y] == 1 && !visited[x][y]);
//    }
//}









//  3rd Program
public class Assignment15 {

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);

        for (String s : combinations) {
            System.out.println(s);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return result;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(0, digits, new StringBuilder(), result, map);

        return result;
    }

    private static void backtrack(int index, String digits, StringBuilder current,
                                  List<String> result, Map<Character, String> map) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(index + 1, digits, current, result, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
}