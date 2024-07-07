import io.runebox.ObfInfo;

@ObfInfo(name = "gk")
public class Class167 {
	@ObfInfo(name = "ar", desc = "Lth;")
	public Class502 field1823;
	@ObfInfo(name = "ag", desc = "Z")
	public boolean field1816;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field1817;
	@ObfInfo(name = "av", desc = "Z")
	public boolean field1836;
	@ObfInfo(name = "ao", desc = "[Z")
	public boolean[] field1834;
	@ObfInfo(name = "ab", desc = "B")
	public byte field1824;
	@ObfInfo(name = "ai", desc = "B")
	public byte field1825;
	@ObfInfo(name = "ae", desc = "B")
	public byte field1826;
	@ObfInfo(name = "au", desc = "B")
	public byte field1827;
	@ObfInfo(name = "ax", desc = "[B")
	public byte[] field1830;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -484263669)
	public int field1820;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1500532859)
	public int field1828;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -481044237)
	public int field1833;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -53757351)
	public int field1837;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1385578651)
	public int field1838;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 196306029)
	public int field1842;
	@ObfInfo(name = "ac", desc = "[I")
	public int[] field1821;
	@ObfInfo(name = "ay", desc = "[I")
	public int[] field1832;
	@ObfInfo(name = "al", desc = "[I")
	public int[] field1841;
	@ObfInfo(name = "an", desc = "Ljava/lang/String;")
	public String field1835;
	@ObfInfo(name = "af", desc = "[Ljava/lang/String;")
	public String[] field1839;
	@ObfInfo(name = "am", desc = "[Ljava/lang/String;")
	public String[] field1840;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -3246048372211759241L)
	public long field1819;
	@ObfInfo(name = "az", desc = "[J")
	public long[] field1829;
	@ObfInfo(name = "at", desc = "[J")
	public long[] field1831;

	public Class167(Class562 var1) {
		this.field1820 = 0;
		this.field1835 = null;
		this.field1838 = 0;
		this.field1833 = -1;
		this.field1842 = -1;
		this.method3473(var1);
	}

	@ObfInfo(name = "aq", desc = "(IB)V", opaque = "0")
	public void method3454(int var1) {
		if (this.field1817) {
			if (this.field1829 != null) {
				System.arraycopy(this.field1829, 0, this.field1829 = new long[var1], 0, this.field1828);
			} else {
				this.field1829 = new long[var1];
			}
		}

		if (this.field1816) {
			if (this.field1839 != null) {
				System.arraycopy(this.field1839, 0, this.field1839 = new String[var1], 0, this.field1828);
			} else {
				this.field1839 = new String[var1];
			}
		}

		if (this.field1830 != null) {
			System.arraycopy(this.field1830, 0, this.field1830 = new byte[var1], 0, this.field1828);
		} else {
			this.field1830 = new byte[var1];
		}

		if (this.field1841 != null) {
			System.arraycopy(this.field1841, 0, this.field1841 = new int[var1], 0, this.field1828);
		} else {
			this.field1841 = new int[var1];
		}

		if (this.field1832 != null) {
			System.arraycopy(this.field1832, 0, this.field1832 = new int[var1], 0, this.field1828);
		} else {
			this.field1832 = new int[var1];
		}

		if (this.field1834 != null) {
			System.arraycopy(this.field1834, 0, this.field1834 = new boolean[var1], 0, this.field1828);
		} else {
			this.field1834 = new boolean[var1];
		}

	}

	@ObfInfo(name = "ad", desc = "(II)V", opaque = "912447472")
	public void method3505(int var1) {
		if (this.field1817) {
			if (this.field1831 != null) {
				System.arraycopy(this.field1831, 0, this.field1831 = new long[var1], 0, this.field1837);
			} else {
				this.field1831 = new long[var1];
			}
		}

		if (this.field1816) {
			if (this.field1840 != null) {
				System.arraycopy(this.field1840, 0, this.field1840 = new String[var1], 0, this.field1837);
			} else {
				this.field1840 = new String[var1];
			}
		}

	}

	@ObfInfo(name = "ag", desc = "(Ljava/lang/String;I)I", opaque = "-996810660")
	public int method3514(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var3 = 0; var3 < this.field1828; ++var3) {
				if (this.field1839[var3].equals(var1)) {
					return var3;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfInfo(name = "ak", desc = "(IIII)I", opaque = "984884395")
	public int method3457(int var1, int var2, int var3) {
		int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1841[var1] & var5) >>> var2;
	}

	@ObfInfo(name = "ap", desc = "(IB)Ljava/lang/Integer;", opaque = "2")
	public Integer method3458(int var1) {
		if (this.field1823 == null) {
			return null;
		} else {
			Class520 var3 = this.field1823.method8901((long)var1);
			return var3 != null && var3 instanceof Class508 ? new Integer(((Class508)var3).field5094) : null;
		}
	}

	@ObfInfo(name = "an", desc = "(I)[I", opaque = "-600541897")
	public int[] method3490() {
		if (this.field1821 == null) {
			String[] var2 = new String[this.field1828];
			this.field1821 = new int[this.field1828];

			for (int var3 = 0; var3 < this.field1828; this.field1821[var3] = var3++) {
				var2[var3] = this.field1839[var3];
				if (var2[var3] != null) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			Class521.method3990(var2, this.field1821);
		}

		return this.field1821;
	}

	@ObfInfo(name = "aj", desc = "(JLjava/lang/String;II)V", opaque = "255427998")
	public void method3483(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field1817) {
			throw new RuntimeException("");
		} else if (var3 != null != this.field1816) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field1829 == null || this.field1828 >= this.field1829.length) || var3 != null && (this.field1839 == null || this.field1828 >= this.field1839.length)) {
				this.method3454(this.field1828 + 5);
			}

			if (this.field1829 != null) {
				this.field1829[this.field1828] = var1;
			}

			if (this.field1839 != null) {
				this.field1839[this.field1828] = var3;
			}

			if (-1 == this.field1833) {
				this.field1833 = this.field1828;
				this.field1830[this.field1828] = 126;
			} else {
				this.field1830[this.field1828] = 0;
			}

			this.field1841[this.field1828] = 0;
			this.field1832[this.field1828] = var4;
			this.field1834[this.field1828] = false;
			++this.field1828;
			this.field1821 = null;
		}
	}

	@ObfInfo(name = "av", desc = "(II)V", opaque = "588688091")
	public void method3495(int var1) {
		if (var1 >= 0 && var1 < this.field1828) {
			--this.field1828;
			this.field1821 = null;
			if (this.field1828 == 0) {
				this.field1829 = null;
				this.field1839 = null;
				this.field1830 = null;
				this.field1841 = null;
				this.field1832 = null;
				this.field1834 = null;
				this.field1833 = -1;
				this.field1842 = -1;
			} else {
				System.arraycopy(this.field1830, var1 + 1, this.field1830, var1, this.field1828 - var1);
				System.arraycopy(this.field1841, var1 + 1, this.field1841, var1, this.field1828 - var1);
				System.arraycopy(this.field1832, var1 + 1, this.field1832, var1, this.field1828 - var1);
				System.arraycopy(this.field1834, var1 + 1, this.field1834, var1, this.field1828 - var1);
				if (this.field1829 != null) {
					System.arraycopy(this.field1829, var1 + 1, this.field1829, var1, this.field1828 - var1);
				}

				if (this.field1839 != null) {
					System.arraycopy(this.field1839, var1 + 1, this.field1839, var1, this.field1828 - var1);
				}

				this.method3462();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(name = "ab", desc = "(I)V", opaque = "1422529734")
	public void method3462() {
		if (0 == this.field1828) {
			this.field1833 = -1;
			this.field1842 = -1;
		} else {
			this.field1833 = -1;
			this.field1842 = -1;
			int var2 = 0;
			byte var3 = this.field1830[0];

			for (int var4 = 1; var4 < this.field1828; ++var4) {
				if (this.field1830[var4] > var3) {
					if (var3 == 125) {
						this.field1842 = var2;
					}

					var2 = var4;
					var3 = this.field1830[var4];
				} else if (-1 == this.field1842 && this.field1830[var4] == 125) {
					this.field1842 = var4;
				}
			}

			this.field1833 = var2;
			if (this.field1833 != -1) {
				this.field1830[this.field1833] = 126;
			}

		}
	}

	@ObfInfo(name = "ai", desc = "(JLjava/lang/String;I)V", opaque = "396253424")
	public void method3463(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.field1817 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.field1816) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field1831 == null || this.field1837 >= this.field1831.length) || var3 != null && (this.field1840 == null || this.field1837 >= this.field1840.length)) {
				this.method3505(5 + this.field1837);
			}

			if (this.field1831 != null) {
				this.field1831[this.field1837] = var1;
			}

			if (this.field1840 != null) {
				this.field1840[this.field1837] = var3;
			}

			++this.field1837;
		}
	}

	@ObfInfo(name = "ae", desc = "(II)V", opaque = "-1361843074")
	public void method3464(int var1) {
		--this.field1837;
		if (0 == this.field1837) {
			this.field1831 = null;
			this.field1840 = null;
		} else {
			if (this.field1831 != null) {
				System.arraycopy(this.field1831, var1 + 1, this.field1831, var1, this.field1837 - var1);
			}

			if (this.field1840 != null) {
				System.arraycopy(this.field1840, var1 + 1, this.field1840, var1, this.field1837 - var1);
			}
		}

	}

	@ObfInfo(name = "au", desc = "(IBB)I", opaque = "0")
	public int method3465(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (var1 == this.field1833 && (this.field1842 == -1 || this.field1830[this.field1842] < 125)) {
				return -1;
			} else if (var2 == this.field1830[var1]) {
				return -1;
			} else {
				this.field1830[var1] = var2;
				this.method3462();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfInfo(name = "ah", desc = "(II)Z", opaque = "-1361976444")
	public boolean method3474(int var1) {
		if (this.field1833 != var1 && 126 != this.field1830[var1]) {
			this.field1830[this.field1833] = 125;
			this.field1842 = this.field1833;
			this.field1830[var1] = 126;
			this.field1833 = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "az", desc = "(IZI)I", opaque = "-208357079")
	public int method3453(int var1, boolean var2) {
		if (this.field1834[var1] == var2) {
			return -1;
		} else {
			this.field1834[var1] = var2;
			return var1;
		}
	}

	@ObfInfo(name = "ax", desc = "(IIIII)I", opaque = "-1714220366")
	public int method3468(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.field1841[var1];
		if (var2 == (var9 & var8)) {
			return -1;
		} else {
			var9 &= ~var8;
			this.field1841[var1] = var9 | var2;
			return var1;
		}
	}

	@ObfInfo(name = "ac", desc = "(IIB)Z", opaque = "6")
	public boolean method3469(int var1, int var2) {
		if (this.field1823 != null) {
			Class520 var4 = this.field1823.method8901((long)var1);
			if (var4 != null) {
				if (var4 instanceof Class508) {
					Class508 var5 = (Class508)var4;
					if (var5.field5094 == var2) {
						return false;
					}

					var5.field5094 = var2;
					return true;
				}

				var4.method9267();
			}
		} else {
			this.field1823 = new Class502(4);
		}

		this.field1823.method8902(new Class508(var2), (long)var1);
		return true;
	}

	@ObfInfo(name = "al", desc = "(IIIII)Z", opaque = "-1315727361")
	public boolean method3470(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (this.field1823 != null) {
			Class520 var9 = this.field1823.method8901((long)var1);
			if (var9 != null) {
				if (var9 instanceof Class508) {
					Class508 var10 = (Class508)var9;
					if (var2 == (var10.field5094 & var8)) {
						return false;
					}

					var10.field5094 &= ~var8;
					var10.field5094 |= var2;
					return true;
				}

				var9.method9267();
			}
		} else {
			this.field1823 = new Class502(4);
		}

		this.field1823.method8902(new Class508(var2), (long)var1);
		return true;
	}

	@ObfInfo(name = "ay", desc = "(IJ)Z")
	public boolean method3471(int var1, long var2) {
		if (this.field1823 != null) {
			Class520 var4 = this.field1823.method8901((long)var1);
			if (var4 != null) {
				if (var4 instanceof Class498) {
					Class498 var5 = (Class498)var4;
					if (var5.field5055 == var2) {
						return false;
					}

					var5.field5055 = var2;
					return true;
				}

				var4.method9267();
			}
		} else {
			this.field1823 = new Class502(4);
		}

		this.field1823.method8902(new Class498(var2), (long)var1);
		return true;
	}

	@ObfInfo(name = "ao", desc = "(ILjava/lang/String;B)Z", opaque = "32")
	public boolean method3472(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.field1823 != null) {
			Class520 var4 = this.field1823.method8901((long)var1);
			if (var4 != null) {
				if (var4 instanceof Class497) {
					Class497 var5 = (Class497)var4;
					if (var5.field5054 instanceof String) {
						if (var2.equals(var5.field5054)) {
							return false;
						}

						var5.method9267();
						this.field1823.method8902(new Class497(var2), var5.field5234);
						return true;
					}
				}

				var4.method9267();
			}
		} else {
			this.field1823 = new Class502(4);
		}

		this.field1823.method8902(new Class497(var2), (long)var1);
		return true;
	}

	@ObfInfo(name = "aa", desc = "(Lvp;I)V", opaque = "547630086")
	public void method3473(Class562 var1) {
		int var3 = var1.method9902();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.method9902();
			if (0 != (var4 & 1)) {
				this.field1817 = true;
			}

			if ((var4 & 2) != 0) {
				this.field1816 = true;
			}

			if (!this.field1817) {
				this.field1829 = null;
				this.field1831 = null;
			}

			if (!this.field1816) {
				this.field1839 = null;
				this.field1840 = null;
			}

			this.field1820 = var1.method9832();
			this.field1838 = var1.method9832();
			if (var3 <= 3 && this.field1838 != 0) {
				this.field1838 += 16912800;
			}

			this.field1828 = var1.method9997();
			this.field1837 = var1.method9902();
			this.field1835 = var1.method9837();
			if (var3 >= 4) {
				var1.method9832();
			}

			this.field1836 = var1.method9902() == 1;
			this.field1824 = var1.method9955();
			this.field1825 = var1.method9955();
			this.field1826 = var1.method9955();
			this.field1827 = var1.method9955();
			int var5;
			if (this.field1828 > 0) {
				if (this.field1817 && (this.field1829 == null || this.field1829.length < this.field1828)) {
					this.field1829 = new long[this.field1828];
				}

				if (this.field1816 && (this.field1839 == null || this.field1839.length < this.field1828)) {
					this.field1839 = new String[this.field1828];
				}

				if (this.field1830 == null || this.field1830.length < this.field1828) {
					this.field1830 = new byte[this.field1828];
				}

				if (this.field1841 == null || this.field1841.length < this.field1828) {
					this.field1841 = new int[this.field1828];
				}

				if (this.field1832 == null || this.field1832.length < this.field1828) {
					this.field1832 = new int[this.field1828];
				}

				if (this.field1834 == null || this.field1834.length < this.field1828) {
					this.field1834 = new boolean[this.field1828];
				}

				for (var5 = 0; var5 < this.field1828; ++var5) {
					if (this.field1817) {
						this.field1829[var5] = var1.method9833();
					}

					if (this.field1816) {
						this.field1839[var5] = var1.method9836();
					}

					this.field1830[var5] = var1.method9955();
					if (var3 >= 2) {
						this.field1841[var5] = var1.method9832();
					}

					if (var3 >= 5) {
						this.field1832[var5] = var1.method9997();
					} else {
						this.field1832[var5] = 0;
					}

					if (var3 >= 6) {
						this.field1834[var5] = var1.method9902() == 1;
					} else {
						this.field1834[var5] = false;
					}
				}

				this.method3462();
			}

			if (this.field1837 > 0) {
				if (this.field1817 && (this.field1831 == null || this.field1831.length < this.field1837)) {
					this.field1831 = new long[this.field1837];
				}

				if (this.field1816 && (this.field1840 == null || this.field1840.length < this.field1837)) {
					this.field1840 = new String[this.field1837];
				}

				for (var5 = 0; var5 < this.field1837; ++var5) {
					if (this.field1817) {
						this.field1831[var5] = var1.method9833();
					}

					if (this.field1816) {
						this.field1840[var5] = var1.method9836();
					}
				}
			}

			if (var3 >= 3) {
				var5 = var1.method9997();
				if (var5 > 0) {
					this.field1823 = new Class502(var5 < 16 ? Class337.method7475(var5) : 16);

					while (var5-- > 0) {
						int var6 = var1.method9832();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.method9832();
							this.field1823.method8902(new Class508(var9), (long)var7);
						} else if (var8 == 1) {
							long var11 = var1.method9833();
							this.field1823.method8902(new Class498(var11), (long)var7);
						} else if (var8 == 2) {
							String var12 = var1.method9837();
							this.field1823.method8902(new Class497(var12), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var3);
		}
	}
}
