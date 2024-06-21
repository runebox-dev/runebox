import io.runebox.ObfInfo;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

public final class Class317 {
	@ObfInfo(name = "aj", desc = "Ljava/util/HashMap;")
	public static final HashMap field3384;

	static {
		field3384 = new HashMap();
		TimeZone var2;
		synchronized(field3384) {
			var2 = (TimeZone)field3384.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3384.put("Europe/London", var2);
			}
		}

		Calendar.getInstance(var2);
	}

	@ObfInfo(name = "nt", desc = "(Lnb;I)V", opaque = "9637510")
	public static void method6187(Class340 var0) {
		if (var0 != null && var0.field3762 == Client.field558) {
			Client.field614[var0.field3821] = true;
		}

	}
}
