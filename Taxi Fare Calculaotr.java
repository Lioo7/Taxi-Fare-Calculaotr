public class Main
{
    
    public static int getPrice(int numOfPassengers, int stops , double travelTime, int time) { // travelTime in minutes, time in am:pm
        int price;
        double rate;
        double extraPassengerCost = 0;
        final double taximeter = 10.68;
        final double call = 4.93;
        final double stopPrice = 0; // ?
        final double extraPassengerPrice = 4.58;
        
        if(numOfPassengers > 2) {
            extraPassengerCost = (numOfPassengers - 2) * extraPassengerPrice;
        }
        
        if(time >= 6 && time < 21){
            rate = 1.67;
        }
                
        else if(time >= 21 && time < 23){
            rate = 2;
        }
                
        else{
            rate = 2.34;
        }

        
        price = (int)(call + taximeter + extraPassengerCost + (stops * stopPrice) + (rate * travelTime));
        return price;
        
    }
    
	public static void main(String[] args) {
	    System.out.println("*Depart*");
	    int price0 = getPrice(4, 0, 38, 18);
		System.out.println("The estimated fare in the best scenario is: " + price0);
	    
	    int price1 = getPrice(4, 0, 50, 18);
		System.out.println("The estimated fare in the average scenario is: " + price1);
		
		int price2 = getPrice(4, 0, 75, 18);
		System.out.println("The estimated fare in the worse scenario is: " + price2);
		
	    System.out.println("\n*Return*");
		int price3 = getPrice(4, 0, 30, 2);
		System.out.println("The estimated fare in the worse scenario is: " + price3);
		
		int price4 = getPrice(4, 0, 36, 2);
		System.out.println("The estimated fare in the worse scenario is: " + price4);
		
		int price5 = getPrice(4, 0, 45, 2);
		System.out.println("The estimated fare in the worse scenario is: " + price5);
	}
}
