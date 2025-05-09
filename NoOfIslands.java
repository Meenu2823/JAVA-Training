public class NoOfIslands {

	public static void dulr(int i, int j, char[][] grid, int m, int n) {
		if (i >= m || i < 0 || j >= n || j < 0 || grid[i][j] == '0')
			return;

		grid[i][j] = '0';
		dulr(i + 1, j, grid, m, n);
		dulr(i - 1, j, grid, m, n);
		dulr(i, j - 1, grid, m, n);
		dulr(i, j + 1, grid, m, n);
        dulr(i+1, j + 1, grid, m, n);//for diagonals
        dulr(i-1, j - 1, grid, m, n);//for diagonals
	}

	public static void main(String[] args) {
		char[][] grid ={{ '1', '1', '1', '1', '0' },
						{ '1', '1', '0', '1', '0' },
						{ '1', '1', '0', '0', '1' },
						{ '0', '0', '0', '1', '0' } };
		int m = grid.length;
		int n = grid[0].length;
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					dulr(i, j, grid, m, n);
					count++;
				}
			}
		}
		System.out.println("islands " + count);
	}
}
