import io.runebox.ObfInfo;

@ObfInfo(name = "vn")
public class Class560 {
	@ObfInfo(name = "ai", desc = "Z")
	public boolean field5455;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1402538695)
	public int field5452;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1847470821)
	public int field5453;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1553082509)
	public int field5454;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1106594863)
	public int field5456;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -789417987)
	public int field5457;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1961602031)
	public int field5458;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1686890437)
	public int field5459;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 1180354653)
	public int field5460;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -728068103)
	public int field5461;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1955973477)
	public int field5462;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -1558879885)
	public int field5463;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1341699441)
	public int field5465;

	public Class560() {
		this.field5460 = 0;
		this.field5458 = 0;
	}

	@ObfInfo(name = "aq", desc = "(IIIIIIIIZI)V")
	public void method9774(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5459 = var1;
		this.field5454 = var2;
		this.field5453 = var3;
		this.field5456 = var4;
		this.field5457 = var5;
		this.field5452 = var6;
		this.field5460 = var7;
		this.field5458 = var8;
		this.field5455 = var9;
	}

	@ObfInfo(name = "ad", desc = "(IIIII)V")
	public void method9785(int var1, int var2, int var3, int var4) {
		this.field5462 = var1;
		this.field5461 = var2;
		this.field5463 = var3;
		this.field5465 = var4;
	}

	@ObfInfo(name = "ag", desc = "(Lql;Lqh;I)V", opaque = "-1273897302")
	public void method9776(Class428 var1, Class424 var2) {
		if (var2 != null) {
			int var4 = var2.field4784;
			int var5 = Math.min(this.field5456, (int)((float)var4 * 0.9F));
			int var6 = var1.method8011(this.field5453);
			int var7 = var1.method7880(this.field5456);
			int var8 = var6 + (this.field5459 - this.field5457);
			int var9 = var4 + var7 + (this.field5454 - this.field5452);
			Class569.method10183(this.field5459, this.field5454, this.field5453 + this.field5459, this.field5454 + this.field5456);
			int var10 = this.field5458;
			int var11 = this.field5460;
			if (var10 > var11) {
				int var12 = var10;
				var10 = var11;
				var11 = var12;
			}

			Class439 var22 = var1.method7884(0, var10);
			Class439 var13 = var1.method7884(var10, var11);
			Class439 var14 = var1.method7884(var11, var1.method7936());
			Class439 var15 = var1.method7884(0, this.field5460);
			int var17;
			int var19;
			if (!var13.method8089()) {
				int var16 = var2.field4793 + var2.field4792;

				for (var17 = 0; var17 < var13.method8090(); ++var17) {
					Class422 var18 = var13.method8098(var17);
					var19 = var18.field4696 + var8;
					int var20 = var2.method8232(var18.field4693);
					int var21 = var18.field4694 + var9 - var4;
					Class569.method10138(var19, var21, var20, var16, this.field5465);
				}
			}

			if (!var22.method8089()) {
				var2.method8150(var22, var8, var9, this.field5462, this.field5461, -1);
			}

			if (!var13.method8089()) {
				var2.method8150(var13, var8, var9, this.field5463, this.field5461, -1);
			}

			if (!var14.method8089()) {
				var2.method8150(var14, var8, var9, this.field5462, this.field5461, -1);
			}

			if (this.field5455) {
				Class515 var23 = var15.method8093();
				var17 = (Integer)var23.field5155 + var8;
				int var24 = (Integer)var23.field5152 + var9;
				var19 = var24 - var5;
				Class569.method10148(var17, var24, var17, var19, this.field5462);
				if (this.field5461 != -1) {
					Class569.method10148(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field5461);
				}
			}

		}
	}
}
