import io.runebox.ObfInfo;

@ObfInfo(name = "ek")
public class Class115 extends Class471 {
	@ObfInfo(name = "ak", desc = "Z")
	public final boolean field1441;

	public Class115(boolean var1) {
		this.field1441 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lso;Lso;I)I", opaque = "-401568257")
	public int method2886(Class483 var1, Class483 var2) {
		if (var1.field4959 == Client.field557 && Client.field557 == var2.field4959) {
			return this.field1441 ? var1.field4960 - var2.field4960 : var2.field4960 - var1.field4960;
		} else {
			return this.method8640(var1, var2);
		}
	}

	@ObfInfo(name = "compare", desc = "(Ljava/lang/Object;Ljava/lang/Object;)I")
	public int compare(Object var1, Object var2) {
		return this.method2886((Class483)var1, (Class483)var2);
	}

	@ObfInfo(name = "aw", desc = "(ILdm;ZI)I", opaque = "-23151886")
	public static int method2892(int var0, Class91 var1, boolean var2) {
		Class340 var4;
		if (var0 != 1927 && var0 != 2927) {
			int var9;
			if (var0 == 1928) {
				var4 = var2 ? Class72.field892 : Class72.field88;
				var9 = Class72.field887[--Class85.field83];
				if (var9 >= 1 && var9 <= 10) {
					Class118 var10 = new Class118(var9, var4.field3676, var4.field3791, var4.field3810);
					Class72.field888.add(var10);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				Class85.field83 -= 3;
				int var8 = Class72.field887[Class85.field83];
				var9 = Class72.field887[1 + Class85.field83];
				int var6 = Class72.field887[2 + Class85.field83];
				if (var6 >= 1 && var6 <= 10) {
					Class118 var7 = new Class118(var6, var8, var9, Client.field25.method6718(var8).field3810);
					Class72.field888.add(var7);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Class72.field896 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var4 = Client.field25.method6718(Class72.field887[--Class85.field83]);
			} else {
				var4 = var2 ? Class72.field892 : Class72.field88;
			}

			if (var4.field3802 == null) {
				return 0;
			} else {
				Class101 var5 = new Class101();
				var5.field1325 = var4;
				var5.field1333 = var4.field3802;
				var5.field1331 = 1 + Class72.field896;
				Client.field696.method7477(var5);
				return 1;
			}
		}
	}
}
