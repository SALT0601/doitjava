package inheritance;

public class VIPCustomer extends Customer{
	private int agentId;
	private double saleRatio;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) »£√‚");
	}
	
	public int getAgentId() {
		return agentId;
	}

}
