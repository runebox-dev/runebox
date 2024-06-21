import io.runebox.ObfInfo;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Class30 {
	@ObfInfo(owner = "ao", name = "ao", desc = "Lbm;")
	public static Class39 field80;
	@ObfInfo(owner = "ci", name = "aq", desc = "Lby;")
	public static Class51 field450;
	@ObfInfo(owner = "ig", name = "ab", desc = "Ljava/util/concurrent/ScheduledExecutorService;")
	public static ScheduledExecutorService field2176;
	@ObfInfo(name = "ae", desc = "Lba;")
	public Class27 field156;
	@ObfInfo(name = "bw", desc = "[Lba;")
	public Class27[] field171;
	@ObfInfo(name = "bl", desc = "[Lba;")
	public Class27[] field174;
	@ObfInfo(name = "ag", desc = "Z")
	public boolean field162;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -927893663)
	public int field157;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 779817765)
	public int field160;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -63177569)
	public int field161;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1635881985)
	public int field163;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -117889257)
	public int field164;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 317305953)
	public int field165;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -781092137)
	public int field167;
	@ObfInfo(name = "bn", desc = "I", intMultiplier = -1098020825)
	public int field169;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field159;
	@ObfInfo(name = "ad", desc = "J", longMultiplier = 3619051364314954007L)
	public long field158;
	@ObfInfo(name = "ar", desc = "J", longMultiplier = 3397901339844606541L)
	public long field166;
	@ObfInfo(name = "ay", desc = "J", longMultiplier = -6124916407686776029L)
	public long field173;

	public Class30() {
		this.field157 = 32;
		this.field173 = Class130.method3047();
		this.field158 = 0L;
		this.field163 = 0;
		this.field164 = 0;
		this.field165 = 0;
		this.field166 = 0L;
		this.field162 = true;
		this.field169 = 0;
		this.field171 = new Class27[8];
		this.field174 = new Class27[8];
	}

	@ObfInfo(name = "bo", desc = "(Lba;I)V")
	public final synchronized void method401(Class27 var1) {
		this.field156 = var1;
	}

	@ObfInfo(name = "bi", desc = "(I)V", opaque = "507705628")
	public final synchronized void method449() {
		if (this.field159 != null) {
			long var2 = Class130.method3047();

			try {
				if (this.field158 != 0L) {
					if (var2 < this.field158) {
						return;
					}

					this.method250(this.field167);
					this.field158 = 0L;
					this.field162 = true;
				}

				int var4 = this.method262();
				if (this.field165 - var4 > this.field163) {
					this.field163 = this.field165 - var4;
				}

				int var5 = this.field161 + this.field160;
				if (var5 + 256 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > this.field167) {
					this.field167 += 1024;
					if (this.field167 > 16384) {
						this.field167 = 16384;
					}

					this.method253();
					this.method250(this.field167);
					var4 = 0;
					this.field162 = true;
					if (var5 + 256 > this.field167) {
						var5 = this.field167 - 256;
						this.field161 = var5 - this.field160;
					}
				}

				while (var4 < var5) {
					this.method435(this.field159, 256);
					this.method252();
					var4 += 256;
				}

				if (var2 > this.field166) {
					if (!this.field162) {
						if (this.field163 == 0 && this.field164 == 0) {
							this.method253();
							this.field158 = var2 + 2000L;
							return;
						}

						this.field161 = Math.min(this.field164, this.field163);
						this.field164 = this.field163;
					} else {
						this.field162 = false;
					}

					this.field163 = 0;
					this.field166 = var2 + 2000L;
				}

				this.field165 = var4;
			} catch (Exception var7) {
				this.method253();
				this.field158 = var2 + 2000L;
			}

			try {
				if (var2 > 500000L + this.field173) {
					var2 = this.field173;
				}

				while (var2 > this.field173 + 5000L) {
					this.method406(256);
					this.field173 += (long)(256000 / Client.field1382);
				}
			} catch (Exception var6) {
				this.field173 = var2;
			}

		}
	}

	@ObfInfo(name = "bt", desc = "(I)V")
	public final void method403() {
		this.field162 = true;
	}

	@ObfInfo(name = "bn", desc = "(I)V")
	public final synchronized void method432() {
		this.field162 = true;

		try {
			this.method254();
		} catch (Exception var3) {
			this.method253();
			this.field158 = Class130.method3047() + 2000L;
		}

	}

	@ObfInfo(name = "bw", desc = "(B)V", opaque = "1")
	public final synchronized void method405() {
		if (field80 != null) {
			boolean var2 = true;

			for (int var3 = 0; var3 < 2; ++var3) {
				if (this == field80.field276[var3]) {
					field80.field276[var3] = null;
				}

				if (field80.field276[var3] != null) {
					var2 = false;
				}
			}

			if (var2) {
				field2176.shutdownNow();
				field2176 = null;
				field80 = null;
			}
		}

		this.method253();
		this.field159 = null;
	}

	@ObfInfo(name = "bl", desc = "(II)V", opaque = "-1437166246")
	public final void method406(int var1) {
		this.field169 -= var1;
		if (this.field169 < 0) {
			this.field169 = 0;
		}

		if (this.field156 != null) {
			this.field156.method395(var1);
		}

	}

	@ObfInfo(name = "be", desc = "([II)V")
	public final void method435(int[] var1, int var2) {
		int var3 = var2;
		if (Client.field1887) {
			var3 = var2 << 1;
		}

		Class445.method8335(var1, 0, var3);
		this.field169 -= var2;
		if (this.field156 != null && this.field169 <= 0) {
			this.field169 += Client.field1382 >> 4;
			method2181(this.field156);
			this.method408(this.field156, this.field156.method377());
			int var4 = 0;
			int var5 = 255;

			int var6;
			Class27 var10;
			label114:
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
					if (0 != (var9 & 1)) {
						var5 &= ~(1 << var7);
						var10 = null;
						Class27 var11 = this.field171[var7];

						label108:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label108;
								}

								Class54 var12 = var11.field138;
								if (var12 != null && var12.field390 > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.field139;
								} else {
									var11.field136 = true;
									int var13 = var11.method380();
									var4 += var13;
									if (var12 != null) {
										var12.field390 += var13;
									}

									if (var4 >= this.field157) {
										break label114;
									}

									Class27 var14 = var11.method384();
									if (var14 != null) {
										for (int var15 = var11.field137; var14 != null; var14 = var11.method379()) {
											this.method408(var14, var14.method377() * var15 >> 8);
										}
									}

									Class27 var18 = var11.field139;
									var11.field139 = null;
									if (var10 == null) {
										this.field171[var7] = var18;
									} else {
										var10.field139 = var18;
									}

									if (var18 == null) {
										this.field174[var7] = var10;
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
				Class27 var16 = this.field171[var6];
				Class27[] var17 = this.field171;
				this.field174[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.field139;
					var16.field139 = null;
				}
			}
		}

		if (this.field169 < 0) {
			this.field169 = 0;
		}

		if (this.field156 != null) {
			this.field156.method381(var1, 0, var2);
		}

		this.field173 = Class130.method3047();
	}

	@ObfInfo(name = "bu", desc = "(Lba;II)V", opaque = "-1196303285")
	public final void method408(Class27 var1, int var2) {
		int var4 = var2 >> 5;
		Class27 var5 = this.field174[var4];
		if (var5 == null) {
			this.field171[var4] = var1;
		} else {
			var5.field139 = var1;
		}

		this.field174[var4] = var1;
		var1.field137 = var2;
	}

	@ObfInfo(name = "ak", desc = "(B)V")
	public void method251() throws Exception {
	}

	@ObfInfo(name = "al", desc = "(IB)V")
	public void method250(int var1) throws Exception {
	}

	@ObfInfo(name = "aj", desc = "(I)I")
	public int method262() throws Exception {
		return this.field167;
	}

	@ObfInfo(name = "az", desc = "()V")
	public void method252() throws Exception {
	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method253() {
	}

	@ObfInfo(name = "aa", desc = "(B)V")
	public void method254() throws Exception {
	}

	@ObfInfo(owner = "ht", name = "bs", desc = "(Lby;S)V")
	public static void method3934(Class51 var0) {
		field450 = var0;
	}

	@ObfInfo(owner = "ah", name = "bf", desc = "(Lgz;IIB)Lbd;", opaque = "56")
	public static Class30 method126(Class182 var0, int var1, int var2) {
		if (0 == Client.field1382) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				Class30 var4 = field450.method166();
				var4.field159 = new int[256 * (Client.field1887 ? 2 : 1)];
				var4.field160 = var2;
				var4.method251();
				var4.field167 = (var2 & -1024) + 1024;
				if (var4.field167 > 16384) {
					var4.field167 = 16384;
				}

				var4.method250(var4.field167);
				if (Client.field2640 > 0 && field80 == null) {
					field80 = new Class39();
					field2176 = Executors.newScheduledThreadPool(1);
					field2176.scheduleAtFixedRate(field80, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (field80 != null) {
					if (field80.field276[var1] != null) {
						throw new IllegalArgumentException();
					}

					field80.field276[var1] = var4;
				}

				return var4;
			} catch (Throwable var5) {
				return new Class30();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(owner = "cy", name = "bg", desc = "(Lba;B)V", opaque = "0")
	public static void method2181(Class27 var0) {
		var0.field136 = false;
		if (var0.field138 != null) {
			var0.field138.field390 = 0;
		}

		for (Class27 var2 = var0.method384(); var2 != null; var2 = var0.method379()) {
			method2181(var2);
		}

	}
}
