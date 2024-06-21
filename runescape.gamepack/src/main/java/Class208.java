import io.runebox.ObfInfo;

public class Class208 extends Class507 {
	@ObfInfo(name = "al", desc = "Llm;")
	public static Class299 field2101;
	@ObfInfo(name = "aj", desc = "C")
	public char field2100;
	@ObfInfo(name = "az", desc = "C")
	public char field2103;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 632326171)
	public int field2104;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 779903189)
	public int field2105;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field2106;
	@ObfInfo(name = "ac", desc = "[I")
	public int[] field2107;
	@ObfInfo(name = "af", desc = "Ljava/lang/String;")
	public String field2099;
	@ObfInfo(name = "ao", desc = "[Ljava/lang/String;")
	public String[] field2108;

	static {
		field2101 = new Class299(64);
	}

	public Class208() {
		this.field2099 = Class378.field4152;
		this.field2105 = 0;
	}

	@ObfInfo(name = "al", desc = "(Lua;S)V")
	public void method3972(Class521 var1) {
		while (true) {
			int var3 = var1.method9405();
			if (var3 == 0) {
				return;
			}

			this.method3964(var1, var3);
		}
	}

	@ObfInfo(name = "aj", desc = "(Lua;II)V", opaque = "1305902892")
	public void method3964(Class521 var1, int var2) {
		if (var2 == 1) {
			this.field2100 = (char)var1.method9405();
		} else if (var2 == 2) {
			this.field2103 = (char)var1.method9405();
		} else if (var2 == 3) {
			this.field2099 = var1.method9415();
		} else if (var2 == 4) {
			this.field2104 = var1.method9410();
		} else {
			int var4;
			if (var2 == 5) {
				this.field2105 = var1.method9407();
				this.field2106 = new int[this.field2105];
				this.field2108 = new String[this.field2105];

				for (var4 = 0; var4 < this.field2105; ++var4) {
					this.field2106[var4] = var1.method9410();
					this.field2108[var4] = var1.method9415();
				}
			} else if (var2 == 6) {
				this.field2105 = var1.method9407();
				this.field2106 = new int[this.field2105];
				this.field2107 = new int[this.field2105];

				for (var4 = 0; var4 < this.field2105; ++var4) {
					this.field2106[var4] = var1.method9410();
					this.field2107[var4] = var1.method9410();
				}
			}
		}

	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method3965() {
		return this.field2105;
	}

	@ObfInfo(owner = "an", name = "ak", desc = "(II)Lhz;", opaque = "-426729511")
	public static Class208 method170(int var0) {
		Class208 var2 = (Class208)field2101.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Client.field2102.method7216(8, var0);
			var2 = new Class208();
			if (var3 != null) {
				var2.method3972(new Class521(var3));
			}

			field2101.method5987(var2, (long)var0);
			return var2;
		}
	}
}
