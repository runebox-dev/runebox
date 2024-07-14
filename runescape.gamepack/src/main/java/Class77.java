import io.runebox.ObfInfo;

@ObfInfo(name = "cy")
public class Class77 {
	@ObfInfo(name = "ad", desc = "Lcy;")
	public static final Class77 field921;
	@ObfInfo(name = "ai", desc = "Lcy;")
	public static final Class77 field922;
	@ObfInfo(name = "ag", desc = "Lcy;")
	public static final Class77 field923;
	@ObfInfo(name = "ak", desc = "Lcy;")
	public static final Class77 field924;
	@ObfInfo(name = "ap", desc = "Lcy;")
	public static final Class77 field925;
	@ObfInfo(name = "an", desc = "Lcy;")
	public static final Class77 field926;
	@ObfInfo(name = "ao", desc = "Lcy;")
	public static final Class77 field927;
	@ObfInfo(name = "av", desc = "Lcy;")
	public static final Class77 field928;
	@ObfInfo(name = "ax", desc = "Lcy;")
	public static final Class77 field930;
	@ObfInfo(name = "ae", desc = "Lcy;")
	public static final Class77 field931;
	@ObfInfo(name = "aq", desc = "Lcy;")
	public static final Class77 field932;
	@ObfInfo(name = "ah", desc = "Lcy;")
	public static final Class77 field933;
	@ObfInfo(name = "az", desc = "Lcy;")
	public static final Class77 field934;
	@ObfInfo(name = "aa", desc = "Lcy;")
	public static final Class77 field935;
	@ObfInfo(name = "ac", desc = "Lcy;")
	public static final Class77 field936;
	@ObfInfo(name = "al", desc = "Lcy;")
	public static final Class77 field937;
	@ObfInfo(name = "ay", desc = "Lcy;")
	public static final Class77 field938;
	@ObfInfo(name = "ab", desc = "Lcy;")
	public static final Class77 field939;
	@ObfInfo(name = "au", desc = "Lcy;")
	public static final Class77 field940;
	@ObfInfo(name = "as", desc = "Lcy;")
	public static final Class77 field941;
	@ObfInfo(name = "aw", desc = "Lcy;")
	public static final Class77 field942;
	@ObfInfo(name = "at", desc = "Lcy;")
	public static final Class77 field943;
	@ObfInfo(name = "af", desc = "Lcy;")
	public static final Class77 field944;
	@ObfInfo(name = "am", desc = "Lcy;")
	public static final Class77 field945;
	@ObfInfo(name = "aj", desc = "Lcy;")
	public static final Class77 field948;

	static {
		field932 = new Class77();
		field921 = new Class77();
		field923 = new Class77();
		field924 = new Class77();
		field925 = new Class77();
		field926 = new Class77();
		field948 = new Class77();
		field928 = new Class77();
		field939 = new Class77();
		field922 = new Class77();
		field931 = new Class77();
		field940 = new Class77();
		field933 = new Class77();
		field934 = new Class77();
		field930 = new Class77();
		field936 = new Class77();
		field937 = new Class77();
		field938 = new Class77();
		field927 = new Class77();
		field935 = new Class77();
		field941 = new Class77();
		field942 = new Class77();
		field943 = new Class77();
		field944 = new Class77();
		field945 = new Class77();
	}

	@ObfInfo(name = "ag", desc = "(Lqu;FFFB)F", opaque = "1")
	public static float method2226(Class437 var0, float var1, float var2, float var3) {
		float var5 = Class437.method5112(var0.field4759, var0.field4760, var1);
		if (Math.abs(var5) < Class153.field1728) {
			return var1;
		} else {
			float var6 = Class437.method5112(var0.field4759, var0.field4760, var2);
			if (Math.abs(var6) < Class153.field1728) {
				return var2;
			} else {
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var9 = 0.0F;
				float var14 = 0.0F;
				boolean var15 = true;
				boolean var16 = false;

				do {
					var16 = false;
					if (var15) {
						var7 = var1;
						var14 = var5;
						var8 = var2 - var1;
						var9 = var8;
						var15 = false;
					}

					if (Math.abs(var14) < Math.abs(var6)) {
						var1 = var2;
						var2 = var7;
						var7 = var1;
						var5 = var6;
						var6 = var14;
						var14 = var5;
					}

					float var17 = Class153.field1723 * Math.abs(var2) + var3 * 0.5F;
					float var18 = (var7 - var2) * 0.5F;
					boolean var19 = Math.abs(var18) > var17 && var6 != 0.0F;
					if (var19) {
						if (Math.abs(var9) >= var17 && Math.abs(var5) > Math.abs(var6)) {
							float var13 = var6 / var5;
							float var10;
							float var11;
							if (var1 == var7) {
								var10 = var18 * 2.0F * var13;
								var11 = 1.0F - var13;
							} else {
								var11 = var5 / var14;
								float var12 = var6 / var14;
								var10 = (var18 * 2.0F * var11 * (var11 - var12) - (var2 - var1) * (var12 - 1.0F)) * var13;
								var11 = (var11 - 1.0F) * (var12 - 1.0F) * (var13 - 1.0F);
							}

							if ((double)var10 > 0.0D) {
								var11 = -var11;
							} else {
								var10 = -var10;
							}

							var13 = var9;
							var9 = var8;
							if (var10 * 2.0F < var18 * 3.0F * var11 - Math.abs(var11 * var17) && var10 < Math.abs(var13 * 0.5F * var11)) {
								var8 = var10 / var11;
							} else {
								var8 = var18;
								var9 = var18;
							}
						} else {
							var8 = var18;
							var9 = var18;
						}

						var1 = var2;
						var5 = var6;
						if (Math.abs(var8) > var17) {
							var2 += var8;
						} else if ((double)var18 > 0.0D) {
							var2 += var17;
						} else {
							var2 -= var17;
						}

						var6 = Class437.method5112(var0.field4759, var0.field4760, var2);
						if ((double)(var6 * (var14 / Math.abs(var14))) > 0.0D) {
							var15 = true;
							var16 = true;
						} else {
							var16 = true;
						}
					}
				} while(var16);

				return var2;
			}
		}
	}

	@ObfInfo(name = "ok", desc = "(Ljava/lang/String;ZB)Ljava/lang/String;", opaque = "-2")
	public static String method2225(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (Client.field527 == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.field527 == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.field527 == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.field527 == 5) {
			var0 = var0 + "-wti";
		} else if (Client.field527 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (Client.field74 != null) {
			var4 = "/p=" + Client.field74;
		}

		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + Client.field1376 + "/a=" + Client.field2080 + var4 + "/";
	}
}
