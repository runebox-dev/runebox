import io.runebox.ObfInfo;

@ObfInfo(name = "hk")
public class Class193 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field2110;
	@ObfInfo(name = "ag", desc = "Lth;")
	public Class502 field2112;

	static {
		field2110 = new Class327(64);
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public void method3862() {
	}

	@ObfInfo(name = "ag", desc = "(Lvp;I)V", opaque = "1414638907")
	public void method3863(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3864(var1, var3);
		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;II)V", opaque = "1820430825")
	public void method3864(Class562 var1, int var2) {
		if (var2 == 249) {
			this.field2112 = Class113.method2910(var1, this.field2112);
		}

	}

	@ObfInfo(name = "ap", desc = "(IIB)I")
	public int method3865(int var1, int var2) {
		return Class208.method4938(this.field2112, var1, var2);
	}

	@ObfInfo(name = "an", desc = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method3866(int var1, String var2) {
		return Class208.method2917(this.field2112, var1, var2);
	}

	@ObfInfo(owner = "client", name = "aq", desc = "(II)Lhk;", opaque = "2012555847")
	public static Class193 method1910(int var0) {
		Class193 var2 = (Class193)field2110.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2111.method7132(34, var0);
			var2 = new Class193();
			if (var3 != null) {
				var2.method3863(new Class562(var3));
			}

			var2.method3862();
			field2110.method6330(var2, (long)var0);
			return var2;
		}
	}
}
