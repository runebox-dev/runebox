import io.runebox.ObfInfo;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfInfo(name = "nr")
public class Class356 {
	@ObfInfo(name = "ag", desc = "Ljava/util/Calendar;")
	public static Calendar field3776;
	@ObfInfo(name = "ad", desc = "[Ljava/lang/String;")
	public static final String[] field3775;
	@ObfInfo(name = "aq", desc = "[[Ljava/lang/String;")
	public static final String[][] field3774;

	static {
		field3774 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		field3775 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		Calendar.getInstance();
		field3776 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	@ObfInfo(owner = "fo", name = "aq", desc = "(J)Ljava/lang/String;")
	public static String method3185(long var0) {
		field3776.setTime(new Date(var0));
		int var2 = field3776.get(7);
		int var3 = field3776.get(5);
		int var4 = field3776.get(2);
		int var5 = field3776.get(1);
		int var6 = field3776.get(11);
		int var7 = field3776.get(12);
		int var8 = field3776.get(13);
		return field3775[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + field3774[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}
}
