import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(df.format(date));
	}
}