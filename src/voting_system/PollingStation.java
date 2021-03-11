
package voting_system;

/**
 *
 * @author norisatsina
 */
public class PollingStation extends Voting {
    
    String pollingStation_Name;
    String pollingStation_Location;
    
    PollingStation(String pollingStation_Name, String pollingStation_Location){
        this.pollingStation_Name = pollingStation_Name;
        this.pollingStation_Location = pollingStation_Location;
    
    }

    PollingStation() {
        
    }
    
    public static void main(String[] args){
    
        PollingStation p = new PollingStation();
        p.partyVotes();
    }
}
