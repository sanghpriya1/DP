import java.util.PriorityQueue;



public class ZeroOneknapSack {
  public static void main(String[] args) {
	int[] A = {14, 13, 7, 5, 5, 7, 13, 16, 17, 1};
	int[] B = {10, 20, 9, 4, 15, 4, 4, 1, 15, 2}; 
	int C = 80;
	PriorityQueue<Knapsacknode> pq = new PriorityQueue<>(3, new KnapSackNodeComparator());
	for(int i = 0; i <A.length; i++) {
		double ratio = (double)B[i]/A[i];
		
		
		pq.add(new Knapsacknode(ratio, A[i], B[i]));
		
	}
	int ans = 0;
	while(!pq.isEmpty()) {
		Knapsacknode node = pq.poll();
		double h = node.getValueweightRatio();
		
		int x = node.getValue();
		
		int y = node.getWeight();
		while(y <= C) {
			C -= y;
			ans += x;
		}
		if(C == 0) break;
		
	}
	System.out.println(ans);
}

}
