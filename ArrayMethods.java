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
	public static int[] allRowSums(int[][] ary) {
		int[] ans = new int [ary.length];
		for (int i = 0; i < ary.length; i++) {
			ans[i] = rowSum(ary, i);
		}
		return ans;
	}
	public static int[] allColSums(int[][] ary) {
		int longest = 0;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i].length >= ary[longest].length) {
				longest = i;
			}
		}
		int[] ans = new int[ary[longest].length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = columnSum(ary, i);
		}
		return ans;
	}
	public static boolean isRowMagic(int[][] ary) {
		if (ary.length == 0) {
			return true;
		}
		int[] ans = allRowSums(ary);
		for (int i = 1; i < ans.length; i++) {
			if (ans[i - 1] != ans[i]) {
				return false;
			}
		}
		return true;
	}
	public static boolean isColumnMagic(int[][] ary) {
		if (ary.length == 0) {
			return true;
		}
		int[] ans = allColSums(ary);
		for (int i = 1; i < ans.length; i++) {
			if (ans[i - 1] != ans[i]) {
				return false;
			}
		}
		return true;
	}
}

	
		
	