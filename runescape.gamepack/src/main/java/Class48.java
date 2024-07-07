import io.runebox.ObfInfo;

@ObfInfo(name = "bv")
public class Class48 {
	@ObfInfo(name = "ax", desc = "Lbk;")
	public Class37 field296;
	@ObfInfo(name = "ba", desc = "[Lbk;")
	public Class37[] field302;
	@ObfInfo(name = "bg", desc = "[Lbk;")
	public Class37[] field307;
	@ObfInfo(name = "ar", desc = "Z")
	public boolean field312;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1310725203)
	public int field297;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -1554328633)
	public int field299;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1832230557)
	public int field300;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -945699819)
	public int field301;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 1128975809)
	public int field303;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -31211881)
	public int field304;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -613062825)
	public int field305;
	@ObfInfo(name = "bi", desc = "I", intMultiplier = 494305069)
	public int field309;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field295;
	@ObfInfo(name = "am", desc = "J", longMultiplier = -4744642679061521139L)
	public long field294;
	@ObfInfo(name = "al", desc = "J", longMultiplier = -6736315824041076637L)
	public long field310;
	@ObfInfo(name = "as", desc = "J", longMultiplier = 4914575348622821863L)
	public long field311;

	public Class48() {
		this.field297 = 32;
		this.field310 = Class329.method4953();
		this.field311 = 0L;
		this.field303 = 0;
		this.field304 = 0;
		this.field305 = 0;
		this.field294 = 0L;
		this.field312 = true;
		this.field309 = 0;
		this.field302 = new Class37[8];
		this.field307 = new Class37[8];
	}

	@ObfInfo(name = "bj", desc = "(Lbk;I)V")
	public final synchronized void method857(Class37 var1) {
		this.field296 = var1;
	}

	@ObfInfo(name = "be", desc = "(I)V", opaque = "2002958200")
	public final synchronized void method806() {
		if (this.field295 != null) {
			long var2 = Class329.method4953();

			try {
				if (0L != this.field311) {
					if (var2 < this.field311) {
						return;
					}

					this.method169(this.field299);
					this.field311 = 0L;
					this.field312 = true;
				}

				int var4 = this.method156();
				if (this.field305 - var4 > this.field303) {
					this.field303 = this.field305 - var4;
				}

				int var5 = this.field300 + this.field301;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > this.field299) {
					this.field299 += 1024;
					if (this.field299 > 16384) {
						this.field299 = 16384;
					}

					this.method155();
					this.method169(this.field299);
					var4 = 0;
					this.field312 = true;
					if (var5 + 256 > this.field299) {
						var5 = this.field299 - 256;
						this.field301 = var5 - this.field300;
					}
				}

				while (var4 < var5) {
					this.method811(this.field295, 256);
					this.method157();
					var4 += 256;
				}

				if (var2 > this.field294) {
					if (!this.field312) {
						if (0 == this.field303 && this.field304 == 0) {
							this.method155();
							this.field311 = 2000L + var2;
							return;
						}

						this.field301 = Math.min(this.field304, this.field303);
						this.field304 = this.field303;
					} else {
						this.field312 = false;
					}

					this.field303 = 0;
					this.field294 = var2 + 2000L;
				}

				this.field305 = var4;
			} catch (Exception var7) {
				this.method155();
				this.field311 = 2000L + var2;
			}

			try {
				if (var2 > this.field310 + 500000L) {
					var2 = this.field310;
				}

				while (var2 > 5000L + this.field310) {
					this.method810(256);
					this.field310 += (long)(256000 / Client.field293);
				}
			} catch (Exception var6) {
				this.field310 = var2;
			}

		}
	}

	@ObfInfo(name = "bm", desc = "(I)V")
	public final void method851() {
		this.field312 = true;
	}

	@ObfInfo(name = "bo", desc = "(I)V")
	public final synchronized void method836() {
		this.field312 = true;

		try {
			this.method159();
		} catch (Exception var3) {
			this.method155();
			this.field311 = Class329.method4953() + 2000L;
		}

	}

	@ObfInfo(name = "bi", desc = "(I)V", opaque = "934513647")
	public final synchronized void method809() {
		if (Client.field291 != null) {
			boolean var2 = true;

			for (int var3 = 0; var3 < 2; ++var3) {
				if (this == Client.field291.field203[var3]) {
					Client.field291.field203[var3] = null;
				}

				if (null != Client.field291.field203[var3]) {
					var2 = false;
				}
			}

			if (var2) {
				Client.field298.shutdownNow();
				Client.field298 = null;
				Client.field291 = null;
			}
		}

		this.method155();
		this.field295 = null;
	}

	@ObfInfo(name = "ba", desc = "(II)V", opaque = "138550330")
	public final void method810(int var1) {
		this.field309 -= var1;
		if (this.field309 < 0) {
			this.field309 = 0;
		}

		if (this.field296 != null) {
			this.field296.method542(var1);
		}

	}

	@ObfInfo(name = "bg", desc = "([II)V")
	public final void method811(int[] var1, int var2) {
		int var3 = var2;
		if (Client.field1012) {
			var3 = var2 << 1;
		}

		Class458.method8428(var1, 0, var3);
		this.field309 -= var2;
		if (this.field296 != null && this.field309 <= 0) {
			this.field309 += Client.field293 >> 4;
			method577(this.field296);
			this.method812(this.field296, this.field296.method526());
			int var4 = 0;
			int var5 = 255;

			int var6;
			Class37 var10;
			label116:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						Class37 var11 = this.field302[var7];

						label110:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label110;
								}

								Class72 var12 = var11.field197;
								if (var12 != null && var12.field882 > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.field196;
								} else {
									var11.field194 = true;
									int var13 = var11.method529();
									var4 += var13;
									if (var12 != null) {
										var12.field882 += var13;
									}

									if (var4 >= this.field297) {
										break label116;
									}

									Class37 var14 = var11.method546();
									if (var14 != null) {
										for (int var15 = var11.field195; var14 != null; var14 = var11.method525()) {
											this.method812(var14, var14.method526() * var15 >> 8);
										}
									}

									Class37 var18 = var11.field196;
									var11.field196 = null;
									if (var10 == null) {
										this.field302[var7] = var18;
									} else {
										var10.field196 = var18;
									}

									if (var18 == null) {
										this.field307[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				Class37 var16 = this.field302[var6];
				Class37[] var17 = this.field302;
				this.field307[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.field196;
					var16.field196 = null;
				}
			}
		}

		if (this.field309 < 0) {
			this.field309 = 0;
		}

		if (this.field296 != null) {
			this.field296.method531(var1, 0, var2);
		}

		this.field310 = Class329.method4953();
	}

	@ObfInfo(name = "bp", desc = "(Lbk;II)V", opaque = "-996576288")
	public final void method812(Class37 var1, int var2) {
		int var4 = var2 >> 5;
		Class37 var5 = this.field307[var4];
		if (var5 == null) {
			this.field302[var4] = var1;
		} else {
			var5.field196 = var1;
		}

		this.field307[var4] = var1;
		var1.field195 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public void method154() throws Exception {
	}

	@ObfInfo(name = "ad", desc = "(IB)V")
	public void method169(int var1) throws Exception {
	}

	@ObfInfo(name = "ag", desc = "(B)I")
	public int method156() throws Exception {
		return this.field299;
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method157() throws Exception {
	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public void method155() {
	}

	@ObfInfo(name = "an", desc = "(B)V")
	public void method159() throws Exception {
	}

	@ObfInfo(owner = "hp", name = "bt", desc = "(IZII)V", opaque = "1619205880")
	public static void method3951(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			Client.field293 = var0;
			Client.field1012 = var1;
			Client.field4521 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(owner = "bo", name = "bs", desc = "(Lbk;I)V", opaque = "1489005224")
	public static void method577(Class37 var0) {
		var0.field194 = false;
		if (var0.field197 != null) {
			var0.field197.field882 = 0;
		}

		for (Class37 var2 = var0.method546(); var2 != null; var2 = var0.method525()) {
			method577(var2);
		}

	}
}
