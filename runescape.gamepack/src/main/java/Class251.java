import io.runebox.ObfInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "jq")
public final class Class251 {
	@ObfInfo(name = "an", desc = "[[Ljc;")
	public Class237[][] field2630;
	@ObfInfo(name = "ag", desc = "Lkl;")
	public Class272 field2635;
	@ObfInfo(name = "ak", desc = "Lvg;")
	public Class553 field2632;
	@ObfInfo(name = "av", desc = "[Lvv;")
	public Class568[] field2639;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field2636;
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field2640;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = -533881187)
	public int field2631;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1445696337)
	public int field2634;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 364355007)
	public int field2642;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -1677086603)
	public int field2643;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1441958215)
	public int field2644;
	@ObfInfo(name = "ap", desc = "Ljava/util/HashMap;")
	public HashMap field2633;
	@ObfInfo(name = "aj", desc = "Ljava/util/HashMap;")
	public HashMap field2641;
	@ObfInfo(name = "ab", desc = "Lok;")
	public final Class375 field2637;
	@ObfInfo(name = "ai", desc = "Lok;")
	public final Class375 field2638;
	@ObfInfo(name = "ae", desc = "Ljava/util/HashMap;")
	public final HashMap field2629;

	public Class251(Class568[] var1, HashMap var2, Class375 var3, Class375 var4) {
		this.field2640 = false;
		this.field2636 = false;
		this.field2641 = new HashMap();
		this.field2644 = 0;
		this.field2639 = var1;
		this.field2629 = var2;
		this.field2637 = var3;
		this.field2638 = var4;
	}

	@ObfInfo(name = "aq", desc = "(Lok;Ljava/lang/String;ZI)V", opaque = "-1320871917")
	public void method4873(Class375 var1, String var2, boolean var3) {
		if (!this.field2636) {
			this.field2640 = false;
			this.field2636 = true;
			System.nanoTime();
			int var5 = var1.method7150(Class266.field2736.field2733);
			int var6 = var1.method7209(var5, var2);
			Class562 var7 = new Class562(var1.method7153(Class266.field2736.field2733, var2));
			Class562 var8 = new Class562(var1.method7153(Class266.field2734.field2733, var2));
			System.nanoTime();
			System.nanoTime();
			this.field2635 = new Class272();

			try {
				this.field2635.method5104(var7, var8, var6, var3);
			} catch (IllegalStateException var17) {
				return;
			}

			this.field2635.method4770();
			this.field2635.method4793();
			this.field2635.method4758();
			this.field2634 = this.field2635.method4771() * 64;
			this.field2631 = this.field2635.method4768() * 64;
			this.field2642 = (this.field2635.method4767() - this.field2635.method4771() + 1) * 64;
			this.field2643 = (this.field2635.method4788() - this.field2635.method4768() + 1) * 64;
			int var9 = this.field2635.method4767() - this.field2635.method4771() + 1;
			int var10 = this.field2635.method4788() - this.field2635.method4768() + 1;
			System.nanoTime();
			System.nanoTime();
			Class237.field2519.method5992();
			this.field2630 = new Class237[var9][var10];
			Iterator var11 = this.field2635.field2794.iterator();

			while (var11.hasNext()) {
				Class248 var12 = (Class248)var11.next();
				int var13 = var12.field2568;
				int var14 = var12.field2569;
				int var15 = var13 - this.field2635.method4771();
				int var16 = var14 - this.field2635.method4768();
				this.field2630[var15][var16] = new Class237(var13, var14, this.field2635.method4809(), this.field2629);
				this.field2630[var15][var16].method4496(var12, this.field2635.field2796);
			}

			for (int var18 = 0; var18 < var9; ++var18) {
				for (int var20 = 0; var20 < var10; ++var20) {
					if (null == this.field2630[var18][var20]) {
						this.field2630[var18][var20] = new Class237(this.field2635.method4771() + var18, this.field2635.method4768() + var20, this.field2635.method4809(), this.field2629);
						this.field2630[var18][var20].method4533(this.field2635.field2795, this.field2635.field2796);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.method7137(Class266.field2735.field2733, var2)) {
				byte[] var19 = var1.method7153(Class266.field2735.field2733, var2);
				this.field2632 = Class41.method4002(var19);
			}

			System.nanoTime();
			var1.method7146();
			var1.method7194();
			this.field2640 = true;
		}
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public final void method4874() {
		this.field2633 = null;
	}

	@ObfInfo(name = "ag", desc = "(IIIIIIIIB)V", opaque = "111")
	public final void method4875(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = Class569.field5504;
		int var11 = Class88.field5502;
		int var12 = Class569.field5503;
		float[] var13 = Class569.field5506;
		int[] var14 = new int[4];
		Class569.method10132(var14);
		Class253 var15 = this.method4879(var1, var2, var3, var4);
		float var16 = this.method4884(var7 - var5, var3 - var1);
		int var17 = (int)Math.ceil((double)var16);
		this.field2644 = var17;
		if (!this.field2641.containsKey(var17)) {
			Class276 var18 = new Class276(var17);
			var18.method5208();
			this.field2641.put(var17, var18);
		}

		int var25 = var15.field2654 + var15.field2652 - 1;
		int var19 = var15.field2653 + var15.field2655 - 1;

		int var20;
		int var21;
		for (var20 = var15.field2652; var20 <= var25; ++var20) {
			for (var21 = var15.field2655; var21 <= var19; ++var21) {
				this.field2630[var20][var21].method4504(var17, (Class276)this.field2641.get(var17), this.field2639, this.field2637, this.field2638);
			}
		}

		Class274.method5128(var10, var11, var12, var13);
		Class569.method10133(var14);
		var20 = (int)(var16 * 64.0F);
		var21 = var1 + this.field2634;
		int var22 = this.field2631 + var2;

		for (int var23 = var15.field2652; var23 < var15.field2652 + var15.field2654; ++var23) {
			for (int var24 = var15.field2655; var24 < var15.field2653 + var15.field2655; ++var24) {
				this.field2630[var23][var24].method4495((this.field2630[var23][var24].field2525 * 64 - var21) * var20 / 64 + var5, var8 - var20 * (64 + (this.field2630[var23][var24].field2514 * 64 - var22)) / 64, var20);
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V", opaque = "854022479")
	public final void method4876(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		Class253 var15 = this.method4879(var1, var2, var3, var4);
		float var16 = this.method4884(var7 - var5, var3 - var1);
		int var17 = (int)(64.0F * var16);
		int var18 = var1 + this.field2634;
		int var19 = this.field2631 + var2;

		int var20;
		int var21;
		for (var20 = var15.field2652; var20 < var15.field2654 + var15.field2652; ++var20) {
			for (var21 = var15.field2655; var21 < var15.field2655 + var15.field2653; ++var21) {
				if (var13) {
					this.field2630[var20][var21].method4500();
				}

				this.field2630[var20][var21].method4505((this.field2630[var20][var21].field2525 * 64 - var18) * var17 / 64 + var5, var8 - (64 + (this.field2630[var20][var21].field2514 * 64 - var19)) * var17 / 64, var17, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var20 = var15.field2652; var20 < var15.field2652 + var15.field2654; ++var20) {
				for (var21 = var15.field2655; var21 < var15.field2653 + var15.field2655; ++var21) {
					this.field2630[var20][var21].method4506(var10, var11, var12);
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(IIIILjava/util/HashSet;IIB)V", opaque = "15")
	public void method4877(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.field2632 != null) {
			this.field2632.method9709(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.field2633 == null) {
					this.method4883();
				}

				Iterator var9 = var5.iterator();

				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}

						int var10 = (Integer)var9.next();
						var11 = (List)this.field2633.get(var10);
					} while(var11 == null);

					Iterator var12 = var11.iterator();

					while (var12.hasNext()) {
						Class268 var13 = (Class268)var12.next();
						int var14 = (var13.field2748.field3748 - this.field2634) * var3 / this.field2642;
						int var15 = var4 - (var13.field2748.field3750 - this.field2631) * var4 / this.field2643;
						Class569.method10131(var14 + var1, var15 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	@ObfInfo(name = "an", desc = "(IIIIIIIIIIB)Ljava/util/List;", opaque = "14")
	public List method4912(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field2640) {
			return var12;
		} else {
			Class253 var13 = this.method4879(var1, var2, var3, var4);
			float var14 = this.method4884(var7, var3 - var1);
			int var15 = (int)(var14 * 64.0F);
			int var16 = var1 + this.field2634;
			int var17 = var2 + this.field2631;

			for (int var18 = var13.field2652; var18 < var13.field2654 + var13.field2652; ++var18) {
				for (int var19 = var13.field2655; var19 < var13.field2655 + var13.field2653; ++var19) {
					List var20 = this.field2630[var18][var19].method4526(var15 * (this.field2630[var18][var19].field2525 * 64 - var16) / 64 + var5, var8 + var6 - (this.field2630[var18][var19].field2514 * 64 - var17 + 64) * var15 / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	@ObfInfo(name = "aj", desc = "(IIIIB)Ljs;", opaque = "95")
	public Class253 method4879(int var1, int var2, int var3, int var4) {
		Class253 var6 = new Class253(this);
		int var7 = this.field2634 + var1;
		int var8 = var2 + this.field2631;
		int var9 = var3 + this.field2634;
		int var10 = var4 + this.field2631;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field2654 = var13 - var11 + 1;
		var6.field2653 = 1 + (var14 - var12);
		var6.field2652 = var11 - this.field2635.method4771();
		var6.field2655 = var12 - this.field2635.method4768();
		if (var6.field2652 < 0) {
			var6.field2654 += var6.field2652;
			var6.field2652 = 0;
		}

		if (var6.field2652 > this.field2630.length - var6.field2654) {
			var6.field2654 = this.field2630.length - var6.field2652;
		}

		if (var6.field2655 < 0) {
			var6.field2653 += var6.field2655;
			var6.field2655 = 0;
		}

		if (var6.field2655 > this.field2630[0].length - var6.field2653) {
			var6.field2653 = this.field2630[0].length - var6.field2655;
		}

		var6.field2654 = Math.min(var6.field2654, this.field2630.length);
		var6.field2653 = Math.min(var6.field2653, this.field2630[0].length);
		return var6;
	}

	@ObfInfo(name = "av", desc = "(I)Z")
	public boolean method4880() {
		return this.field2640;
	}

	@ObfInfo(name = "ab", desc = "(B)I")
	public int method4881() {
		return this.field2635.method4823();
	}

	@ObfInfo(name = "ai", desc = "(I)Ljava/util/HashMap;")
	public HashMap method4885() {
		this.method4883();
		return this.field2633;
	}

	@ObfInfo(name = "ae", desc = "(I)V", opaque = "-963801199")
	public void method4883() {
		if (this.field2633 == null) {
			this.field2633 = new HashMap();
		}

		this.field2633.clear();

		for (int var2 = 0; var2 < this.field2630.length; ++var2) {
			for (int var3 = 0; var3 < this.field2630[var2].length; ++var3) {
				List var4 = this.field2630[var2][var3].method4527();
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					Class268 var6 = (Class268)var5.next();
					if (var6.method5065()) {
						int var7 = var6.method4659();
						if (!this.field2633.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field2633.put(var7, var8);
						} else {
							List var9 = (List)this.field2633.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "au", desc = "(IIS)F", opaque = "496")
	public float method4884(int var1, int var2) {
		float var4 = (float)var1 / (float)var2;
		if (var4 > 8.0F) {
			return 8.0F;
		} else if (var4 < 1.0F) {
			return 1.0F;
		} else {
			int var5 = Math.round(var4);
			return Math.abs((float)var5 - var4) < 0.05F ? (float)var5 : var4;
		}
	}
}
