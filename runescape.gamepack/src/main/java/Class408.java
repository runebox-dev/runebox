import io.runebox.ObfInfo;
import java.util.HashMap;

@ObfInfo(name = "pr")
public class Class408 {
	@ObfInfo(desc = "[I")
	public static int[] field1557;
	@ObfInfo(name = "al", desc = "Lqi;")
	public Class425 field4637;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 182759609)
	public int field4640;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field4638;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field4639;
	@ObfInfo(name = "ak", desc = "Ljava/util/HashMap;")
	public final HashMap field4643;

	public Class408() {
		this.field4643 = new HashMap();
		this.field4637 = new Class425(0, 0);
		this.field4638 = new int[2048];
		this.field4639 = new int[2048];
		this.field4640 = 0;
		field1557 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = Class339.method6490((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
			field1557[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < field1557.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = Class339.method6490((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < field1557.length; ++var1) {
				field1557[var1] = var5;
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(II)V", opaque = "-16711937")
	public void method7583(int var1) {
		int var3 = 1 + var1 * 2;
		double[] var4 = Class82.method2248(0.0D, (double)((float)var1 / 3.0F), var1);
		double var5 = var4[var1] * var4[var1];
		int[] var7 = new int[var3 * var3];
		boolean var8 = false;

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = 0; var10 < var3; ++var10) {
				int var11 = var7[var10 + var9 * var3] = (int)(256.0D * (var4[var10] * var4[var9] / var5));
				if (!var8 && var11 > 0) {
					var8 = true;
				}
			}
		}

		Class549 var12 = new Class549(var7, var3, var3);
		this.field4643.put(var1, var12);
	}

	@ObfInfo(name = "al", desc = "(II)Lvc;", opaque = "1970065707")
	public Class549 method7580(int var1) {
		if (!this.field4643.containsKey(var1)) {
			this.method7583(var1);
		}

		return (Class549)this.field4643.get(var1);
	}

	@ObfInfo(name = "aj", desc = "(III)V", opaque = "-473263065")
	public final void method7581(int var1, int var2) {
		if (this.field4640 < this.field4638.length) {
			this.field4638[this.field4640] = var1;
			this.field4639[this.field4640] = var2;
			++this.field4640;
		}
	}

	@ObfInfo(name = "az", desc = "(B)V")
	public final void method7594() {
		this.field4640 = 0;
	}

	@ObfInfo(name = "af", desc = "(IILvc;FI)V", opaque = "-896621393")
	public final void method7591(int var1, int var2, Class549 var3, float var4) {
		int var6 = (int)(var4 * 18.0F);
		Class549 var7 = this.method7580(var6);
		int var8 = var6 * 2 + 1;
		Class425 var9 = new Class425(0, 0, var3.field5353, var3.field5354);
		Class425 var10 = new Class425(0, 0);
		this.field4637.method7841(var8, var8);
		System.nanoTime();

		int var11;
		int var12;
		int var13;
		for (var11 = 0; var11 < this.field4640; ++var11) {
			var12 = this.field4638[var11];
			var13 = this.field4639[var11];
			int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
			int var15 = (int)((float)var3.field5354 - var4 * (float)(var13 - var2)) - var6;
			this.field4637.method7840(var14, var15);
			this.field4637.method7843(var9, var10);
			this.method7584(var7, var3, var10);
		}

		System.nanoTime();
		System.nanoTime();

		for (var11 = 0; var11 < var3.field5357.length; ++var11) {
			if (var3.field5357[var11] == 0) {
				var3.field5357[var11] = -16777216;
			} else {
				var12 = (var3.field5357[var11] + 64 - 1) / 256;
				if (var12 <= 0) {
					var3.field5357[var11] = -16777216;
				} else {
					if (var12 > field1557.length) {
						var12 = field1557.length;
					}

					var13 = field1557[var12 - 1];
					var3.field5357[var11] = -16777216 | var13;
				}
			}
		}

		System.nanoTime();
	}

	@ObfInfo(name = "aa", desc = "(Lvc;Lvc;Lqi;I)V", opaque = "-1144373910")
	public void method7584(Class549 var1, Class549 var2, Class425 var3) {
		if (var3.field4690 != 0 && var3.field4688 != 0) {
			int var5 = 0;
			int var6 = 0;
			if (var3.field4691 == 0) {
				var5 = var1.field5353 - var3.field4690;
			}

			if (var3.field4689 == 0) {
				var6 = var1.field5354 - var3.field4688;
			}

			int var7 = var1.field5353 * var6 + var5;
			int var8 = var2.field5353 * var3.field4689 + var3.field4691;

			for (int var9 = 0; var9 < var3.field4688; ++var9) {
				for (int var10 = 0; var10 < var3.field4690; ++var10) {
					int[] var10000 = var2.field5357;
					int var10001 = var8++;
					var10000[var10001] += var1.field5357[var7++];
				}

				var7 += var1.field5353 - var3.field4690;
				var8 += var2.field5353 - var3.field4690;
			}

		}
	}
}
