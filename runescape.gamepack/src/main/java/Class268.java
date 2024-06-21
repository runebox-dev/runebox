import io.runebox.ObfInfo;

@ObfInfo(name = "kh")
public class Class268 implements Class298 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1548514205)
	public int field2972;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1720094217)
	public int field2973;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 943478777)
	public int field2974;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 377124275)
	public int field2975;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -267670147)
	public int field2976;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1042513445)
	public int field2977;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1353748853)
	public int field2978;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1779465705)
	public int field2979;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -744624811)
	public int field2981;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 183984075)
	public int field2984;

	@ObfInfo(name = "ak", desc = "(Lkz;I)V", opaque = "795611668")
	public void method5354(Class286 var1) {
		if (var1.field3135 > this.field2976) {
			var1.field3135 = this.field2976;
		}

		if (var1.field3136 < this.field2976) {
			var1.field3136 = this.field2976;
		}

		if (var1.field3134 > this.field2977) {
			var1.field3134 = this.field2977;
		}

		if (var1.field3129 < this.field2977) {
			var1.field3129 = this.field2977;
		}

	}

	@ObfInfo(name = "al", desc = "(IIII)Z", opaque = "-1194566834")
	public boolean method5327(int var1, int var2, int var3) {
		if (var1 >= this.field2973 && var1 < this.field2973 + this.field2978) {
			return var2 >= (this.field2974 << 3) + (this.field2975 << 6) && var2 <= 7 + (this.field2975 << 6) + (this.field2974 << 3) && var3 >= (this.field2979 << 3) + (this.field2972 << 6) && var3 <= (this.field2972 << 6) + (this.field2979 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "aj", desc = "(III)Z", opaque = "1114654110")
	public boolean method5348(int var1, int var2) {
		return var1 >= (this.field2976 << 6) + (this.field2984 << 3) && var1 <= (this.field2984 << 3) + (this.field2976 << 6) + 7 && var2 >= (this.field2981 << 3) + (this.field2977 << 6) && var2 <= (this.field2981 << 3) + (this.field2977 << 6) + 7;
	}

	@ObfInfo(name = "az", desc = "(IIII)[I")
	public int[] method5329(int var1, int var2, int var3) {
		if (!this.method5327(var1, var2, var3)) {
			return null;
		} else {
			int[] var5 = new int[]{var2 + (this.field2976 * 64 - this.field2975 * 64) + (this.field2984 * 8 - this.field2974 * 8), var3 + (this.field2977 * 64 - this.field2972 * 64) + (this.field2981 * 8 - this.field2979 * 8)};
			return var5;
		}
	}

	@ObfInfo(name = "af", desc = "(III)Lnj;", opaque = "-2116954761")
	public Class348 method5330(int var1, int var2) {
		if (!this.method5348(var1, var2)) {
			return null;
		} else {
			int var4 = this.field2975 * 64 - this.field2976 * 64 + var1 + (this.field2974 * 8 - this.field2984 * 8);
			int var5 = this.field2979 * 8 - this.field2981 * 8 + this.field2972 * 64 - this.field2977 * 64 + var2;
			return new Class348(this.field2973, var4, var5);
		}
	}

	@ObfInfo(name = "aa", desc = "(Lua;B)V")
	public void method5349(Class521 var1) {
		this.field2973 = var1.method9405();
		this.field2978 = var1.method9405();
		this.field2975 = var1.method9407();
		this.field2974 = var1.method9405();
		this.field2972 = var1.method9407();
		this.field2979 = var1.method9405();
		this.field2976 = var1.method9407();
		this.field2984 = var1.method9405();
		this.field2977 = var1.method9407();
		this.field2981 = var1.method9405();
		this.method5332();
	}

	@ObfInfo(name = "at", desc = "(I)V")
	public void method5332() {
	}

	@ObfInfo(name = "id", desc = "(IB)I")
	public static int method5356(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
