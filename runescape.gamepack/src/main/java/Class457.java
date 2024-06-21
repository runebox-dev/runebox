import io.runebox.ObfInfo;

@ObfInfo(name = "ro")
public class Class457 extends Class479 {
	@ObfInfo(name = "aa", desc = "B")
	public byte field4860;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 1584426961)
	public int field4861;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1512347247)
	public int field4862;
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	public String field4855;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field4858;
	@ObfInfo(name = "aj", desc = "Lrn;")
	public final Class456 field4857;
	@ObfInfo(name = "al", desc = "Lux;")
	public final Class544 field4856;

	public Class457(Class544 var1, Class456 var2) {
		super(500);
		this.field4858 = null;
		this.field4855 = null;
		this.field4862 = 1;
		this.field4856 = var1;
		this.field4857 = var2;
	}

	@ObfInfo(name = "ak", desc = "(B)Lsg;")
	public Class475 method8483() {
		return new Class482();
	}

	@ObfInfo(name = "al", desc = "(II)[Lsg;")
	public Class475[] method8457(int var1) {
		return new Class482[var1];
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;I)V", opaque = "-185368692")
	public final void method8458(String var1) {
		long var6 = 0L;
		int var8 = var1.length();

		for (int var9 = 0; var9 < var8; ++var9) {
			var6 *= 37L;
			char var10 = var1.charAt(var9);
			if (var10 >= 'A' && var10 <= 'Z') {
				var6 += (long)(var10 + 1 - 65);
			} else if (var10 >= 'a' && var10 <= 'z') {
				var6 += (long)(var10 + 1 - 97);
			} else if (var10 >= '0' && var10 <= '9') {
				var6 += (long)(var10 + 27 - 48);
			}

			if (var6 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var6 % 37L && 0L != var6) {
			var6 /= 37L;
		}

		String var11 = Class422.method3324(var6);
		if (var11 == null) {
			var11 = "";
		}

		this.field4858 = var11;
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;S)V", opaque = "16383")
	public final void method8459(String var1) {
		long var6 = 0L;
		int var8 = var1.length();

		for (int var9 = 0; var9 < var8; ++var9) {
			var6 *= 37L;
			char var10 = var1.charAt(var9);
			if (var10 >= 'A' && var10 <= 'Z') {
				var6 += (long)(var10 + 1 - 65);
			} else if (var10 >= 'a' && var10 <= 'z') {
				var6 += (long)(var10 + 1 - 97);
			} else if (var10 >= '0' && var10 <= '9') {
				var6 += (long)(var10 + 27 - 48);
			}

			if (var6 >= 177917621779460413L) {
				break;
			}
		}

		while (var6 % 37L == 0L && 0L != var6) {
			var6 /= 37L;
		}

		String var11 = Class422.method3324(var6);
		if (var11 == null) {
			var11 = "";
		}

		this.field4855 = var11;
	}

	@ObfInfo(name = "ah", desc = "(Lua;II)V", opaque = "755505003")
	public final void method8460(Class521 var1, int var2) {
		this.method8459(var1.method9415());
		long var4 = var1.method9411();
		long var7 = var4;
		String var6;
		int var9;
		if (var4 > 0L && var4 < 6582952005840035281L) {
			if (var4 % 37L == 0L) {
				var6 = null;
			} else {
				var9 = 0;

				for (long var10 = var4; 0L != var10; var10 /= 37L) {
					++var9;
				}

				StringBuilder var12 = new StringBuilder(var9);

				while (0L != var7) {
					long var13 = var7;
					var7 /= 37L;
					var12.append(Class422.field4681[(int)(var13 - 37L * var7)]);
				}

				var6 = var12.reverse().toString();
			}
		} else {
			var6 = null;
		}

		this.method8458(var6);
		this.field4860 = var1.method9406();
		short var15;
		if (var2 == 1) {
			var9 = var1.method9405();
			var15 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var9 = var1.method9420();
			var15 = -1;
		}

		if (var15 != var9) {
			this.method8730();

			for (int var16 = 0; var16 < var9; ++var16) {
				Class482 var17 = (Class482)this.method8811(new Class567(var1.method9415(), this.field4856));
				int var14 = var1.method9407();
				var17.method8862(var14, ++this.field4862 - 1);
				var17.field4961 = var1.method9406();
				var1.method9415();
				this.method8464(var17);
			}

		}
	}

	@ObfInfo(name = "av", desc = "(Lua;I)V", opaque = "1485188490")
	public final void method8461(Class521 var1) {
		Class567 var3 = new Class567(var1.method9415(), this.field4856);
		int var4 = var1.method9407();
		byte var5 = var1.method9406();
		boolean var6 = false;
		if (var5 == -128) {
			var6 = true;
		}

		Class482 var7;
		if (var6) {
			if (this.method8761() == 0) {
				return;
			}

			var7 = (Class482)this.method8735(var3);
			if (var7 != null && var7.method8867() == var4) {
				this.method8801(var7);
			}
		} else {
			var1.method9415();
			var7 = (Class482)this.method8735(var3);
			if (var7 == null) {
				if (this.method8761() > super.field4951) {
					return;
				}

				var7 = (Class482)this.method8811(var3);
			}

			var7.method8862(var4, ++this.field4862 - 1);
			var7.field4961 = var5;
			this.method8464(var7);
		}

	}

	@ObfInfo(name = "aq", desc = "(I)V", opaque = "888196496")
	public final void method8478() {
		for (int var2 = 0; var2 < this.method8761(); ++var2) {
			((Class482)this.method8781(var2)).method8839();
		}

	}

	@ObfInfo(name = "ap", desc = "(B)V", opaque = "0")
	public final void method8479() {
		for (int var2 = 0; var2 < this.method8761(); ++var2) {
			((Class482)this.method8781(var2)).method8842();
		}

	}

	@ObfInfo(name = "ae", desc = "(Lsn;B)V", opaque = "9")
	public final void method8464(Class482 var1) {
		if (var1.method8703().equals(this.field4857.method1226())) {
			this.field4861 = var1.field4961;
		}

	}
}
