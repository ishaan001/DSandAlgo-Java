package Backtracking;

import java.util.Scanner;

public class RatMaze {
	 
	  
    // Size of the maze 
    static int N;
    static int M;
  
    /* A utility function to print  
    solution matrix sol[N][N] */
    void printSolution(int sol[][]) 
    { 
        for (int i = 0; i < M; i++) { 
            for (int j = 0; j < N; j++) 
                System.out.print( 
                    " " + sol[i][j] + " "); 
            System.out.println(); 
        } 
    } 
  
    /* A utility function to check  
        if x, y is valid index for N*N maze */
    boolean isSafe( 
        int maze[][], int x, int y) 
    { 
        // if (x, y outside maze) return false 
        return (x >= 0 && x < M && y >= 0
                && y < N && maze[x][y] == 1); 
    } 
  
    /* This function solves the Maze problem using  
    Backtracking. It mainly uses solveMazeUtil()  
    to solve the problem. It returns false if no  
    path is possible, otherwise return true and  
    prints the path in the form of 1s. Please note  
    that there may be more than one solutions, this  
    function prints one of the feasible solutions.*/
    boolean solveMaze(int maze[][]) 
    { 
        int sol[][] = new int[M][N]; 
  
        if (solveMazeUtil(maze, 0, 0, sol) == false) { 
            System.out.print("Solution doesn't exist"); 
            return false; 
        } 
  
        printSolution(sol); 
        return true; 
    } 
  
    /* A recursive utility function to solve Maze  
    problem */
    boolean solveMazeUtil(int maze[][], int x, int y, 
                          int sol[][]) 
    { 
        // if (x, y is goal) return true 
        if (x == M - 1 && y == N - 1
            && maze[x][y] == 1) { 
            sol[x][y] = 1; 
            return true; 
        } 
  
        // Check if maze[x][y] is valid 
        if (isSafe(maze, x, y) == true) { 
            // mark x, y as part of solution path 
            sol[x][y] = 1; 
  
           
            /* If moving in x direction doesn't give  
            solution then Move down in y direction */
            if (solveMazeUtil(maze, x, y + 1, sol)) 
                 return true; 
            
            /* Move forward in x direction */
            if (solveMazeUtil(maze, x + 1, y, sol)) 
                return true; 
  
  
            /* If none of the above movements works then  
            BACKTRACK: unmark x, y as part of solution  
            path */
            sol[x][y] = 0; 
            return false; 
        } 
  
        return false; 
    } 
  
    public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		 M = sc.nextInt();
		 N = sc.nextInt();
		int[][] maze = new int[M][N];
		for (int i = 0; i < 5; i++) {
			String s = sc.next();
			String[] sr = s.split("");
			for (int j = 0; j < sr.length; j++) {
				if (sr[j].equals("O")) {
					maze[i][j] = 1;
				} else {
					maze[i][j] = 0;
				}
			}

		}

	/*	int[][] visited = new int[maze.length][maze[0].length];
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[0].length; j++) {
				visited[i][j] = 0;
			}
		}*/

		RatMaze rat = new RatMaze();
		 
	     rat.solveMaze(maze);
	} 
} 


