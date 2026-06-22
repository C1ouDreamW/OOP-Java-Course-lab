package 实验6;
import java.time.*;

public class GiveCalendar {
    public LocalDate [] getCalendar(LocalDate date) {
        LocalDate [] dataArrays = new LocalDate[42];
        LocalDate firstDay = date.withDayOfMonth(1);
        int space = firstDay.getDayOfWeek().getValue() % 7;
        int length = date.lengthOfMonth();
        for(int i=0;i<length;i++){
            dataArrays[space + i] = firstDay.plusDays(i);
        }
        return dataArrays;
    }
}
