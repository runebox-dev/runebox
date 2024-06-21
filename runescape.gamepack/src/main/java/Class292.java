import io.runebox.ObfInfo;

@ObfInfo(name = "lf")
public class Class292 {
	@ObfInfo(desc = "(II)I")
	public static int method4758(int var0, int var1) {
		Class230 var4 = (Class230)Class230.field2422.method5993((long)var0);
		Class230 var3;
		if (var4 != null) {
			var3 = var4;
		} else {
			byte[] var5 = Class93.field2417.method7216(4, var0);
			var4 = new Class230();
			if (var5 != null) {
				var4.method4393(new Class521(var5), var0);
			}

			var4.method4394();
			Class230.field2422.method5987(var4, (long)var0);
			var3 = var4;
		}

		if (var3 == null) {
			return var1;
		} else {
			int var6;
			int var7;
			if (var3.field2419 >= 0) {
				var7 = method3770(var3.field2431, var3.field2426, var3.field2427);
				var6 = method3139(var7, 96);
				return Class253.field2684[var6] | -16777216;
			} else if (var3.field2429 >= 0) {
				var7 = method3139(Class253.field2688.field3043.method4718(var3.field2429), 96);
				return Class253.field2684[var7] | -16777216;
			} else if (16711935 == var3.field2418) {
				return var1;
			} else {
				var7 = method3770(var3.field2425, var3.field2423, var3.field2424);
				var6 = method3139(var7, 96);
				return Class253.field2684[var6] | -16777216;
			}
		}
	}

	@ObfInfo(name = "az", desc = "(II)Lfr;", opaque = "1257407705")
	public static Class148 method5906(int var0) {
		Class148[] var2 = new Class148[]{Class148.field1677, Class148.field1673, Class148.field1674, Class148.field1675, Class148.field1683, Class148.field1684};
		Class148 var3 = (Class148)Class62.method1112(var2, var0);
		if (var3 == null) {
			var3 = Class148.field1677;
		}

		return var3;
	}

	@ObfInfo(desc = "(II)I")
	public static int method3139(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	@ObfInfo(desc = "(III)I")
	public static int method3770(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
		return var4;
	}
}
