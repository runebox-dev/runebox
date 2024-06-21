import io.runebox.ObfInfo;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(name = "nk")
public class Class349 {
	@ObfInfo(desc = "[Z")
	public static boolean[] field1710;
	@ObfInfo(name = "ao", desc = "Llm;")
	public Class299 field3880;
	@ObfInfo(name = "av", desc = "Llm;")
	public Class299 field3881;
	@ObfInfo(name = "ah", desc = "Llm;")
	public Class299 field3883;
	@ObfInfo(name = "ac", desc = "Llm;")
	public Class299 field3886;
	@ObfInfo(name = "aa", desc = "[[Lnb;")
	public Class340[][] field3877;
	@ObfInfo(name = "al", desc = "Lor;")
	public Class382 field3873;
	@ObfInfo(name = "az", desc = "Lor;")
	public Class382 field3875;
	@ObfInfo(name = "af", desc = "Lor;")
	public Class382 field3876;
	@ObfInfo(name = "aj", desc = "Lor;")
	public Class382 field3879;
	@ObfInfo(name = "ak", desc = "Lor;")
	public Class382 field3882;
	@ObfInfo(name = "ap", desc = "Lry;")
	public Class467 field3872;
	@ObfInfo(name = "aq", desc = "Lry;")
	public Class467 field3884;
	@ObfInfo(name = "ab", desc = "Ljava/util/Map;")
	public Map field3878;

	public Class349(Class382 var1, Class382 var2, Class382 var3, Class382 var4, Class382 var5) {
		this.field3878 = new HashMap();
		this.field3886 = new Class299(200);
		this.field3880 = new Class299(50);
		this.field3883 = new Class299(20);
		this.field3881 = new Class299(8);
		this.field3884 = new Class467(10, Class459.field4870);
		this.field3872 = new Class467(10, Class459.field4870);
		int var6 = 0;
		if (var1 != null) {
			this.field3882 = var1;
			this.field3879 = var2;
			this.field3875 = var3;
			this.field3876 = var4;
			this.field3873 = var5;
			var6 = this.field3882.method7228();
		}

		this.field3877 = new Class340[var6][];
		field1710 = new boolean[var6];
	}

	@ObfInfo(name = "ak", desc = "(IB)Lnb;", opaque = "17")
	public Class340 method6718(int var1) {
		int var3 = var1 >> 16;
		int var4 = var1 & 65535;
		if (this.field3877[var3] == null || this.field3877[var3][var4] == null) {
			boolean var5 = this.method6720(var3);
			if (!var5) {
				return null;
			}
		}

		return this.field3877[var3][var4];
	}

	@ObfInfo(name = "al", desc = "(III)Lnb;", opaque = "535501978")
	public Class340 method6721(int var1, int var2) {
		Class340 var4 = this.method6718(var1);
		if (var2 == -1) {
			return var4;
		} else {
			return var4 != null && var4.field3745 != null && var2 < var4.field3745.length ? var4.field3745[var2] : null;
		}
	}

	@ObfInfo(name = "aj", desc = "(IB)Z", opaque = "5")
	public boolean method6720(int var1) {
		if (field1710[var1]) {
			return true;
		} else if (!this.field3882.method7220(var1)) {
			return false;
		} else {
			int var3 = this.field3882.method7237(var1);
			if (var3 == 0) {
				field1710[var1] = true;
				return true;
			} else {
				if (null == this.field3877[var1]) {
					this.field3877[var1] = new Class340[var3];
				}

				for (int var4 = 0; var4 < var3; ++var4) {
					if (this.field3877[var1][var4] == null) {
						byte[] var5 = this.field3882.method7216(var1, var4);
						if (var5 != null) {
							this.field3877[var1][var4] = new Class340();
							this.field3877[var1][var4].field3676 = (var1 << 16) + var4;
							if (var5[0] == -1) {
								this.field3877[var1][var4].method6502(new Class521(var5));
							} else {
								this.field3877[var1][var4].method6586(new Class521(var5));
							}

							if (this.field3873 != null) {
								byte[] var6 = this.field3873.method7216(var1, var4);
								if (var6 != null && var6.length > 0) {
									this.field3877[var1][var4].method6499(new Class521(var6));
									this.field3878.put(this.field3877[var1][var4].field3678, var1);
								}
							}
						}
					}
				}

				field1710[var1] = true;
				return true;
			}
		}
	}

	@ObfInfo(name = "az", desc = "(II)V", opaque = "-839691768")
	public void method6722(int var1) {
		if (var1 != -1) {
			if (field1710[var1]) {
				this.field3882.method7230(var1);
				if (this.field3877[var1] != null) {
					for (int var3 = 0; var3 < this.field3877[var1].length; ++var3) {
						if (this.field3877[var1][var3] != null) {
							this.field3877[var1][var3] = null;
						}
					}

					this.field3877[var1] = null;
					field1710[var1] = false;
				}
			}
		}
	}

	@ObfInfo(name = "af", desc = "(I)V")
	public void method6732() {
		this.field3886.method5995();
		this.field3880.method5995();
		this.field3883.method5995();
		this.field3881.method5995();
	}

	@ObfInfo(name = "ao", desc = "(IS)J")
	public static long method6730(int var0) {
		if (var0 > 63) {
			throw new Class429("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}
}
