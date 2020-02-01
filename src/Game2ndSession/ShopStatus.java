package Game2ndSession;

import java.time.LocalDateTime;

import static Game2ndSession.Constants.CLOSING_HOUR;
import static Game2ndSession.Constants.OPENING_HOUR;

public class ShopStatus {

    public boolean isOpen() {
        LocalDateTime localDate = LocalDateTime.now();
//        System.out.println(localDate.getHour() + ":" + localDate.getMinute());
        if (localDate.getHour() >= OPENING_HOUR && localDate.getHour() <= CLOSING_HOUR) {
            return true;
        } else {
            return false;
        }
    }
}
