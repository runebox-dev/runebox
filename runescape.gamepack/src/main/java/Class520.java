import io.runebox.ObfInfo;
import java.util.HashMap;

@ObfInfo(name = "tz")
public class Class520 {
	@ObfInfo(name = "al", desc = "Lor;")
	public Class382 field5212;
	@ObfInfo(name = "ak", desc = "Lor;")
	public Class382 field5214;
	@ObfInfo(name = "aj", desc = "Ljava/util/HashMap;")
	public HashMap field5213;

	public Class520(Class382 var1, Class382 var2) {
		this.field5214 = var1;
		this.field5212 = var2;
		this.field5213 = new HashMap();
	}

	@ObfInfo(name = "ak", desc = "([Ltc;I)Ljava/util/HashMap;", opaque = "-411117179")
	public HashMap method9383(Class497[] var1) {
		HashMap var3 = new HashMap();

		for (int var5 = 0; var5 < var1.length; ++var5) {
			Class497 var6 = var1[var5];
			if (this.field5213.containsKey(var6)) {
				var3.put(var6, this.field5213.get(var6));
			} else {
				Class382 var8 = this.field5214;
				Class382 var9 = this.field5212;
				String var10 = var6.field5088;
				Class418 var7;
				if (!var8.method7235(var10, "")) {
					var7 = null;
				} else {
					int var11 = var8.method7233(var10);
					int var12 = var8.method7299(var11, "");
					Class418 var13;
					if (!Class554.method2876(var8, var11, var12)) {
						var13 = null;
					} else {
						byte[] var15 = var9.method7216(var11, var12);
						Class418 var14;
						if (var15 == null) {
							var14 = null;
						} else {
							Class418 var16 = new Class418(var15, Class81.field5374, Class81.field5377, Class81.field5376, Class81.field5379, Class81.field1371, Class81.field1910);
							Class81.field5374 = null;
							Class81.field5377 = null;
							Class81.field5376 = null;
							Class81.field5379 = null;
							Class81.field1371 = null;
							Class81.field1910 = (byte[][])null;
							var14 = var16;
						}

						var13 = var14;
					}

					var7 = var13;
				}

				if (var7 != null) {
					this.field5213.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}

		return var3;
	}
}
