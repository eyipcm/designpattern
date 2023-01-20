package com.aypc.factory2;

public class GetPlanFactory {
	
	//use getPlan method to get object of type Plan   
	public Plan getPlan(String planType){
		if(planType == null){
			return null;
		}
		if(PlanType.DOMESTICPLAN.toString().equals(planType)) {
			return new DomesticPlan();  
		}
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
			return new CommercialPlan();  
		}
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}

	public Plan getPlan(PlanType planType){
		if (PlanType.DOMESTICPLAN.equals(planType)){
			return new DomesticPlan();
		} else if(PlanType.COMMERCIALPLAN.equals(planType)){
			return new CommercialPlan();
		} else if(PlanType.INSTITUTIONALPLAN.equals(planType)) {
			return new InstitutionalPlan();
		}
		return null;
	}

}
