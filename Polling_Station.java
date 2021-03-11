import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Polling_Station extends Vote{
    private int Stat_ID;
    private String districtname;
    private String regionname;

    Polling_Station(){
    	super();
    }
   
    Polling_Station( int Stat_ID, String districtname, String regionname){
      
        this.Stat_ID=Stat_ID;
        this.districtname=districtname;
        this.regionname=regionname;       
    }

    public int getStat_ID() {
        return Stat_ID;
    }


    public void setStaID(int staID) {
        Stat_ID = staID;
    }


    public String getDistrictname() {
        return districtname;
    }


    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }


    public String getRegionname() {
        return regionname;
    }


    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }


    @Override
    public String toString() {
        return "Polling_Station [StaID=" + Stat_ID + ", districtname=" + districtname + ", regionname=" + regionname
                + "]";
    }
    
    static HashMap<Candidate, Integer> voteCountHashMap= new HashMap<Candidate, Integer>();
  
    //Map of frequency against number   
    public static void collate() {
        Map<Integer,Integer> counts=new HashMap<Integer,Integer>();
         for(Integer c : voteCountHashMap.values()) { 
         	int value = counts.get(c) == null ? 0 : counts.get(c);
             counts.put(c, value + 1);	
             
         }System.out.println(counts);}
    // doesnt work properly. 
    public static void colate() {
    	int count = Collections.frequency(voteCountHashMap.values(), 1);
    	int count2 = Collections.frequency(voteCountHashMap.values(), 2);
    	int count3 = Collections.frequency(voteCountHashMap.values(), 3);
    	int count4 = Collections.frequency(voteCountHashMap.values(), 4);
    	System.out.println(count);
    	System.out.println(count2);
    	System.out.println(count3);
    	System.out.println(count4);
    	}	
    public static void colllate() {
    	for (Integer i:voteCountHashMap.values() ) {
    		System.out.println(i);
    	}
    }
    	 
    
    //List to store all voters
    static Vote[] votersList = {
            new Vote(1),
            new Vote(2),
            new Vote(3),
            new Vote(4),
            new Vote(5),
            new Vote(6),
            new Vote(8),
            new Vote(9),
            new Vote(10),
            new Vote(11)};

    
    public static void main(String[] args) {
        
        //Initialize hashmap with candidates and set initial votes to 0
      voteCountHashMap.put(new Candidate("Nana Addo",1,"NPP"), 0);
      voteCountHashMap.put(new Candidate("John Mahama",2,"NDC"), 0);
      voteCountHashMap.put(new Candidate("Maame Akua Donkor",3,"GFP"), 0);
      voteCountHashMap.put(new Candidate("Ivor Greenstreet",4,"CPP"), 0);
     
      /*voting process
       * 
       */
      //step 1
      System.out.println("**************Enter Details**********");
      Scanner scanner = new Scanner(System.in);  // Create a Scanner object
  
      System.out.print("Enter voter No: ");
      int voterNo = scanner.nextInt();
     
      //verification process
      boolean found = false;

      for (Vote voter : votersList) {
          if((voterNo == (voter.getVoteID()))){
              found = true;
          }
      }
      if(!found) {
          System.out.println("Details do not match, Ask for Assistance!");
          System.exit(0);
      }
      System.out.println("No \t\tParty \t\tFullName");
      voteCountHashMap.forEach(new BiConsumer<Candidate, Integer>() {
          @Override
          public void accept(Candidate candidate, Integer integer) {
              System.out.println(candidate.getCandidate_id() + "\t\t" + candidate.getPolitical_Party() + "\t\t" + candidate.getCandidate_name());
          }
      });
      System.out.println("Type the number indicating your selection: ");

      int userSelection = scanner.nextInt();

      voteCountHashMap.forEach(new BiConsumer<Candidate, Integer>() {
          @Override
          public void accept(Candidate Candidate, Integer integer) {
              if (Candidate.getCandidate_id() == userSelection) {
                  //Increase the vote count by 1
                  voteCountHashMap.put(Candidate, integer++);

               
                  //prompt the use of their selection and exit
                  System.out.println("Congratulations your vote for " + Candidate.getCandidate_name() + " has been logged\n" +
                          "Thank you for voting :)");
              }
          }
      });
      
      colllate() ;
   scanner.close();
  }		    

}
// counts for each candidate. 
// number determines party, 1 for npp 2 for ndc ....
/* int count1=Collections.frequency(voteCountHashMap(), 1);
int count2=Collections.frequency(voteCountHashMap(), 2);
int count3=Collections.frequency(voteCountHashMap(), 3);
int count4=Collections.frequency(voteCountHashMap(), 4);*/

	//Hashmap to store all candidates
	          /*votes per party
System.out.println(count1);
System.out.println(count2);
System.out.println(count3);
System.out.println(count4);*/