import io.runebox.ObfInfo;

public class Class43 {
	@ObfInfo(name = "al", desc = "Lor;")
	public Class382 field304;
	@ObfInfo(name = "ak", desc = "Lor;")
	public Class382 field307;
	@ObfInfo(name = "aj", desc = "Ltx;")
	public Class518 field310;

	public Class43(Class382 var1, Class382 var2) {
		new Class518(256);
		this.field310 = new Class518(256);
		this.field307 = var1;
		this.field304 = var2;
	}

	@ObfInfo(name = "ak", desc = "(II[IB)Lbr;", opaque = "1")
	public Class44 method823(int var1, int var2, int[] var3) {
		long var5 = this.method825(var1, var2, false);
		Class63 var7 = (Class63)this.field310.method9361(var5);
		if (var7 != null) {
			return var7.method1115();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			Class42 var8 = Class42.method820(this.field307, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				Class44 var9 = var8.method808();
				this.field310.method9360(new Class63(var9), var5);
				if (var3 != null) {
					var3[0] -= var9.field314.length;
				}

				return var9;
			}
		}
	}

	@ObfInfo(name = "al", desc = "(III)Lck;", opaque = "506101823")
	public Class63 method833(int var1, int var2) {
		long var4 = this.method825(var1, var2, true);
		Class63 var6 = (Class63)this.field310.method9361(var4);
		if (var6 != null) {
			return var6;
		} else {
			Class66 var7 = Class66.method1818(this.field304, var1, var2);
			if (var7 == null) {
				return new Class63();
			} else {
				Class63 var8 = new Class63(var7);
				this.field310.method9360(var8, var4);
				return var8;
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(I[IB)Lbr;", opaque = "-1")
	public Class44 method842(int var1, int[] var2) {
		if (this.field307.method7228() == 1) {
			return this.method823(0, var1, var2);
		} else if (this.field307.method7237(var1) == 1) {
			return this.method823(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "az", desc = "(IB)Lck;", opaque = "-1")
	public Class63 method826(int var1) {
		if (this.field304.method7228() == 1) {
			return this.method833(0, var1);
		} else if (this.field304.method7237(var1) == 1) {
			return this.method833(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "af", desc = "(II)Lbr;")
	public Class44 method839(int var1) {
		return this.method842(var1, (int[])null);
	}

	@ObfInfo(name = "aa", desc = "(IIZI)J", opaque = "-826539165")
	public long method825(int var1, int var2, boolean var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var5 |= var1 << 16;
		return var3 ? (long)var5 ^ 4294967296L : (long)var5;
	}
}
