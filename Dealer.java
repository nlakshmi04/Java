package carDealership;

public class Dealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean finance;
		double loanamt;
		
		vehicle v1 = new vehicle();
		
		v1.setcarType("Suv");
		v1.setModel("Ford car");
		v1.setYear(1987);
		v1.setPrice(1200000);
		
		Employee emp1 = new Employee();
		
		emp1.setName("cathy");
	
		customer c1 = new customer();
		
		c1.setName("Aarthi");
		c1.setAddress("Chennai");
		c1.setcashonhand(2000000);
		
		loanamt = v1.getPrice() - c1.getcashonhand();
		
		if (loanamt > 0) {
			finance = true;
		} 
		else {
			finance = false;
		}
		
		if (finance) {
			System.out.println(c1.getName()+ " purchased "+ v1.getModel()+ " thru dealer " + emp1.getName()+ " for Rs. "+v1.getPrice()+" thru finance option.");
		}
		else {			
			System.out.println(c1.getName()+ " purchased "+ v1.getModel()+ " thru dealer " + emp1.getName()+ " for Rs. "+v1.getPrice()+" with cash on hand.");
		}
		
	}		

}
