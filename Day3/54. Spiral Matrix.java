class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return Print(matrix);
    }
    public static List<Integer> Print(int[][] arr) {
        List<Integer> list = new ArrayList<>();
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		int t = arr.length*arr[0].length;
		int c= 0;
		while(c<t) {
			for(int i =minc; i<=maxc&&c<t; i++) {
				list.add(arr[minr][i]);
				c++;
			}
			minr ++;
			for(int i = minr; i<=maxr&&c<t; i++) {
				list.add(arr[i][maxc]);
				c++;
			}
			maxc--;
			for(int i = maxc; i>=minc&&c<t; i--) {
				list.add(arr[maxr][i]);
				c++;
			}
			maxr --;
			for(int i = maxr; i>= minr&&c<t; i--) {
				list.add(arr[i][minc]);
				c++;
			}
			minc++;
		}
        return list;
		
	}

}
