package com.aypc.creational.factory2;

public class GetPlanFactory {
	
	//use getPlan method to get object of type Plan
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

	public String getEntirePlanType(){
		StringBuilder result = new StringBuilder();
		for (PlanType plan : PlanType.values()) {
			if (result.length() > 0){
				result.append(",").append(plan);
			} else {
				result.append(plan);
			}
		}
		return result.toString();
	}

}
