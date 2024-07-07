import io.runebox.ObfInfo;

@ObfInfo(name = "hq")
public class Class199 extends Class516 {
	@ObfInfo(name = "ak", desc = "Lmo;")
	public static Class327 field2194;
	@ObfInfo(name = "au", desc = "Z")
	public boolean field2198;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 413166461)
	public int field2191;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field2188;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field2197;
	@ObfInfo(name = "av", desc = "[S")
	public short[] field2192;
	@ObfInfo(name = "aj", desc = "[S")
	public short[] field2193;
	@ObfInfo(name = "ab", desc = "[S")
	public short[] field2195;
	@ObfInfo(name = "ai", desc = "[S")
	public short[] field2196;

	static {
		field2194 = new Class327(64);
	}

	public Class199() {
		this.field2191 = -1;
		this.field2197 = new int[]{-1, -1, -1, -1, -1};
		this.field2198 = false;
	}

	@ObfInfo(name = "ad", desc = "(Lvp;I)V")
	public void method3967(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3952(var1, var3);
		}
	}

	@ObfInfo(name = "ag", desc = "(Lvp;IB)V", opaque = "-1")
	public void method3952(Class562 var1, int var2) {
		if (var2 == 1) {
			this.field2191 = var1.method9902();
		} else {
			int var4;
			int var5;
			if (var2 == 2) {
				var4 = var1.method9902();
				this.field2188 = new int[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2188[var5] = var1.method9997();
				}
			} else if (var2 == 3) {
				this.field2198 = true;
			} else if (var2 == 40) {
				var4 = var1.method9902();
				this.field2193 = new short[var4];
				this.field2192 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2193[var5] = (short)var1.method9997();
					this.field2192[var5] = (short)var1.method9997();
				}
			} else if (var2 == 41) {
				var4 = var1.method9902();
				this.field2195 = new short[var4];
				this.field2196 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2195[var5] = (short)var1.method9997();
					this.field2196[var5] = (short)var1.method9997();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.field2197[var2 - 60] = var1.method9997();
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "1360031690")
	public boolean method3956() {
		if (this.field2188 == null) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.field2188.length; ++var3) {
				if (!Client.field2189.method7134(this.field2188[var3], 0)) {
					var2 = false;
				}
			}

			return var2;
		}
	}

	@ObfInfo(name = "ap", desc = "(I)Lkr;", opaque = "-599136550")
	public Class278 method3957() {
		if (this.field2188 == null) {
			return null;
		} else {
			Class278[] var2 = new Class278[this.field2188.length];

			for (int var3 = 0; var3 < this.field2188.length; ++var3) {
				var2[var3] = Class278.method5522(Client.field2189, this.field2188[var3], 0);
			}

			Class278 var5;
			if (1 == var2.length) {
				var5 = var2[0];
			} else {
				var5 = new Class278(var2, var2.length);
			}

			int var4;
			if (this.field2193 != null) {
				for (var4 = 0; var4 < this.field2193.length; ++var4) {
					var5.method5567(this.field2193[var4], this.field2192[var4]);
				}
			}

			if (this.field2195 != null) {
				for (var4 = 0; var4 < this.field2195.length; ++var4) {
					var5.method5576(this.field2195[var4], this.field2196[var4]);
				}
			}

			return var5;
		}
	}

	@ObfInfo(name = "an", desc = "(B)Z", opaque = "1")
	public boolean method3954() {
		boolean var2 = true;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (-1 != this.field2197[var3] && !Client.field2189.method7134(this.field2197[var3], 0)) {
				var2 = false;
			}
		}

		return var2;
	}

	@ObfInfo(name = "aj", desc = "(I)Lkr;", opaque = "597415699")
	public Class278 method3953() {
		Class278[] var2 = new Class278[5];
		int var3 = 0;

		for (int var4 = 0; var4 < 5; ++var4) {
			if (this.field2197[var4] != -1) {
				var2[var3++] = Class278.method5522(Client.field2189, this.field2197[var4], 0);
			}
		}

		Class278 var6 = new Class278(var2, var3);
		int var5;
		if (this.field2193 != null) {
			for (var5 = 0; var5 < this.field2193.length; ++var5) {
				var6.method5567(this.field2193[var5], this.field2192[var5]);
			}
		}

		if (this.field2195 != null) {
			for (var5 = 0; var5 < this.field2195.length; ++var5) {
				var6.method5576(this.field2195[var5], this.field2196[var5]);
			}
		}

		return var6;
	}

	@ObfInfo(owner = "bv", name = "aq", desc = "(IB)Lhq;", opaque = "33")
	public static Class199 method866(int var0) {
		Class199 var2 = (Class199)field2194.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else if (Client.field2190 == null) {
			return null;
		} else {
			byte[] var3 = Client.field2190.method7132(3, var0);
			var2 = new Class199();
			if (var3 != null) {
				var2.method3967(new Class562(var3));
			}

			field2194.method6330(var2, (long)var0);
			return var2;
		}
	}
}
