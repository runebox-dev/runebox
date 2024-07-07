import io.runebox.ObfInfo;
import java.util.Locale;

@ObfInfo(name = "pe")
public class Class395 implements Class393 {
	@ObfInfo(name = "an", desc = "Lpe;")
	public static final Class395 field4595;
	@ObfInfo(name = "ad", desc = "Lpe;")
	public static final Class395 field4596;
	@ObfInfo(name = "aj", desc = "Lpe;")
	public static final Class395 field4597;
	@ObfInfo(name = "ak", desc = "Lpe;")
	public static final Class395 field4598;
	@ObfInfo(name = "ap", desc = "Lpe;")
	public static final Class395 field4599;
	@ObfInfo(name = "aq", desc = "Lpe;")
	public static final Class395 field4602;
	@ObfInfo(name = "ag", desc = "Lpe;")
	public static final Class395 field4607;
	@ObfInfo(name = "ae", desc = "[Lpe;")
	public static final Class395[] field4605;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1567769779)
	public final int field4604;
	@ObfInfo(name = "ab", desc = "Ljava/lang/String;")
	public final String field4600;
	@ObfInfo(name = "av", desc = "Ljava/lang/String;")
	public final String field4601;

	static {
		field4602 = new Class395("EN", "en", "English", Class402.field4628, 0, "GB");
		field4596 = new Class395("DE", "de", "German", Class402.field4628, 1, "DE");
		field4607 = new Class395("FR", "fr", "French", Class402.field4628, 2, "FR");
		field4598 = new Class395("PT", "pt", "Portuguese", Class402.field4628, 3, "BR");
		field4599 = new Class395("NL", "nl", "Dutch", Class402.field4630, 4, "NL");
		field4595 = new Class395("ES", "es", "Spanish", Class402.field4630, 5, "ES");
		field4597 = new Class395("ES_MX", "es-mx", "Spanish (Latin American)", Class402.field4628, 6, "MX");
		Class395[] var0 = method7378();
		field4605 = new Class395[var0.length];

		for (int var2 = 0; var2 < var0.length; ++var2) {
			Class395 var3 = var0[var2];
			if (null != field4605[var3.field4604]) {
				throw new IllegalStateException();
			}

			field4605[var3.field4604] = var3;
		}

	}

	public Class395(String var1, String var2, String var3, Class402 var4, int var5, String var6) {
		this.field4601 = var1;
		this.field4600 = var2;
		this.field4604 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfInfo(name = "ak", desc = "(I)Ljava/lang/String;")
	public String method7365() {
		return this.field4600;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field4604;
	}

	public String toString() {
		return this.method7365().toLowerCase(Locale.ENGLISH);
	}

	@ObfInfo(name = "ag", desc = "(I)[Lpe;")
	public static Class395[] method7378() {
		return new Class395[]{field4607, field4595, field4596, field4598, field4599, field4597, field4602};
	}

	@ObfInfo(name = "ap", desc = "(II)Lpe;")
	public static Class395 method7367(int var0) {
		return var0 >= 0 && var0 < field4605.length ? field4605[var0] : null;
	}

	@ObfInfo(name = "if", desc = "(I)V", opaque = "1273672622")
	public static void method7373() {
		if (Client.field1770) {
			if (Client.field883 != null) {
				Client.field883.method8564();
			}

			for (int var1 = 0; var1 < Client.field5093.field1017.field1402; ++var1) {
				Class80 var2 = Client.field5093.field1024[Client.field5093.field1017.field1407[var1]];
				var2.method2292();
			}

			Client.field1770 = false;
		}

	}
}
