import java.io.IOException;
import java.util.Locale;

public class Class402 implements Class393 {
	public static final Class402 field4608;
	public static final Class402 field4609;
	public static final Class402 field4610;
	public static final Class402 field4611;
	public static final Class402 field4612;
	public static final Class402 field4613;
	public static final Class402 field4616;
	public static final Class402[] field4617;
	public final int field4618;
	public final String field4614;
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

	public String method7521() {
		return this.field4615;
	}

	public int method175() {
		return this.field4618;
	}

	public String toString() {
		return this.method7521().toLowerCase(Locale.ENGLISH);
	}

	public static int method7534(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	public static Class402[] method7528() {
		return new Class402[]{field4608, field4613, field4611, field4616, field4612, field4609, field4610};
	}

	public static Class402 method7514(int var0) {
		return var0 >= 0 && var0 < field4617.length ? field4617[var0] : null;
	}

	public static Class102 method7532() {
		Class525 var1 = null;
		Class102 var2 = new Class102();

		try {
			var1 = Class179.method2980("", Client.field1497.field4550, false);
			byte[] var3 = new byte[(int)var1.method9674()];

			int var5;
			for (int var4 = 0; var4 < var3.length; var4 += var5) {
				var5 = var1.method9682(var3, var4, var3.length - var4);
				if (var5 == -1) {
					throw new IOException();
				}
			}

			var2 = new Class102(new Class521(var3));
		} catch (Exception var7) {
		}

		try {
			if (var1 != null) {
				var1.method9672();
			}
		} catch (Exception var6) {
		}

		return var2;
	}
}
