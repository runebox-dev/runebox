import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "qg")
public final class Class423 {
	@ObfInfo(name = "ad", desc = "[Lqg;")
	public static Class423[] field4698;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1373796869)
	public static int field4699;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1620544593)
	public static int field4700;
	@ObfInfo(name = "an", desc = "Lqg;")
	public static final Class423 field4701;
	@ObfInfo(name = "ap", desc = "[F")
	public float[] field4703;

	static {
		field4698 = new Class423[0];
		method5806(100);
		field4701 = new Class423();
	}

	public Class423() {
		this.field4703 = new float[16];
		this.method7740();
	}

	public Class423(Class423 var1) {
		this.field4703 = new float[16];
		this.method7760(var1);
	}

	public Class423(Class562 var1, boolean var2) {
		this.field4703 = new float[16];
		this.method7728(var1, var2);
	}

	@ObfInfo(name = "ag", desc = "(I)V")
	public void method7752() {
		synchronized(field4698) {
			if (field4700 < field4699 - 1) {
				field4698[++field4700 - 1] = this;
			}

		}
	}

	@ObfInfo(name = "ak", desc = "(Lvp;ZI)V", opaque = "1801643449")
	public void method7728(Class562 var1, boolean var2) {
		if (var2) {
			Class440 var4 = new Class440();
			int var7 = var1.method9829();
			var7 &= 16383;
			float var6 = (float)((double)((float)var7 / 16384.0F) * 6.283185307179586D);
			var4.method8116(var6);
			int var10 = var1.method9829();
			var10 &= 16383;
			float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586D);
			var4.method8126(var9);
			int var13 = var1.method9829();
			var13 &= 16383;
			float var12 = (float)((double)((float)var13 / 16384.0F) * 6.283185307179586D);
			var4.method8118(var12);
			var4.method8119((float)var1.method9829(), (float)var1.method9829(), (float)var1.method9829());
			this.method7739(var4);
		} else {
			for (int var14 = 0; var14 < 16; ++var14) {
				this.field4703[var14] = var1.method9834();
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(I)[F", opaque = "1367989156")
	public float[] method7729() {
		float[] var2 = new float[3];
		if ((double)this.field4703[2] < 0.999D && (double)this.field4703[2] > -0.999D) {
			var2[1] = (float)(-Math.asin((double)this.field4703[2]));
			double var3 = Math.cos((double)var2[1]);
			var2[0] = (float)Math.atan2((double)this.field4703[6] / var3, (double)this.field4703[10] / var3);
			var2[2] = (float)Math.atan2((double)this.field4703[1] / var3, (double)this.field4703[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2((double)this.field4703[2], 0.0D);
			var2[2] = (float)Math.atan2((double)(-this.field4703[9]), (double)this.field4703[5]);
		}

		return var2;
	}

	@ObfInfo(name = "an", desc = "(I)[F", opaque = "269177408")
	public float[] method7730() {
		float[] var2 = new float[]{(float)(-Math.asin((double)this.field4703[6])), 0.0F, 0.0F};
		double var3 = Math.cos((double)var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double)this.field4703[2];
			var7 = (double)this.field4703[10];
			double var9 = (double)this.field4703[4];
			double var11 = (double)this.field4703[5];
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			var5 = (double)this.field4703[1];
			var7 = (double)this.field4703[0];
			if (this.field4703[6] < 0.0F) {
				var2[1] = (float)Math.atan2(var5, var7);
			} else {
				var2[1] = (float)(-Math.atan2(var5, var7));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public void method7740() {
		this.field4703[0] = 1.0F;
		this.field4703[1] = 0.0F;
		this.field4703[2] = 0.0F;
		this.field4703[3] = 0.0F;
		this.field4703[4] = 0.0F;
		this.field4703[5] = 1.0F;
		this.field4703[6] = 0.0F;
		this.field4703[7] = 0.0F;
		this.field4703[8] = 0.0F;
		this.field4703[9] = 0.0F;
		this.field4703[10] = 1.0F;
		this.field4703[11] = 0.0F;
		this.field4703[12] = 0.0F;
		this.field4703[13] = 0.0F;
		this.field4703[14] = 0.0F;
		this.field4703[15] = 1.0F;
	}

	@ObfInfo(name = "av", desc = "(I)V")
	public void method7732() {
		this.field4703[0] = 0.0F;
		this.field4703[1] = 0.0F;
		this.field4703[2] = 0.0F;
		this.field4703[3] = 0.0F;
		this.field4703[4] = 0.0F;
		this.field4703[5] = 0.0F;
		this.field4703[6] = 0.0F;
		this.field4703[7] = 0.0F;
		this.field4703[8] = 0.0F;
		this.field4703[9] = 0.0F;
		this.field4703[10] = 0.0F;
		this.field4703[11] = 0.0F;
		this.field4703[12] = 0.0F;
		this.field4703[13] = 0.0F;
		this.field4703[14] = 0.0F;
		this.field4703[15] = 0.0F;
	}

	@ObfInfo(name = "ab", desc = "(Lqg;B)V")
	public void method7760(Class423 var1) {
		System.arraycopy(var1.field4703, 0, this.field4703, 0, 16);
	}

	@ObfInfo(name = "ai", desc = "(FB)V")
	public void method7734(float var1) {
		this.method7755(var1, var1, var1);
	}

	@ObfInfo(name = "ae", desc = "(FFFB)V")
	public void method7755(float var1, float var2, float var3) {
		this.method7740();
		this.field4703[0] = var1;
		this.field4703[5] = var2;
		this.field4703[10] = var3;
	}

	@ObfInfo(name = "au", desc = "(Lqg;I)V", opaque = "248531856")
	public void method7733(Class423 var1) {
		for (int var3 = 0; var3 < this.field4703.length; ++var3) {
			float[] var10000 = this.field4703;
			var10000[var3] += var1.field4703[var3];
		}

	}

	@ObfInfo(name = "ah", desc = "(Lqg;I)V")
	public void method7736(Class423 var1) {
		float var3 = this.field4703[3] * var1.field4703[12] + this.field4703[2] * var1.field4703[8] + this.field4703[0] * var1.field4703[0] + this.field4703[1] * var1.field4703[4];
		float var4 = this.field4703[3] * var1.field4703[13] + this.field4703[2] * var1.field4703[9] + this.field4703[1] * var1.field4703[5] + this.field4703[0] * var1.field4703[1];
		float var5 = this.field4703[3] * var1.field4703[14] + this.field4703[2] * var1.field4703[10] + this.field4703[0] * var1.field4703[2] + this.field4703[1] * var1.field4703[6];
		float var6 = this.field4703[3] * var1.field4703[15] + this.field4703[2] * var1.field4703[11] + this.field4703[0] * var1.field4703[3] + this.field4703[1] * var1.field4703[7];
		float var7 = this.field4703[7] * var1.field4703[12] + this.field4703[6] * var1.field4703[8] + this.field4703[4] * var1.field4703[0] + this.field4703[5] * var1.field4703[4];
		float var8 = this.field4703[7] * var1.field4703[13] + this.field4703[6] * var1.field4703[9] + this.field4703[5] * var1.field4703[5] + this.field4703[4] * var1.field4703[1];
		float var9 = this.field4703[7] * var1.field4703[14] + this.field4703[6] * var1.field4703[10] + this.field4703[5] * var1.field4703[6] + this.field4703[4] * var1.field4703[2];
		float var10 = this.field4703[7] * var1.field4703[15] + this.field4703[6] * var1.field4703[11] + this.field4703[5] * var1.field4703[7] + this.field4703[4] * var1.field4703[3];
		float var11 = this.field4703[11] * var1.field4703[12] + this.field4703[10] * var1.field4703[8] + this.field4703[8] * var1.field4703[0] + this.field4703[9] * var1.field4703[4];
		float var12 = this.field4703[11] * var1.field4703[13] + this.field4703[10] * var1.field4703[9] + this.field4703[8] * var1.field4703[1] + this.field4703[9] * var1.field4703[5];
		float var13 = this.field4703[11] * var1.field4703[14] + this.field4703[10] * var1.field4703[10] + this.field4703[9] * var1.field4703[6] + this.field4703[8] * var1.field4703[2];
		float var14 = this.field4703[11] * var1.field4703[15] + this.field4703[10] * var1.field4703[11] + this.field4703[9] * var1.field4703[7] + this.field4703[8] * var1.field4703[3];
		float var15 = this.field4703[15] * var1.field4703[12] + this.field4703[14] * var1.field4703[8] + this.field4703[12] * var1.field4703[0] + this.field4703[13] * var1.field4703[4];
		float var16 = this.field4703[15] * var1.field4703[13] + this.field4703[14] * var1.field4703[9] + this.field4703[12] * var1.field4703[1] + this.field4703[13] * var1.field4703[5];
		float var17 = this.field4703[15] * var1.field4703[14] + this.field4703[14] * var1.field4703[10] + this.field4703[13] * var1.field4703[6] + this.field4703[12] * var1.field4703[2];
		float var18 = this.field4703[15] * var1.field4703[15] + this.field4703[14] * var1.field4703[11] + this.field4703[13] * var1.field4703[7] + this.field4703[12] * var1.field4703[3];
		this.field4703[0] = var3;
		this.field4703[1] = var4;
		this.field4703[2] = var5;
		this.field4703[3] = var6;
		this.field4703[4] = var7;
		this.field4703[5] = var8;
		this.field4703[6] = var9;
		this.field4703[7] = var10;
		this.field4703[8] = var11;
		this.field4703[9] = var12;
		this.field4703[10] = var13;
		this.field4703[11] = var14;
		this.field4703[12] = var15;
		this.field4703[13] = var16;
		this.field4703[14] = var17;
		this.field4703[15] = var18;
	}

	@ObfInfo(name = "az", desc = "(Lqe;B)V")
	public void method7737(Class421 var1) {
		float var3 = var1.field4688.field4710 * var1.field4688.field4710;
		float var4 = var1.field4688.field4710 * var1.field4688.field4707;
		float var5 = var1.field4688.field4710 * var1.field4688.field4708;
		float var6 = var1.field4688.field4710 * var1.field4688.field4704;
		float var7 = var1.field4688.field4707 * var1.field4688.field4707;
		float var8 = var1.field4688.field4708 * var1.field4688.field4707;
		float var9 = var1.field4688.field4707 * var1.field4688.field4704;
		float var10 = var1.field4688.field4708 * var1.field4688.field4708;
		float var11 = var1.field4688.field4708 * var1.field4688.field4704;
		float var12 = var1.field4688.field4704 * var1.field4688.field4704;
		this.field4703[0] = var3 + var7 - var12 - var10;
		this.field4703[1] = var6 + var8 + var8 + var6;
		this.field4703[2] = var9 - var5 - var5 + var9;
		this.field4703[4] = var8 - var6 - var6 + var8;
		this.field4703[5] = var3 + var10 - var7 - var12;
		this.field4703[6] = var4 + var11 + var11 + var4;
		this.field4703[8] = var5 + var9 + var9 + var5;
		this.field4703[9] = var11 - var4 - var4 + var11;
		this.field4703[10] = var3 + var12 - var10 - var7;
		float[] var13 = this.field4703;
		float[] var14 = this.field4703;
		this.field4703[11] = 0.0F;
		var14[7] = 0.0F;
		var13[3] = 0.0F;
		this.field4703[12] = var1.field4689.field4746;
		this.field4703[13] = var1.field4689.field4743;
		this.field4703[14] = var1.field4689.field4744;
		this.field4703[15] = 1.0F;
	}

	@ObfInfo(name = "ax", desc = "(Lqi;I)V")
	public void method7748(Class425 var1) {
		float var3 = var1.field4710 * var1.field4710;
		float var4 = var1.field4710 * var1.field4707;
		float var5 = var1.field4710 * var1.field4708;
		float var6 = var1.field4710 * var1.field4704;
		float var7 = var1.field4707 * var1.field4707;
		float var8 = var1.field4708 * var1.field4707;
		float var9 = var1.field4707 * var1.field4704;
		float var10 = var1.field4708 * var1.field4708;
		float var11 = var1.field4708 * var1.field4704;
		float var12 = var1.field4704 * var1.field4704;
		this.field4703[0] = var3 + var7 - var12 - var10;
		this.field4703[1] = var6 + var8 + var8 + var6;
		this.field4703[2] = var9 - var5 - var5 + var9;
		this.field4703[4] = var8 - var6 - var6 + var8;
		this.field4703[5] = var3 + var10 - var7 - var12;
		this.field4703[6] = var4 + var11 + var11 + var4;
		this.field4703[8] = var5 + var9 + var9 + var5;
		this.field4703[9] = var11 - var4 - var4 + var11;
		this.field4703[10] = var3 + var12 - var10 - var7;
	}

	@ObfInfo(name = "ac", desc = "(Lqx;B)V")
	public void method7739(Class440 var1) {
		this.field4703[0] = var1.field4772;
		this.field4703[1] = var1.field4771;
		this.field4703[2] = var1.field4773;
		this.field4703[3] = 0.0F;
		this.field4703[4] = var1.field4774;
		this.field4703[5] = var1.field4775;
		this.field4703[6] = var1.field4776;
		this.field4703[7] = 0.0F;
		this.field4703[8] = var1.field4780;
		this.field4703[9] = var1.field4778;
		this.field4703[10] = var1.field4777;
		this.field4703[11] = 0.0F;
		this.field4703[12] = var1.field4781;
		this.field4703[13] = var1.field4779;
		this.field4703[14] = var1.field4782;
		this.field4703[15] = 1.0F;
	}

	@ObfInfo(name = "al", desc = "(I)F")
	public float method7790() {
		return this.field4703[6] * this.field4703[3] * this.field4703[9] * this.field4703[12] + (this.field4703[5] * this.field4703[3] * this.field4703[8] * this.field4703[14] + this.field4703[4] * this.field4703[3] * this.field4703[10] * this.field4703[13] + (this.field4703[7] * this.field4703[2] * this.field4703[8] * this.field4703[13] + this.field4703[2] * this.field4703[5] * this.field4703[11] * this.field4703[12] + (this.field4703[4] * this.field4703[2] * this.field4703[9] * this.field4703[15] + this.field4703[1] * this.field4703[7] * this.field4703[10] * this.field4703[12] + (this.field4703[6] * this.field4703[1] * this.field4703[8] * this.field4703[15] + this.field4703[4] * this.field4703[1] * this.field4703[11] * this.field4703[14] + (this.field4703[7] * this.field4703[0] * this.field4703[9] * this.field4703[14] + this.field4703[6] * this.field4703[0] * this.field4703[11] * this.field4703[13] + (this.field4703[0] * this.field4703[5] * this.field4703[10] * this.field4703[15] - this.field4703[0] * this.field4703[5] * this.field4703[11] * this.field4703[14] - this.field4703[6] * this.field4703[0] * this.field4703[9] * this.field4703[15]) - this.field4703[0] * this.field4703[7] * this.field4703[10] * this.field4703[13] - this.field4703[4] * this.field4703[1] * this.field4703[10] * this.field4703[15]) - this.field4703[1] * this.field4703[6] * this.field4703[11] * this.field4703[12] - this.field4703[1] * this.field4703[7] * this.field4703[8] * this.field4703[14]) - this.field4703[2] * this.field4703[4] * this.field4703[11] * this.field4703[13] - this.field4703[5] * this.field4703[2] * this.field4703[8] * this.field4703[15]) - this.field4703[2] * this.field4703[7] * this.field4703[9] * this.field4703[12] - this.field4703[4] * this.field4703[3] * this.field4703[9] * this.field4703[14]) - this.field4703[3] * this.field4703[5] * this.field4703[10] * this.field4703[12] - this.field4703[3] * this.field4703[6] * this.field4703[8] * this.field4703[13]);
	}

	@ObfInfo(name = "ay", desc = "(I)V")
	public void method7741() {
		float var2 = 1.0F / this.method7790();
		float var3 = (this.field4703[7] * this.field4703[9] * this.field4703[14] + this.field4703[11] * this.field4703[6] * this.field4703[13] + (this.field4703[5] * this.field4703[10] * this.field4703[15] - this.field4703[11] * this.field4703[5] * this.field4703[14] - this.field4703[9] * this.field4703[6] * this.field4703[15]) - this.field4703[10] * this.field4703[7] * this.field4703[13]) * var2;
		float var4 = (this.field4703[3] * this.field4703[10] * this.field4703[13] + (this.field4703[2] * this.field4703[9] * this.field4703[15] + this.field4703[11] * this.field4703[1] * this.field4703[14] + this.field4703[10] * -this.field4703[1] * this.field4703[15] - this.field4703[2] * this.field4703[11] * this.field4703[13] - this.field4703[9] * this.field4703[3] * this.field4703[14])) * var2;
		float var5 = (this.field4703[3] * this.field4703[5] * this.field4703[14] + this.field4703[2] * this.field4703[7] * this.field4703[13] + (this.field4703[1] * this.field4703[6] * this.field4703[15] - this.field4703[1] * this.field4703[7] * this.field4703[14] - this.field4703[5] * this.field4703[2] * this.field4703[15]) - this.field4703[6] * this.field4703[3] * this.field4703[13]) * var2;
		float var6 = (this.field4703[3] * this.field4703[6] * this.field4703[9] + (this.field4703[2] * this.field4703[5] * this.field4703[11] + this.field4703[7] * this.field4703[1] * this.field4703[10] + this.field4703[6] * -this.field4703[1] * this.field4703[11] - this.field4703[7] * this.field4703[2] * this.field4703[9] - this.field4703[5] * this.field4703[3] * this.field4703[10])) * var2;
		float var7 = (this.field4703[10] * this.field4703[7] * this.field4703[12] + (this.field4703[6] * this.field4703[8] * this.field4703[15] + this.field4703[10] * -this.field4703[4] * this.field4703[15] + this.field4703[4] * this.field4703[11] * this.field4703[14] - this.field4703[11] * this.field4703[6] * this.field4703[12] - this.field4703[7] * this.field4703[8] * this.field4703[14])) * var2;
		float var8 = (this.field4703[8] * this.field4703[3] * this.field4703[14] + this.field4703[11] * this.field4703[2] * this.field4703[12] + (this.field4703[0] * this.field4703[10] * this.field4703[15] - this.field4703[0] * this.field4703[11] * this.field4703[14] - this.field4703[8] * this.field4703[2] * this.field4703[15]) - this.field4703[10] * this.field4703[3] * this.field4703[12]) * var2;
		float var9 = (this.field4703[6] * this.field4703[3] * this.field4703[12] + (this.field4703[4] * this.field4703[2] * this.field4703[15] + this.field4703[0] * this.field4703[7] * this.field4703[14] + this.field4703[6] * -this.field4703[0] * this.field4703[15] - this.field4703[7] * this.field4703[2] * this.field4703[12] - this.field4703[4] * this.field4703[3] * this.field4703[14])) * var2;
		float var10 = (this.field4703[4] * this.field4703[3] * this.field4703[10] + this.field4703[7] * this.field4703[2] * this.field4703[8] + (this.field4703[0] * this.field4703[6] * this.field4703[11] - this.field4703[7] * this.field4703[0] * this.field4703[10] - this.field4703[4] * this.field4703[2] * this.field4703[11]) - this.field4703[3] * this.field4703[6] * this.field4703[8]) * var2;
		float var11 = (this.field4703[7] * this.field4703[8] * this.field4703[13] + this.field4703[11] * this.field4703[5] * this.field4703[12] + (this.field4703[9] * this.field4703[4] * this.field4703[15] - this.field4703[11] * this.field4703[4] * this.field4703[13] - this.field4703[8] * this.field4703[5] * this.field4703[15]) - this.field4703[9] * this.field4703[7] * this.field4703[12]) * var2;
		float var12 = (this.field4703[3] * this.field4703[9] * this.field4703[12] + (this.field4703[1] * this.field4703[8] * this.field4703[15] + this.field4703[0] * this.field4703[11] * this.field4703[13] + this.field4703[9] * -this.field4703[0] * this.field4703[15] - this.field4703[11] * this.field4703[1] * this.field4703[12] - this.field4703[3] * this.field4703[8] * this.field4703[13])) * var2;
		float var13 = (this.field4703[3] * this.field4703[4] * this.field4703[13] + this.field4703[1] * this.field4703[7] * this.field4703[12] + (this.field4703[5] * this.field4703[0] * this.field4703[15] - this.field4703[7] * this.field4703[0] * this.field4703[13] - this.field4703[4] * this.field4703[1] * this.field4703[15]) - this.field4703[3] * this.field4703[5] * this.field4703[12]) * var2;
		float var14 = (this.field4703[5] * this.field4703[3] * this.field4703[8] + (this.field4703[1] * this.field4703[4] * this.field4703[11] + this.field4703[5] * -this.field4703[0] * this.field4703[11] + this.field4703[7] * this.field4703[0] * this.field4703[9] - this.field4703[1] * this.field4703[7] * this.field4703[8] - this.field4703[4] * this.field4703[3] * this.field4703[9])) * var2;
		float var15 = (this.field4703[9] * this.field4703[6] * this.field4703[12] + (this.field4703[5] * this.field4703[8] * this.field4703[14] + this.field4703[9] * -this.field4703[4] * this.field4703[14] + this.field4703[4] * this.field4703[10] * this.field4703[13] - this.field4703[5] * this.field4703[10] * this.field4703[12] - this.field4703[6] * this.field4703[8] * this.field4703[13])) * var2;
		float var16 = (this.field4703[2] * this.field4703[8] * this.field4703[13] + this.field4703[1] * this.field4703[10] * this.field4703[12] + (this.field4703[0] * this.field4703[9] * this.field4703[14] - this.field4703[0] * this.field4703[10] * this.field4703[13] - this.field4703[8] * this.field4703[1] * this.field4703[14]) - this.field4703[2] * this.field4703[9] * this.field4703[12]) * var2;
		float var17 = (this.field4703[2] * this.field4703[5] * this.field4703[12] + (this.field4703[4] * this.field4703[1] * this.field4703[14] + this.field4703[6] * this.field4703[0] * this.field4703[13] + this.field4703[5] * -this.field4703[0] * this.field4703[14] - this.field4703[1] * this.field4703[6] * this.field4703[12] - this.field4703[4] * this.field4703[2] * this.field4703[13])) * var2;
		float var18 = (this.field4703[4] * this.field4703[2] * this.field4703[9] + this.field4703[6] * this.field4703[1] * this.field4703[8] + (this.field4703[0] * this.field4703[5] * this.field4703[10] - this.field4703[6] * this.field4703[0] * this.field4703[9] - this.field4703[4] * this.field4703[1] * this.field4703[10]) - this.field4703[5] * this.field4703[2] * this.field4703[8]) * var2;
		this.field4703[0] = var3;
		this.field4703[1] = var4;
		this.field4703[2] = var5;
		this.field4703[3] = var6;
		this.field4703[4] = var7;
		this.field4703[5] = var8;
		this.field4703[6] = var9;
		this.field4703[7] = var10;
		this.field4703[8] = var11;
		this.field4703[9] = var12;
		this.field4703[10] = var13;
		this.field4703[11] = var14;
		this.field4703[12] = var15;
		this.field4703[13] = var16;
		this.field4703[14] = var17;
		this.field4703[15] = var18;
	}

	@ObfInfo(name = "ao", desc = "(FFFFI)V")
	public void method7742(float var1, float var2, float var3, float var4) {
		this.field4703[0] = var1;
		this.field4703[1] = 0.0F;
		this.field4703[2] = 0.0F;
		this.field4703[3] = 0.0F;
		this.field4703[4] = 0.0F;
		this.field4703[5] = var2;
		this.field4703[6] = 0.0F;
		this.field4703[7] = 0.0F;
		this.field4703[8] = 0.0F;
		this.field4703[9] = 0.0F;
		this.field4703[10] = var3;
		this.field4703[11] = 0.0F;
		this.field4703[12] = 0.0F;
		this.field4703[13] = 0.0F;
		this.field4703[14] = 0.0F;
		this.field4703[15] = var4;
	}

	@ObfInfo(name = "aa", desc = "(FFF[FB)V", opaque = "17")
	public void method7743(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field4703[8] * var3 + this.field4703[0] * var1 + this.field4703[4] * var2 + this.field4703[12];
		var4[1] = this.field4703[9] * var3 + this.field4703[5] * var2 + this.field4703[1] * var1 + this.field4703[13];
		var4[2] = this.field4703[10] * var3 + this.field4703[6] * var2 + this.field4703[2] * var1 + this.field4703[14];
		if (var4.length > 3) {
			var4[3] = this.field4703[11] * var3 + this.field4703[7] * var2 + this.field4703[3] * var1 + this.field4703[15];
		}

	}

	@ObfInfo(name = "as", desc = "(FFFI)F")
	public float method7735(float var1, float var2, float var3) {
		return this.field4703[8] * var3 + this.field4703[4] * var2 + this.field4703[0] * var1 + this.field4703[12];
	}

	@ObfInfo(name = "aw", desc = "(FFFB)F")
	public float method7804(float var1, float var2, float var3) {
		return this.field4703[9] * var3 + this.field4703[1] * var1 + this.field4703[5] * var2 + this.field4703[13];
	}

	@ObfInfo(name = "at", desc = "(FFFB)F")
	public float method7746(float var1, float var2, float var3) {
		return this.field4703[10] * var3 + this.field4703[2] * var1 + this.field4703[6] * var2 + this.field4703[14];
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7730();
		this.method7729();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4703[var2 * 4 + var3];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4703);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof Class423)) {
			return false;
		} else {
			Class423 var2 = (Class423)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4703[var3] != var2.field4703[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfInfo(name = "af", desc = "(I)[F")
	public float[] method7749() {
		float[] var2 = new float[3];
		Class431 var3 = new Class431(this.field4703[0], this.field4703[1], this.field4703[2]);
		Class431 var4 = new Class431(this.field4703[4], this.field4703[5], this.field4703[6]);
		Class431 var5 = new Class431(this.field4703[8], this.field4703[9], this.field4703[10]);
		var2[0] = var3.method8026();
		var2[1] = var4.method8026();
		var2[2] = var5.method8026();
		return var2;
	}

	@ObfInfo(owner = "lk", name = "aq", desc = "(II)V")
	public static void method5806(int var0) {
		field4699 = var0;
		field4698 = new Class423[var0];
		field4700 = 0;
	}

	@ObfInfo(owner = "gd", name = "ad", desc = "(I)Lqg;", opaque = "603613830")
	public static Class423 method3364() {
		synchronized(field4698) {
			if (field4700 == 0) {
				return new Class423();
			} else {
				field4698[--field4700].method7740();
				return field4698[field4700];
			}
		}
	}
}
