import java.util.Arrays;

public class ElectoralOffice {

    private String collatorID;
    private String collatorName;
    private int[] tally = {0,0,0,0};

    ElectoralOffice(String collatorID, String collatorName){
        this.collatorID = collatorID;
        this.collatorName = collatorName;
    }


    public void setCollatorID(String collatorID) {
        this.collatorID = collatorID;
    }

    public void setCollatorName(String collatorName) {
        this.collatorName = collatorName;
    }

    public void setTally(int[] tally) {
        this.tally = tally;
    }

    public String getCollatorID() {
        return collatorID;
    }

    public String getCollatorName() {
        return collatorName;
    }

    public int[] getTally() {
        return tally;
    }



    @Override
    public String toString() {
        return collatorName + " Tally:" +
                "\nParty 1 = " + String.valueOf(tally[0]) +
                "\nParty 2 = " + String.valueOf(tally[1]) +
                "\nParty 3 = " + String.valueOf(tally[2]) +
                "\nParty 4 = " + String.valueOf(tally[3])
                ;
    }


    public static void main(String[] args) {

        ElectoralOffice genOffice = new ElectoralOffice("OS63212", "Osu General Office");
        System.out.println(genOffice.toString());

    }
}
