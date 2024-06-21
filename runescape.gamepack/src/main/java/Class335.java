import io.runebox.ObfInfo;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Class335 extends Class27 {
	@ObfInfo(name = "bh", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	public static ThreadPoolExecutor field3489;
	@ObfInfo(name = "bu", desc = "Ljava/util/concurrent/atomic/AtomicBoolean;")
	public static AtomicBoolean field3483;
	@ObfInfo(name = "be", desc = "Lbd;")
	public Class30 field3505;
	@ObfInfo(name = "bl", desc = "Lml;")
	public Class324 field3504;
	@ObfInfo(name = "bf", desc = "Lmx;")
	public Class336 field3498;
	@ObfInfo(name = "ag", desc = "[[Lne;")
	public Class343[][] field3496;
	@ObfInfo(name = "bs", desc = "[[Lne;")
	public Class343[][] field3497;
	@ObfInfo(name = "ak", desc = "Ltx;")
	public Class518 field3488;
	@ObfInfo(name = "bo", desc = "Z")
	public boolean field3507;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1429921871)
	public int field3482;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1920878651)
	public int field3491;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = -1552418049)
	public int field3492;
	@ObfInfo(name = "bi", desc = "I", intMultiplier = -469107071)
	public int field3500;
	@ObfInfo(name = "bk", desc = "I", intMultiplier = -473293717)
	public int field3509;
	@ObfInfo(name = "ar", desc = "[I")
	public int[] field3476;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field3478;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field3479;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field3480;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field3481;
	@ObfInfo(name = "ac", desc = "[I")
	public int[] field3484;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field3485;
	@ObfInfo(name = "ah", desc = "[I")
	public int[] field3486;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field3487;
	@ObfInfo(name = "aw", desc = "[I")
	public int[] field3490;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field3493;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field3494;
	@ObfInfo(name = "ao", desc = "[I")
	public int[] field3499;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field3501;
	@ObfInfo(name = "at", desc = "[I")
	public int[] field3508;
	@ObfInfo(name = "bg", desc = "Ljava/util/PriorityQueue;")
	public PriorityQueue field3506;
	@ObfInfo(name = "bn", desc = "J", longMultiplier = -3040115667621603143L)
	public long field3502;
	@ObfInfo(name = "bw", desc = "J", longMultiplier = -4832767796175148511L)
	public long field3503;

	static {
		field3483 = null;
		field3489 = null;
	}

	public Class335(Class30 var1) {
		this.field3491 = 256;
		this.field3482 = 1000000;
		this.field3479 = new int[16];
		this.field3480 = new int[16];
		this.field3481 = new int[16];
		this.field3508 = new int[16];
		this.field3501 = new int[16];
		this.field3484 = new int[16];
		this.field3499 = new int[16];
		this.field3486 = new int[16];
		this.field3487 = new int[16];
		this.field3490 = new int[16];
		this.field3485 = new int[16];
		this.field3478 = new int[16];
		this.field3493 = new int[16];
		this.field3494 = new int[16];
		this.field3476 = new int[16];
		this.field3496 = new Class343[16][128];
		this.field3497 = new Class343[16][128];
		this.field3498 = new Class336();
		this.field3504 = new Class324(this);
		this.field3505 = null;
		this.field3506 = new PriorityQueue(5, new Class345());
		this.field3509 = 0;
		this.field3505 = var1;
		this.field3488 = new Class518(128);
		this.method6333();
	}

	@ObfInfo(name = "ak", desc = "(II)V")
	public void method6400(int var1) {
		synchronized(this.field3505) {
			this.field3491 = var1;
		}
	}

	@ObfInfo(name = "al", desc = "(B)I")
	public int method6431() {
		return this.field3491;
	}

	@ObfInfo(name = "aj", desc = "(Lno;Lor;Lbq;I)Z", opaque = "1596548192")
	public boolean method6422(Class353 var1, Class382 var2, Class43 var3) {
		synchronized(this.field3505) {
			boolean var6 = true;
			synchronized(this.field3506) {
				this.field3506.clear();
			}

			for (Class356 var7 = (Class356)var1.field3899.method9363(); var7 != null; var7 = (Class356)var1.field3899.method9364()) {
				int var8 = (int)var7.field5170;
				Class333 var9 = (Class333)this.field3488.method9361((long)var8);
				if (var9 == null) {
					byte[] var11 = var2.method7221(var8);
					Class333 var10;
					if (var11 == null) {
						var10 = null;
					} else {
						var10 = new Class333(var11);
					}

					var9 = var10;
					if (var10 == null) {
						var6 = false;
						continue;
					}

					this.field3488.method9360(var10, (long)var8);
				}

				if (!var9.method6302(var3, var7.field3928)) {
					var6 = false;
				} else if (this.field3506 != null) {
					synchronized(this.field3506) {
						Iterator var18 = var9.field3472.iterator();

						while (var18.hasNext()) {
							Class63 var12 = (Class63)var18.next();
							this.field3506.add(new Class337(var7.field3929, var12));
						}
					}
				}
			}

			return var6;
		}
	}

	@ObfInfo(name = "az", desc = "(B)V", opaque = "0")
	public void method6324() {
		if (this.field3506 != null) {
			if (field3483 != null) {
				field3483.set(true);
			}

			field3483 = new AtomicBoolean(false);
			AtomicBoolean var2 = field3483;
			if (field3489 == null) {
				int var3 = Runtime.getRuntime().availableProcessors();
				field3489 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new Class313(this));
			}

			field3489.submit(new Class325(this, var2));
		}
	}

	@ObfInfo(name = "af", desc = "(B)V", opaque = "-1")
	public void method6316() {
		synchronized(this.field3505) {
			for (Class333 var3 = (Class333)this.field3488.method9363(); var3 != null; var3 = (Class333)this.field3488.method9364()) {
				var3.method6303();
			}

		}
	}

	@ObfInfo(name = "ao", desc = "(I)V", opaque = "264957018")
	public void method6313() {
		synchronized(this.field3505) {
			for (Class333 var3 = (Class333)this.field3488.method9363(); var3 != null; var3 = (Class333)this.field3488.method9364()) {
				var3.method9277();
			}

		}
	}

	@ObfInfo(name = "av", desc = "(Lno;ZB)V", opaque = "1")
	public void method6318(Class353 var1, boolean var2) {
		synchronized(this.field3505) {
			this.method6319();
			this.field3498.method6465(var1.field3900);
			this.field3507 = var2;
			this.field3502 = 0L;
			int var5 = this.field3498.method6449();

			for (int var6 = 0; var6 < var5; ++var6) {
				this.field3498.method6450(var6);
				this.field3498.method6447(var6);
				this.field3498.method6451(var6);
			}

			this.field3500 = this.field3498.method6457();
			this.field3492 = this.field3498.field3514[this.field3500];
			this.field3503 = this.field3498.method6446(this.field3492);
		}
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public void method6319() {
		synchronized(this.field3505) {
			this.field3498.method6459();
			this.method6333();
		}
	}

	@ObfInfo(name = "ap", desc = "(B)Z")
	public boolean method6320() {
		synchronized(this.field3505) {
			return this.field3498.method6448();
		}
	}

	@ObfInfo(name = "ae", desc = "(S)Z")
	public boolean method6321() {
		synchronized(this.field3505) {
			return this.field3488.method9362() > 0;
		}
	}

	@ObfInfo(name = "ax", desc = "(III)V")
	public void method6322(int var1, int var2) {
		synchronized(this.field3505) {
			this.method6323(var1, var2);
		}
	}

	@ObfInfo(name = "ay", desc = "(III)V")
	public void method6323(int var1, int var2) {
		this.field3508[var1] = var2;
		this.field3484[var1] = var2 & -128;
		this.method6419(var1, var2);
	}

	@ObfInfo(name = "au", desc = "(IIB)V", opaque = "0")
	public void method6419(int var1, int var2) {
		if (this.field3501[var1] != var2) {
			this.field3501[var1] = var2;

			for (int var4 = 0; var4 < 128; ++var4) {
				this.field3497[var1][var4] = null;
			}
		}

	}

	@ObfInfo(name = "as", desc = "(IIII)V", opaque = "-280989961")
	public void method6325(int var1, int var2, int var3) {
		this.method6327(var1, var2, 64);
		if (0 != (this.field3490[var1] & 2)) {
			for (Class343 var5 = (Class343)this.field3504.field3413.method7483(); var5 != null; var5 = (Class343)this.field3504.field3413.method7504()) {
				if (var5.field3840 == var1 && var5.field3850 < 0) {
					this.field3496[var1][var5.field3842] = null;
					this.field3496[var1][var2] = var5;
					int var6 = var5.field3853 + (var5.field3846 * var5.field3841 >> 12);
					var5.field3853 += var2 - var5.field3842 << 8;
					var5.field3841 = var6 - var5.field3853;
					var5.field3846 = 4096;
					var5.field3842 = var2;
					return;
				}
			}
		}

		Class333 var9 = (Class333)this.field3488.method9361((long)this.field3501[var1]);
		if (var9 != null) {
			if (null != var9.field3466[var2]) {
				Class44 var10 = var9.field3466[var2].method1115();
				if (var10 != null) {
					Class343 var7 = new Class343();
					var7.field3840 = var1;
					var7.field3837 = var9;
					var7.field3847 = var10;
					var7.field3839 = var9.field3469[var2];
					var7.field3838 = var9.field3471[var2];
					var7.field3842 = var2;
					var7.field3855 = 1024 + var9.field3465 * var3 * var3 * var9.field3468[var2] >> 11;
					var7.field3843 = var9.field3473[var2] & 255;
					var7.field3853 = (var2 << 8) - (var9.field3467[var2] & 32767);
					var7.field3844 = 0;
					var7.field3848 = 0;
					var7.field3854 = 0;
					var7.field3850 = -1;
					var7.field3851 = 0;
					if (0 == this.field3493[var1]) {
						var7.field3845 = Class52.method919(var10, this.method6338(var7), this.method6339(var7), this.method6340(var7));
					} else {
						var7.field3845 = Class52.method919(var10, this.method6338(var7), 0, this.method6340(var7));
						this.method6356(var7, var9.field3467[var2] < 0);
					}

					if (var9.field3467[var2] < 0) {
						var7.field3845.method921(-1);
					}

					if (var7.field3838 >= 0) {
						Class343 var8 = this.field3497[var1][var7.field3838];
						if (var8 != null && var8.field3850 < 0) {
							this.field3496[var1][var8.field3842] = null;
							var8.field3850 = 0;
						}

						this.field3497[var1][var7.field3838] = var7;
					}

					this.field3504.field3413.method7477(var7);
					this.field3496[var1][var2] = var7;
				}
			}
		}
	}

	@ObfInfo(name = "aw", desc = "(Lne;ZB)V", opaque = "-1")
	public void method6356(Class343 var1, boolean var2) {
		int var4 = var1.field3847.field314.length;
		int var5;
		if (var2 && var1.field3847.field315) {
			int var6 = var4 + var4 - var1.field3847.field311;
			var5 = (int)((long)this.field3493[var1.field3840] * (long)var6 >> 6);
			var4 <<= 8;
			if (var5 >= var4) {
				var5 = var4 + var4 - 1 - var5;
				var1.field3845.method928(true);
			}
		} else {
			var5 = (int)((long)this.field3493[var1.field3840] * (long)var4 >> 6);
		}

		var1.field3845.method927(var5);
	}

	@ObfInfo(name = "ad", desc = "(IIII)V", opaque = "1265693380")
	public void method6327(int var1, int var2, int var3) {
		Class343 var5 = this.field3496[var1][var2];
		if (var5 != null) {
			this.field3496[var1][var2] = null;
			if ((this.field3490[var1] & 2) != 0) {
				for (Class343 var6 = (Class343)this.field3504.field3413.method7482(); var6 != null; var6 = (Class343)this.field3504.field3413.method7490()) {
					if (var6.field3840 == var5.field3840 && var6.field3850 < 0 && var6 != var5) {
						var5.field3850 = 0;
						break;
					}
				}
			} else {
				var5.field3850 = 0;
			}

		}
	}

	@ObfInfo(name = "bn", desc = "(IIII)V")
	public void method6392(int var1, int var2, int var3) {
	}

	@ObfInfo(name = "bw", desc = "(III)V")
	public void method6329(int var1, int var2) {
	}

	@ObfInfo(name = "bu", desc = "(III)V")
	public void method6433(int var1, int var2) {
		this.field3499[var1] = var2;
	}

	@ObfInfo(name = "bh", desc = "(IB)V", opaque = "91")
	public void method6330(int var1) {
		for (Class343 var3 = (Class343)this.field3504.field3413.method7482(); var3 != null; var3 = (Class343)this.field3504.field3413.method7490()) {
			if (var1 < 0 || var1 == var3.field3840) {
				if (var3.field3845 != null) {
					var3.field3845.method932(Client.field1382 / 100);
					if (var3.field3845.method936()) {
						this.field3504.field3412.method743(var3.field3845);
					}

					var3.method6665();
				}

				if (var3.field3850 < 0) {
					this.field3496[var3.field3840][var3.field3842] = null;
				}

				var3.method9277();
			}
		}

	}

	@ObfInfo(name = "bk", desc = "(IB)V", opaque = "13")
	public void method6331(int var1) {
		if (var1 >= 0) {
			this.field3479[var1] = 12800;
			this.field3480[var1] = 8192;
			this.field3481[var1] = 16383;
			this.field3499[var1] = 8192;
			this.field3486[var1] = 0;
			this.field3487[var1] = 8192;
			this.method6367(var1);
			this.method6335(var1);
			this.field3490[var1] = 0;
			this.field3485[var1] = 32767;
			this.field3478[var1] = 256;
			this.field3493[var1] = 0;
			this.method6337(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6331(var1);
			}

		}
	}

	@ObfInfo(name = "br", desc = "(II)V", opaque = "-1939272721")
	public void method6332(int var1) {
		for (Class343 var3 = (Class343)this.field3504.field3413.method7482(); var3 != null; var3 = (Class343)this.field3504.field3413.method7490()) {
			if ((var1 < 0 || var3.field3840 == var1) && var3.field3850 < 0) {
				this.field3496[var3.field3840][var3.field3842] = null;
				var3.field3850 = 0;
			}
		}

	}

	@ObfInfo(name = "bx", desc = "(I)V", opaque = "-1104397490")
	public void method6333() {
		this.method6330(-1);
		this.method6331(-1);

		int var2;
		for (var2 = 0; var2 < 16; ++var2) {
			this.field3501[var2] = this.field3508[var2];
		}

		for (var2 = 0; var2 < 16; ++var2) {
			this.field3484[var2] = this.field3508[var2] & -128;
		}

	}

	@ObfInfo(name = "bd", desc = "(II)V", opaque = "20957472")
	public void method6367(int var1) {
		if (0 != (this.field3490[var1] & 2)) {
			for (Class343 var3 = (Class343)this.field3504.field3413.method7482(); var3 != null; var3 = (Class343)this.field3504.field3413.method7490()) {
				if (var1 == var3.field3840 && this.field3496[var1][var3.field3842] == null && var3.field3850 < 0) {
					var3.field3850 = 0;
				}
			}
		}

	}

	@ObfInfo(name = "bv", desc = "(II)V", opaque = "-119796863")
	public void method6335(int var1) {
		if (0 != (this.field3490[var1] & 4)) {
			for (Class343 var3 = (Class343)this.field3504.field3413.method7482(); var3 != null; var3 = (Class343)this.field3504.field3413.method7490()) {
				if (var3.field3840 == var1) {
					var3.field3856 = 0;
				}
			}
		}

	}

	@ObfInfo(name = "bm", desc = "(II)V", opaque = "-2016365982")
	public void method6417(int var1) {
		int var3 = var1 & 240;
		int var4;
		int var5;
		int var6;
		if (var3 == 128) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method6327(var4, var5, var6);
		} else if (var3 == 144) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var6 > 0) {
				this.method6325(var4, var5, var6);
			} else {
				this.method6327(var4, var5, 64);
			}

		} else if (var3 == 160) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			this.method6392(var4, var5, var6);
		} else if (var3 == 176) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			var6 = var1 >> 16 & 127;
			if (var5 == 0) {
				this.field3484[var4] = (var6 << 14) + (this.field3484[var4] & -2080769);
			}

			if (var5 == 32) {
				this.field3484[var4] = (var6 << 7) + (this.field3484[var4] & -16257);
			}

			if (var5 == 1) {
				this.field3486[var4] = (var6 << 7) + (this.field3486[var4] & -16257);
			}

			if (var5 == 33) {
				this.field3486[var4] = var6 + (this.field3486[var4] & -128);
			}

			if (var5 == 5) {
				this.field3487[var4] = (var6 << 7) + (this.field3487[var4] & -16257);
			}

			if (var5 == 37) {
				this.field3487[var4] = (this.field3487[var4] & -128) + var6;
			}

			if (var5 == 7) {
				this.field3479[var4] = (var6 << 7) + (this.field3479[var4] & -16257);
			}

			if (var5 == 39) {
				this.field3479[var4] = (this.field3479[var4] & -128) + var6;
			}

			if (var5 == 10) {
				this.field3480[var4] = (this.field3480[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 42) {
				this.field3480[var4] = (this.field3480[var4] & -128) + var6;
			}

			if (var5 == 11) {
				this.field3481[var4] = (this.field3481[var4] & -16257) + (var6 << 7);
			}

			if (var5 == 43) {
				this.field3481[var4] = (this.field3481[var4] & -128) + var6;
			}

			int[] var10000;
			if (var5 == 64) {
				if (var6 >= 64) {
					var10000 = this.field3490;
					var10000[var4] |= 1;
				} else {
					var10000 = this.field3490;
					var10000[var4] &= -2;
				}
			}

			if (var5 == 65) {
				if (var6 >= 64) {
					var10000 = this.field3490;
					var10000[var4] |= 2;
				} else {
					this.method6367(var4);
					var10000 = this.field3490;
					var10000[var4] &= -3;
				}
			}

			if (var5 == 99) {
				this.field3485[var4] = (var6 << 7) + (this.field3485[var4] & 127);
			}

			if (var5 == 98) {
				this.field3485[var4] = (this.field3485[var4] & 16256) + var6;
			}

			if (var5 == 101) {
				this.field3485[var4] = 16384 + (this.field3485[var4] & 127) + (var6 << 7);
			}

			if (var5 == 100) {
				this.field3485[var4] = 16384 + (this.field3485[var4] & 16256) + var6;
			}

			if (var5 == 120) {
				this.method6330(var4);
			}

			if (var5 == 121) {
				this.method6331(var4);
			}

			if (var5 == 123) {
				this.method6332(var4);
			}

			int var7;
			if (var5 == 6) {
				var7 = this.field3485[var4];
				if (var7 == 16384) {
					this.field3478[var4] = (var6 << 7) + (this.field3478[var4] & -16257);
				}
			}

			if (var5 == 38) {
				var7 = this.field3485[var4];
				if (var7 == 16384) {
					this.field3478[var4] = (this.field3478[var4] & -128) + var6;
				}
			}

			if (var5 == 16) {
				this.field3493[var4] = (var6 << 7) + (this.field3493[var4] & -16257);
			}

			if (var5 == 48) {
				this.field3493[var4] = (this.field3493[var4] & -128) + var6;
			}

			if (var5 == 81) {
				if (var6 >= 64) {
					var10000 = this.field3490;
					var10000[var4] |= 4;
				} else {
					this.method6335(var4);
					var10000 = this.field3490;
					var10000[var4] &= -5;
				}
			}

			if (var5 == 17) {
				this.method6337(var4, (var6 << 7) + (this.field3494[var4] & -16257));
			}

			if (var5 == 49) {
				this.method6337(var4, var6 + (this.field3494[var4] & -128));
			}

		} else if (var3 == 192) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method6419(var4, this.field3484[var4] + var5);
		} else if (var3 == 208) {
			var4 = var1 & 15;
			var5 = var1 >> 8 & 127;
			this.method6329(var4, var5);
		} else if (var3 == 224) {
			var4 = var1 & 15;
			var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
			this.method6433(var4, var5);
		} else {
			var3 = var1 & 255;
			if (var3 == 255) {
				this.method6333();
			}
		}
	}

	@ObfInfo(name = "bq", desc = "(III)V")
	public void method6337(int var1, int var2) {
		this.field3494[var1] = var2;
		this.field3476[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfInfo(name = "bj", desc = "(Lne;B)I", opaque = "64")
	public int method6338(Class343 var1) {
		int var3 = (var1.field3846 * var1.field3841 >> 12) + var1.field3853;
		var3 += this.field3478[var1.field3840] * (this.field3499[var1.field3840] - 8192) >> 12;
		Class331 var4 = var1.field3839;
		int var5;
		if (var4.field3450 > 0 && (var4.field3449 > 0 || this.field3486[var1.field3840] > 0)) {
			var5 = var4.field3449 << 2;
			int var6 = var4.field3443 << 1;
			if (var1.field3852 < var6) {
				var5 = var1.field3852 * var5 / var6;
			}

			var5 += this.field3486[var1.field3840] >> 7;
			double var7 = Math.sin((double)(var1.field3849 & 511) * 0.01227184630308513D);
			var3 += (int)(var7 * (double)var5);
		}

		var5 = (int)((double)(var1.field3847.field312 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)Client.field1382 + 0.5D);
		return var5 < 1 ? 1 : var5;
	}

	@ObfInfo(name = "bc", desc = "(Lne;B)I", opaque = "1")
	public int method6339(Class343 var1) {
		Class331 var3 = var1.field3839;
		int var4 = 4096 + this.field3479[var1.field3840] * this.field3481[var1.field3840] >> 13;
		var4 = var4 * var4 + 16384 >> 15;
		var4 = 16384 + var4 * var1.field3855 >> 15;
		var4 = var4 * this.field3491 + 128 >> 8;
		if (var3.field3445 > 0) {
			var4 = (int)((double)var4 * Math.pow(0.5D, (double)var1.field3844 * 1.953125E-5D * (double)var3.field3445) + 0.5D);
		}

		int var5;
		int var6;
		int var7;
		int var8;
		if (var3.field3447 != null) {
			var5 = var1.field3848;
			var6 = var3.field3447[1 + var1.field3854];
			if (var1.field3854 < var3.field3447.length - 2) {
				var7 = (var3.field3447[var1.field3854] & 255) << 8;
				var8 = (var3.field3447[var1.field3854 + 2] & 255) << 8;
				var6 += (var3.field3447[3 + var1.field3854] - var6) * (var5 - var7) / (var8 - var7);
			}

			var4 = 32 + var6 * var4 >> 6;
		}

		if (var1.field3850 > 0 && var3.field3444 != null) {
			var5 = var1.field3850;
			var6 = var3.field3444[1 + var1.field3851];
			if (var1.field3851 < var3.field3444.length - 2) {
				var7 = (var3.field3444[var1.field3851] & 255) << 8;
				var8 = (var3.field3444[var1.field3851 + 2] & 255) << 8;
				var6 += (var5 - var7) * (var3.field3444[3 + var1.field3851] - var6) / (var8 - var7);
			}

			var4 = 32 + var6 * var4 >> 6;
		}

		return var4;
	}

	@ObfInfo(name = "bz", desc = "(Lne;I)I", opaque = "1796105500")
	public int method6340(Class343 var1) {
		int var3 = this.field3480[var1.field3840];
		return var3 < 8192 ? 32 + var1.field3843 * var3 >> 6 : 16384 - (32 + (16384 - var3) * (128 - var1.field3843) >> 6);
	}

	@ObfInfo(name = "aa", desc = "()Lba;")
	public Class27 method384() {
		return this.field3504;
	}

	@ObfInfo(name = "at", desc = "()Lba;")
	public Class27 method379() {
		return null;
	}

	@ObfInfo(name = "ab", desc = "()I")
	public int method380() {
		return 0;
	}

	@ObfInfo(name = "ac", desc = "([III)V")
	public void method381(int[] var1, int var2, int var3) {
		if (this.field3498.method6448()) {
			int var4 = this.field3498.field3511 * this.field3482 / Client.field1382;

			do {
				long var5 = (long)var4 * (long)var3 + this.field3502;
				if (this.field3503 - var5 >= 0L) {
					this.field3502 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3503 - this.field3502) - 1L) / (long)var4);
				this.field3502 += (long)var7 * (long)var4;
				this.field3504.method381(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6376();
			} while(this.field3498.method6448());
		}

		this.field3504.method381(var1, var2, var3);
	}

	@ObfInfo(name = "ah", desc = "(I)V")
	public void method395(int var1) {
		if (this.field3498.method6448()) {
			int var2 = this.field3498.field3511 * this.field3482 / Client.field1382;

			do {
				long var3 = (long)var2 * (long)var1 + this.field3502;
				if (this.field3503 - var3 >= 0L) {
					this.field3502 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3503 - this.field3502) - 1L) / (long)var2);
				this.field3502 += (long)var2 * (long)var5;
				this.field3504.method395(var5);
				var1 -= var5;
				this.method6376();
			} while(this.field3498.method6448());
		}

		this.field3504.method395(var1);
	}

	@ObfInfo(name = "ba", desc = "(I)V", opaque = "-485260719")
	public void method6376() {
		int var2 = this.field3500;
		int var3 = this.field3492;

		long var4;
		for (var4 = this.field3503; var3 == this.field3492; var4 = this.field3498.method6446(var3)) {
			while (this.field3498.field3514[var2] == var3) {
				this.field3498.method6450(var2);
				int var6 = this.field3498.method6453(var2);
				if (var6 == 1) {
					this.field3498.method6473();
					this.field3498.method6451(var2);
					if (this.field3498.method6481()) {
						if (!this.field3507 || var3 == 0) {
							this.method6333();
							this.field3498.method6459();
							return;
						}

						this.field3498.method6474(var4);
					}
					break;
				}

				if ((var6 & 128) != 0) {
					this.method6417(var6);
				}

				this.field3498.method6447(var2);
				this.field3498.method6451(var2);
			}

			var2 = this.field3498.method6457();
			var3 = this.field3498.field3514[var2];
		}

		this.field3500 = var2;
		this.field3492 = var3;
		this.field3503 = var4;
	}

	@ObfInfo(name = "bb", desc = "(Lne;B)Z", opaque = "-1")
	public boolean method6347(Class343 var1) {
		if (var1.field3845 == null) {
			if (var1.field3850 >= 0) {
				var1.method9277();
				if (var1.field3838 > 0 && this.field3497[var1.field3840][var1.field3838] == var1) {
					this.field3497[var1.field3840][var1.field3838] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "by", desc = "(Lne;[IIII)Z", opaque = "-1519191575")
	public boolean method6388(Class343 var1, int[] var2, int var3, int var4) {
		var1.field3836 = Client.field1382 / 100;
		if (var1.field3850 < 0 || var1.field3845 != null && !var1.field3845.method943()) {
			int var6 = var1.field3846;
			if (var6 > 0) {
				var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3487[var1.field3840]) + 0.5D);
				if (var6 < 0) {
					var6 = 0;
				}

				var1.field3846 = var6;
			}

			var1.field3845.method933(this.method6338(var1));
			Class331 var7 = var1.field3839;
			boolean var8 = false;
			++var1.field3852;
			var1.field3849 += var7.field3450;
			double var9 = 5.086263020833333E-6D * (double)((var1.field3841 * var1.field3846 >> 12) + (var1.field3842 - 60 << 8));
			if (var7.field3445 > 0) {
				if (var7.field3451 > 0) {
					var1.field3844 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field3451) + 0.5D);
				} else {
					var1.field3844 += 128;
				}
			}

			if (var7.field3447 != null) {
				if (var7.field3446 > 0) {
					var1.field3848 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field3446) + 0.5D);
				} else {
					var1.field3848 += 128;
				}

				while (var1.field3854 < var7.field3447.length - 2 && var1.field3848 > (var7.field3447[var1.field3854 + 2] & 255) << 8) {
					var1.field3854 += 2;
				}

				if (var7.field3447.length - 2 == var1.field3854 && 0 == var7.field3447[var1.field3854 + 1]) {
					var8 = true;
				}
			}

			if (var1.field3850 >= 0 && var7.field3444 != null && (this.field3490[var1.field3840] & 1) == 0 && (var1.field3838 < 0 || var1 != this.field3497[var1.field3840][var1.field3838])) {
				if (var7.field3448 > 0) {
					var1.field3850 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field3448) + 0.5D);
				} else {
					var1.field3850 += 128;
				}

				while (var1.field3851 < var7.field3444.length - 2 && var1.field3850 > (var7.field3444[2 + var1.field3851] & 255) << 8) {
					var1.field3851 += 2;
				}

				if (var7.field3444.length - 2 == var1.field3851) {
					var8 = true;
				}
			}

			if (var8) {
				var1.field3845.method932(var1.field3836);
				if (var2 != null) {
					var1.field3845.method381(var2, var3, var4);
				} else {
					var1.field3845.method395(var4);
				}

				if (var1.field3845.method936()) {
					this.field3504.field3412.method743(var1.field3845);
				}

				var1.method6665();
				if (var1.field3850 >= 0) {
					var1.method9277();
					if (var1.field3838 > 0 && this.field3497[var1.field3840][var1.field3838] == var1) {
						this.field3497[var1.field3840][var1.field3838] = null;
					}
				}

				return true;
			} else {
				var1.field3845.method931(var1.field3836, this.method6339(var1), this.method6340(var1));
				return false;
			}
		} else {
			var1.method6665();
			var1.method9277();
			if (var1.field3838 > 0 && this.field3497[var1.field3840][var1.field3838] == var1) {
				this.field3497[var1.field3840][var1.field3838] = null;
			}

			return true;
		}
	}
}
