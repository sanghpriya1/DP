
public class Knapsacknode {
	public double getValueweightRatio() {
		return valueweightRatio;
	}

	public void setValueweightRatio(double valueweightRatio) {
		this.valueweightRatio = valueweightRatio;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	private double valueweightRatio;
	private int value;
	private int weight;

	public Knapsacknode(double valueweightRatio, int value, int weight) {

		this.valueweightRatio = valueweightRatio;
		this.value = value;
		this.weight = weight;

	}

	@Override
	public String toString() {
		return "Knasacknode [valueweightRatio=" + valueweightRatio + ", value=" + value + ", weight=" + weight + "]";
	}

	public Knapsacknode() {

	}

}
