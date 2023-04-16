package pageobject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScrollUtilities {
	
	public static String getCurrentDateStr()
	{
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		return dateName;
		
		
	}

}
