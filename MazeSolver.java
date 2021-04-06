/*************************************************************************
 *  Finds the way out of a given maze using recursion

 *************************************************************************/


import gdp.stdlib.StdDraw;

public class MazeSolver {
   
    public static boolean solve(int[][]maze, int row, int col) {            
        
        if (col != 0) {
            if (maze[row][col - 1] == 3) {
                    maze[row][col - 1] = 2;
                    return true;  
            }
            if (maze[row][col - 1] != 0) {
                if (maze[row][col - 1] == 1) {
                    maze[row][col - 1] = 2;
                    if (solve(maze, row, col - 1)) return true;
                } 
            }
        }

        if (row != maze.length - 1) {
            if (maze[row + 1][col] == 3) {
                maze[row + 1][col] = 2;
                    return true;
            }
            if (maze[row + 1 ][col] != 0) {
                if (maze[row + 1][col] == 1) {
                    maze[row + 1][col] = 2;
                    if (solve(maze, row + 1, col)) return true;
                }
            }
        }
        maze[row][col] = 4;
            
        return false; 
    }

    public static void printBoard(int[][] maze) {
        System.out.println("Next maze: ");
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze.length; col++) {
                System.out.print(maze[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void draw(int[][] maze) {

        //Draw coordinate system
        int sizeColumns = maze.length;
        int sizeRows = maze.length;

        StdDraw.setXscale(0, sizeColumns);
        StdDraw.setYscale(0, sizeRows);
        
        StdDraw.setPenColor(StdDraw.BLACK);

        for (int row = 0; row < sizeColumns ; row++) {
            for (int col = 0; col < sizeRows; col++){
                StdDraw.line(0.0 , 0.0, row, 0.0);
                StdDraw.line(0.0, 0.0, col, 0.0);
                StdDraw.line(0.0, col, row, col);
                StdDraw.line(row, 0.0, row, col);
            }
        }
        
        //Draw squares          
            for (int row = 0; row < maze.length; row++){
                for (int col = maze.length - 1; col >= 0; col--) {
                    if (maze[row][col] == 0) {
                        StdDraw.setPenColor(StdDraw.GRAY);
                        StdDraw.filledSquare(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.square(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                    }
                    
                    if (maze[row][col] == 1) {
                        StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.filledSquare(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.square(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                    }
                    if (maze[row][col] == 2) {
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.filledSquare(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.square(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                        //StdDraw.show(200); 
                    }
                    if (maze[row][col] == 3) {
                        StdDraw.setPenColor(StdDraw.BLUE);
                        StdDraw.filledSquare(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.square(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                    }
                    if (maze[row][col] == 4) {
                        StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.filledSquare(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                        StdDraw.setPenColor(StdDraw.BLACK);
                        StdDraw.square(col + 0.5, maze.length - 1 - row + 0.5, 0.5);
                    }
                
            }
        }  
         

	}
     

}

