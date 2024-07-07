import io.runebox.ObfInfo;

@ObfInfo(name = "gg")
public class Class163 extends Class516 {
	@ObfInfo(name = "ak", desc = "Lmo;")
	public static Class327 field1774;
	@ObfInfo(name = "as", desc = "Lhp;")
	public Class198 field1791;
	@ObfInfo(name = "aw", desc = "Lhx;")
	public Class206 field1792;
	@ObfInfo(name = "au", desc = "Z")
	public boolean field1782;
	@ObfInfo(name = "ah", desc = "Z")
	public boolean field1786;
	@ObfInfo(name = "af", desc = "[B")
	public byte[] field1794;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1782190655)
	public int field1777;
	@ObfInfo(name = "am", desc = "I", intMultiplier = -1450163917)
	public int field1778;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -2142550135)
	public int field1779;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -1897252869)
	public int field1780;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1313100289)
	public int field1783;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 367877827)
	public int field1787;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -1911514097)
	public int field1788;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 2063216183)
	public int field1789;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -419355367)
	public int field1795;
	@ObfInfo(name = "ac", desc = "[I")
	public int[] field1781;
	@ObfInfo(name = "at", desc = "[I")
	public int[] field1793;
	@ObfInfo(name = "av", desc = "Ljava/lang/String;")
	public String field1776;
	@ObfInfo(name = "ax", desc = "Ljava/lang/String;")
	public String field1785;
	@ObfInfo(name = "az", desc = "[Ljava/lang/String;")
	public String[] field1784;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -640773699)
	public final int field1775;

	static {
		field1774 = new Class327(256);
	}

	public Class163(int var1) {
		this.field1795 = -1;
		this.field1783 = -1;
		this.field1779 = 0;
		this.field1782 = true;
		this.field1786 = false;
		this.field1784 = new String[5];
		this.field1780 = Integer.MAX_VALUE;
		this.field1788 = Integer.MAX_VALUE;
		this.field1789 = Integer.MIN_VALUE;
		this.field1787 = Integer.MIN_VALUE;
		this.field1791 = Class198.field2179;
		this.field1792 = Class206.field2238;
		this.field1778 = -1;
		this.field1775 = var1;
	}

	@ObfInfo(name = "ad", desc = "(Lvp;I)V", opaque = "876705741")
	public void method3393(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3400(var1, var3);
		}
	}

	@ObfInfo(name = "ag", desc = "(Lvp;II)V", opaque = "1390831493")
	public void method3400(Class562 var1, int var2) {
		if (var2 == 1) {
			this.field1795 = var1.method9871();
		} else if (var2 == 2) {
			this.field1783 = var1.method9871();
		} else if (var2 == 3) {
			this.field1776 = var1.method9837();
		} else if (var2 == 4) {
			this.field1777 = var1.method9830();
		} else if (var2 == 5) {
			var1.method9830();
		} else if (var2 == 6) {
			this.field1779 = var1.method9902();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.method9902();
				if ((var4 & 1) == 0) {
					this.field1782 = false;
				}

				if ((var4 & 2) == 2) {
					this.field1786 = true;
				}
			} else if (var2 == 8) {
				var1.method9902();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field1784[var2 - 10] = var1.method9837();
			} else if (var2 == 15) {
				var4 = var1.method9902();
				this.field1781 = new int[var4 * 2];

				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field1781[var5] = var1.method9829();
				}

				var1.method9832();
				var5 = var1.method9902();
				this.field1793 = new int[var5];

				int var6;
				for (var6 = 0; var6 < this.field1793.length; ++var6) {
					this.field1793[var6] = var1.method9832();
				}

				this.field1794 = new byte[var4];

				for (var6 = 0; var6 < var4; ++var6) {
					this.field1794[var6] = var1.method9955();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field1785 = var1.method9837();
				} else if (var2 == 18) {
					var1.method9871();
				} else if (var2 == 19) {
					this.field1778 = var1.method9997();
				} else if (var2 == 21) {
					var1.method9832();
				} else if (var2 == 22) {
					var1.method9832();
				} else if (var2 == 23) {
					var1.method9902();
					var1.method9902();
					var1.method9902();
				} else if (var2 == 24) {
					var1.method9829();
					var1.method9829();
				} else if (var2 == 25) {
					var1.method9871();
				} else if (var2 == 28) {
					var1.method9902();
				} else if (var2 == 29) {
					Class198[] var7 = new Class198[]{Class198.field2179, Class198.field2180, Class198.field2186};
					this.field1791 = (Class198)Class406.method4071(var7, var1.method9902());
				} else if (var2 == 30) {
					this.field1792 = (Class206)Class406.method4071(Class206.method5055(), var1.method9902());
				}
			}
		}

	}

	@ObfInfo(name = "ak", desc = "(I)V", opaque = "-1010949943")
	public void method3387() {
		if (this.field1781 != null) {
			for (int var2 = 0; var2 < this.field1781.length; var2 += 2) {
				if (this.field1781[var2] < this.field1780) {
					this.field1780 = this.field1781[var2];
				} else if (this.field1781[var2] > this.field1789) {
					this.field1789 = this.field1781[var2];
				}

				if (this.field1781[var2 + 1] < this.field1788) {
					this.field1788 = this.field1781[var2 + 1];
				} else if (this.field1781[var2 + 1] > this.field1787) {
					this.field1787 = this.field1781[var2 + 1];
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(ZI)Lvg;", opaque = "-1473839283")
	public Class553 method3388(boolean var1) {
		int var3 = var1 ? this.field1783 : this.field1795;
		return this.method3389(var3);
	}

	@ObfInfo(name = "an", desc = "(II)Lvg;", opaque = "457669942")
	public Class553 method3389(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			Class553 var3 = (Class553)field1774.method6327((long)var1);
			if (var3 != null) {
				return var3;
			} else {
				var3 = Class554.method7253(Client.field1790, var1, 0);
				if (var3 != null) {
					field1774.method6330(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(S)I")
	public int method3390() {
		return this.field1775;
	}

	@ObfInfo(owner = "gn", name = "aq", desc = "(II)Lgg;", opaque = "-810303386")
	public static Class163 method3540(int var0) {
		return var0 >= 0 && var0 < Client.field1771.length && null != Client.field1771[var0] ? Client.field1771[var0] : new Class163(var0);
	}

	@ObfInfo(owner = "aa", name = "av", desc = "(I)V")
	public static void method5() {
		field1774.method6332();
	}
}
