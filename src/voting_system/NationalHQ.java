
package voting_system;

/**
 *
 * @author nGroup 9
 */
public class NationalHQ extends RegionalOffice {
	private String Nation;
	
	
	public NationalHQ() {}// default constructor
	/**
	 * Acessor Method: getNation()
	 * @param Nation
	 */
	public String getNation() { //accessor method
		return Nation;
	}
	/**
	 * Mutator Method: setNation()
	 * @param Nation
	 */

	public void setNation(String nation) { 
		Nation = nation;
	}

	@Override
	//To String method
	public String toString() {
		return "NationalHQ [Nation=" + Nation + "]";
	}
	/**
	 * @param args nat_party1,nat_party2,nat_party3,nat_party4
	 */
	private static int nat_party1;
	private static int nat_party2;
	private static int nat_party3;
	private static int nat_party4;
	
	//Collate method
	public static void collateNational() {
		RegionalOffice natresults = new RegionalOffice();
		RegionalOffice.tallyReg();
		
		try {
		nat_party1 = natresults.getreg().get("NPP") + natresults.getreg1().get("NPP") + natresults.getreg2().get("NPP");
		nat_party2 = natresults.getreg().get("NDC") + natresults.getreg1().get("NDC") + natresults.getreg2().get("NDC");
		nat_party3 = natresults.getreg().get("GUM") + natresults.getreg1().get("GUM") + natresults.getreg2().get("GUM");
		nat_party4 = natresults.getreg().get("PPP") + natresults.getreg1().get("PPP") + natresults.getreg2().get("PPP");
		
		regional.put("NPP", nat_party1);
		regional.put("NDC", nat_party2);
		regional.put("GUM", nat_party3);
		regional.put("PPP", nat_party4);
		
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	}
		//method to get the national tally
		public static void tallyNat() {
			NationalHQ.collateNational();
		}
		
		public static void main(String[] args) {
			NationalHQ.tallyNat();
			//results: totdal votes each party recieved in the various regions
			System.out.println("NPP -> " + regional.get("NPP"));
			System.out.println("NDC -> " + regional.get("NDC"));
			System.out.println("GUM -> " + regional.get("GUM"));
			System.out.println("PPP -> " + regional.get("PPP"));
		}
	}