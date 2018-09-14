import org.joda.time.DateTime;

public class Test
{
    public static void main(String[] args)
    {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toString("yyyy-MM-dd hh:mm:ss"));
        DateTime time2 = dateTime.plusDays(3);
        
        System.out.println(dateTime.toString("yyyy-MM-dd hh:mm:ss"));
        System.out.println(time2.toString("yyyy-MM-dd hh:mm:ss"));
    }
}
