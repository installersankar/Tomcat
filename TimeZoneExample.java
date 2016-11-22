public class TimeZoneExample {

	public static void main(String[] argv) {

		/*Set<String> allZones = ZoneId.getAvailableZoneIds();
		LocalDateTime dt = LocalDateTime.now();

		// Create a List using the set of zones and sort it.
		List<String> zoneList = new ArrayList<String>(allZones);
		Collections.sort(zoneList);


		for (String s : zoneList) {
		    ZoneId zone = ZoneId.of(s);
		    ZonedDateTime zdt = dt.atZone(zone);
		    ZoneOffset offset = zdt.getOffset();
		    int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
		    String out = String.format("%35s %10s%n", zone, offset);

		    // Write only time zones that do not have a whole hour offset
		    // to standard out.
		    if (secondsOfHour != 0) {
		        System.out.printf(out);
		    }
		}*/
		String replace="am_c_Get_Started_with_AM.htm";
		String orgin="topic=/Operations_Console/";
		
		String queryString="topic=/Operations_Console/Self_Service_Console_Web_Pages/Customize_Self-Service_Console_Web_Pages.htm&lang=en_US&lang=en_US&VISITED=YES";
		String url="/console-infocenter/Content/Production/Security%20Console%20Help/am_c_Get_Started_with_AM.htm";
		//String subString= queryString.s"topic=/Operations_Console/";
		String replaced=org.apache.commons.lang.StringUtils.remove(queryString, orgin);
		
		System.out.println(replaced);
		
		
		String replaced2=org.apache.commons.lang.StringUtils.remove(url, replace);
		System.out.println(replaced2);
		

}
}