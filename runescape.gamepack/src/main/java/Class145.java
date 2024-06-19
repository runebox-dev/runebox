import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public class Class145 extends Class507 {
	public Class143[][] field1651;
	public Class143[][] field1657;
	public Class248 field1654;
	public boolean field1656;
	public int field1652;
	public int field1655;
	public List field1659;
	public Future field1658;

	public Class145(Class382 var1, Class382 var2, int var3, boolean var4) {
		this.field1657 = (Class143[][])null;
		this.field1651 = (Class143[][])null;
		this.field1652 = 0;
		this.field1655 = var3;
		byte[] var5 = var1.method7216(this.field1655 >> 16 & 65535, this.field1655 & 65535);
		Class521 var6 = new Class521(var5);
		int var7 = var6.method9405();
		int var8 = var6.method9407();
		byte[] var9;
		if (var4) {
			var9 = var2.method7224(0, var8);
		} else {
			var9 = var2.method7224(var8, 0);
		}

		this.field1654 = new Class248(var8, var9);
		this.field1659 = new ArrayList();
		this.field1658 = Class337.field155.submit(new Class131(this, var6, var7));
	}

	public void method3189(Class521 var1, int var2) {
		var1.method9407();
		var1.method9407();
		this.field1652 = var1.method9405();
		int var4 = var1.method9407();
		this.field1651 = new Class143[this.field1654.method4761().method4640()][];
		this.field1657 = new Class143[this.field1654.method4763()][];
		Class155[] var5 = new Class155[var4];

		int var6;
		int var8;
		for (var6 = 0; var6 < var4; ++var6) {
			Class148 var7 = Class292.method5906(var1.method9405());
			var8 = var1.method9457();
			Class156 var9 = Class85.method2304(var1.method9405());
			Class143 var10 = new Class143();
			var10.method3174(var1, var2);
			var5[var6] = new Class155(this, var10, var7, var9, var8);
			int var11 = var7.method3247();
			Class143[][] var12;
			if (Class148.field1673 == var7) {
				var12 = this.field1651;
			} else {
				var12 = this.field1657;
			}

			if (var12[var8] == null) {
				var12[var8] = new Class143[var11];
			}

			if (Class148.field1683 == var7) {
				this.field1656 = true;
			}
		}

		var6 = var4 / Class337.field1653;
		int var13 = var4 % Class337.field1653;
		int var14 = 0;

		for (int var15 = 0; var15 < Class337.field1653; ++var15) {
			var8 = var14;
			var14 += var6;
			if (var13 > 0) {
				++var14;
				--var13;
			}

			if (var14 == var8) {
				break;
			}

			this.field1659.add(Class337.field155.submit(new Class137(this, var8, var14, var5)));
		}

	}

	public boolean method3190() {
		if (this.field1658 == null && this.field1659 == null) {
			return true;
		} else {
			if (this.field1658 != null) {
				if (!this.field1658.isDone()) {
					return false;
				}

				this.field1658 = null;
			}

			boolean var2 = true;

			for (int var3 = 0; var3 < this.field1659.size(); ++var3) {
				if (!((Future)this.field1659.get(var3)).isDone()) {
					var2 = false;
				} else {
					this.field1659.remove(var3);
					--var3;
				}
			}

			if (!var2) {
				return false;
			} else {
				this.field1659 = null;
				return true;
			}
		}
	}

	public int method3191() {
		return this.field1652;
	}

	public boolean method3192() {
		return this.field1656;
	}

	public void method3193(int var1, Class138 var2, int var3, int var4) {
		Class428 var6;
		synchronized(Class428.field4696) {
			if (0 == Class428.field5232) {
				var6 = new Class428();
			} else {
				Class428.field4696[--Class428.field5232].method7921();
				var6 = Class428.field4696[Class428.field5232];
			}
		}

		this.method3215(var6, var3, var2, var1);
		this.method3195(var6, var3, var2, var1);
		this.method3194(var6, var3, var2, var1);
		var2.method3120(var6);
		var6.method7908();
	}

	public void method3215(Class428 var1, int var2, Class138 var3, int var4) {
		float[] var6 = var3.method3108(this.field1652);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field1651[var2]) {
			Class143 var10 = this.field1651[var2][0];
			Class143 var11 = this.field1651[var2][1];
			Class143 var12 = this.field1651[var2][2];
			if (var10 != null) {
				var7 = var10.method3156(var4);
			}

			if (var11 != null) {
				var8 = var11.method3156(var4);
			}

			if (var12 != null) {
				var9 = var12.method3156(var4);
			}
		}

		Class442 var18 = Class442.method2775();
		var18.method8279(1.0F, 0.0F, 0.0F, var7);
		Class442 var19 = Class442.method2775();
		var19.method8279(0.0F, 1.0F, 0.0F, var8);
		Class442 var20 = Class442.method2775();
		var20.method8279(0.0F, 0.0F, 1.0F, var9);
		Class442 var13 = Class442.method2775();
		var13.method8282(var20);
		var13.method8282(var18);
		var13.method8282(var19);
		Class428 var14;
		synchronized(Class428.field4696) {
			if (0 == Class428.field5232) {
				var14 = new Class428();
			} else {
				Class428.field4696[--Class428.field5232].method7921();
				var14 = Class428.field4696[Class428.field5232];
			}
		}

		var14.method7884(var13);
		var1.method7935(var14);
		var18.method8300();
		var19.method8300();
		var20.method8300();
		var13.method8300();
		var14.method7908();
	}

	public void method3194(Class428 var1, int var2, Class138 var3, int var4) {
		float[] var6 = var3.method3109(this.field1652);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field1651[var2] != null) {
			Class143 var10 = this.field1651[var2][3];
			Class143 var11 = this.field1651[var2][4];
			Class143 var12 = this.field1651[var2][5];
			if (var10 != null) {
				var7 = var10.method3156(var4);
			}

			if (var11 != null) {
				var8 = var11.method3156(var4);
			}

			if (var12 != null) {
				var9 = var12.method3156(var4);
			}
		}

		var1.field4699[12] = var7;
		var1.field4699[13] = var8;
		var1.field4699[14] = var9;
	}

	public void method3195(Class428 var1, int var2, Class138 var3, int var4) {
		float[] var6 = var3.method3105(this.field1652);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (this.field1651[var2] != null) {
			Class143 var10 = this.field1651[var2][6];
			Class143 var11 = this.field1651[var2][7];
			Class143 var12 = this.field1651[var2][8];
			if (var10 != null) {
				var7 = var10.method3156(var4);
			}

			if (var11 != null) {
				var8 = var11.method3156(var4);
			}

			if (var12 != null) {
				var9 = var12.method3156(var4);
			}
		}

		Class428 var15;
		synchronized(Class428.field4696) {
			if (0 == Class428.field5232) {
				var15 = new Class428();
			} else {
				Class428.field4696[--Class428.field5232].method7921();
				var15 = Class428.field4696[Class428.field5232];
			}
		}

		var15.method7888(var7, var8, var9);
		var1.method7935(var15);
		var15.method7908();
	}
}
