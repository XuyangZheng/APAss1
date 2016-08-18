package TravelPass;

import java.sql.Time;
import java.util.Date;

/**
 * Project APAss1,
 * Created by TonyZheng on 18/08/2016.
 */
public class TwoHoursPassZone2 extends TwoHoursPass {
    double price;
    public TwoHoursPassZone2(Date date, Time time){
        super(date,time);
        this.price = 5.0;
    }
}
