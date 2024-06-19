import java.io.File;
import java.io.IOException;

public class Class179 {
	public static Class528 field1885;
	public static Class528 field1886;
	public static Class528 field1890;

	static {
		field1886 = null;
		field1885 = null;
		field1890 = null;
	}

	public static Class525 method2980(String var0, String var1, boolean var2) {
		File var4 = new File(Class90.field6, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				Class525 var11 = new Class525(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (33 == Class90.field1889) {
			var5 = "_rc";
		} else if (34 == Class90.field1889) {
			var5 = "_wip";
		}

		File var6 = new File(Class90.field1336, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		Class525 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new Class525(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}

		try {
			var7 = new Class525(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	public static void method2751(Class521 var0, int var1) {
		if (field1886 != null) {
			try {
				field1886.method9736(0L);
				field1886.method9709(var0.field5221, var1, 24);
			} catch (Exception var4) {
			}
		}

	}

	public static void method3510() {
		try {
			field1885.method9707();

			for (int var1 = 0; var1 < Class90.field2841; ++var1) {
				Client.field910[var1].method9707();
			}

			field1890.method9707();
			field1886.method9707();
		} catch (Exception var2) {
		}

	}
}
