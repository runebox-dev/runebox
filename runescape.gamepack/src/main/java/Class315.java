import io.runebox.ObfInfo;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfInfo(name = "mc")
public class Class315 extends Class37 {
	@ObfInfo(name = "bu", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	public static ThreadPoolExecutor field3280;
	@ObfInfo(name = "bx", desc = "Ljava/util/concurrent/atomic/AtomicBoolean;")
	public static AtomicBoolean field3307;
	@ObfInfo(name = "bj", desc = "Lmg;")
	public Class319 field3304;
	@ObfInfo(name = "bt", desc = "[[Lna;")
	public Class339[][] field3277;
	@ObfInfo(name = "ar", desc = "[[Lna;")
	public Class339[][] field3296;
	@ObfInfo(name = "bg", desc = "Lnt;")
	public Class358 field3308;
	@ObfInfo(name = "bs", desc = "Lbv;")
	public Class48 field3305;
	@ObfInfo(name = "aq", desc = "Lup;")
	public Class536 field3310;
	@ObfInfo(name = "be", desc = "Z")
	public boolean field3298;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -35329085)
	public int field3278;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 909887491)
	public int field3299;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = 2047528875)
	public int field3300;
	@ObfInfo(name = "bo", desc = "I", intMultiplier = 992038787)
	public int field3301;
	@ObfInfo(name = "by", desc = "I", intMultiplier = -1411363415)
	public int field3309;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field3279;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field3281;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field3282;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field3283;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field3284;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field3285;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field3286;
	@ObfInfo(name = "au", desc = "[I")
	public int[] field3288;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field3290;
	@ObfInfo(name = "as", desc = "[I")
	public int[] field3291;
	@ObfInfo(name = "at", desc = "[I")
	public int[] field3293;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field3295;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field3297;
	@ObfInfo(name = "aw", desc = "[I")
	public int[] field3302;
	@ObfInfo(name = "ae", desc = "[I")
	public int[] field3303;
	@ObfInfo(name = "bp", desc = "Ljava/util/PriorityQueue;")
	public PriorityQueue field3306;
	@ObfInfo(name = "bi", desc = "J", longMultiplier = 7642554548963887643L)
	public long field3287;
	@ObfInfo(name = "ba", desc = "J", longMultiplier = -7456478925563174147L)
	public long field3292;

	static {
		field3307 = null;
		field3280 = null;
	}

	public Class315(Class48 var1) {
		this.field3278 = 256;
		this.field3299 = 1000000;
		this.field3297 = new int[16];
		this.field3281 = new int[16];
		this.field3282 = new int[16];
		this.field3283 = new int[16];
		this.field3284 = new int[16];
		this.field3285 = new int[16];
		this.field3286 = new int[16];
		this.field3303 = new int[16];
		this.field3288 = new int[16];
		this.field3290 = new int[16];
		this.field3291 = new int[16];
		this.field3302 = new int[16];
		this.field3293 = new int[16];
		this.field3279 = new int[16];
		this.field3295 = new int[16];
		this.field3296 = new Class339[16][128];
		this.field3277 = new Class339[16][128];
		this.field3304 = new Class319();
		this.field3308 = new Class358(this);
		this.field3305 = null;
		this.field3306 = new PriorityQueue(5, new Class360());
		this.field3309 = 0;
		this.field3305 = var1;
		this.field3310 = new Class536(128);
		this.method6111();
	}

	@ObfInfo(name = "aq", desc = "(IB)V")
	public void method6090(int var1) {
		synchronized(this.field3305) {
			this.field3278 = var1;
		}
	}

	@ObfInfo(name = "ad", desc = "(I)I")
	public int method6091() {
		return this.field3278;
	}

	@ObfInfo(name = "ag", desc = "(Lnz;Lok;Lbh;B)Z", opaque = "1")
	public boolean method6092(Class364 var1, Class375 var2, Class34 var3) {
		synchronized(this.field3305) {
			boolean var6 = true;
			synchronized(this.field3306) {
				this.field3306.clear();
			}

			for (Class347 var7 = (Class347)var1.field3993.method9442(); var7 != null; var7 = (Class347)var1.field3993.method9446()) {
				int var8 = (int)var7.field5234;
				Class334 var9 = (Class334)this.field3310.method9439((long)var8);
				if (var9 == null) {
					var9 = Class334.method450(var2, var8);
					if (var9 == null) {
						var6 = false;
						continue;
					}

					this.field3310.method9445(var9, (long)var8);
				}

				if (!var9.method6357(var3, var7.field3743)) {
					var6 = false;
				} else if (this.field3306 != null) {
					synchronized(this.field3306) {
						Iterator var11 = var9.field3653.iterator();

						while (var11.hasNext()) {
							Class74 var12 = (Class74)var11.next();
							this.field3306.add(new Class317(var7.field3741, var12));
						}
					}
				}
			}

			return var6;
		}
	}

	@ObfInfo(name = "ak", desc = "(I)V", opaque = "1103805692")
	public void method6093() {
		if (this.field3306 != null) {
			if (field3307 != null) {
				field3307.set(true);
			}

			field3307 = new AtomicBoolean(false);
			AtomicBoolean var2 = field3307;
			if (field3280 == null) {
				int var3 = Runtime.getRuntime().availableProcessors();
				field3280 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new Class335(this));
			}

			field3280.submit(new Class318(this, var2));
		}
	}

	@ObfInfo(name = "ap", desc = "(B)V")
	public void method6164() {
		synchronized(this.field3305) {
			for (Class334 var3 = (Class334)this.field3310.method9442(); var3 != null; var3 = (Class334)this.field3310.method9446()) {
				var3.method6358();
			}

		}
	}

	@ObfInfo(name = "ai", desc = "(B)V", opaque = "116")
	public void method6094() {
		synchronized(this.field3305) {
			for (Class334 var3 = (Class334)this.field3310.method9442(); var3 != null; var3 = (Class334)this.field3310.method9446()) {
				var3.method9267();
			}

		}
	}

	@ObfInfo(name = "au", desc = "(Lnz;ZI)V", opaque = "1411387952")
	public void method6162(Class364 var1, boolean var2) {
		synchronized(this.field3305) {
			this.method6129();
			this.field3304.method6246(var1.field3994);
			this.field3298 = var2;
			this.field3287 = 0L;
			int var5 = this.field3304.method6236();

			for (int var6 = 0; var6 < var5; ++var6) {
				this.field3304.method6278(var6);
				this.field3304.method6273(var6);
				this.field3304.method6259(var6);
			}

			this.field3300 = this.field3304.method6243();
			this.field3301 = this.field3304.field3339[this.field3300];
			this.field3292 = this.field3304.method6242(this.field3301);
		}
	}

	@ObfInfo(name = "ah", desc = "(B)V")
	public void method6129() {
		synchronized(this.field3305) {
			this.field3304.method6232();
			this.method6111();
		}
	}

	@ObfInfo(name = "az", desc = "(B)Z")
	public boolean method6097() {
		synchronized(this.field3305) {
			return this.field3304.method6233();
		}
	}

	@ObfInfo(name = "ax", desc = "(I)Z", opaque = "-2133113978")
	public boolean method6098() {
		synchronized(this.field3305) {
			return this.field3310.method9440() > 0;
		}
	}

	@ObfInfo(name = "ac", desc = "(III)V")
	public void method6099(int var1, int var2) {
		synchronized(this.field3305) {
			this.method6121(var1, var2);
		}
	}

	@ObfInfo(name = "al", desc = "(III)V")
	public void method6121(int var1, int var2) {
		this.field3283[var1] = var2;
		this.field3285[var1] = var2 & -128;
		this.method6181(var1, var2);
	}

	@ObfInfo(name = "ay", desc = "(IIB)V", opaque = "7")
	public void method6181(int var1, int var2) {
		if (this.field3284[var1] != var2) {
			this.field3284[var1] = var2;

			for (int var4 = 0; var4 < 128; ++var4) {
				this.field3277[var1][var4] = null;
			}
		}

	}

	@ObfInfo(name = "ao", desc = "(IIIS)V", opaque = "241")
	public void method6102(int var1, int var2, int var3) {
		this.method6153(var1, var2, 64);
		if ((this.field3290[var1] & 2) != 0) {
			for (Class339 var5 = (Class339)this.field3308.field3784.method7510(); var5 != null; var5 = (Class339)this.field3308.field3784.method7512()) {
				if (var5.field3679 == var1 && var5.field3674 < 0) {
					this.field3296[var1][var5.field3669] = null;
					this.field3296[var1][var2] = var5;
					int var6 = (var5.field3678 * var5.field3672 >> 12) + var5.field3677;
					var5.field3677 += var2 - var5.field3669 << 8;
					var5.field3678 = var6 - var5.field3677;
					var5.field3672 = 4096;
					var5.field3669 = var2;
					return;
				}
			}
		}

		Class334 var9 = (Class334)this.field3310.method9439((long)this.field3284[var1]);
		if (var9 != null) {
			if (var9.field3647[var2] != null) {
				Class38 var10 = var9.field3647[var2].method2149();
				if (var10 != null) {
					Class339 var7 = new Class339();
					var7.field3679 = var1;
					var7.field3670 = var9;
					var7.field3671 = var10;
					var7.field3684 = var9.field3645[var2];
					var7.field3673 = var9.field3651[var2];
					var7.field3669 = var2;
					var7.field3675 = var3 * var3 * var9.field3650 * var9.field3649[var2] + 1024 >> 11;
					var7.field3676 = var9.field3646[var2] & 255;
					var7.field3677 = (var2 << 8) - (var9.field3648[var2] & 32767);
					var7.field3683 = 0;
					var7.field3680 = 0;
					var7.field3688 = 0;
					var7.field3674 = -1;
					var7.field3682 = 0;
					if (this.field3293[var1] == 0) {
						var7.field3687 = Class52.method937(var10, this.method6116(var7), this.method6125(var7), this.method6110(var7));
					} else {
						var7.field3687 = Class52.method937(var10, this.method6116(var7), 0, this.method6110(var7));
						this.method6109(var7, var9.field3648[var2] < 0);
					}

					if (var9.field3648[var2] < 0) {
						var7.field3687.method1040(-1);
					}

					if (var7.field3673 >= 0) {
						Class339 var8 = this.field3277[var1][var7.field3673];
						if (var8 != null && var8.field3674 < 0) {
							this.field3296[var1][var8.field3669] = null;
							var8.field3674 = 0;
						}

						this.field3277[var1][var7.field3673] = var7;
					}

					this.field3308.field3784.method7506(var7);
					this.field3296[var1][var2] = var7;
				}
			}
		}
	}

	@ObfInfo(name = "aa", desc = "(Lna;ZS)V", opaque = "203")
	public void method6109(Class339 var1, boolean var2) {
		int var4 = var1.field3671.field198.length;
		int var5;
		if (var2 && var1.field3671.field202) {
			int var6 = var4 + var4 - var1.field3671.field200;
			var5 = (int)((long)this.field3293[var1.field3679] * (long)var6 >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.field3687.method1012(true);
			}
		} else {
			var5 = (int)((long)this.field3293[var1.field3679] * (long)var4 >> 6);
		}

		var1.field3687.method1036(var5);
	}

	@ObfInfo(name = "as", desc = "(IIII)V", opaque = "65505835")
	public void method6153(int var1, int var2, int var3) {
		Class339 var5 = this.field3296[var1][var2];
		if (var5 != null) {
			this.field3296[var1][var2] = null;
			if ((this.field3290[var1] & 2) != 0) {
				for (Class339 var6 = (Class339)this.field3308.field3784.method7526(); var6 != null; var6 = (Class339)this.field3308.field3784.method7511()) {
					if (var5.field3679 == var6.field3679 && var6.field3674 < 0 && var5 != var6) {
						var5.field3674 = 0;
						break;
					}
				}
			} else {
				var5.field3674 = 0;
			}

		}
	}

	@ObfInfo(name = "aw", desc = "(IIIB)V")
	public void method6210(int var1, int var2, int var3) {
	}

	@ObfInfo(name = "at", desc = "(III)V")
	public void method6106(int var1, int var2) {
	}

	@ObfInfo(name = "af", desc = "(IIB)V")
	public void method6217(int var1, int var2) {
		this.field3286[var1] = var2;
	}

	@ObfInfo(name = "bx", desc = "(II)V", opaque = "131784240")
	public void method6108(int var1) {
		for (Class339 var3 = (Class339)this.field3308.field3784.method7526(); var3 != null; var3 = (Class339)this.field3308.field3784.method7511()) {
			if (var1 < 0 || var3.field3679 == var1) {
				if (var3.field3687 != null) {
					var3.field3687.method950(Client.field293 / 100);
					if (var3.field3687.method945()) {
						this.field3308.field3785.method892(var3.field3687);
					}

					var3.method6399();
				}

				if (var3.field3674 < 0) {
					this.field3296[var3.field3679][var3.field3669] = null;
				}

				var3.method9267();
			}
		}

	}

	@ObfInfo(name = "bu", desc = "(IB)V", opaque = "-77")
	public void method6187(int var1) {
		if (var1 >= 0) {
			this.field3297[var1] = 12800;
			this.field3281[var1] = 8192;
			this.field3282[var1] = 16383;
			this.field3286[var1] = 8192;
			this.field3303[var1] = 0;
			this.field3288[var1] = 8192;
			this.method6156(var1);
			this.method6113(var1);
			this.field3290[var1] = 0;
			this.field3291[var1] = 32767;
			this.field3302[var1] = 256;
			this.field3293[var1] = 0;
			this.method6115(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6187(var1);
			}

		}
	}

	@ObfInfo(name = "by", desc = "(IB)V", opaque = "2")
	public void method6191(int var1) {
		for (Class339 var3 = (Class339)this.field3308.field3784.method7526(); var3 != null; var3 = (Class339)this.field3308.field3784.method7511()) {
			if ((var1 < 0 || var3.field3679 == var1) && var3.field3674 < 0) {
				this.field3296[var3.field3679][var3.field3669] = null;
				var3.field3674 = 0;
			}
		}

	}

	@ObfInfo(name = "bc", desc = "(I)V", opaque = "355111668")
	public void method6111() {
		this.method6108(-1);
		this.method6187(-1);

		int var2;
		for (var2 = 0; var2 < 16; ++var2) {
			this.field3284[var2] = this.field3283[var2];
		}

		for (var2 = 0; var2 < 16; ++var2) {
			this.field3285[var2] = this.field3283[var2] & -128;
		}

	}

	@ObfInfo(name = "bb", desc = "(IS)V", opaque = "8248")
	public void method6156(int var1) {
		if ((this.field3290[var1] & 2) != 0) {
			for (Class339 var3 = (Class339)this.field3308.field3784.method7526(); var3 != null; var3 = (Class339)this.field3308.field3784.method7511()) {
				if (var3.field3679 == var1 && this.field3296[var1][var3.field3669] == null && var3.field3674 < 0) {
					var3.field3674 = 0;
				}
			}
		}

	}

	@ObfInfo(name = "bn", desc = "(IB)V", opaque = "5")
	public void method6113(int var1) {
		if ((this.field3290[var1] & 4) != 0) {
			for (Class339 var3 = (Class339)this.field3308.field3784.method7526(); var3 != null; var3 = (Class339)this.field3308.field3784.method7511()) {
				if (var3.field3679 == var1) {
					var3.field3689 = 0;
				}
			}
		}

	}

	@ObfInfo(name = "bh", desc = "(IB)V", opaque = "17")
	public void method6201(int var1) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method6153(var4, var5, var6);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var6 > 0) {
				this.method6102(var4, var5, var6);
			} else {
				this.method6153(var4, var5, 64);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method6210(var4, var5, var6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.field3285[var4] = (var6 << 14) + (this.field3285[var4] & -2080769);
			}

			if (var5 == 32) {
				this.field3285[var4] = (var6 << 7) + (this.field3285[var4] & -16257);
			}

			if (var5 == 1) {
				this.field3303[var4] = (var6 << 7) + (this.field3303[var4] & -16257);
			}

			if (var5 == 33) {
				this.field3303[var4] = (this.field3303[var4] & -128) + var6;
			}

			if (var5 == 5) {
				this.field3288[var4] = (var6 << 7) + (this.field3288[var4] & -16257);
			}

			if (var5 == 37) {
				this.field3288[var4] = (this.field3288[var4] & -128) + var6;
			}

			if (var5 == 7) {
				this.field3297[var4] = (var6 << 7) + (this.field3297[var4] & -16257);
			}

			if (var5 == 39) {
				this.field3297[var4] = (this.field3297[var4] & -128) + var6;
			}

			if (var5 == 10) {
				this.field3281[var4] = (var6 << 7) + (this.field3281[var4] & -16257);
			}

			if (var5 == 42) {
				this.field3281[var4] = (this.field3281[var4] & -128) + var6;
			}

			if (var5 == 11) {
				this.field3282[var4] = (var6 << 7) + (this.field3282[var4] & -16257);
			}

			if (var5 == 43) {
				this.field3282[var4] = (this.field3282[var4] & -128) + var6;
			}

			int[] var10000;
			if (var5 == 64) {
				if (var6 >= 64) {
					var10000 = this.field3290;
					var10000[var4] |= 1;
				} else {
					var10000 = this.field3290;
					var10000[var4] &= -2;
				}
			}

			if (var5 == 65) {
				if (var6 >= 64) {
					var10000 = this.field3290;
					var10000[var4] |= 2;
				} else {
					this.method6156(var4);
					var10000 = this.field3290;
					var10000[var4] &= -3;
				}
			}

			if (var5 == 99) {
				this.field3291[var4] = (var6 << 7) + (this.field3291[var4] & 127);
			}

			if (var5 == 98) {
				this.field3291[var4] = (this.field3291[var4] & 16256) + var6;
			}

			if (var5 == 101) {
				this.field3291[var4] = (var6 << 7) + (this.field3291[var4] & 127) + 16384;
			}

			if (var5 == 100) {
				this.field3291[var4] = (this.field3291[var4] & 16256) + 16384 + var6;
			}

			if (var5 == 120) {
				this.method6108(var4);
			}

			if (var5 == 121) {
				this.method6187(var4);
			}

			if (var5 == 123) {
				this.method6191(var4);
			}

			int var7;
			if (var5 == 6) {
				var7 = this.field3291[var4];
				if (var7 == 16384) {
					this.field3302[var4] = (var6 << 7) + (this.field3302[var4] & -16257);
				}
			}

			if (var5 == 38) {
				var7 = this.field3291[var4];
				if (var7 == 16384) {
					this.field3302[var4] = (this.field3302[var4] & -128) + var6;
				}
			}

			if (var5 == 16) {
				this.field3293[var4] = (var6 << 7) + (this.field3293[var4] & -16257);
			}

			if (var5 == 48) {
				this.field3293[var4] = (this.field3293[var4] & -128) + var6;
			}

			if (var5 == 81) {
				if (var6 >= 64) {
					var10000 = this.field3290;
					var10000[var4] |= 4;
				} else {
					this.method6113(var4);
					var10000 = this.field3290;
					var10000[var4] &= -5;
				}
			}

			if (var5 == 17) {
				this.method6115(var4, (var6 << 7) + (this.field3279[var4] & -16257));
			}

			if (var5 == 49) {
				this.method6115(var4, (this.field3279[var4] & -128) + var6);
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method6181(var4, this.field3285[var4] + var5);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method6106(var4, var5);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6217(var4, var5);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				this.method6111();
			}
		}
	}

	@ObfInfo(name = "bq", desc = "(III)V")
	public void method6115(int var1, int var2) {
		this.field3279[var1] = var2;
		this.field3295[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfInfo(name = "bd", desc = "(Lna;I)I", opaque = "1580178616")
	public int method6116(Class339 var1) {
		int var3 = (var1.field3678 * var1.field3672 >> 12) + var1.field3677;
		var3 += (this.field3286[var1.field3679] - 8192) * this.field3302[var1.field3679] >> 12;
		Class324 var4 = var1.field3684;
		int var5;
		if (var4.field3482 > 0 && (var4.field3476 > 0 || this.field3303[var1.field3679] > 0)) {
			var5 = var4.field3476 << 2;
			int var6 = var4.field3478 << 1;
			if (var1.field3681 < var6) {
				var5 = var1.field3681 * var5 / var6;
			}

			var5 += this.field3303[var1.field3679] >> 7;
			double var7 = Math.sin((double)(var1.field3686 & 511) * 0.01227184630308513D);
			var3 += (int)((double)var5 * var7);
		}

		var5 = (int)((double)(var1.field3671.field201 * 256) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)Client.field293 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	@ObfInfo(name = "bz", desc = "(Lna;I)I", opaque = "-1878764550")
	public int method6125(Class339 var1) {
		Class324 var3 = var1.field3684;
		int var4 = this.field3297[var1.field3679] * this.field3282[var1.field3679] + 4096 >> 13;
		var4 = var4 * var4 + 16384 >> 15;
		var4 = var1.field3675 * var4 + 16384 >> 15;
		var4 = this.field3278 * var4 + 128 >> 8;
		if (var3.field3477 > 0) {
			var4 = (int)((double)var4 * Math.pow(0.5D, (double)var1.field3683 * 1.953125E-5D * (double)var3.field3477) + 0.5D);
		}

		int var5;
		int var6;
		int var7;
		int var8;
		if (var3.field3487 != null) {
			var5 = var1.field3680;
			var6 = var3.field3487[var1.field3688 + 1];
			if (var1.field3688 < var3.field3487.length - 2) {
				var7 = (var3.field3487[var1.field3688] & 255) << 8;
				var8 = (var3.field3487[var1.field3688 + 2] & 255) << 8;
				var6 += (var3.field3487[var1.field3688 + 3] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = var4 * var6 + 32 >> 6;
		}

		if (var1.field3674 > 0 && var3.field3483 != null) {
			var5 = var1.field3674;
			var6 = var3.field3483[var1.field3682 + 1];
			if (var1.field3682 < var3.field3483.length - 2) {
				var7 = (var3.field3483[var1.field3682] & 255) << 8;
				var8 = (var3.field3483[var1.field3682 + 2] & 255) << 8;
				var6 += (var3.field3483[var1.field3682 + 3] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = var4 * var6 + 32 >> 6;
		}

		return var4;
	}

	@ObfInfo(name = "bk", desc = "(Lna;I)I", opaque = "-435630989")
	public int method6110(Class339 var1) {
		int var3 = this.field3281[var1.field3679];
		return var3 < 8192 ? var1.field3676 * var3 + 32 >> 6 : 16384 - ((128 - var1.field3676) * (16384 - var3) + 32 >> 6);
	}

	@ObfInfo(name = "an", desc = "()Lbk;")
	public Class37 method546() {
		return this.field3308;
	}

	@ObfInfo(name = "aj", desc = "()Lbk;")
	public Class37 method525() {
		return null;
	}

	@ObfInfo(name = "av", desc = "()I")
	public int method529() {
		return 0;
	}

	@ObfInfo(name = "ab", desc = "([III)V")
	public void method531(int[] var1, int var2, int var3) {
		if (this.field3304.method6233()) {
			int var4 = this.field3304.field3335 * this.field3299 / Client.field293;

			do {
				long var5 = (long)var3 * (long)var4 + this.field3287;
				if (this.field3292 - var5 >= 0L) {
					this.field3287 = var5;
					break;
				}

				int var7 = (int)((this.field3292 - this.field3287 + (long)var4 - 1L) / (long)var4);
				this.field3287 += (long)var4 * (long)var7;
				this.field3308.method531(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6179();
			} while(this.field3304.method6233());
		}

		this.field3308.method531(var1, var2, var3);
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	public void method542(int var1) {
		if (this.field3304.method6233()) {
			int var2 = this.field3304.field3335 * this.field3299 / Client.field293;

			do {
				long var3 = (long)var1 * (long)var2 + this.field3287;
				if (this.field3292 - var3 >= 0L) {
					this.field3287 = var3;
					break;
				}

				int var5 = (int)((this.field3292 - this.field3287 + (long)var2 - 1L) / (long)var2);
				this.field3287 += (long)var2 * (long)var5;
				this.field3308.method542(var5);
				var1 -= var5;
				this.method6179();
			} while(this.field3304.method6233());
		}

		this.field3308.method542(var1);
	}

	@ObfInfo(name = "br", desc = "(I)V", opaque = "581072964")
	public void method6179() {
		int var2 = this.field3300;
		int var3 = this.field3301;

		long var4;
		for (var4 = this.field3292; this.field3301 == var3; var4 = this.field3304.method6242(var3)) {
			while (this.field3304.field3339[var2] == var3) {
				this.field3304.method6278(var2);
				int var6 = this.field3304.method6239(var2);
				if (var6 == 1) {
					this.field3304.method6237();
					this.field3304.method6259(var2);
					if (this.field3304.method6244()) {
						if (!this.field3298 || var3 == 0) {
							this.method6111();
							this.field3304.method6232();
							return;
						}

						this.field3304.method6245(var4);
					}
					break;
				}

				if ((var6 & 128) != 0) {
					this.method6201(var6);
				}

				this.field3304.method6273(var2);
				this.field3304.method6259(var2);
			}

			var2 = this.field3304.method6243();
			var3 = this.field3304.field3339[var2];
		}

		this.field3300 = var2;
		this.field3301 = var3;
		this.field3292 = var4;
	}

	@ObfInfo(name = "bf", desc = "(Lna;B)Z", opaque = "2")
	public boolean method6160(Class339 var1) {
		if (var1.field3687 == null) {
			if (var1.field3674 >= 0) {
				var1.method9267();
				if (var1.field3673 > 0 && this.field3277[var1.field3679][var1.field3673] == var1) {
					this.field3277[var1.field3679][var1.field3673] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "cf", desc = "(Lna;[IIII)Z", opaque = "-1689303641")
	public boolean method6182(Class339 var1, int[] var2, int var3, int var4) {
		var1.field3685 = Client.field293 / 100;
		if (var1.field3674 < 0 || var1.field3687 != null && !var1.field3687.method953()) {
			int var6 = var1.field3672;
			if (var6 > 0) {
				var6 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3288[var1.field3679] * 4.921259842519685E-4D) + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}

				var1.field3672 = var6;
			}

			var1.field3687.method951(this.method6116(var1));
			Class324 var7 = var1.field3684;
			boolean var8 = false;
			++var1.field3681;
			var1.field3686 += var7.field3482;
			double var9 = (double)((var1.field3669 - 60 << 8) + (var1.field3678 * var1.field3672 >> 12)) * 5.086263020833333E-6D;
			if (var7.field3477 > 0) {
				if (var7.field3480 > 0) {
					var1.field3683 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3480 * var9) + 0.5D);
				} else {
					var1.field3683 += 128;
				}
			}

			if (var7.field3487 != null) {
				if (var7.field3481 > 0) {
					var1.field3680 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3481 * var9) + 0.5D);
				} else {
					var1.field3680 += 128;
				}

				while (var1.field3688 < var7.field3487.length - 2 && var1.field3680 > (var7.field3487[var1.field3688 + 2] & 255) << 8) {
					var1.field3688 += 2;
				}

				if (var7.field3487.length - 2 == var1.field3688 && var7.field3487[var1.field3688 + 1] == 0) {
					var8 = true;
				}
			}

			if (var1.field3674 >= 0 && var7.field3483 != null && (this.field3290[var1.field3679] & 1) == 0 && (var1.field3673 < 0 || this.field3277[var1.field3679][var1.field3673] != var1)) {
				if (var7.field3479 > 0) {
					var1.field3674 += (int)(128.0D * Math.pow(2.0D, (double)var7.field3479 * var9) + 0.5D);
				} else {
					var1.field3674 += 128;
				}

				while (var1.field3682 < var7.field3483.length - 2 && var1.field3674 > (var7.field3483[var1.field3682 + 2] & 255) << 8) {
					var1.field3682 += 2;
				}

				if (var7.field3483.length - 2 == var1.field3682) {
					var8 = true;
				}
			}

			if (var8) {
				var1.field3687.method950(var1.field3685);
				if (var2 != null) {
					var1.field3687.method531(var2, var3, var4);
				} else {
					var1.field3687.method542(var4);
				}

				if (var1.field3687.method945()) {
					this.field3308.field3785.method892(var1.field3687);
				}

				var1.method6399();
				if (var1.field3674 >= 0) {
					var1.method9267();
					if (var1.field3673 > 0 && this.field3277[var1.field3679][var1.field3673] == var1) {
						this.field3277[var1.field3679][var1.field3673] = null;
					}
				}

				return true;
			} else {
				var1.field3687.method949(var1.field3685, this.method6125(var1), this.method6110(var1));
				return false;
			}
		} else {
			var1.method6399();
			var1.method9267();
			if (var1.field3673 > 0 && this.field3277[var1.field3679][var1.field3673] == var1) {
				this.field3277[var1.field3679][var1.field3673] = null;
			}

			return true;
		}
	}

	@ObfInfo(name = "ot", desc = "(I)V", opaque = "-1032177729")
	public static void method6221() {
		for (int var1 = 0; var1 < Client.field5093.field1017.field1402; ++var1) {
			Class80 var2 = Client.field5093.field1024[Client.field5093.field1017.field1407[var1]];
			var2.method2241();
		}

		Iterator var3 = Class115.field1428.iterator();

		while (var3.hasNext()) {
			Class63 var4 = (Class63)var3.next();
			var4.method1298();
		}

		if (Client.field883 != null) {
			Client.field883.method8360();
		}

	}
}
