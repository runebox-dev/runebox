import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "da")
public class Class79 extends Class506 {
	@ObfInfo(name = "ak", desc = "Ltx;")
	public static Class518 field982;
	@ObfInfo(name = "al", desc = "[I")
	public int[] field980;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field981;

	static {
		field982 = new Class518(32);
	}

	public Class79() {
		this.field980 = new int[]{-1};
		this.field981 = new int[]{0};
	}

	@ObfInfo(owner = "cj", name = "ak", desc = "(IIB)I", opaque = "-1")
	public static int method1113(int var0, int var1) {
		Class79 var3 = (Class79)field982.method9361((long)var0);
		if (var3 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var3.field980.length ? var3.field980[var1] : -1;
		}
	}

	@ObfInfo(owner = "fq", name = "al", desc = "(III)I", opaque = "-627086171")
	public static int method3244(int var0, int var1) {
		Class79 var3 = (Class79)field982.method9361((long)var0);
		if (var3 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field981.length ? var3.field981[var1] : 0;
		}
	}

	@ObfInfo(owner = "cx", name = "aj", desc = "(III)I", opaque = "-514019208")
	public static int method2115(int var0, int var1) {
		Class79 var3 = (Class79)field982.method9361((long)var0);
		if (var3 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var5 = 0; var5 < var3.field981.length; ++var5) {
				if (var1 == var3.field980[var5]) {
					var4 += var3.field981[var5];
				}
			}

			return var4;
		}
	}

	@ObfInfo(owner = "ix", name = "az", desc = "(IIIII)V", opaque = "-1323037164")
	public static void method4478(int var0, int var1, int var2, int var3) {
		Class79 var5 = (Class79)field982.method9361((long)var0);
		if (var5 == null) {
			var5 = new Class79();
			field982.method9360(var5, (long)var0);
		}

		if (var5.field980.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];

			int var8;
			for (var8 = 0; var8 < var5.field980.length; ++var8) {
				var6[var8] = var5.field980[var8];
				var7[var8] = var5.field981[var8];
			}

			for (var8 = var5.field980.length; var8 < var1; ++var8) {
				var6[var8] = -1;
				var7[var8] = 0;
			}

			var5.field980 = var6;
			var5.field981 = var7;
		}

		var5.field980[var1] = var2;
		var5.field981[var1] = var3;
	}

	@ObfInfo(owner = "ad", name = "af", desc = "(II)V", opaque = "-2025178871")
	public static void method51(int var0) {
		Class79 var2 = (Class79)field982.method9361((long)var0);
		if (var2 != null) {
			for (int var3 = 0; var3 < var2.field980.length; ++var3) {
				var2.field980[var3] = -1;
				var2.field981[var3] = 0;
			}

		}
	}

	@ObfInfo(owner = "ro", name = "aa", desc = "(II)V", opaque = "-789628247")
	public static void method8489(int var0) {
		Class79 var2 = (Class79)field982.method9361((long)var0);
		if (var2 != null) {
			var2.method9277();
		}
	}

	@ObfInfo(owner = "fn", name = "at", desc = "(B)V")
	public static void method3179() {
		field982 = new Class518(32);
	}

	@ObfInfo(name = "ou", desc = "(I)V", opaque = "-1828875769")
	public static void method2220() {
		Iterator var1 = Class128.field1529.iterator();

		while (var1.hasNext()) {
			Class67 var2 = (Class67)var1.next();
			var2.method1834();
		}

		if (Client.field1420 != null) {
			Client.field1420.method8479();
		}

	}
}
