import java.util.HashMap;
import java.util.Map;
 class Electoral_Office extends Candidate{
    private int collatorID;
    private String name;
 
    Electoral_Office(){ 
    	super();  }

    

	public Electoral_Office(int collatorID, String name ) {
       
        this.collatorID = collatorID;
        this.name = name;
        
    }
    public int getCollatorID() {
        return collatorID;
    }
    public void setCollatorID(int collatorID) {
        this.collatorID = collatorID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "Electoral_Office [collatorID=" + collatorID + ", name=" + name + "]";
    }

    //Hashmap to store all candidates
   public static HashMap<Candidate, Integer> voteCountHashMap= new HashMap<Candidate, Integer>();

        public static void main(String[] args) {
           
          //Initialize hashmap with candidates and set initial votes to 0
        voteCountHashMap.put(new Candidate("Nana Addo",1,"NPP"), 0);
        voteCountHashMap.put(new Candidate("John Mahama",2,"NDC"), 0);
        voteCountHashMap.put(new Candidate("Maame Akua Donkor",3,"GFP"), 0);
        voteCountHashMap.put(new Candidate("Ivor Greenstreet",4,"CPP"), 0);
        // counts for each candidate. 
        // number determines party, 1 for npp 2 for ndc ....
       /* int count1=Collections.frequency(voteCountHashMap(), 1);
        int count2=Collections.frequency(voteCountHashMap(), 2);
        int count3=Collections.frequency(voteCountHashMap(), 3);
        int count4=Collections.frequency(voteCountHashMap(), 4);*/
       Map<Integer,Integer> counts=new HashMap<Integer,Integer>();
        for(Integer c : voteCountHashMap.values()) {
        	int value = counts.get(c) == null ? 0 : counts.get(c);
            counts.put(c, value + 1);	
        }
        /*votes per party
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);*/
        
        

    }



		
}