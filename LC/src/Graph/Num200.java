package Graph;

public class Num200 {
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		int m = grid.length;
		int n = grid[0].length;
		UnionFind uf = new UnionFind(m * n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '0') continue;
				uf.count++;
				
				int id = i * n + j; // convert two dimensional coordinates to one dimensional
				if (j > 0 && grid[i][j - 1] == '1') // left
					uf.union(id, id - 1);
				if (i > 0 && grid[i - 1][j] == '1') // up
					uf.union(id, id - n);
			}
		}
		return uf.count;
	}
	
	public static void main(String[] args) {
		
	}
}
