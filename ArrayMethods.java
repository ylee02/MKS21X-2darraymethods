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