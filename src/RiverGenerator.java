import java.util.ArrayList;

/**
 * This Class generates permutations of the river after a storm
 * @author ejwilliams
 */
public class RiverGenerator {
	public static final int HORIZONTAL = 0;
	public static final int VERTICAL = 1;
	
	//The rate of failure
	private double failRate;
	//The value of N, for which there are N by N+1 islands
	private int nValue;
	//The ArrayList of Horizontal and Vertical Bridges
	private boolean[][] horizontalBridge;
	private boolean[][] verticalBridge;

	/**
	 * Constructor for RiverGenerator
	 * @param failRate
	 * @param nValue
	 */
	public RiverGenerator(double failRate, int nValue) {
		this.failRate = failRate;
		this.nValue = nValue;

		horizontalBridge = new boolean[nValue][nValue];
		verticalBridge = new boolean[nValue+1][nValue+1];

	}
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RiverGenerator rGen = new RiverGenerator(0.5, 3);
		rGen.generateBridges();
		
		
		
//		boolean[][] horiz = rGen.getHorizontalBridge();
//		for (int i=0; i<horiz.length; i++) {
//			for (int j=0; j<horiz[i].length; j++) {
//				System.out.print(horiz[i][j] + " ");
//			}
//			System.out.println();
//		}
//		boolean[][] vert = rGen.getVerticalBridge();
//		for (int i=0; i<vert.length; i++) {
//			for (int j=0; j<vert[i].length; j++) {
//				System.out.print(vert[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	/*
	 * Generates a random bridge state based upon the failRate and nValue
	 */
	private void generateBridges() {
		//Generates the horizontalBridge matrix
		for(int i=0; i<nValue; i++) {
			for(int j=0; j<nValue; j++) {
				double rand = Math.random();
				if (rand < failRate) {
					horizontalBridge[i][j] = false;
				} else {
					horizontalBridge[i][j] = true;
				}
			}
		}
		//Generates the verticalBridge matrix
		for(int i=0; i<=nValue; i++) {
			for(int j=0; j<=nValue; j++) {
				double rand = Math.random();
				if (rand < failRate) {
					verticalBridge[i][j] = false;
				} else {
					verticalBridge[i][j] = true;
				}
			}
		}
	}
	//BOILERPLATE CODE
	
	/**
	 * @return the failRate
	 */
	public double getFailRate() {
		return failRate;
	}
	/**
	 * @param failRate the failRate to set
	 */
	public void setFailRate(double failRate) {
		this.failRate = failRate;
	}
	/**
	 * @return the nValue
	 */
	public int getnValue() {
		return nValue;
	}
	/**
	 * @param nValue the nValue to set
	 */
	public void setnValue(int nValue) {
		this.nValue = nValue;
	}
	/**
	 * @return the horizontalBridge
	 */
	public boolean[][] getHorizontalBridge() {
		return horizontalBridge;
	}
	/**
	 * @param horizontalBridge the horizontalBridge to set
	 */
	public void setHorizontalBridge(boolean[][] horizontalBridge) {
		this.horizontalBridge = horizontalBridge;
	}
	/**
	 * @return the verticalBridge
	 */
	public boolean[][] getVerticalBridge() {
		return verticalBridge;
	}
	/**
	 * @param verticalBridge the verticalBridge to set
	 */
	public void setVerticalBridge(boolean[][] verticalBridge) {
		this.verticalBridge = verticalBridge;
	}
	
	
}
