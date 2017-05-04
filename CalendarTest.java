import java.util.Calendar;
public class CalendarTest {
public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    c.set(2000,0,1,12,0);
    System.out.println("time:"+c.getTime());
    c.add(c.DATE,40);
    System.out.println("after add 40 days, time:"+c.getTime());
    c.roll(c.DATE,40);
    System.out.println("after roll 40 days, time:"+c.getTime());
    c.set(c.DATE,15);
    System.out.println("after set day = 15, time:"+c.getTime());
    System.out.println("YEAR = "+c.YEAR);
    System.out.println("MONTH = "+c.MONTH);
    System.out.println("DATE = "+c.DATE);
    System.out.println("DAY_OF_MONTH = "+c.DAY_OF_MONTH);
    System.out.println("HOUR = "+c.HOUR);
    System.out.println("HOUR_OF_DAY = "+c.HOUR_OF_DAY);
    System.out.println("MINUTE = "+c.MINUTE);
    System.out.println("SECOND = "+c.SECOND);
    System.out.println("MILLISECOND = "+c.MILLISECOND);
    System.out.println("ZONE_OFFSET = "+c.ZONE_OFFSET);
}
}
