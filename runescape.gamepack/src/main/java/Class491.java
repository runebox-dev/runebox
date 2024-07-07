import io.runebox.ObfInfo;

@ObfInfo(name = "sw")
public class Class491 {
	@ObfInfo(name = "aq", desc = "Lsw;")
	public static final Class491 field5019;
	@ObfInfo(name = "ad", desc = "Lsw;")
	public static final Class491 field5020;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1592901653)
	public final int field5021;

	static {
		field5019 = new Class491(1);
		field5020 = new Class491(3);
	}

	public Class491(int var1) {
		this.field5021 = var1;
	}

	@ObfInfo(name = "au", desc = "([BI)V", opaque = "-1395904714")
	public static void method8828(byte[] var0) {
		Class562 var2 = new Class562(var0);
		var2.field5471 = var0.length - 2;
		Client.field5437 = var2.method9997();
		Client.field1454 = new int[Client.field5437];
		Client.field1561 = new int[Client.field5437];
		Client.field5435 = new int[Client.field5437];
		Client.field3491 = new int[Client.field5437];
		Client.field5434 = new byte[Client.field5437][];
		var2.field5471 = var0.length - 7 - Client.field5437 * 8;
		Client.field5433 = var2.method9997();
		Client.field5438 = var2.method9997();
		int var3 = (var2.method9902() & 255) + 1;

		int var4;
		for (var4 = 0; var4 < Client.field5437; ++var4) {
			Client.field1454[var4] = var2.method9997();
		}

		for (var4 = 0; var4 < Client.field5437; ++var4) {
			Client.field1561[var4] = var2.method9997();
		}

		for (var4 = 0; var4 < Client.field5437; ++var4) {
			Client.field5435[var4] = var2.method9997();
		}

		for (var4 = 0; var4 < Client.field5437; ++var4) {
			Client.field3491[var4] = var2.method9997();
		}

		var2.field5471 = var0.length - 7 - Client.field5437 * 8 - (var3 - 1) * 3;
		Client.field5432 = new int[var3];

		for (var4 = 1; var4 < var3; ++var4) {
			Client.field5432[var4] = var2.method9830();
			if (0 == Client.field5432[var4]) {
				Client.field5432[var4] = 1;
			}
		}

		var2.field5471 = 0;

		for (var4 = 0; var4 < Client.field5437; ++var4) {
			int var5 = Client.field5435[var4];
			int var6 = Client.field3491[var4];
			int var7 = var6 * var5;
			byte[] var8 = new byte[var7];
			Client.field5434[var4] = var8;
			int var9 = var2.method9902();
			int var10;
			if (var9 == 0) {
				for (var10 = 0; var10 < var7; ++var10) {
					var8[var10] = var2.method9955();
				}
			} else if (var9 == 1) {
				for (var10 = 0; var10 < var5; ++var10) {
					for (int var11 = 0; var11 < var6; ++var11) {
						var8[var11 * var5 + var10] = var2.method9955();
					}
				}
			}
		}

	}
}
