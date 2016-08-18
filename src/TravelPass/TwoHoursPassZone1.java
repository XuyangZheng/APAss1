package TravelPass;

import java.sql.Time;
import java.util.Date;

/**
 * Project APAss1,
 * Created by TonyZheng on 18/08/2016.
 */
public class TwoHoursPassZone1 extends TwoHoursPass {
    double price;
    public TwoHoursPassZone1(Date date, Time time){
        super(date,time);
        this.price=3.5;
    }
}
