import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class Class269 {
	public Class279[][] field2995;
	public Class306 field2986;
	public Class549 field2989;
	public Class557[] field2993;
	public boolean field2987;
	public boolean field2991;
	public int field2996;
	public int field2998;
	public int field2999;
	public int field3000;
	public int field3001;
	public HashMap field2990;
	public HashMap field3002;
	public final Class382 field2992;
	public final Class382 field2994;
	public final HashMap field2988;

	public Class269(Class557[] var1, HashMap var2, Class382 var3, Class382 var4) {
		this.field2991 = false;
		this.field2987 = false;
		this.field3002 = new HashMap();
		this.field3001 = 0;
		this.field2993 = var1;
		this.field2988 = var2;
		this.field2994 = var3;
		this.field2992 = var4;
	}

	public void method5362(Class382 var1, String var2, boolean var3) {
		if (!this.field2987) {
			this.field2991 = false;
			this.field2987 = true;
			System.nanoTime();
			int var5 = var1.method7233(Class308.field3249.field3251);
			int var6 = var1.method7299(var5, var2);
			Class521 var7 = new Class521(var1.method7271(Class308.field3249.field3251, var2));
			Class521 var8 = new Class521(var1.method7271(Class308.field3246.field3251, var2));
			System.nanoTime();
			System.nanoTime();
			this.field2986 = new Class306();

			try {
				this.field2986.method6147(var7, var8, var6, var3);
			} catch (IllegalStateException var17) {
				return;
			}

			this.field2986.method5815();
			this.field2986.method5804();
			this.field2986.method5805();
			this.field2998 = this.field2986.method5799() * 64;
			this.field2996 = this.field2986.method5801() * 64;
			this.field2999 = (this.field2986.method5800() - this.field2986.method5799() + 1) * 64;
			this.field3000 = (this.field2986.method5824() - this.field2986.method5801() + 1) * 64;
			int var9 = this.field2986.method5800() - this.field2986.method5799() + 1;
			int var10 = this.field2986.method5824() - this.field2986.method5801() + 1;
			System.nanoTime();
			System.nanoTime();
			Class279.field3086.method5894();
			this.field2995 = new Class279[var9][var10];
			Iterator var11 = this.field2986.field3240.iterator();

			while (var11.hasNext()) {
				Class282 var12 = (Class282)var11.next();
				int var13 = var12.field3223;
				int var14 = var12.field3213;
				int var15 = var13 - this.field2986.method5799();
				int var16 = var14 - this.field2986.method5801();
				this.field2995[var15][var16] = new Class279(var13, var14, this.field2986.method5796(), this.field2988);
				this.field2995[var15][var16].method5573(var12, this.field2986.field3239);
			}

			for (int var18 = 0; var18 < var9; ++var18) {
				for (int var20 = 0; var20 < var10; ++var20) {
					if (this.field2995[var18][var20] == null) {
						this.field2995[var18][var20] = new Class279(this.field2986.method5799() + var18, this.field2986.method5801() + var20, this.field2986.method5796(), this.field2988);
						this.field2995[var18][var20].method5574(this.field2986.field3238, this.field2986.field3239);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.method7235(Class308.field3247.field3251, var2)) {
				byte[] var19 = var1.method7271(Class308.field3247.field3251, var2);
				this.field2989 = Class46.method8418(var19);
			}

			System.nanoTime();
			var1.method7229();
			var1.method7231();
			this.field2991 = true;
		}
	}

	public final void method5359() {
		this.field2990 = null;
	}

	public final void method5360(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var10 = Class561.field5418;
		int var11 = Class87.field5423;
		int var12 = Class561.field5420;
		float[] var13 = Class561.field5421;
		int[] var14 = new int[4];
		Class561.method10195(var14);
		Class311 var15 = this.method5364(var1, var2, var3, var4);
		float var16 = this.method5369(var7 - var5, var3 - var1);
		int var17 = (int)Math.ceil((double)var16);
		this.field3001 = var17;
		if (!this.field3002.containsKey(var17)) {
			Class304 var18 = new Class304(var17);
			var18.method6087();
			this.field3002.put(var17, var18);
		}

		int var25 = var15.field3261 + var15.field3262 - 1;
		int var19 = var15.field3263 + var15.field3265 - 1;

		int var20;
		int var21;
		for (var20 = var15.field3262; var20 <= var25; ++var20) {
			for (var21 = var15.field3263; var21 <= var19; ++var21) {
				this.field2995[var20][var21].method5672(var17, (Class304)this.field3002.get(var17), this.field2993, this.field2994, this.field2992);
			}
		}

		Class253.method4794(var10, var11, var12, var13);
		Class561.method10147(var14);
		var20 = (int)(var16 * 64.0F);
		var21 = this.field2998 + var1;
		int var22 = this.field2996 + var2;

		for (int var23 = var15.field3262; var23 < var15.field3261 + var15.field3262; ++var23) {
			for (int var24 = var15.field3263; var24 < var15.field3263 + var15.field3265; ++var24) {
				this.field2995[var23][var24].method5572(var5 + (this.field2995[var23][var24].field3077 * 64 - var21) * var20 / 64, var8 - var20 * (this.field2995[var23][var24].field3078 * 64 - var22 + 64) / 64, var20);
			}
		}

	}

	public final void method5393(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		Class311 var15 = this.method5364(var1, var2, var3, var4);
		float var16 = this.method5369(var7 - var5, var3 - var1);
		int var17 = (int)(64.0F * var16);
		int var18 = this.field2998 + var1;
		int var19 = var2 + this.field2996;

		int var20;
		int var21;
		for (var20 = var15.field3262; var20 < var15.field3262 + var15.field3261; ++var20) {
			for (var21 = var15.field3263; var21 < var15.field3265 + var15.field3263; ++var21) {
				if (var13) {
					this.field2995[var20][var21].method5618();
				}

				this.field2995[var20][var21].method5622(var5 + var17 * (this.field2995[var20][var21].field3077 * 64 - var18) / 64, var8 - (this.field2995[var20][var21].field3078 * 64 - var19 + 64) * var17 / 64, var17, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var20 = var15.field3262; var20 < var15.field3261 + var15.field3262; ++var20) {
				for (var21 = var15.field3263; var21 < var15.field3263 + var15.field3265; ++var21) {
					this.field2995[var20][var21].method5583(var10, var11, var12);
				}
			}
		}

	}

	public void method5361(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.field2989 != null) {
			this.field2989.method9947(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.field2990 == null) {
					this.method5368();
				}

				Iterator var9 = var5.iterator();

				while (true) {
					List var11;
					do {
						if (!var9.hasNext()) {
							return;
						}

						int var10 = (Integer)var9.next();
						var11 = (List)this.field2990.get(var10);
					} while(var11 == null);

					Iterator var12 = var11.iterator();

					while (var12.hasNext()) {
						Class305 var13 = (Class305)var12.next();
						int var14 = var3 * (var13.field3235.field3869 - this.field2998) / this.field2999;
						int var15 = var4 - var4 * (var13.field3235.field3868 - this.field2996) / this.field3000;
						Class561.method10150(var14 + var1, var15 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	public List method5358(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var12 = new LinkedList();
		if (!this.field2991) {
			return var12;
		} else {
			Class311 var13 = this.method5364(var1, var2, var3, var4);
			float var14 = this.method5369(var7, var3 - var1);
			int var15 = (int)(var14 * 64.0F);
			int var16 = var1 + this.field2998;
			int var17 = var2 + this.field2996;

			for (int var18 = var13.field3262; var18 < var13.field3261 + var13.field3262; ++var18) {
				for (int var19 = var13.field3263; var19 < var13.field3265 + var13.field3263; ++var19) {
					List var20 = this.field2995[var18][var19].method5603((this.field2995[var18][var19].field3077 * 64 - var16) * var15 / 64 + var5, var8 + var6 - var15 * (64 + (this.field2995[var18][var19].field3078 * 64 - var17)) / 64, var15, var9, var10);
					if (!var20.isEmpty()) {
						var12.addAll(var20);
					}
				}
			}

			return var12;
		}
	}

	public Class311 method5364(int var1, int var2, int var3, int var4) {
		Class311 var6 = new Class311(this);
		int var7 = var1 + this.field2998;
		int var8 = var2 + this.field2996;
		int var9 = var3 + this.field2998;
		int var10 = var4 + this.field2996;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		int var14 = var10 / 64;
		var6.field3261 = 1 + (var13 - var11);
		var6.field3265 = var14 - var12 + 1;
		var6.field3262 = var11 - this.field2986.method5799();
		var6.field3263 = var12 - this.field2986.method5801();
		if (var6.field3262 < 0) {
			var6.field3261 += var6.field3262;
			var6.field3262 = 0;
		}

		if (var6.field3262 > this.field2995.length - var6.field3261) {
			var6.field3261 = this.field2995.length - var6.field3262;
		}

		if (var6.field3263 < 0) {
			var6.field3265 += var6.field3263;
			var6.field3263 = 0;
		}

		if (var6.field3263 > this.field2995[0].length - var6.field3265) {
			var6.field3265 = this.field2995[0].length - var6.field3263;
		}

		var6.field3261 = Math.min(var6.field3261, this.field2995.length);
		var6.field3265 = Math.min(var6.field3265, this.field2995[0].length);
		return var6;
	}

	public boolean method5365() {
		return this.field2991;
	}

	public int method5366() {
		return this.field2986.method5787();
	}

	public HashMap method5363() {
		this.method5368();
		return this.field2990;
	}

	public void method5368() {
		if (this.field2990 == null) {
			this.field2990 = new HashMap();
		}

		this.field2990.clear();

		for (int var2 = 0; var2 < this.field2995.length; ++var2) {
			for (int var3 = 0; var3 < this.field2995[var2].length; ++var3) {
				List var4 = this.field2995[var2][var3].method5604();
				Iterator var5 = var4.iterator();

				while (var5.hasNext()) {
					Class305 var6 = (Class305)var5.next();
					if (var6.method6119()) {
						int var7 = var6.method5728();
						if (!this.field2990.containsKey(var7)) {
							LinkedList var8 = new LinkedList();
							var8.add(var6);
							this.field2990.put(var7, var8);
						} else {
							List var9 = (List)this.field2990.get(var7);
							var9.add(var6);
						}
					}
				}
			}
		}

	}

	public float method5369(int var1, int var2) {
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
