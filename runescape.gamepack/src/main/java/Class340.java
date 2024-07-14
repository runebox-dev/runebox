import io.runebox.ObfInfo;
import java.nio.ByteBuffer;

@ObfInfo(name = "nb")
public class Class340 extends Class354 {
	@ObfInfo(name = "aq", desc = "Ljava/nio/ByteBuffer;")
	public ByteBuffer field3691;

	@ObfInfo(name = "ak", desc = "(B)[B")
	public byte[] method6404() {
		byte[] var2 = new byte[this.field3691.capacity()];
		this.field3691.position(0);
		this.field3691.get(var2);
		return var2;
	}

	@ObfInfo(name = "ap", desc = "([BI)V")
	public void method6403(byte[] var1) {
		this.field3691 = ByteBuffer.allocateDirect(var1.length);
		this.field3691.position(0);
		this.field3691.put(var1);
	}

	@ObfInfo(name = "aq", desc = "([FIFZFZ[FI)I", opaque = "-1045908994")
	public static int method6408(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var8 = 0.0F;

		for (int var9 = 0; var9 < var1 + 1; ++var9) {
			var8 += Math.abs(var0[var9]);
		}

		float var22 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * Class153.field1728;
		if (var8 <= var22) {
			return -1;
		} else {
			float[] var10 = new float[var1 + 1];

			int var11;
			for (var11 = 0; var11 < var1 + 1; ++var11) {
				var10[var11] = 1.0F / var8 * var0[var11];
			}

			while (Math.abs(var10[var1]) < var22) {
				--var1;
			}

			var11 = 0;
			if (var1 == 0) {
				return var11;
			} else if (var1 == 1) {
				var6[0] = -var10[0] / var10[1];
				boolean var23 = var3 ? var2 < var6[0] + var22 : var2 < var6[0] - var22;
				boolean var24 = var5 ? var4 > var6[0] - var22 : var4 > var6[0] + var22;
				var11 = var23 && var24 ? 1 : 0;
				if (var11 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var11;
			} else {
				Class437 var12 = new Class437(var10, var1);
				float[] var13 = new float[var1 + 1];

				for (int var14 = 1; var14 <= var1; ++var14) {
					var13[var14 - 1] = var10[var14] * (float)var14;
				}

				float[] var25 = new float[var1 + 1];
				int var15 = method6408(var13, var1 - 1, var2, false, var4, false, var25);
				if (var15 == -1) {
					return 0;
				} else {
					boolean var16 = false;
					float var18 = 0.0F;
					float var19 = 0.0F;
					float var20 = 0.0F;

					for (int var21 = 0; var21 <= var15; ++var21) {
						if (var11 > var1) {
							return var11;
						}

						float var17;
						if (var21 == 0) {
							var17 = var2;
							var19 = Class437.method5112(var10, var1, var2);
							if (Math.abs(var19) <= var22 && var3) {
								var6[var11++] = var2;
							}
						} else {
							var17 = var20;
							var19 = var18;
						}

						if (var15 == var21) {
							var20 = var4;
							var16 = false;
						} else {
							var20 = var25[var21];
						}

						var18 = Class437.method5112(var10, var1, var20);
						if (var16) {
							var16 = false;
						} else if (Math.abs(var18) < var22) {
							if (var15 != var21 || var5) {
								var6[var11++] = var20;
								var16 = true;
							}
						} else if (var19 < 0.0F && var18 > 0.0F || var19 > 0.0F && var18 < 0.0F) {
							var6[var11++] = Class77.method2226(var12, var17, var20, 0.0F);
							if (var11 > 1 && var6[var11 - 2] >= var6[var11 - 1] - var22) {
								var6[var11 - 2] = (var6[var11 - 1] + var6[var11 - 2]) * 0.5F;
								--var11;
							}
						}
					}

					return var11;
				}
			}
		}
	}
}
