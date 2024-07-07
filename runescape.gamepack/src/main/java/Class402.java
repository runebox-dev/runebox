import io.runebox.ObfInfo;
import java.util.Locale;

@ObfInfo(name = "pl")
public class Class402 implements Class393 {
	@ObfInfo(name = "al", desc = "Lpl;")
	public static final Class402 field4608;
	@ObfInfo(name = "aa", desc = "Lpl;")
	public static final Class402 field4609;
	@ObfInfo(name = "aj", desc = "Lpl;")
	public static final Class402 field4610;
	@ObfInfo(name = "az", desc = "Lpl;")
	public static final Class402 field4611;
	@ObfInfo(name = "af", desc = "Lpl;")
	public static final Class402 field4612;
	@ObfInfo(name = "at", desc = "Lpl;")
	public static final Class402 field4613;
	@ObfInfo(name = "ak", desc = "Lpl;")
	public static final Class402 field4616;
	@ObfInfo(name = "ah", desc = "[Lpl;")
	public static final Class402[] field4617;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -120687081)
	public final int field4618;
	@ObfInfo(name = "ab", desc = "Ljava/lang/String;")
	public final String field4614;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	public final String field4615;

	static {
		field4616 = new Class402("EN", "en", "English", Class395.field4567, 0, "GB");
		field4608 = new Class402("DE", "de", "German", Class395.field4567, 1, "DE");
		field4610 = new Class402("FR", "fr", "French", Class395.field4567, 2, "FR");
		field4611 = new Class402("PT", "pt", "Portuguese", Class395.field4567, 3, "BR");
		field4612 = new Class402("NL", "nl", "Dutch", Class395.field4570, 4, "NL");
		field4609 = new Class402("ES", "es", "Spanish", Class395.field4570, 5, "ES");
		field4613 = new Class402("ES_MX", "es-mx", "Spanish (Latin American)", Class395.field4567, 6, "MX");
		Class402[] var0 = method7528();
		field4617 = new Class402[var0.length];

		for (int var2 = 0; var2 < var0.length; ++var2) {
			Class402 var3 = var0[var2];
			if (null != field4617[var3.field4618]) {
				throw new IllegalStateException();
			}

			field4617[var3.field4618] = var3;
		}

	}

	public Class402(String var1, String var2, String var3, Class395 var4, int var5, String var6) {
		this.field4614 = var1;
		this.field4615 = var2;
		this.field4618 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfInfo(name = "af", desc = "(I)Ljava/lang/String;")
	public String method7521() {
		return this.field4615;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field4618;
	}

	public String toString() {
		return this.method7521().toLowerCase(Locale.ENGLISH);
	}

	@ObfInfo(name = "ak", desc = "(IIIII)I")
	public static int method7534(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfInfo(name = "az", desc = "(B)[Lpl;")
	public static Class402[] method7528() {
		return new Class402[]{field4608, field4613, field4611, field4616, field4612, field4609, field4610};
	}

	@ObfInfo(name = "aa", desc = "(II)Lpl;", opaque = "-968330042")
	public static Class402 method7514(int var0) {
		return var0 >= 0 && var0 < field4617.length ? field4617[var0] : null;
	}
}
