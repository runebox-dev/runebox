import io.runebox.ObfInfo;
import java.util.HashMap;

@ObfInfo(name = "pb")
public class Class392 {
	@ObfInfo(owner = "bh", name = "ab", desc = "[I")
	public static int[] field176;
	@ObfInfo(name = "ad", desc = "Lqa;")
	public Class417 field4585;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1659401979)
	public int field4588;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field4587;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field4589;
	@ObfInfo(name = "aq", desc = "Ljava/util/HashMap;")
	public final HashMap field4590;

	public Class392() {
		this.field4590 = new HashMap();
		this.field4585 = new Class417(0, 0);
		this.field4589 = new int[2048];
		this.field4587 = new int[2048];
		this.field4588 = 0;
		field176 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = Class239.method6346((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var1 * 0.425F / 16.0F));
			field176[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < field176.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = Class239.method6346((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < field176.length; ++var1) {
				field176[var1] = var5;
			}
		}

	}

	@ObfInfo(name = "aq", desc = "(II)V", opaque = "-345524306")
	public void method7326(int var1) {
		int var3 = var1 * 2 + 1;
		double[] var4 = Class435.method2972(0.0D, (double)((float)var1 / 3.0F), var1);
		double var5 = var4[var1] * var4[var1];
		int[] var7 = new int[var3 * var3];
		boolean var8 = false;

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = 0; var10 < var3; ++var10) {
				int var11 = var7[var9 * var3 + var10] = (int)(256.0D * (var4[var10] * var4[var9] / var5));
				if (!var8 && var11 > 0) {
					var8 = true;
				}
			}
		}

		Class553 var12 = new Class553(var7, var3, var3);
		this.field4590.put(var1, var12);
	}

	@ObfInfo(name = "ad", desc = "(II)Lvg;", opaque = "802516227")
	public Class553 method7327(int var1) {
		if (!this.field4590.containsKey(var1)) {
			this.method7326(var1);
		}

		return (Class553)this.field4590.get(var1);
	}

	@ObfInfo(name = "ag", desc = "(III)V", opaque = "1314046197")
	public final void method7328(int var1, int var2) {
		if (this.field4588 < this.field4589.length) {
			this.field4589[this.field4588] = var1;
			this.field4587[this.field4588] = var2;
			++this.field4588;
		}
	}

	@ObfInfo(name = "ak", desc = "(I)V")
	public final void method7325() {
		this.field4588 = 0;
	}

	@ObfInfo(name = "ap", desc = "(IILvg;FB)V", opaque = "-1")
	public final void method7334(int var1, int var2, Class553 var3, float var4) {
		int var6 = (int)(18.0F * var4);
		Class553 var7 = this.method7327(var6);
		int var8 = var6 * 2 + 1;
		Class417 var9 = new Class417(0, 0, var3.field5421, var3.field5424);
		Class417 var10 = new Class417(0, 0);
		this.field4585.method7669(var8, var8);
		System.nanoTime();

		int var11;
		int var12;
		int var13;
		for (var11 = 0; var11 < this.field4588; ++var11) {
			var12 = this.field4589[var11];
			var13 = this.field4587[var11];
			int var14 = (int)((float)(var12 - var1) * var4) - var6;
			int var15 = (int)((float)var3.field5424 - (float)(var13 - var2) * var4) - var6;
			this.field4585.method7668(var14, var15);
			this.field4585.method7666(var9, var10);
			this.method7340(var7, var3, var10);
		}

		System.nanoTime();
		System.nanoTime();

		for (var11 = 0; var11 < var3.field5429.length; ++var11) {
			if (0 == var3.field5429[var11]) {
				var3.field5429[var11] = -16777216;
			} else {
				var12 = (var3.field5429[var11] + 64 - 1) / 256;
				if (var12 <= 0) {
					var3.field5429[var11] = -16777216;
				} else {
					if (var12 > field176.length) {
						var12 = field176.length;
					}

					var13 = field176[var12 - 1];
					var3.field5429[var11] = -16777216 | var13;
				}
			}
		}

		System.nanoTime();
	}

	@ObfInfo(name = "an", desc = "(Lvg;Lvg;Lqa;I)V", opaque = "1934834752")
	public void method7340(Class553 var1, Class553 var2, Class417 var3) {
		if (var3.field4677 != 0 && 0 != var3.field4680) {
			int var5 = 0;
			int var6 = 0;
			if (var3.field4679 == 0) {
				var5 = var1.field5421 - var3.field4677;
			}

			if (var3.field4678 == 0) {
				var6 = var1.field5424 - var3.field4680;
			}

			int var7 = var1.field5421 * var6 + var5;
			int var8 = var2.field5421 * var3.field4678 + var3.field4679;

			for (int var9 = 0; var9 < var3.field4680; ++var9) {
				for (int var10 = 0; var10 < var3.field4677; ++var10) {
					int[] var10000 = var2.field5429;
					int var10001 = var8++;
					var10000[var10001] += var1.field5429[var7++];
				}

				var7 += var1.field5421 - var3.field4677;
				var8 += var2.field5421 - var3.field4677;
			}

		}
	}
}
