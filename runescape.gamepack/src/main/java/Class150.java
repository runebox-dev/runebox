import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@ObfInfo(name = "ft")
public class Class150 extends Class516 {
	@ObfInfo(name = "ag", desc = "[[Lfd;")
	public Class134[][] field1687;
	@ObfInfo(name = "ad", desc = "[[Lfd;")
	public Class134[][] field1691;
	@ObfInfo(name = "ak", desc = "Lko;")
	public Class275 field1688;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field1690;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -433832585)
	public int field1689;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1622909371)
	public int field1694;
	@ObfInfo(name = "ai", desc = "Ljava/util/List;")
	public List field1695;
	@ObfInfo(name = "ab", desc = "Ljava/util/concurrent/Future;")
	public Future field1693;

	public Class150(Class375 var1, Class375 var2, int var3, boolean var4) {
		this.field1691 = (Class134[][])null;
		this.field1687 = (Class134[][])null;
		this.field1689 = 0;
		this.field1694 = var3;
		byte[] var5 = var1.method7132(this.field1694 >> 16 & 65535, this.field1694 & 65535);
		Class562 var6 = new Class562(var5);
		int var7 = var6.method9902();
		int var8 = var6.method9997();
		byte[] var9;
		if (var4) {
			var9 = var2.method7140(0, var8);
		} else {
			var9 = var2.method7140(var8, 0);
		}

		this.field1688 = new Class275(var8, var9);
		this.field1695 = new ArrayList();
		this.field1693 = Class217.field1692.submit(new Class135(this, var6, var7));
	}

	@ObfInfo(name = "aq", desc = "(Lvp;II)V", opaque = "-1276043565")
	public void method3215(Class562 var1, int var2) {
		var1.method9997();
		var1.method9997();
		this.field1689 = var1.method9902();
		int var4 = var1.method9997();
		this.field1687 = new Class134[this.field1688.method5200().method5100()][];
		this.field1691 = new Class134[this.field1688.method5199()][];
		Class137[] var5 = new Class137[var4];

		int var6;
		int var8;
		for (var6 = 0; var6 < var4; ++var6) {
			Class139 var7 = Class139.method1273(var1.method9902());
			var8 = var1.method9841();
			Class132 var9 = Class132.method8896(var1.method9902());
			Class134 var10 = new Class134();
			var10.method3086(var1, var2);
			var5[var6] = new Class137(this, var10, var7, var9, var8);
			int var11 = var7.method3141();
			Class134[][] var12;
			if (Class139.field1617 == var7) {
				var12 = this.field1687;
			} else {
				var12 = this.field1691;
			}

			if (var12[var8] == null) {
				var12[var8] = new Class134[var11];
			}

			if (Class139.field1616 == var7) {
				this.field1690 = true;
			}
		}

		var6 = var4 / Class217.field1686;
		int var13 = var4 % Class217.field1686;
		int var14 = 0;

		for (int var15 = 0; var15 < Class217.field1686; ++var15) {
			var8 = var14;
			var14 += var6;
			if (var13 > 0) {
				++var14;
				--var13;
			}

			if (var8 == var14) {
				break;
			}

			this.field1695.add(Class217.field1692.submit(new Class156(this, var8, var14, var5)));
		}

	}

	@ObfInfo(name = "ad", desc = "(I)Z", opaque = "1603197561")
	public boolean method3242() {
		if (this.field1693 == null && this.field1695 == null) {
			return true;
		} else {
			if (this.field1693 != null) {
				if (!this.field1693.isDone()) {
					return false;
				}

				this.field1693 = null;
			}

			boolean var2 = true;

			for (int var3 = 0; var3 < this.field1695.size(); ++var3) {
				if (!((Future)this.field1695.get(var3)).isDone()) {
					var2 = false;
				} else {
					this.field1695.remove(var3);
					--var3;
				}
			}

			if (!var2) {
				return false;
			} else {
				this.field1695 = null;
				return true;
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(I)I")
	public int method3216() {
		return this.field1689;
	}

	@ObfInfo(name = "ak", desc = "(I)Z")
	public boolean method3217() {
		return this.field1690;
	}

	@ObfInfo(name = "ap", desc = "(ILfv;III)V")
	public void method3222(int var1, Class152 var2, int var3, int var4) {
		Class423 var6 = Class423.method3364();
		this.method3219(var6, var3, var2, var1);
		this.method3241(var6, var3, var2, var1);
		this.method3220(var6, var3, var2, var1);
		var2.method3259(var6);
		var6.method7752();
	}

	@ObfInfo(name = "an", desc = "(Lqg;ILfv;II)V", opaque = "1416708693")
	public void method3219(Class423 var1, int var2, Class152 var3, int var4) {
		float[] var6 = var3.method3263(this.field1689);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field1687[var2] != null) {
			Class134 var10 = this.field1687[var2][0];
			Class134 var11 = this.field1687[var2][1];
			Class134 var12 = this.field1687[var2][2];
			if (var10 != null) {
				var7 = var10.method3088(var4);
			}

			if (var11 != null) {
				var8 = var11.method3088(var4);
			}

			if (var12 != null) {
				var9 = var12.method3088(var4);
			}
		}

		Class425 var18 = Class425.method2569();
		var18.method7820(1.0F, 0.0F, 0.0F, var7);
		Class425 var19 = Class425.method2569();
		var19.method7820(0.0F, 1.0F, 0.0F, var8);
		Class425 var20 = Class425.method2569();
		var20.method7820(0.0F, 0.0F, 1.0F, var9);
		Class425 var13 = Class425.method2569();
		var13.method7823(var20);
		var13.method7823(var18);
		var13.method7823(var19);
		Class423 var14;
		synchronized(Class423.field4698) {
			if (Class423.field4700 == 0) {
				var14 = new Class423();
			} else {
				Class423.field4698[--Class423.field4700].method7740();
				var14 = Class423.field4698[Class423.field4700];
			}
		}

		var14.method7748(var13);
		var1.method7736(var14);
		var18.method7850();
		var19.method7850();
		var20.method7850();
		var13.method7850();
		var14.method7752();
	}

	@ObfInfo(name = "aj", desc = "(Lqg;ILfv;II)V", opaque = "-1772943993")
	public void method3220(Class423 var1, int var2, Class152 var3, int var4) {
		float[] var6 = var3.method3261(this.field1689);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field1687[var2] != null) {
			Class134 var10 = this.field1687[var2][3];
			Class134 var11 = this.field1687[var2][4];
			Class134 var12 = this.field1687[var2][5];
			if (var10 != null) {
				var7 = var10.method3088(var4);
			}

			if (var11 != null) {
				var8 = var11.method3088(var4);
			}

			if (var12 != null) {
				var9 = var12.method3088(var4);
			}
		}

		var1.field4703[12] = var7;
		var1.field4703[13] = var8;
		var1.field4703[14] = var9;
	}

	@ObfInfo(name = "av", desc = "(Lqg;ILfv;II)V", opaque = "603613831")
	public void method3241(Class423 var1, int var2, Class152 var3, int var4) {
		float[] var6 = var3.method3301(this.field1689);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field1687[var2] != null) {
			Class134 var10 = this.field1687[var2][6];
			Class134 var11 = this.field1687[var2][7];
			Class134 var12 = this.field1687[var2][8];
			if (var10 != null) {
				var7 = var10.method3088(var4);
			}

			if (var11 != null) {
				var8 = var11.method3088(var4);
			}

			if (var12 != null) {
				var9 = var12.method3088(var4);
			}
		}

		Class423 var15;
		synchronized(Class423.field4698) {
			if (Class423.field4700 == 0) {
				var15 = new Class423();
			} else {
				Class423.field4698[--Class423.field4700].method7740();
				var15 = Class423.field4698[Class423.field4700];
			}
		}

		var15.method7755(var7, var8, var9);
		var1.method7736(var15);
		var15.method7752();
	}
}
