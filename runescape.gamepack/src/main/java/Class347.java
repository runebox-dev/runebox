import io.runebox.ObfInfo;
import java.util.Calendar;
import java.util.TimeZone;

public class Class347 {
	@ObfInfo(name = "aj", desc = "Ljava/util/Calendar;")
	public static Calendar field3864;
	@ObfInfo(name = "al", desc = "[Ljava/lang/String;")
	public static final String[] field3863;
	@ObfInfo(name = "ak", desc = "[[Ljava/lang/String;")
	public static final String[][] field3866;

	static {
		field3866 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		field3863 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		Calendar.getInstance();
		field3864 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}
}
