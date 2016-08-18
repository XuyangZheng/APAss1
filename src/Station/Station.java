package Station;

/**
 * Project APAss1,
 * Created by TonyZheng on 18/08/2016.
 */
public class Station {
    public String getStationName() {
        return stationName;
    }
    
    private String stationName;
    
    public int getZone() {
        return zone;
    }
    
    private int zone;
    public Station(String StationName,int Zone){
        this.stationName = StationName;
        this.zone = Zone;
    }
}
