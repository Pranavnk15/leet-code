
//  Word Search



// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.



class wordSearch {
    public boolean exist(char[][] board, String word) {
        boolean exits = false;
        int visited[][] = new int[board.length][board[0].length];

        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[0].length; j++) {
                visited[i][j] = -1;
                boolean ret = discover(i, j, 0, word, visited, board);
                if(ret) {
                    exits = true;
                    break;
                }
                visited[i][j] = 0;
            }
            if(exits) {
                break;
            }
        }
        return exits;
    }

    public static boolean discover(int i, int j, int charLoc, String word, int[][] visited, char[][] board) {
        if(board[i][j] != word.charAt(charLoc)) {
            return false;
        } else {
            if(charLoc == word.length()-1) {
                return true;
            }
            //right
            if(j+1 < board[0].length && visited[i][j+1] == 0) {
                visited[i][j+1] = -1;
                boolean ret = discover(i, j+1, charLoc+1, word, visited, board);
                if(ret) {
                    return ret;
                }
                visited[i][j+1] = 0;
            }
            //down
            if(i+1 < board.length && visited[i+1][j] == 0) {
                visited[i+1][j] = -1;
                boolean ret = discover(i+1, j, charLoc+1, word, visited, board);
                if(ret) {
                    return ret;
                }
                visited[i+1][j] = 0;
            }
            //left
            if(j-1 >= 0 && visited[i][j-1] == 0) {
                visited[i][j-1] = -1;
                boolean ret = discover(i, j-1, charLoc+1, word, visited, board);
                if(ret) {
                    return ret;
                }
                visited[i][j-1] = 0;
            }
            //up
            if(i-1 >= 0 && visited[i-1][j] == 0) {
                visited[i-1][j] = -1;
                boolean ret = discover(i-1, j, charLoc+1, word, visited, board);
                if(ret) {
                    return ret;
                }
                visited[i-1][j] = 0;
            }
        }
        return false;
    }
}