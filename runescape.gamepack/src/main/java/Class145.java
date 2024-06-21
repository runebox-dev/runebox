import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Class145 extends Class507 {
	@ObfInfo(name = "at", desc = "I", intMultiplier = 910389071)
	public static int field1653;
	@ObfInfo(owner = "bd", name = "ab", desc = "Ljava/util/concurrent/ThreadPoolExecutor;")
	public static ThreadPoolExecutor field155;
	@ObfInfo(name = "aj", desc = "[[Lfm;")
	public Class143[][] field1651;
	@ObfInfo(name = "al", desc = "[[Lfm;")
	public Class143[][] field1657;
	@ObfInfo(name = "az", desc = "Ljn;")
	public Class248 field1654;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field1656;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -130218119)
	public int field1652;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 997175123)
	public int field1655;
	@ObfInfo(name = "ao", desc = "Ljava/util/List;")
	public List field1659;
	@ObfInfo(name = "ac", desc = "Ljava/util/concurrent/Future;")
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
		this.field1658 = field155.submit(new Class131(this, var6, var7));
	}

	@ObfInfo(name = "al", desc = "(Lua;IS)V", opaque = "22049")
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
			Class148 var7 = Class148.method5906(var1.method9405());
			var8 = var1.method9457();
			Class156 var9 = Class156.method2304(var1.method9405());
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

		var6 = var4 / field1653;
		int var13 = var4 % field1653;
		int var14 = 0;

		for (int var15 = 0; var15 < field1653; ++var15) {
			var8 = var14;
			var14 += var6;
			if (var13 > 0) {
				++var14;
				--var13;
			}

			if (var14 == var8) {
				break;
			}

			this.field1659.add(field155.submit(new Class137(this, var8, var14, var5)));
		}

	}

	@ObfInfo(name = "aj", desc = "(I)Z", opaque = "-1182903109")
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

	@ObfInfo(name = "az", desc = "(B)I")
	public int method3191() {
		return this.field1652;
	}

	@ObfInfo(name = "af", desc = "(I)Z")
	public boolean method3192() {
		return this.field1656;
	}

	@ObfInfo(name = "aa", desc = "(ILfh;III)V", opaque = "333553969")
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

	@ObfInfo(name = "at", desc = "(Lql;ILfh;II)V", opaque = "176351717")
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

	@ObfInfo(name = "ab", desc = "(Lql;ILfh;IB)V", opaque = "0")
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

	@ObfInfo(name = "ac", desc = "(Lql;ILfh;II)V", opaque = "-124019686")
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

	@ObfInfo(owner = "my", name = "ak", desc = "(Lor;Lor;IZI)Lfo;", opaque = "-1743362675")
	public static Class145 method6486(Class382 var0, Class382 var1, int var2, boolean var3) {
		boolean var5 = true;
		byte[] var6 = var0.method7224(var2 >> 16 & 65535, var2 & 65535);
		if (var6 == null) {
			var5 = false;
			return null;
		} else {
			int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
			byte[] var8;
			if (var3) {
				var8 = var1.method7224(0, var7);
			} else {
				var8 = var1.method7224(var7, 0);
			}

			if (var8 == null) {
				var5 = false;
			}

			if (!var5) {
				return null;
			} else {
				if (field155 == null) {
					field1653 = Runtime.getRuntime().availableProcessors();
					field155 = new ThreadPoolExecutor(0, field1653, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + field1653 * 100), new Class133());
				}

				try {
					return new Class145(var0, var1, var2, var3);
				} catch (Exception var10) {
					return null;
				}
			}
		}
	}
}
