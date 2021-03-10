public class Polling_Station extends Vote{
    private int Stat_ID;
    private String districtname;
    private String regionname;

   
    Polling_Station( int Stat_ID, String districtname, String regionname){
        super(Vote);
        this.StaID=StaID;
        this.districtname=districtname;
        this.regionname=regionname;
        
    }


    public int getStaID() {
        return StaID;
    }


    public void setStaID(int staID) {
        StaID = staID;
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
        return "Polling_Station [StaID=" + StaID + ", districtname=" + districtname + ", regionname=" + regionname
                + "]";
    }
 public static void main(String[] args) {
    
}
}