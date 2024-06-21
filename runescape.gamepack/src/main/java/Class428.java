import io.runebox.ObfInfo;
import java.util.Arrays;

public final class Class428 {
	@ObfInfo(name = "al", desc = "[Lql;")
	public static Class428[] field4696;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1072253169)
	public static int field4698;
	@ObfInfo(owner = "ue", name = "az", desc = "I", intMultiplier = -1830068443)
	public static int field5232;
	@ObfInfo(name = "aa", desc = "Lql;")
	public static final Class428 field4700;
	@ObfInfo(name = "af", desc = "[F")
	public float[] field4699;

	static {
		field4696 = new Class428[0];
		method7461(100);
		field4700 = new Class428();
	}

	public Class428() {
		this.field4699 = new float[16];
		this.method7921();
	}

	public Class428(Class428 var1) {
		this.field4699 = new float[16];
		this.method7955(var1);
	}

	public Class428(Class521 var1, boolean var2) {
		this.field4699 = new float[16];
		this.method7881(var1, var2);
	}

	@ObfInfo(name = "al", desc = "(B)V")
	public void method7908() {
		synchronized(field4696) {
			if (field5232 < field4698 - 1) {
				field4696[++field5232 - 1] = this;
			}

		}
	}

	@ObfInfo(name = "aj", desc = "(Lua;ZI)V", opaque = "1413000688")
	public void method7881(Class521 var1, boolean var2) {
		if (var2) {
			Class440 var4 = new Class440();
			int var7 = var1.method9535();
			var7 &= 16383;
			float var6 = (float)(6.283185307179586D * (double)((float)var7 / 16384.0F));
			var4.method8252(var6);
			int var10 = var1.method9535();
			var10 &= 16383;
			float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586D);
			var4.method8253(var9);
			int var13 = var1.method9535();
			var13 &= 16383;
			float var12 = (float)((double)((float)var13 / 16384.0F) * 6.283185307179586D);
			var4.method8254(var12);
			var4.method8255((float)var1.method9535(), (float)var1.method9535(), (float)var1.method9535());
			this.method7956(var4);
		} else {
			for (int var14 = 0; var14 < 16; ++var14) {
				this.field4699[var14] = var1.method9412();
			}
		}

	}

	@ObfInfo(name = "az", desc = "(B)[F", opaque = "1")
	public float[] method7882() {
		float[] var2 = new float[3];
		if ((double)this.field4699[2] < 0.999D && (double)this.field4699[2] > -0.999D) {
			var2[1] = (float)(-Math.asin((double)this.field4699[2]));
			double var3 = Math.cos((double)var2[1]);
			var2[0] = (float)Math.atan2((double)this.field4699[6] / var3, (double)this.field4699[10] / var3);
			var2[2] = (float)Math.atan2((double)this.field4699[1] / var3, (double)this.field4699[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2((double)this.field4699[2], 0.0D);
			var2[2] = (float)Math.atan2((double)(-this.field4699[9]), (double)this.field4699[5]);
		}

		return var2;
	}

	@ObfInfo(name = "af", desc = "(B)[F", opaque = "0")
	public float[] method7883() {
		float[] var2 = new float[]{(float)(-Math.asin((double)this.field4699[6])), 0.0F, 0.0F};
		double var3 = Math.cos((double)var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double)this.field4699[2];
			var7 = (double)this.field4699[10];
			double var9 = (double)this.field4699[4];
			double var11 = (double)this.field4699[5];
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			var5 = (double)this.field4699[1];
			var7 = (double)this.field4699[0];
			if (this.field4699[6] < 0.0F) {
				var2[1] = (float)Math.atan2(var5, var7);
			} else {
				var2[1] = (float)(-Math.atan2(var5, var7));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	@ObfInfo(name = "aa", desc = "(B)V")
	public void method7921() {
		this.field4699[0] = 1.0F;
		this.field4699[1] = 0.0F;
		this.field4699[2] = 0.0F;
		this.field4699[3] = 0.0F;
		this.field4699[4] = 0.0F;
		this.field4699[5] = 1.0F;
		this.field4699[6] = 0.0F;
		this.field4699[7] = 0.0F;
		this.field4699[8] = 0.0F;
		this.field4699[9] = 0.0F;
		this.field4699[10] = 1.0F;
		this.field4699[11] = 0.0F;
		this.field4699[12] = 0.0F;
		this.field4699[13] = 0.0F;
		this.field4699[14] = 0.0F;
		this.field4699[15] = 1.0F;
	}

	@ObfInfo(name = "at", desc = "(B)V")
	public void method7892() {
		this.field4699[0] = 0.0F;
		this.field4699[1] = 0.0F;
		this.field4699[2] = 0.0F;
		this.field4699[3] = 0.0F;
		this.field4699[4] = 0.0F;
		this.field4699[5] = 0.0F;
		this.field4699[6] = 0.0F;
		this.field4699[7] = 0.0F;
		this.field4699[8] = 0.0F;
		this.field4699[9] = 0.0F;
		this.field4699[10] = 0.0F;
		this.field4699[11] = 0.0F;
		this.field4699[12] = 0.0F;
		this.field4699[13] = 0.0F;
		this.field4699[14] = 0.0F;
		this.field4699[15] = 0.0F;
	}

	@ObfInfo(name = "ab", desc = "(Lql;B)V")
	public void method7955(Class428 var1) {
		System.arraycopy(var1.field4699, 0, this.field4699, 0, 16);
	}

	@ObfInfo(name = "ac", desc = "(FI)V")
	public void method7887(float var1) {
		this.method7888(var1, var1, var1);
	}

	@ObfInfo(name = "ao", desc = "(FFFS)V")
	public void method7888(float var1, float var2, float var3) {
		this.method7921();
		this.field4699[0] = var1;
		this.field4699[5] = var2;
		this.field4699[10] = var3;
	}

	@ObfInfo(name = "ah", desc = "(Lql;B)V", opaque = "16")
	public void method7889(Class428 var1) {
		for (int var3 = 0; var3 < this.field4699.length; ++var3) {
			float[] var10000 = this.field4699;
			var10000[var3] += var1.field4699[var3];
		}

	}

	@ObfInfo(name = "av", desc = "(Lql;I)V")
	public void method7935(Class428 var1) {
		float var3 = this.field4699[3] * var1.field4699[12] + var1.field4699[8] * this.field4699[2] + this.field4699[0] * var1.field4699[0] + var1.field4699[4] * this.field4699[1];
		float var4 = this.field4699[2] * var1.field4699[9] + this.field4699[1] * var1.field4699[5] + this.field4699[0] * var1.field4699[1] + var1.field4699[13] * this.field4699[3];
		float var5 = this.field4699[3] * var1.field4699[14] + var1.field4699[2] * this.field4699[0] + var1.field4699[6] * this.field4699[1] + var1.field4699[10] * this.field4699[2];
		float var6 = this.field4699[3] * var1.field4699[15] + this.field4699[2] * var1.field4699[11] + var1.field4699[7] * this.field4699[1] + this.field4699[0] * var1.field4699[3];
		float var7 = var1.field4699[8] * this.field4699[6] + this.field4699[5] * var1.field4699[4] + this.field4699[4] * var1.field4699[0] + var1.field4699[12] * this.field4699[7];
		float var8 = this.field4699[7] * var1.field4699[13] + this.field4699[6] * var1.field4699[9] + this.field4699[5] * var1.field4699[5] + this.field4699[4] * var1.field4699[1];
		float var9 = var1.field4699[14] * this.field4699[7] + var1.field4699[10] * this.field4699[6] + this.field4699[5] * var1.field4699[6] + this.field4699[4] * var1.field4699[2];
		float var10 = this.field4699[7] * var1.field4699[15] + this.field4699[6] * var1.field4699[11] + var1.field4699[7] * this.field4699[5] + var1.field4699[3] * this.field4699[4];
		float var11 = this.field4699[10] * var1.field4699[8] + this.field4699[9] * var1.field4699[4] + var1.field4699[0] * this.field4699[8] + var1.field4699[12] * this.field4699[11];
		float var12 = var1.field4699[13] * this.field4699[11] + this.field4699[8] * var1.field4699[1] + this.field4699[9] * var1.field4699[5] + var1.field4699[9] * this.field4699[10];
		float var13 = var1.field4699[14] * this.field4699[11] + this.field4699[9] * var1.field4699[6] + this.field4699[8] * var1.field4699[2] + this.field4699[10] * var1.field4699[10];
		float var14 = var1.field4699[11] * this.field4699[10] + this.field4699[9] * var1.field4699[7] + this.field4699[8] * var1.field4699[3] + this.field4699[11] * var1.field4699[15];
		float var15 = var1.field4699[8] * this.field4699[14] + this.field4699[12] * var1.field4699[0] + this.field4699[13] * var1.field4699[4] + var1.field4699[12] * this.field4699[15];
		float var16 = var1.field4699[9] * this.field4699[14] + this.field4699[13] * var1.field4699[5] + this.field4699[12] * var1.field4699[1] + this.field4699[15] * var1.field4699[13];
		float var17 = this.field4699[15] * var1.field4699[14] + var1.field4699[6] * this.field4699[13] + this.field4699[12] * var1.field4699[2] + this.field4699[14] * var1.field4699[10];
		float var18 = var1.field4699[11] * this.field4699[14] + this.field4699[12] * var1.field4699[3] + this.field4699[13] * var1.field4699[7] + this.field4699[15] * var1.field4699[15];
		this.field4699[0] = var3;
		this.field4699[1] = var4;
		this.field4699[2] = var5;
		this.field4699[3] = var6;
		this.field4699[4] = var7;
		this.field4699[5] = var8;
		this.field4699[6] = var9;
		this.field4699[7] = var10;
		this.field4699[8] = var11;
		this.field4699[9] = var12;
		this.field4699[10] = var13;
		this.field4699[11] = var14;
		this.field4699[12] = var15;
		this.field4699[13] = var16;
		this.field4699[14] = var17;
		this.field4699[15] = var18;
	}

	@ObfInfo(name = "aq", desc = "(Lqd;I)V")
	public void method7897(Class420 var1) {
		float var3 = var1.field4673.field4786 * var1.field4673.field4786;
		float var4 = var1.field4673.field4786 * var1.field4673.field4788;
		float var5 = var1.field4673.field4785 * var1.field4673.field4786;
		float var6 = var1.field4673.field4790 * var1.field4673.field4786;
		float var7 = var1.field4673.field4788 * var1.field4673.field4788;
		float var8 = var1.field4673.field4785 * var1.field4673.field4788;
		float var9 = var1.field4673.field4790 * var1.field4673.field4788;
		float var10 = var1.field4673.field4785 * var1.field4673.field4785;
		float var11 = var1.field4673.field4790 * var1.field4673.field4785;
		float var12 = var1.field4673.field4790 * var1.field4673.field4790;
		this.field4699[0] = var3 + var7 - var12 - var10;
		this.field4699[1] = var6 + var8 + var6 + var8;
		this.field4699[2] = var9 - var5 - var5 + var9;
		this.field4699[4] = var8 - var6 - var6 + var8;
		this.field4699[5] = var3 + var10 - var7 - var12;
		this.field4699[6] = var11 + var11 + var4 + var4;
		this.field4699[8] = var9 + var9 + var5 + var5;
		this.field4699[9] = var11 - var4 - var4 + var11;
		this.field4699[10] = var3 + var12 - var10 - var7;
		float[] var13 = this.field4699;
		float[] var14 = this.field4699;
		this.field4699[11] = 0.0F;
		var14[7] = 0.0F;
		var13[3] = 0.0F;
		this.field4699[12] = var1.field4674.field4680;
		this.field4699[13] = var1.field4674.field4677;
		this.field4699[14] = var1.field4674.field4678;
		this.field4699[15] = 1.0F;
	}

	@ObfInfo(name = "ap", desc = "(Lqz;I)V")
	public void method7884(Class442 var1) {
		float var3 = var1.field4786 * var1.field4786;
		float var4 = var1.field4788 * var1.field4786;
		float var5 = var1.field4785 * var1.field4786;
		float var6 = var1.field4790 * var1.field4786;
		float var7 = var1.field4788 * var1.field4788;
		float var8 = var1.field4788 * var1.field4785;
		float var9 = var1.field4790 * var1.field4788;
		float var10 = var1.field4785 * var1.field4785;
		float var11 = var1.field4790 * var1.field4785;
		float var12 = var1.field4790 * var1.field4790;
		this.field4699[0] = var7 + var3 - var12 - var10;
		this.field4699[1] = var8 + var6 + var8 + var6;
		this.field4699[2] = var9 + (var9 - var5 - var5);
		this.field4699[4] = var8 - var6 - var6 + var8;
		this.field4699[5] = var10 + var3 - var7 - var12;
		this.field4699[6] = var11 + var4 + var11 + var4;
		this.field4699[8] = var9 + var9 + var5 + var5;
		this.field4699[9] = var11 + (var11 - var4 - var4);
		this.field4699[10] = var3 + var12 - var10 - var7;
	}

	@ObfInfo(name = "ae", desc = "(Lqx;I)V")
	public void method7956(Class440 var1) {
		this.field4699[0] = var1.field4773;
		this.field4699[1] = var1.field4781;
		this.field4699[2] = var1.field4770;
		this.field4699[3] = 0.0F;
		this.field4699[4] = var1.field4772;
		this.field4699[5] = var1.field4774;
		this.field4699[6] = var1.field4775;
		this.field4699[7] = 0.0F;
		this.field4699[8] = var1.field4776;
		this.field4699[9] = var1.field4777;
		this.field4699[10] = var1.field4778;
		this.field4699[11] = 0.0F;
		this.field4699[12] = var1.field4779;
		this.field4699[13] = var1.field4780;
		this.field4699[14] = var1.field4771;
		this.field4699[15] = 1.0F;
	}

	@ObfInfo(name = "ax", desc = "(B)F")
	public float method7894() {
		return this.field4699[8] * this.field4699[5] * this.field4699[3] * this.field4699[14] + this.field4699[7] * this.field4699[2] * this.field4699[8] * this.field4699[13] + this.field4699[11] * this.field4699[2] * this.field4699[5] * this.field4699[12] + (this.field4699[12] * this.field4699[1] * this.field4699[7] * this.field4699[10] + (this.field4699[6] * this.field4699[0] * this.field4699[11] * this.field4699[13] + (this.field4699[0] * this.field4699[5] * this.field4699[10] * this.field4699[15] - this.field4699[5] * this.field4699[0] * this.field4699[11] * this.field4699[14] - this.field4699[15] * this.field4699[6] * this.field4699[0] * this.field4699[9]) + this.field4699[9] * this.field4699[0] * this.field4699[7] * this.field4699[14] - this.field4699[13] * this.field4699[7] * this.field4699[0] * this.field4699[10] - this.field4699[15] * this.field4699[4] * this.field4699[1] * this.field4699[10] + this.field4699[1] * this.field4699[4] * this.field4699[11] * this.field4699[14] + this.field4699[8] * this.field4699[1] * this.field4699[6] * this.field4699[15] - this.field4699[12] * this.field4699[11] * this.field4699[6] * this.field4699[1] - this.field4699[14] * this.field4699[7] * this.field4699[1] * this.field4699[8]) + this.field4699[9] * this.field4699[2] * this.field4699[4] * this.field4699[15] - this.field4699[11] * this.field4699[4] * this.field4699[2] * this.field4699[13] - this.field4699[15] * this.field4699[8] * this.field4699[5] * this.field4699[2]) - this.field4699[2] * this.field4699[7] * this.field4699[9] * this.field4699[12] - this.field4699[14] * this.field4699[3] * this.field4699[4] * this.field4699[9] + this.field4699[13] * this.field4699[3] * this.field4699[4] * this.field4699[10] - this.field4699[12] * this.field4699[3] * this.field4699[5] * this.field4699[10] - this.field4699[13] * this.field4699[8] * this.field4699[6] * this.field4699[3] + this.field4699[12] * this.field4699[9] * this.field4699[6] * this.field4699[3];
	}

	@ObfInfo(name = "ay", desc = "(I)V")
	public void method7901() {
		float var2 = 1.0F / this.method7894();
		float var3 = (this.field4699[14] * this.field4699[7] * this.field4699[9] + this.field4699[13] * this.field4699[11] * this.field4699[6] + (this.field4699[10] * this.field4699[5] * this.field4699[15] - this.field4699[11] * this.field4699[5] * this.field4699[14] - this.field4699[15] * this.field4699[6] * this.field4699[9]) - this.field4699[13] * this.field4699[7] * this.field4699[10]) * var2;
		float var4 = var2 * (this.field4699[2] * this.field4699[9] * this.field4699[15] + this.field4699[14] * this.field4699[1] * this.field4699[11] + -this.field4699[1] * this.field4699[10] * this.field4699[15] - this.field4699[11] * this.field4699[2] * this.field4699[13] - this.field4699[3] * this.field4699[9] * this.field4699[14] + this.field4699[13] * this.field4699[10] * this.field4699[3]);
		float var5 = var2 * (this.field4699[14] * this.field4699[5] * this.field4699[3] + this.field4699[13] * this.field4699[2] * this.field4699[7] + (this.field4699[1] * this.field4699[6] * this.field4699[15] - this.field4699[14] * this.field4699[7] * this.field4699[1] - this.field4699[15] * this.field4699[5] * this.field4699[2]) - this.field4699[13] * this.field4699[6] * this.field4699[3]);
		float var6 = var2 * (this.field4699[9] * this.field4699[3] * this.field4699[6] + (this.field4699[11] * this.field4699[2] * this.field4699[5] + this.field4699[7] * this.field4699[1] * this.field4699[10] + this.field4699[6] * -this.field4699[1] * this.field4699[11] - this.field4699[9] * this.field4699[2] * this.field4699[7] - this.field4699[3] * this.field4699[5] * this.field4699[10]));
		float var7 = var2 * (this.field4699[15] * this.field4699[10] * -this.field4699[4] + this.field4699[14] * this.field4699[11] * this.field4699[4] + this.field4699[8] * this.field4699[6] * this.field4699[15] - this.field4699[6] * this.field4699[11] * this.field4699[12] - this.field4699[14] * this.field4699[8] * this.field4699[7] + this.field4699[7] * this.field4699[10] * this.field4699[12]);
		float var8 = (this.field4699[2] * this.field4699[11] * this.field4699[12] + (this.field4699[15] * this.field4699[10] * this.field4699[0] - this.field4699[14] * this.field4699[11] * this.field4699[0] - this.field4699[15] * this.field4699[2] * this.field4699[8]) + this.field4699[3] * this.field4699[8] * this.field4699[14] - this.field4699[10] * this.field4699[3] * this.field4699[12]) * var2;
		float var9 = var2 * (this.field4699[15] * this.field4699[2] * this.field4699[4] + -this.field4699[0] * this.field4699[6] * this.field4699[15] + this.field4699[14] * this.field4699[0] * this.field4699[7] - this.field4699[12] * this.field4699[7] * this.field4699[2] - this.field4699[3] * this.field4699[4] * this.field4699[14] + this.field4699[12] * this.field4699[3] * this.field4699[6]);
		float var10 = (this.field4699[10] * this.field4699[3] * this.field4699[4] + this.field4699[6] * this.field4699[0] * this.field4699[11] - this.field4699[0] * this.field4699[7] * this.field4699[10] - this.field4699[4] * this.field4699[2] * this.field4699[11] + this.field4699[2] * this.field4699[7] * this.field4699[8] - this.field4699[6] * this.field4699[3] * this.field4699[8]) * var2;
		float var11 = var2 * (this.field4699[7] * this.field4699[8] * this.field4699[13] + this.field4699[5] * this.field4699[11] * this.field4699[12] + (this.field4699[15] * this.field4699[4] * this.field4699[9] - this.field4699[4] * this.field4699[11] * this.field4699[13] - this.field4699[15] * this.field4699[8] * this.field4699[5]) - this.field4699[12] * this.field4699[7] * this.field4699[9]);
		float var12 = (this.field4699[1] * this.field4699[8] * this.field4699[15] + this.field4699[13] * this.field4699[11] * this.field4699[0] + this.field4699[15] * -this.field4699[0] * this.field4699[9] - this.field4699[12] * this.field4699[11] * this.field4699[1] - this.field4699[13] * this.field4699[3] * this.field4699[8] + this.field4699[12] * this.field4699[3] * this.field4699[9]) * var2;
		float var13 = var2 * (this.field4699[7] * this.field4699[1] * this.field4699[12] + (this.field4699[15] * this.field4699[5] * this.field4699[0] - this.field4699[13] * this.field4699[7] * this.field4699[0] - this.field4699[15] * this.field4699[1] * this.field4699[4]) + this.field4699[3] * this.field4699[4] * this.field4699[13] - this.field4699[3] * this.field4699[5] * this.field4699[12]);
		float var14 = (this.field4699[11] * this.field4699[1] * this.field4699[4] + this.field4699[11] * this.field4699[5] * -this.field4699[0] + this.field4699[0] * this.field4699[7] * this.field4699[9] - this.field4699[8] * this.field4699[7] * this.field4699[1] - this.field4699[9] * this.field4699[4] * this.field4699[3] + this.field4699[8] * this.field4699[5] * this.field4699[3]) * var2;
		float var15 = (this.field4699[12] * this.field4699[9] * this.field4699[6] + (-this.field4699[4] * this.field4699[9] * this.field4699[14] + this.field4699[10] * this.field4699[4] * this.field4699[13] + this.field4699[8] * this.field4699[5] * this.field4699[14] - this.field4699[12] * this.field4699[10] * this.field4699[5] - this.field4699[13] * this.field4699[6] * this.field4699[8])) * var2;
		float var16 = var2 * (this.field4699[12] * this.field4699[1] * this.field4699[10] + (this.field4699[14] * this.field4699[0] * this.field4699[9] - this.field4699[0] * this.field4699[10] * this.field4699[13] - this.field4699[1] * this.field4699[8] * this.field4699[14]) + this.field4699[13] * this.field4699[8] * this.field4699[2] - this.field4699[2] * this.field4699[9] * this.field4699[12]);
		float var17 = (this.field4699[6] * this.field4699[0] * this.field4699[13] + this.field4699[14] * -this.field4699[0] * this.field4699[5] + this.field4699[4] * this.field4699[1] * this.field4699[14] - this.field4699[12] * this.field4699[6] * this.field4699[1] - this.field4699[2] * this.field4699[4] * this.field4699[13] + this.field4699[5] * this.field4699[2] * this.field4699[12]) * var2;
		float var18 = var2 * (this.field4699[6] * this.field4699[1] * this.field4699[8] + (this.field4699[0] * this.field4699[5] * this.field4699[10] - this.field4699[9] * this.field4699[0] * this.field4699[6] - this.field4699[10] * this.field4699[1] * this.field4699[4]) + this.field4699[9] * this.field4699[4] * this.field4699[2] - this.field4699[2] * this.field4699[5] * this.field4699[8]);
		this.field4699[0] = var3;
		this.field4699[1] = var4;
		this.field4699[2] = var5;
		this.field4699[3] = var6;
		this.field4699[4] = var7;
		this.field4699[5] = var8;
		this.field4699[6] = var9;
		this.field4699[7] = var10;
		this.field4699[8] = var11;
		this.field4699[9] = var12;
		this.field4699[10] = var13;
		this.field4699[11] = var14;
		this.field4699[12] = var15;
		this.field4699[13] = var16;
		this.field4699[14] = var17;
		this.field4699[15] = var18;
	}

	@ObfInfo(name = "au", desc = "(FFFFI)V")
	public void method7896(float var1, float var2, float var3, float var4) {
		this.field4699[0] = var1;
		this.field4699[1] = 0.0F;
		this.field4699[2] = 0.0F;
		this.field4699[3] = 0.0F;
		this.field4699[4] = 0.0F;
		this.field4699[5] = var2;
		this.field4699[6] = 0.0F;
		this.field4699[7] = 0.0F;
		this.field4699[8] = 0.0F;
		this.field4699[9] = 0.0F;
		this.field4699[10] = var3;
		this.field4699[11] = 0.0F;
		this.field4699[12] = 0.0F;
		this.field4699[13] = 0.0F;
		this.field4699[14] = 0.0F;
		this.field4699[15] = var4;
	}

	@ObfInfo(name = "as", desc = "(FFF[FI)V", opaque = "141794880")
	public void method7904(float var1, float var2, float var3, float[] var4) {
		var4[0] = var1 * this.field4699[0] + var2 * this.field4699[4] + var3 * this.field4699[8] + this.field4699[12];
		var4[1] = this.field4699[13] + var3 * this.field4699[9] + this.field4699[5] * var2 + var1 * this.field4699[1];
		var4[2] = this.field4699[14] + var1 * this.field4699[2] + this.field4699[6] * var2 + var3 * this.field4699[10];
		if (var4.length > 3) {
			var4[3] = var2 * this.field4699[7] + var1 * this.field4699[3] + var3 * this.field4699[11] + this.field4699[15];
		}

	}

	@ObfInfo(name = "aw", desc = "(FFFI)F")
	public float method7914(float var1, float var2, float var3) {
		return var2 * this.field4699[4] + var1 * this.field4699[0] + var3 * this.field4699[8] + this.field4699[12];
	}

	@ObfInfo(name = "ad", desc = "(FFFI)F")
	public float method7898(float var1, float var2, float var3) {
		return this.field4699[13] + this.field4699[5] * var2 + var1 * this.field4699[1] + this.field4699[9] * var3;
	}

	@ObfInfo(name = "ai", desc = "(FFFB)F")
	public float method7900(float var1, float var2, float var3) {
		return this.field4699[10] * var3 + this.field4699[6] * var2 + this.field4699[2] * var1 + this.field4699[14];
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7883();
		this.method7882();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4699[var2 * 4 + var3];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4699);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof Class428)) {
			return false;
		} else {
			Class428 var2 = (Class428)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4699[var3] != var2.field4699[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfInfo(name = "an", desc = "(B)[F")
	public float[] method7902() {
		float[] var2 = new float[3];
		Class421 var3 = new Class421(this.field4699[0], this.field4699[1], this.field4699[2]);
		Class421 var4 = new Class421(this.field4699[4], this.field4699[5], this.field4699[6]);
		Class421 var5 = new Class421(this.field4699[8], this.field4699[9], this.field4699[10]);
		var2[0] = var3.method7813();
		var2[1] = var4.method7813();
		var2[2] = var5.method7813();
		return var2;
	}

	@ObfInfo(owner = "ph", name = "ak", desc = "(IB)V")
	public static void method7461(int var0) {
		field4698 = var0;
		field4696 = new Class428[var0];
		field5232 = 0;
	}
}
