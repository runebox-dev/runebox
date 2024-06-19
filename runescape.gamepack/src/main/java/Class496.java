import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class496 {
	public static int field2098;
	public static final Class497 field5028;
	public static final Class497 field5029;
	public static final Class497 field5030;
	public Class269 field5038;
	public Class286 field5026;
	public Class286 field5035;
	public Class286 field5050;
	public Class348 field5074;
	public Class382 field5023;
	public Class382 field5025;
	public Class382 field5066;
	public Class418 field5031;
	public Class502 field5039;
	public Class549 field5051;
	public Class557[] field5033;
	public boolean field5032;
	public boolean field5048;
	public boolean field5068;
	public boolean field5075;
	public float field5045;
	public float field5059;
	public int field5020;
	public int field5027;
	public int field5040;
	public int field5041;
	public int field5042;
	public int field5043;
	public int field5044;
	public int field5047;
	public int field5049;
	public int field5054;
	public int field5055;
	public int field5056;
	public int field5057;
	public int field5058;
	public int field5061;
	public int field5062;
	public int field5067;
	public int field5069;
	public int field5073;
	public int field5076;
	public int field5077;
	public int field5078;
	public int field5080;
	public HashMap field5034;
	public HashMap field5063;
	public HashSet field5037;
	public HashSet field5052;
	public HashSet field5053;
	public HashSet field5064;
	public HashSet field5065;
	public HashSet field5071;
	public Iterator field5072;
	public List field5079;
	public long field5060;
	public final int[] field5070;

	static {
		field5028 = Class497.field5085;
		field5029 = Class497.field5086;
		field5030 = Class497.field5087;
	}

	public Class496() {
		this.field5042 = -1;
		this.field5043 = -1;
		this.field5044 = -1;
		this.field5047 = -1;
		this.field5073 = -1;
		this.field5020 = -1;
		this.field5049 = 3;
		this.field5027 = 50;
		this.field5032 = false;
		this.field5053 = null;
		this.field5054 = -1;
		this.field5055 = -1;
		this.field5056 = -1;
		this.field5057 = -1;
		this.field5058 = -1;
		this.field5076 = -1;
		this.field5048 = true;
		this.field5064 = new HashSet();
		this.field5065 = new HashSet();
		this.field5052 = new HashSet();
		this.field5037 = new HashSet();
		this.field5068 = false;
		this.field5069 = 0;
		this.field5070 = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field5071 = new HashSet();
		this.field5074 = null;
		this.field5075 = false;
		this.field5078 = -1;
		this.field5067 = -1;
		this.field5080 = -1;
	}

	public void method8990(Class382 var1, Class382 var2, Class382 var3, Class418 var4, HashMap var5, Class557[] var6) {
		this.field5033 = var6;
		this.field5025 = var1;
		this.field5066 = var2;
		this.field5023 = var3;
		this.field5031 = var4;
		this.field5063 = new HashMap();
		this.field5063.put(Class278.field3063, var5.get(field5028));
		this.field5063.put(Class278.field3065, var5.get(field5029));
		this.field5063.put(Class278.field3064, var5.get(field5030));
		this.field5039 = new Class502(var1);
		int var8 = this.field5025.method7233(Class308.field3249.field3251);
		int[] var9 = this.field5025.method7226(var8);
		int var10 = var9 == null ? 0 : var9.length;
		this.field5034 = new HashMap(var10);

		for (int var11 = 0; var11 < var10; ++var11) {
			Class521 var12 = new Class521(this.field5025.method7216(var8, var9[var11]));
			Class286 var13 = new Class286();
			var13.method5835(var12, var9[var11]);
			this.field5034.put(var13.method5794(), var13);
			if (var13.method5793()) {
				this.field5035 = var13;
			}
		}

		this.method9089(this.field5035);
		this.field5050 = null;
	}

	public void method9173() {
		Class301.method6030();
	}

	public void method9149(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.field5039.method9239()) {
			this.method9114();
			this.method9159();
			if (var3) {
				int var9 = (int)Math.ceil((double)((float)var6 / this.field5059));
				int var10 = (int)Math.ceil((double)((float)var7 / this.field5059));
				List var11 = this.field5038.method5358(this.field5040 - var9 / 2 - 1, this.field5041 - var10 / 2 - 1, this.field5040 + var9 / 2 + 1, 1 + var10 / 2 + this.field5041, var4, var5, var6, var7, var1, var2);
				HashSet var12 = new HashSet();

				Iterator var13;
				Class305 var14;
				Class101 var15;
				Class309 var16;
				for (var13 = var11.iterator(); var13.hasNext(); Class72.method7210(var15)) {
					var14 = (Class305)var13.next();
					var12.add(var14);
					var15 = new Class101();
					var16 = new Class309(var14.method5728(), var14.field3230, var14.field3235);
					var15.method2598(new Object[]{var16, var1, var2});
					if (this.field5071.contains(var14)) {
						var15.method2596(17);
					} else {
						var15.method2596(15);
					}
				}

				var13 = this.field5071.iterator();

				while (var13.hasNext()) {
					var14 = (Class305)var13.next();
					if (!var12.contains(var14)) {
						var15 = new Class101();
						var16 = new Class309(var14.method5728(), var14.field3230, var14.field3235);
						var15.method2598(new Object[]{var16, var1, var2});
						var15.method2596(16);
						Class72.method7210(var15);
					}
				}

				this.field5071 = var12;
			}
		}
	}

	public void method8993(int var1, int var2, boolean var3, boolean var4) {
		long var6;
		label38: {
			var6 = Class327.method3047();
			this.method8994(var1, var2, var4, var6);
			if (!this.method8999() && (var4 || var3)) {
				boolean var8 = Client.field665 != null;
				if (!var8) {
					if (var4) {
						this.field5058 = var1;
						this.field5076 = var2;
						this.field5056 = this.field5040;
						this.field5057 = this.field5041;
					}

					if (this.field5056 != -1) {
						int var9 = var1 - this.field5058;
						int var10 = var2 - this.field5076;
						this.method8997(this.field5056 - (int)((float)var9 / this.field5045), this.field5057 + (int)((float)var10 / this.field5045), false);
					}
					break label38;
				}
			}

			this.method8998();
		}

		if (var4) {
			this.field5060 = var6;
			this.field5061 = var1;
			this.field5062 = var2;
		}

	}

	public void method8994(int var1, int var2, boolean var3, long var4) {
		if (this.field5026 != null) {
			int var6 = (int)((float)this.field5040 + ((float)(var1 - this.field5073) - (float)this.method9027() * this.field5059 / 2.0F) / this.field5059);
			int var7 = (int)((float)this.field5041 - ((float)(var2 - this.field5020) - (float)this.method9028() * this.field5059 / 2.0F) / this.field5059);
			this.field5074 = this.field5026.method5842(var6 + this.field5026.method5799() * 64, var7 + this.field5026.method5801() * 64);
			if (this.field5074 != null && var3) {
				Class227 var8 = Client.field721;
				int var11;
				int var12;
				if (Class221.method4169() && var8.method4342(82) && var8.method4342(81)) {
					int var14 = this.field5074.field3869;
					var11 = this.field5074.field3868;
					var12 = this.field5074.field3870;
					Class316 var13 = Class316.method3908(Class315.field3333, Client.field548.field1446);
					var13.field3374.method9496(var12);
					var13.field3374.method9443(var11);
					var13.field3374.method9459(0);
					var13.field3374.method9389(var14);
					Client.field548.method2897(var13);
				} else {
					boolean var10 = true;
					if (this.field5048) {
						var11 = var1 - this.field5061;
						var12 = var2 - this.field5062;
						if (var4 - this.field5060 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						Class316 var15 = Class316.method3908(Class315.field3330, Client.field548.field1446);
						var15.field3374.method9590(this.field5074.method6698());
						Client.field548.method2897(var15);
						this.field5060 = 0L;
					}
				}
			}
		} else {
			this.field5074 = null;
		}

	}

	public void method9114() {
		if (Client.field422 != null) {
			this.field5059 = this.field5045;
		} else {
			if (this.field5059 < this.field5045) {
				this.field5059 = Math.min(this.field5045, this.field5059 / 30.0F + this.field5059);
			}

			if (this.field5059 > this.field5045) {
				this.field5059 = Math.max(this.field5045, this.field5059 - this.field5059 / 30.0F);
			}

		}
	}

	public void method9159() {
		if (this.method8999()) {
			int var2 = this.field5042 - this.field5040;
			int var3 = this.field5043 - this.field5041;
			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			if (var3 != 0) {
				var3 /= Math.min(8, Math.abs(var3));
			}

			this.method8997(var2 + this.field5040, this.field5041 + var3, true);
			if (this.field5042 == this.field5040 && this.field5043 == this.field5041) {
				this.field5042 = -1;
				this.field5043 = -1;
			}

		}
	}

	public final void method8997(int var1, int var2, boolean var3) {
		this.field5040 = var1;
		this.field5041 = var2;
		Class327.method3047();
		if (var3) {
			this.method8998();
		}

	}

	public final void method8998() {
		this.field5076 = -1;
		this.field5058 = -1;
		this.field5057 = -1;
		this.field5056 = -1;
	}

	public boolean method8999() {
		return this.field5042 != -1 && -1 != this.field5043;
	}

	public Class286 method9147(int var1, int var2, int var3) {
		Iterator var5 = this.field5034.values().iterator();

		Class286 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (Class286)var5.next();
		} while(!var6.method5843(var1, var2, var3));

		return var6;
	}

	public void method9001(int var1, int var2, int var3, boolean var4) {
		Class286 var6 = this.method9147(var1, var2, var3);
		if (var6 == null) {
			if (!var4) {
				return;
			}

			var6 = this.field5035;
		}

		boolean var7 = false;
		if (this.field5050 != var6 || var4) {
			this.field5050 = var6;
			this.method9089(var6);
			var7 = true;
		}

		if (var7 || var4) {
			this.method9007(var1, var2, var3);
		}

	}

	public void method9002(int var1) {
		Class286 var3 = this.method9019(var1);
		if (var3 != null) {
			this.method9089(var3);
		}

	}

	public int method9069() {
		return this.field5026 == null ? -1 : this.field5026.method5792();
	}

	public Class286 method9004() {
		return this.field5026;
	}

	public void method9089(Class286 var1) {
		if (this.field5026 == null || this.field5026 != var1) {
			this.method9146(var1);
			this.method9007(-1, -1, -1);
		}
	}

	public void method9146(Class286 var1) {
		this.field5026 = var1;
		this.field5038 = new Class269(this.field5033, this.field5063, this.field5066, this.field5023);
		this.field5039.method9236(this.field5026 == null ? null : this.field5026.method5794());
	}

	public void method9037(Class286 var1, Class348 var2, Class348 var3, boolean var4) {
		if (var1 != null) {
			if (this.field5026 == null || this.field5026 != var1) {
				this.method9146(var1);
			}

			if (!var4 && this.field5026.method5843(var2.field3870, var2.field3869, var2.field3868)) {
				this.method9007(var2.field3870, var2.field3869, var2.field3868);
			} else {
				this.method9007(var3.field3870, var3.field3869, var3.field3868);
			}

		}
	}

	public void method9007(int var1, int var2, int var3) {
		if (this.field5026 != null) {
			int[] var5 = this.field5026.method5789(var1, var2, var3);
			if (var5 == null) {
				var5 = this.field5026.method5789(this.field5026.method5804(), this.field5026.method5815(), this.field5026.method5805());
			}

			this.method8997(var5[0] - this.field5026.method5799() * 64, var5[1] - this.field5026.method5801() * 64, true);
			this.field5042 = -1;
			this.field5043 = -1;
			this.field5059 = this.method9033(this.field5026.method5798());
			this.field5045 = this.field5059;
			this.field5079 = null;
			this.field5072 = null;
			this.field5038.method5359();
		}
	}

	public void method9008(int var1, int var2, int var3, int var4, int var5, double var6) {
		int[] var8 = new int[4];
		Class561.method10195(var8);
		Class561.method10144(var1, var2, var3 + var1, var4 + var2);
		int var9 = this.field5039.method9240();
		if (var9 < 100) {
			this.method9014(var1, var2, var3, var4, var9);
		} else {
			if (!this.field5038.method5365()) {
				this.field5038.method5362(this.field5025, this.field5026.method5794(), Client.field528);
				if (!this.field5038.method5365()) {
					return;
				}
			}

			int var11 = this.field5038.method5366();
			double var12 = (double)(var11 >> 16 & 255) / 256.0D;
			double var14 = (double)(var11 >> 8 & 255) / 256.0D;
			double var16 = (double)(var11 & 255) / 256.0D;
			var12 = Math.pow(var12, var6);
			var14 = Math.pow(var14, var6);
			var16 = Math.pow(var16, var6);
			int var18 = (int)(256.0D * var12);
			int var19 = (int)(256.0D * var14);
			int var20 = (int)(256.0D * var16);
			int var10 = (var19 << 8) + -16777216 + (var18 << 16) + var20;
			Class561.method10152(var1, var2, var3, var4, var10);
			if (this.field5053 != null) {
				++this.field5055;
				if (this.field5055 % this.field5027 == 0) {
					this.field5055 = 0;
					++this.field5054;
				}

				if (this.field5054 >= this.field5049 && !this.field5032) {
					this.field5053 = null;
				}
			}

			int var13 = (int)Math.ceil((double)((float)var3 / this.field5059));
			int var21 = (int)Math.ceil((double)((float)var4 / this.field5059));
			this.field5038.method5360(this.field5040 - var13 / 2, this.field5041 - var21 / 2, var13 / 2 + this.field5040, this.field5041 + var21 / 2, var1, var2, var3 + var1, var4 + var2);
			if (!this.field5068) {
				boolean var15 = false;
				if (var5 - this.field5069 > 100) {
					this.field5069 = var5;
					var15 = true;
				}

				this.field5038.method5393(this.field5040 - var13 / 2, this.field5041 - var21 / 2, var13 / 2 + this.field5040, this.field5041 + var21 / 2, var1, var2, var3 + var1, var4 + var2, this.field5037, this.field5053, this.field5055, this.field5027, var15);
			}

			this.method9085(var1, var2, var3, var4, var13, var21);
			if (Class221.method4169() && this.field5075 && this.field5074 != null) {
				this.field5031.method8017("Coord: " + this.field5074, Class561.field5424 + 10, Class561.field5422 + 20, 16776960, -1);
			}

			this.field5044 = var13;
			this.field5047 = var21;
			this.field5073 = var1;
			this.field5020 = var2;
			Class561.method10147(var8);
		}
	}

	public void method9134() {
		Class279.field3086.method5894();
	}

	public boolean method9010(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.field5051 == null) {
			return true;
		} else if (this.field5051.field5353 == var1 && this.field5051.field5354 == var2) {
			if (this.field5038.field3001 != this.field5077) {
				return true;
			} else if (this.field5080 != Client.field781) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var3 + var1 < var5 || var4 + var2 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public void method9085(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field422 != null) {
			int var8 = 512 / (this.field5038.field3001 * 2);
			int var9 = var3 + 512;
			int var10 = var4 + 512;
			float var11 = 1.0F;
			var9 = (int)((float)var9 / var11);
			var10 = (int)((float)var10 / var11);
			int var12 = this.method9024() - var5 / 2 - var8;
			int var13 = this.method9158() - var6 / 2 - var8;
			int var14 = var1 - this.field5038.field3001 * (var12 + var8 - this.field5078);
			int var15 = var2 - (var8 - (var13 - this.field5067)) * this.field5038.field3001;
			if (this.method9010(var9, var10, var14, var15, var3, var4)) {
				if (this.field5051 != null && this.field5051.field5353 == var9 && this.field5051.field5354 == var10) {
					Arrays.fill(this.field5051.field5357, 0);
				} else {
					this.field5051 = new Class549(var9, var10);
				}

				this.field5078 = this.method9024() - var5 / 2 - var8;
				this.field5067 = this.method9158() - var6 / 2 - var8;
				this.field5077 = this.field5038.field3001;
				Client.field422.method7591(this.field5078, this.field5067, this.field5051, (float)this.field5077 / var11);
				this.field5080 = Client.field781;
				var14 = var1 - this.field5038.field3001 * (var12 + var8 - this.field5078);
				var15 = var2 - this.field5038.field3001 * (var8 - (var13 - this.field5067));
			}

			Class561.method10151(var1, var2, var3, var4, 0, 128);
			if (1.0F == var11) {
				this.field5051.method9941(var14, var15, 192);
			} else {
				this.field5051.method9944(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
			}
		}

	}

	public void method9098(int var1, int var2, int var3, int var4) {
		if (this.field5039.method9239()) {
			if (!this.field5038.method5365()) {
				this.field5038.method5362(this.field5025, this.field5026.method5794(), Client.field528);
				if (!this.field5038.method5365()) {
					return;
				}
			}

			this.field5038.method5361(var1, var2, var3, var4, this.field5053, this.field5055, this.field5027);
		}
	}

	public void method9090(int var1) {
		this.field5045 = this.method9033(var1);
	}

	public void method9014(int var1, int var2, int var3, int var4, int var5) {
		byte var7 = 20;
		int var8 = var1 + var3 / 2;
		int var9 = var4 / 2 + var2 - 18 - var7;
		Class561.method10152(var1, var2, var3, var4, -16777216);
		Class561.method10156(var8 - 152, var9, 304, 34, -65536);
		Class561.method10152(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
		this.field5031.method7996(Class378.field4452, var8, var9 + var7, -1, -1);
	}

	public float method9033(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	public int method9023() {
		if ((double)this.field5045 == 1.0D) {
			return 25;
		} else if ((double)this.field5045 == 1.5D) {
			return 37;
		} else if (2.0D == (double)this.field5045) {
			return 50;
		} else if ((double)this.field5045 == 3.0D) {
			return 75;
		} else {
			return (double)this.field5045 == 4.0D ? 100 : 200;
		}
	}

	public void method9005() {
		this.field5039.method9237();
	}

	public boolean method9018() {
		return this.field5039.method9239();
	}

	public Class286 method9019(int var1) {
		Iterator var3 = this.field5034.values().iterator();

		Class286 var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (Class286)var3.next();
		} while(var4.method5792() != var1);

		return var4;
	}

	public void method9067(int var1, int var2) {
		if (this.field5026 != null && this.field5026.method5797(var1, var2)) {
			this.field5042 = var1 - this.field5026.method5799() * 64;
			this.field5043 = var2 - this.field5026.method5801() * 64;
		}
	}

	public void method9021(int var1, int var2) {
		if (this.field5026 != null) {
			this.method8997(var1 - this.field5026.method5799() * 64, var2 - this.field5026.method5801() * 64, true);
			this.field5042 = -1;
			this.field5043 = -1;
		}
	}

	public void method9022(int var1, int var2, int var3) {
		if (this.field5026 != null) {
			int[] var5 = this.field5026.method5789(var1, var2, var3);
			if (var5 != null) {
				this.method9067(var5[0], var5[1]);
			}

		}
	}

	public void method9035(int var1, int var2, int var3) {
		if (this.field5026 != null) {
			int[] var5 = this.field5026.method5789(var1, var2, var3);
			if (var5 != null) {
				this.method9021(var5[0], var5[1]);
			}

		}
	}

	public int method9024() {
		return this.field5026 == null ? -1 : this.field5040 + this.field5026.method5799() * 64;
	}

	public int method9158() {
		return this.field5026 == null ? -1 : this.field5041 + this.field5026.method5801() * 64;
	}

	public Class348 method9026() {
		return this.field5026 == null ? null : this.field5026.method5842(this.method9024(), this.method9158());
	}

	public int method9027() {
		return this.field5044;
	}

	public int method9028() {
		return this.field5047;
	}

	public void method9029(int var1) {
		if (var1 >= 1) {
			this.field5049 = var1;
		}

	}

	public void method9030() {
		this.field5049 = 3;
	}

	public void method9031(int var1) {
		if (var1 >= 1) {
			this.field5027 = var1;
		}

	}

	public void method9032() {
		this.field5027 = 50;
	}

	public void method9066(boolean var1) {
		this.field5032 = var1;
	}

	public void method9034(int var1) {
		this.field5053 = new HashSet();
		this.field5053.add(var1);
		this.field5054 = 0;
		this.field5055 = 0;
	}

	public void method9050(int var1) {
		this.field5053 = new HashSet();
		this.field5054 = 0;
		this.field5055 = 0;

		for (int var3 = 0; var3 < field2098; ++var3) {
			if (Class200.method3917(var3) != null && Class200.method3917(var3).field2065 == var1) {
				this.field5053.add(Class200.method3917(var3).field2045);
			}
		}

	}

	public void method9056() {
		this.field5053 = null;
	}

	public void method9013(boolean var1) {
		this.field5068 = !var1;
	}

	public void method9038(int var1, boolean var2) {
		if (!var2) {
			this.field5064.add(var1);
		} else {
			this.field5064.remove(var1);
		}

		this.method9043();
	}

	public void method9039(int var1, boolean var2) {
		if (!var2) {
			this.field5065.add(var1);
		} else {
			this.field5065.remove(var1);
		}

		for (int var4 = 0; var4 < field2098; ++var4) {
			if (Class200.method3917(var4) != null && Class200.method3917(var4).field2065 == var1) {
				int var5 = Class200.method3917(var4).field2045;
				if (!var2) {
					this.field5052.add(var5);
				} else {
					this.field5052.remove(var5);
				}
			}
		}

		this.method9043();
	}

	public boolean method9040() {
		return !this.field5068;
	}

	public boolean method9041(int var1) {
		return !this.field5064.contains(var1);
	}

	public boolean method9042(int var1) {
		return !this.field5065.contains(var1);
	}

	public void method9043() {
		this.field5037.clear();
		this.field5037.addAll(this.field5064);
		this.field5037.addAll(this.field5052);
	}

	public void method9044(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.field5039.method9239()) {
			int var8 = (int)Math.ceil((double)((float)var3 / this.field5059));
			int var9 = (int)Math.ceil((double)((float)var4 / this.field5059));
			List var10 = this.field5038.method5358(this.field5040 - var8 / 2 - 1, this.field5041 - var9 / 2 - 1, this.field5040 + var8 / 2 + 1, 1 + var9 / 2 + this.field5041, var1, var2, var3, var4, var5, var6);
			if (!var10.isEmpty()) {
				Iterator var11 = var10.iterator();

				boolean var14;
				do {
					if (!var11.hasNext()) {
						return;
					}

					Class305 var12 = (Class305)var11.next();
					Class200 var13 = Class200.method3917(var12.method5728());
					var14 = false;

					for (int var15 = this.field5070.length - 1; var15 >= 0; --var15) {
						if (var13.field2054[var15] != null) {
							Class7.method93(var13.field2054[var15], var13.field2055, this.field5070[var15], var12.method5728(), var12.field3230.method6698(), var12.field3235.method6698());
							var14 = true;
						}
					}
				} while(!var14);

			}
		}
	}

	public Class348 method8989(int var1, Class348 var2) {
		if (!this.field5039.method9239()) {
			return null;
		} else if (!this.field5038.method5365()) {
			return null;
		} else if (!this.field5026.method5797(var2.field3869, var2.field3868)) {
			return null;
		} else {
			HashMap var4 = this.field5038.method5363();
			List var5 = (List)var4.get(var1);
			if (var5 != null && !var5.isEmpty()) {
				Class305 var6 = null;
				int var7 = -1;
				Iterator var8 = var5.iterator();

				while (true) {
					Class305 var9;
					int var12;
					do {
						if (!var8.hasNext()) {
							return var6.field3235;
						}

						var9 = (Class305)var8.next();
						int var10 = var9.field3235.field3869 - var2.field3869;
						int var11 = var9.field3235.field3868 - var2.field3868;
						var12 = var10 * var10 + var11 * var11;
						if (var12 == 0) {
							return var9.field3235;
						}
					} while(var12 >= var7 && var6 != null);

					var6 = var9;
					var7 = var12;
				}
			} else {
				return null;
			}
		}
	}

	public void method9046(int var1, int var2, Class348 var3, Class348 var4) {
		Class101 var6 = new Class101();
		Class309 var7 = new Class309(var2, var3, var4);
		var6.method2598(new Object[]{var7});
		switch(var1) {
		case 1008:
			var6.method2596(10);
			break;
		case 1009:
			var6.method2596(11);
			break;
		case 1010:
			var6.method2596(12);
			break;
		case 1011:
			var6.method2596(13);
			break;
		case 1012:
			var6.method2596(14);
		}

		Class72.method7210(var6);
	}

	public Class305 method9047() {
		if (!this.field5039.method9239()) {
			return null;
		} else if (!this.field5038.method5365()) {
			return null;
		} else {
			HashMap var2 = this.field5038.method5363();
			this.field5079 = new LinkedList();
			Iterator var3 = var2.values().iterator();

			while (var3.hasNext()) {
				List var4 = (List)var3.next();
				this.field5079.addAll(var4);
			}

			this.field5072 = this.field5079.iterator();
			return this.method9058();
		}
	}

	public Class305 method9058() {
		if (this.field5072 == null) {
			return null;
		} else {
			Class305 var2;
			do {
				if (!this.field5072.hasNext()) {
					return null;
				}

				var2 = (Class305)this.field5072.next();
			} while(var2.method5728() == -1);

			return var2;
		}
	}
}
