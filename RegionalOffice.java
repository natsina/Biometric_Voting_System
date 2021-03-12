import java.util.HashMap;

public class RegionalOffice extends DistrictElectoralOffice{
	private int RegionalID;
	private String regionName;
	
	public RegionalOffice() {}

	public int getRegionalID() {
		return RegionalID;
	}

	public void setRegionalID(int regionalID) {
		RegionalID = regionalID;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return "RegionalOffice [RegionalID=" + RegionalID + ", regionName=" + regionName + "]";
	}
	
	public static HashMap<String, Integer> regional = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getreg(){
		return regional;
	}
	
	public static HashMap<String, Integer> regional1 = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getreg1(){
		return regional1;
	}
	
	public static HashMap<String, Integer> regional2 = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getreg2(){
		return regional2;
	}
	
	
	private static int reg_party1;
	private static int nat_party2;
	private static int nat_party3;
	private static int nat_party4;
	
	public static void collateReg() {
		DistrictElectoralOffice regresults = new DistrictElectoralOffice();
		DistrictElectoralOffice.tallyDist();
		
		try {
		reg_party1 = regresults.getdist().get("NPP") + regresults.getdist1().get("NPP") + regresults.getdist2().get("NPP");
		nat_party2 = regresults.getdist().get("NDC") + regresults.getdist1().get("NDC") + regresults.getdist2().get("NDC");
		nat_party3 = regresults.getdist().get("GUM") + regresults.getdist1().get("GUM") + regresults.getdist2().get("GUM");
		nat_party4 = regresults.getdist().get("PPP") + regresults.getdist1().get("PPP") + regresults.getdist2().get("PPP");
		
		regional.put("NPP", reg_party1);
		regional.put("NDC", nat_party2);
		regional.put("GUM", nat_party3);
		regional.put("PPP", nat_party4);
		
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public static void tallyReg() {
		RegionalOffice.collateReg();
		RegionalOffice results = new RegionalOffice();
		results.insertReg();
	}
	
	private void insertReg() {
		regional1.put("NPP", 2453);
		regional1.put("NDC", 2967);
		regional1.put("GUM", 3167);
		regional1.put("PPP", 3210);
		
		regional2.put("NPP", 5890);
		regional2.put("NDC", 4827);
		regional2.put("GUM", 3207);
		regional2.put("PPP", 3216);
		
	}

	public static void main(String[] args) {
		RegionalOffice.tallyReg();

		System.out.println("NPP -> " + regional.get("NPP"));
		System.out.println("NDC -> " + regional.get("NDC"));
		System.out.println("GUM -> " + regional.get("GUM"));
		System.out.println("PPP -> " + regional.get("PPP"));
	}
	
	
}
