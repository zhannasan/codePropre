package monotache.corrige;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {

	public static Date parse(String date){
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return formatter.parse(date);
		} catch (ParseException e) {
			return null;
		}
	}
}
