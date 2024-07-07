import io.runebox.ObfInfo;

@ObfInfo(name = "vy")
public class Class570 {
	@ObfInfo(name = "ao", desc = "Z")
	public boolean field5487;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -56042371)
	public int field5486;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1299554851)
	public int field5488;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1870799425)
	public int field5489;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -143017937)
	public int field5490;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -795160307)
	public int field5491;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 500348423)
	public int field5492;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 203814195)
	public int field5493;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1818663149)
	public int field5494;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -474419009)
	public int field5495;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1784964957)
	public int field5496;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1357965749)
	public int field5497;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -531279993)
	public int field5498;

	public Class570() {
		this.field5492 = 0;
		this.field5496 = 0;
	}

	@ObfInfo(name = "ak", desc = "(IIIIIIIIZI)V")
	public void method10306(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5486 = var1;
		this.field5495 = var2;
		this.field5488 = var3;
		this.field5489 = var4;
		this.field5493 = var5;
		this.field5491 = var6;
		this.field5492 = var7;
		this.field5496 = var8;
		this.field5487 = var9;
	}

	@ObfInfo(name = "al", desc = "(IIIII)V")
	public void method10299(int var1, int var2, int var3, int var4) {
		this.field5494 = var1;
		this.field5490 = var2;
		this.field5497 = var3;
		this.field5498 = var4;
	}

	@ObfInfo(name = "aj", desc = "(Lqw;Lqb;B)V", opaque = "2")
	public void method10301(Class439 var1, Class418 var2) {
		if (var2 != null) {
			int var4 = var2.field4730;
			int var5 = Math.min(this.field5489, (int)((float)var4 * 0.9F));
			int var6 = var1.method8152(this.field5488);
			int var7 = var1.method8153(this.field5489);
			int var8 = var6 + (this.field5486 - this.field5493);
			int var9 = var4 + var7 + (this.field5495 - this.field5491);
			Class561.method10144(this.field5486, this.field5495, this.field5486 + this.field5488, this.field5495 + this.field5489);
			int var10 = this.field5496;
			int var11 = this.field5492;
			if (var10 > var11) {
				int var12 = var10;
				var10 = var11;
				var11 = var12;
			}

			Class438 var22 = var1.method8133(0, var10);
			Class438 var13 = var1.method8133(var10, var11);
			Class438 var14 = var1.method8133(var11, var1.method8175());
			Class438 var15 = var1.method8133(0, this.field5492);
			int var17;
			int var19;
			if (!var13.method8101()) {
				int var16 = var2.field4732 + var2.field4734;

				for (var17 = 0; var17 < var13.method8102(); ++var17) {
					Class431 var18 = var13.method8106(var17);
					var19 = var8 + var18.field4709;
					int var20 = var2.method7987(var18.field4708);
					int var21 = var9 + var18.field4710 - var4;
					Class561.method10152(var19, var21, var20, var16, this.field5498);
				}
			}

			if (!var22.method8101()) {
				var2.method7999(var22, var8, var9, this.field5494, this.field5490, -1);
			}

			if (!var13.method8101()) {
				var2.method7999(var13, var8, var9, this.field5497, this.field5490, -1);
			}

			if (!var14.method8101()) {
				var2.method7999(var14, var8, var9, this.field5494, this.field5490, -1);
			}

			if (this.field5487) {
				Class509 var23 = var15.method8105();
				var17 = (Integer)var23.field5176 + var8;
				int var24 = (Integer)var23.field5175 + var9;
				var19 = var24 - var5;
				Class561.method10220(var17, var24, var17, var19, this.field5494);
				if (-1 != this.field5490) {
					Class561.method10220(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field5490);
				}
			}

		}
	}
}
