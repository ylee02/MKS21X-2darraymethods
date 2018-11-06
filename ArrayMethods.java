public class ArrayMethods {
	public static int rowSum(int[][] ary, int x) {
		int ans = 0;
		if (x < ary.length) {
			for (int i = 0; i < ary[x].length; i++) {
				ans += ary[x][i];
			}
		}
		return ans;
	}
	public static int columnSum(int[][] ary, int x) {
		int ans = 0;
		for (int i = 0; i < ary.length; i++) {
			if (x < ary[i].length) {
				ans += ary[i][x];
			}
		}
		return ans;
	}
	