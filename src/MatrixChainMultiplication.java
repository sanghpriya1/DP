
import java.util.ArrayList;
import java.util.Arrays;


public class MatrixChainMultiplication {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(40);
		A.add(20);
		A.add(30);
		A.add(10);
		A.add(30);
		
		int[] arr = new int[A.size()];
        for(int i = 0; i < A.size(); i++){
            arr[i] = A.get(i);
        }
        //runMatrixChainMultiplication(arr);
        System.out.println(matrixChainOrder(arr));
    }
 
//    private static void runMatrixChainMultiplication(int[] dims) {
//        System.out.printf("Array Dimension  = %s%n", Arrays.toString(dims));
//        System.out.printf("Cost             = %d%n", matrixChainOrder(dims));
//        System.out.printf("Optimal Multiply = %s%n%n", getOptimalParenthesizations());
//    }
 
    private static int[][]cost;
    private static int[][]order;
 
    public static int matrixChainOrder(int[] dims) {
        int n = dims.length - 1;
        cost = new int[n][n];
        order = new int[n][n];
 
        for (int lenMinusOne = 1 ; lenMinusOne < n ; lenMinusOne++) {
            for (int i = 0; i < n - lenMinusOne; i++) {
                int j = i + lenMinusOne;
                cost[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int currentCost = cost[i][k] + cost[k+1][j] + dims[i]*dims[k+1]*dims[j+1];
                    if (currentCost < cost[i][j]) {
                        cost[i][j] = currentCost;
                        order[i][j] = k;
                    }
                }
            }
        }
        return cost[0][n-1];
    }
 
    private static String getOptimalParenthesizations() {
        return getOptimalParenthesizations(order, 0, order.length - 1);
    }
 
    private static String getOptimalParenthesizations(int[][]s, int i, int j) {
        if (i == j) {
            return String.format("%c", i+65);
        }
        else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(getOptimalParenthesizations(s, i, s[i][j]));
            sb.append(" * ");
            sb.append(getOptimalParenthesizations(s, s[i][j] + 1, j));
            sb.append(")");
            return sb.toString();
        }
    }

}
