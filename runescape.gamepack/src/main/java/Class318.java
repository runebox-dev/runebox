import io.runebox.ObfInfo;

@ObfInfo(name = "mf")
public class Class318 {
	@ObfInfo(name = "jv", desc = "(IIB)V", opaque = "-1")
	public static void method6188(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (Client.field1105 < var0) {
			Client.field1105 += Client.field2960 * (var0 - Client.field1105) / 1000 + Client.field1408;
			if (Client.field1105 > var0) {
				Client.field1105 = var0;
			}
		} else if (Client.field1105 > var0) {
			Client.field1105 -= Client.field1408 + Client.field2960 * (Client.field1105 - var0) / 1000;
			if (Client.field1105 < var0) {
				Client.field1105 = var0;
			}
		}

		var1 &= 2047;
		int var3 = var1 - Client.field2029;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			Client.field2029 += Client.field1408 + var3 * Client.field2960 / 1000;
			Client.field2029 &= 2047;
		} else if (var3 < 0) {
			Client.field2029 -= Client.field1408 + -var3 * Client.field2960 / 1000;
			Client.field2029 &= 2047;
		}

		int var4 = var1 - Client.field2029;
		if (var4 > 1024) {
			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}

		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			Client.field2029 = var1;
		}

	}
}
