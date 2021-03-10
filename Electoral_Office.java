import java.util.Collections;
import java.util.HashMap;
public class Electoral_Office extends Candidate{
    private int collatorID;
    private String name;
 

    public Electoral_Office(int collatorID, String name ) {
        super(Candidate);
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
        return "Electoral_Office [collatorID=" + collatorID + ", name=" + name + ", tally=" + tally + "]";
    }
    public int collate(){

        return collate;
    }
   
        HashMap<Candidate, integer> voteCountHashMap=new HashMap<>();
        public static void main(String[] args) {
          //Initialize hashmap with candidates and set initial votes to 0
        voteCountsHashMap.put(new Candidate("Nana Addo",1,"NPP"), 0);
        voteCountsHashMap.put(new Candidate("John Mahama",2,"NDC"), 0);
        voteCountsHashMap.put(new Candidate("Maame Akua Donkor,"3,"GFP"), 0);
        voteCountsHashMap.put(new Candidate("Ivor Greenstreet",4,"CPP"), 0);
        // counts for each candidate. 
        // number determines party, 1 for npp 2 for ndc ....
        int count1=Collections.frequency(voteCountsHashMap, 1);
        int count2=Collections.frequency(voteCountsHashMap, 2);
        int count3=Collections.frequency(voteCountsHashMap, 3);
        int count4=Collections.frequency(voteCountsHashMap, 4);
        //votes per party
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        
        

    }
}