package com.converge.ExtractShared.dateutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.log4j.Logger;

/**
 * Class used to convert mined dates to java objects
 * @author Brackston Mayhall
 */
public class DateUtil {
	
	final static Logger logger = Logger.getLogger(DateUtil.class);
	
	/**
	 * Ingests a microsoft date and returns it in millis since epoch
	 * @param dateString the string
	 * @return returnsm the date in millis
	 * @throws ParseException an exception if we cannt parse the date
	 */
	public static long msDateStringToMillis(String dateString) throws ParseException {
		SimpleDateFormat format;
		if(dateString.length() == 20) {
			format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
					format.setTimeZone(TimeZone.getTimeZone("UTC"));
		} else if (dateString.length() == 28) {
			format = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'", Locale.US);
					format.setTimeZone(TimeZone.getTimeZone("UTC"));
		} else {
			throw new ParseException("can not parse incoming microsoft date", 0);
		}
				
		Date date = null;
		try {
			date = format.parse(dateString);
		} catch (ParseException e) {
			logger.error("could not parse date pcgameclip.", e);
		}
		return date.getTime();
	}
	
}
