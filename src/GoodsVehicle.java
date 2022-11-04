import Strategy.DriveStrategy;
import Strategy.NormalDriveStrategy;
import Strategy.SportsDriveStrategy;

public class GoodsVehicle extends Vehicle{


    GoodsVehicle( ) {
        super(new NormalDriveStrategy());
    }
}
