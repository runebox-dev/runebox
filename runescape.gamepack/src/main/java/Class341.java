import io.runebox.ObfInfo;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(name = "nc")
public class Class341 {
	@ObfInfo(name = "aj", desc = "[Z")
	public static boolean[] field3699;
	@ObfInfo(name = "ai", desc = "Lmo;")
	public Class327 field3693;
	@ObfInfo(name = "ae", desc = "Lmo;")
	public Class327 field3695;
	@ObfInfo(name = "ab", desc = "Lmo;")
	public Class327 field3697;
	@ObfInfo(name = "au", desc = "Lmo;")
	public Class327 field3704;
	@ObfInfo(name = "an", desc = "[[Lnx;")
	public Class362[][] field3698;
	@ObfInfo(name = "ad", desc = "Lok;")
	public Class375 field3694;
	@ObfInfo(name = "ap", desc = "Lok;")
	public Class375 field3696;
	@ObfInfo(name = "ag", desc = "Lok;")
	public Class375 field3701;
	@ObfInfo(name = "aq", desc = "Lok;")
	public Class375 field3702;
	@ObfInfo(name = "ak", desc = "Lok;")
	public Class375 field3706;
	@ObfInfo(name = "az", desc = "Lrb;")
	public Class444 field3703;
	@ObfInfo(name = "ah", desc = "Lrb;")
	public Class444 field3705;
	@ObfInfo(name = "av", desc = "Ljava/util/Map;")
	public Map field3700;

	public Class341(Class375 var1, Class375 var2, Class375 var3, Class375 var4, Class375 var5) {
		this.field3700 = new HashMap();
		this.field3697 = new Class327(200);
		this.field3693 = new Class327(50);
		this.field3695 = new Class327(20);
		this.field3704 = new Class327(8);
		this.field3705 = new Class444(10, Class446.field4834);
		this.field3703 = new Class444(10, Class446.field4834);
		int var6 = 0;
		if (var1 != null) {
			this.field3702 = var1;
			this.field3701 = var2;
			this.field3706 = var3;
			this.field3696 = var4;
			this.field3694 = var5;
			var6 = this.field3702.method7156();
		}

		this.field3698 = new Class362[var6][];
		field3699 = new boolean[var6];
	}

	@ObfInfo(name = "aq", desc = "(II)Lnx;", opaque = "1792194920")
	public Class362 method6417(int var1) {
		int var3 = var1 >> 16;
		int var4 = var1 & 65535;
		if (this.field3698[var3] == null || this.field3698[var3][var4] == null) {
			boolean var5 = this.method6412(var3);
			if (!var5) {
				return null;
			}
		}

		return this.field3698[var3][var4];
	}

	@ObfInfo(name = "ad", desc = "(IIB)Lnx;", opaque = "12")
	public Class362 method6411(int var1, int var2) {
		Class362 var4 = this.method6417(var1);
		if (var2 == -1) {
			return var4;
		} else {
			return var4 != null && var4.field3950 != null && var2 < var4.field3950.length ? var4.field3950[var2] : null;
		}
	}

	@ObfInfo(name = "ag", desc = "(II)Z", opaque = "65534")
	public boolean method6412(int var1) {
		if (field3699[var1]) {
			return true;
		} else if (!this.field3702.method7136(var1)) {
			return false;
		} else {
			int var3 = this.field3702.method7144(var1);
			if (var3 == 0) {
				field3699[var1] = true;
				return true;
			} else {
				if (this.field3698[var1] == null) {
					this.field3698[var1] = new Class362[var3];
				}

				for (int var4 = 0; var4 < var3; ++var4) {
					if (this.field3698[var1][var4] == null) {
						byte[] var5 = this.field3702.method7132(var1, var4);
						if (var5 != null) {
							this.field3698[var1][var4] = new Class362();
							this.field3698[var1][var4].field3812 = (var1 << 16) + var4;
							if (var5[0] == -1) {
								this.field3698[var1][var4].method6622(new Class562(var5));
							} else {
								this.field3698[var1][var4].method6665(new Class562(var5));
							}

							if (this.field3694 != null) {
								byte[] var6 = this.field3694.method7132(var1, var4);
								if (var6 != null && var6.length > 0) {
									this.field3698[var1][var4].method6623(new Class562(var6));
									this.field3700.put(this.field3698[var1][var4].field3814, var1);
								}
							}
						}
					}
				}

				field3699[var1] = true;
				return true;
			}
		}
	}

	@ObfInfo(name = "ak", desc = "(IB)V", opaque = "-2")
	public void method6410(int var1) {
		if (var1 != -1) {
			if (field3699[var1]) {
				this.field3702.method7147(var1);
				if (this.field3698[var1] != null) {
					for (int var3 = 0; var3 < this.field3698[var1].length; ++var3) {
						if (this.field3698[var1][var3] != null) {
							this.field3698[var1][var3] = null;
						}
					}

					this.field3698[var1] = null;
					field3699[var1] = false;
				}
			}
		}
	}

	@ObfInfo(name = "ap", desc = "(S)V")
	public void method6414() {
		this.field3697.method6332();
		this.field3693.method6332();
		this.field3695.method6332();
		this.field3704.method6332();
	}
}
