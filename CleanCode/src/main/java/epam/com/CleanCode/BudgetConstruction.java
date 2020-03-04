package epam.com.CleanCode;


public class BudgetConstruction {
double calculatesConstructionCost(double area,int standard, int fullyAutomated){
		
		double costPerSqFt;
		
		int pricePerSqFt;
		
		if( standard == 1){
			
			pricePerSqFt = 1200;
			
		} else if(standard == 2){
			
			pricePerSqFt = 1500;
			
		}else{
			
			if(fullyAutomated == 0){
				
				pricePerSqFt = 1800;
				
			}else{
				
				pricePerSqFt = 2500;
				
			}
			
		}
		
		costPerSqFt = area*pricePerSqFt;
		
		return costPerSqFt;
	}

}
