import java.util.Comparator;




class KnapSackNodeComparator implements Comparator<Knapsacknode> {

	@Override
	public int compare(Knapsacknode o1, Knapsacknode o2) {
		double ch = o1.getValueweightRatio();
		double cht = o2.getValueweightRatio();
		if (o1.getValueweightRatio() > o2.getValueweightRatio()) {
    		return 1;
    	}
    	if (o1.getValueweightRatio() < o2.getValueweightRatio()) {
    		return -1;
    	}
    	return 0;
	}
	
}