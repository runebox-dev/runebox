import io.runebox.ObfInfo;

@ObfInfo(name = "rm")
public class Class455 extends Class471 {
	@ObfInfo(name = "an", desc = "B")
	public byte field4882;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -2048302067)
	public int field4880;
	@ObfInfo(name = "av", desc = "I", intMultiplier = 380981587)
	public int field4884;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public String field4881;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field4883;
	@ObfInfo(name = "ag", desc = "Lrv;")
	public final Class464 field4877;
	@ObfInfo(name = "ad", desc = "Luu;")
	public final Class541 field4878;

	public Class455(Class541 var1, Class464 var2) {
		super(500);
		this.field4883 = null;
		this.field4881 = null;
		this.field4884 = 1;
		this.field4878 = var1;
		this.field4877 = var2;
	}

	@ObfInfo(name = "aq", desc = "(B)Lsk;")
	public Class479 method8342() {
		return new Class472();
	}

	@ObfInfo(name = "ad", desc = "(II)[Lsk;")
	public Class479[] method8343(int var1) {
		return new Class472[var1];
	}

	@ObfInfo(name = "ag", desc = "(Ljava/lang/String;B)V")
	public final void method8355(String var1) {
		this.field4883 = Class426.method3995(var1);
	}

	@ObfInfo(name = "ab", desc = "(Ljava/lang/String;B)V")
	public final void method8356(String var1) {
		this.field4881 = Class426.method3995(var1);
	}

	@ObfInfo(name = "ai", desc = "(Lvp;IB)V", opaque = "1")
	public final void method8358(Class562 var1, int var2) {
		this.method8356(var1.method9837());
		long var4 = var1.method9833();
		long var7 = var4;
		String var6;
		int var9;
		if (var4 > 0L && var4 < 6582952005840035281L) {
			if (var4 % 37L == 0L) {
				var6 = null;
			} else {
				var9 = 0;

				for (long var10 = var4; var10 != 0L; var10 /= 37L) {
					++var9;
				}

				StringBuilder var12 = new StringBuilder(var9);

				while (var7 != 0L) {
					long var13 = var7;
					var7 /= 37L;
					var12.append(Class426.field4711[(int)(var13 - var7 * 37L)]);
				}

				var6 = var12.reverse().toString();
			}
		} else {
			var6 = null;
		}

		this.method8355(var6);
		this.field4882 = var1.method9955();
		short var15;
		if (var2 == 1) {
			var9 = var1.method9902();
			var15 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var9 = var1.method9843();
			var15 = -1;
		}

		if (var9 != var15) {
			this.method8552();

			for (int var16 = 0; var16 < var9; ++var16) {
				Class472 var17 = (Class472)this.method8593(new Class561(var1.method9837(), this.field4878));
				int var14 = var1.method9997();
				var17.method8677(var14, ++this.field4884 - 1);
				var17.field4969 = var1.method9955();
				var1.method9837();
				this.method8362(var17);
			}

		}
	}

	@ObfInfo(name = "ae", desc = "(Lvp;I)V", opaque = "-804506784")
	public final void method8359(Class562 var1) {
		Class561 var3 = new Class561(var1.method9837(), this.field4878);
		int var4 = var1.method9997();
		byte var5 = var1.method9955();
		boolean var6 = false;
		if (var5 == -128) {
			var6 = true;
		}

		Class472 var7;
		if (var6) {
			if (this.method8582() == 0) {
				return;
			}

			var7 = (Class472)this.method8578(var3);
			if (var7 != null && var7.method8682() == var4) {
				this.method8560(var7);
			}
		} else {
			var1.method9837();
			var7 = (Class472)this.method8578(var3);
			if (var7 == null) {
				if (this.method8582() > super.field4955) {
					return;
				}

				var7 = (Class472)this.method8593(var3);
			}

			var7.method8677(var4, ++this.field4884 - 1);
			var7.field4969 = var5;
			this.method8362(var7);
		}

	}

	@ObfInfo(name = "au", desc = "(B)V", opaque = "6")
	public final void method8360() {
		for (int var2 = 0; var2 < this.method8582(); ++var2) {
			((Class472)this.method8563(var2)).method8621();
		}

	}

	@ObfInfo(name = "ah", desc = "(B)V", opaque = "101")
	public final void method8370() {
		for (int var2 = 0; var2 < this.method8582(); ++var2) {
			((Class472)this.method8563(var2)).method8637();
		}

	}

	@ObfInfo(name = "az", desc = "(Lsd;I)V", opaque = "1139714414")
	public final void method8362(Class472 var1) {
		if (var1.method8693().equals(this.field4877.method1354())) {
			this.field4880 = var1.field4969;
		}

	}
}
