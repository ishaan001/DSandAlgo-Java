package Backtracking;

public class BlockedMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = {{0,1,0,0}, 
						{0,0,0,0},
						{0,1,0,0},
						{0,0,1,0}};
		ismazeBlocked(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);

	}

	public static void ismazeBlocked(int[][] maze, int rows, int col, String ans, boolean[][] visited) {
		
		// BAse cases
		// if we reached the destination from the source,
		if (rows == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}
		
		//all the -ve base cases
		if(rows == -1 || rows == maze.length || col == -1|| col==maze[0].length || maze[rows][col] == 1 || 
				visited[rows][col]) {
			return;
		}
		
		// this is to mark the path from which we came from so that we don't go back to same path and explore
		//same options
		visited[rows][col] = true;
		// Top
		ismazeBlocked(maze, rows - 1, col, ans + "T", visited);
		// Down
		ismazeBlocked(maze, rows + 1, col, ans + "D", visited);
		// Left
		ismazeBlocked(maze, rows, col - 1, ans + "L", visited);
		// Right
		ismazeBlocked(maze, rows, col + 1, ans + "R", visited);
		
		// once everything is done we need to explore other options also 
		visited[rows][col] = false;
	}
}
