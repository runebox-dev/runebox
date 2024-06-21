import io.runebox.ObfInfo;

@ObfInfo(name = "je")
public class Class239 {
	@ObfInfo(desc = "LClass382;")
	public static Class382 field2088;
	@ObfInfo(name = "al", desc = "[Lfh;")
	public Class138[] field2580;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -2019764053)
	public int field2582;

	public Class239(Class521 var1, int var2) {
		this.field2580 = new Class138[var2];
		this.field2582 = var1.method9405();

		for (int var3 = 0; var3 < this.field2580.length; ++var3) {
			Class138 var4 = new Class138(this.field2582, var1, false);
			this.field2580[var3] = var4;
		}

		this.method4639();
	}

	@ObfInfo(name = "ak", desc = "(I)V", opaque = "-16711937")
	public void method4639() {
		Class138[] var2 = this.field2580;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class138 var4 = var2[var3];
			if (var4.field1584 >= 0) {
				var4.field1585 = this.field2580[var4.field1584];
			}
		}

	}

	@ObfInfo(name = "al", desc = "(B)I")
	public int method4640() {
		return this.field2580.length;
	}

	@ObfInfo(name = "aj", desc = "(II)Lfh;", opaque = "-672411917")
	public Class138 method4641(int var1) {
		return var1 >= this.method4640() ? null : this.field2580[var1];
	}

	@ObfInfo(name = "az", desc = "(I)[Lfh;")
	public Class138[] method4660() {
		return this.field2580;
	}

	@ObfInfo(name = "af", desc = "(Lfo;II)V")
	public void method4638(Class145 var1, int var2) {
		this.method4642(var1, var2, (boolean[])null, false);
	}

	@ObfInfo(name = "aa", desc = "(Lfo;I[ZZI)V", opaque = "88109315")
	public void method4642(Class145 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method3191();
		int var7 = 0;
		Class138[] var8 = this.method4660();

		for (int var9 = 0; var9 < var8.length; ++var9) {
			Class138 var10 = var8[var9];
			if (var3 == null || var3[var7] == var4) {
				var1.method3193(var2, var10, var7, var6);
			}

			++var7;
		}

	}

	@ObfInfo(name = "al", desc = "(II)Lhw;", opaque = "-1459518751")
	public static Class205 method4659(int var0) {
		Class205 var2 = (Class205)Class205.field2084.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2088.method7216(16, var0);
			var2 = new Class205();
			if (var3 != null) {
				var2.method3942(new Class521(var3));
			}

			Class205.field2084.method5987(var2, (long)var0);
			return var2;
		}
	}
}
