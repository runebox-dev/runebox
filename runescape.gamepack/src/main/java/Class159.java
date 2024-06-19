public class Class159 {
	public Class515 field1762;
	public boolean field1763;
	public boolean field1764;
	public boolean field1765;
	public boolean[] field1780;
	public byte field1770;
	public byte field1771;
	public byte field1773;
	public byte field1776;
	public byte[] field1768;
	public int field1766;
	public int field1767;
	public int field1769;
	public int field1774;
	public int field1781;
	public int field1782;
	public int[] field1777;
	public int[] field1778;
	public int[] field1779;
	public String field1772;
	public String[] field1785;
	public String[] field1786;
	public long field1787;
	public long[] field1775;
	public long[] field1784;

	public Class159(Class521 var1) {
		this.field1766 = 0;
		this.field1772 = null;
		this.field1767 = 0;
		this.field1781 = -1;
		this.field1782 = -1;
		this.method3352(var1);
	}

	public void method3333(int var1) {
		if (this.field1763) {
			if (this.field1775 != null) {
				System.arraycopy(this.field1775, 0, this.field1775 = new long[var1], 0, this.field1774);
			} else {
				this.field1775 = new long[var1];
			}
		}

		if (this.field1764) {
			if (this.field1785 != null) {
				System.arraycopy(this.field1785, 0, this.field1785 = new String[var1], 0, this.field1774);
			} else {
				this.field1785 = new String[var1];
			}
		}

		if (this.field1768 != null) {
			System.arraycopy(this.field1768, 0, this.field1768 = new byte[var1], 0, this.field1774);
		} else {
			this.field1768 = new byte[var1];
		}

		if (this.field1778 != null) {
			System.arraycopy(this.field1778, 0, this.field1778 = new int[var1], 0, this.field1774);
		} else {
			this.field1778 = new int[var1];
		}

		if (this.field1779 != null) {
			System.arraycopy(this.field1779, 0, this.field1779 = new int[var1], 0, this.field1774);
		} else {
			this.field1779 = new int[var1];
		}

		if (this.field1780 != null) {
			System.arraycopy(this.field1780, 0, this.field1780 = new boolean[var1], 0, this.field1774);
		} else {
			this.field1780 = new boolean[var1];
		}

	}

	public void method3349(int var1) {
		if (this.field1763) {
			if (this.field1784 != null) {
				System.arraycopy(this.field1784, 0, this.field1784 = new long[var1], 0, this.field1769);
			} else {
				this.field1784 = new long[var1];
			}
		}

		if (this.field1764) {
			if (this.field1786 != null) {
				System.arraycopy(this.field1786, 0, this.field1786 = new String[var1], 0, this.field1769);
			} else {
				this.field1786 = new String[var1];
			}
		}

	}

	public int method3354(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var3 = 0; var3 < this.field1774; ++var3) {
				if (this.field1785[var3].equals(var1)) {
					return var3;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	public int method3400(int var1, int var2, int var3) {
		int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1778[var1] & var5) >>> var2;
	}

	public Integer method3394(int var1) {
		if (this.field1762 == null) {
			return null;
		} else {
			Class506 var3 = this.field1762.method9326((long)var1);
			return var3 != null && var3 instanceof Class516 ? new Integer(((Class516)var3).field5199) : null;
		}
	}

	public int[] method3338() {
		if (this.field1777 == null) {
			String[] var2 = new String[this.field1774];
			this.field1777 = new int[this.field1774];

			for (int var3 = 0; var3 < this.field1774; this.field1777[var3] = var3++) {
				var2[var3] = this.field1785[var3];
				if (var2[var3] != null) {
					var2[var3] = var2[var3].toLowerCase();
				}
			}

			Class91.method2406(var2, this.field1777);
		}

		return this.field1777;
	}

	public void method3339(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field1763) {
			throw new RuntimeException("");
		} else if (this.field1764 != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field1775 == null || this.field1774 >= this.field1775.length) || var3 != null && (this.field1785 == null || this.field1774 >= this.field1785.length)) {
				this.method3333(5 + this.field1774);
			}

			if (this.field1775 != null) {
				this.field1775[this.field1774] = var1;
			}

			if (this.field1785 != null) {
				this.field1785[this.field1774] = var3;
			}

			if (-1 == this.field1781) {
				this.field1781 = this.field1774;
				this.field1768[this.field1774] = 126;
			} else {
				this.field1768[this.field1774] = 0;
			}

			this.field1778[this.field1774] = 0;
			this.field1779[this.field1774] = var4;
			this.field1780[this.field1774] = false;
			++this.field1774;
			this.field1777 = null;
		}
	}

	public void method3340(int var1) {
		if (var1 >= 0 && var1 < this.field1774) {
			--this.field1774;
			this.field1777 = null;
			if (this.field1774 == 0) {
				this.field1775 = null;
				this.field1785 = null;
				this.field1768 = null;
				this.field1778 = null;
				this.field1779 = null;
				this.field1780 = null;
				this.field1781 = -1;
				this.field1782 = -1;
			} else {
				System.arraycopy(this.field1768, var1 + 1, this.field1768, var1, this.field1774 - var1);
				System.arraycopy(this.field1778, var1 + 1, this.field1778, var1, this.field1774 - var1);
				System.arraycopy(this.field1779, var1 + 1, this.field1779, var1, this.field1774 - var1);
				System.arraycopy(this.field1780, var1 + 1, this.field1780, var1, this.field1774 - var1);
				if (this.field1775 != null) {
					System.arraycopy(this.field1775, var1 + 1, this.field1775, var1, this.field1774 - var1);
				}

				if (this.field1785 != null) {
					System.arraycopy(this.field1785, var1 + 1, this.field1785, var1, this.field1774 - var1);
				}

				this.method3385();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	public void method3385() {
		if (0 == this.field1774) {
			this.field1781 = -1;
			this.field1782 = -1;
		} else {
			this.field1781 = -1;
			this.field1782 = -1;
			int var2 = 0;
			byte var3 = this.field1768[0];

			for (int var4 = 1; var4 < this.field1774; ++var4) {
				if (this.field1768[var4] > var3) {
					if (var3 == 125) {
						this.field1782 = var2;
					}

					var2 = var4;
					var3 = this.field1768[var4];
				} else if (this.field1782 == -1 && this.field1768[var4] == 125) {
					this.field1782 = var4;
				}
			}

			this.field1781 = var2;
			if (-1 != this.field1781) {
				this.field1768[this.field1781] = 126;
			}

		}
	}

	public void method3342(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.field1763 != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.field1764) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field1784 == null || this.field1769 >= this.field1784.length) || var3 != null && (this.field1786 == null || this.field1769 >= this.field1786.length)) {
				this.method3349(5 + this.field1769);
			}

			if (this.field1784 != null) {
				this.field1784[this.field1769] = var1;
			}

			if (this.field1786 != null) {
				this.field1786[this.field1769] = var3;
			}

			++this.field1769;
		}
	}

	public void method3343(int var1) {
		--this.field1769;
		if (this.field1769 == 0) {
			this.field1784 = null;
			this.field1786 = null;
		} else {
			if (this.field1784 != null) {
				System.arraycopy(this.field1784, var1 + 1, this.field1784, var1, this.field1769 - var1);
			}

			if (this.field1786 != null) {
				System.arraycopy(this.field1786, var1 + 1, this.field1786, var1, this.field1769 - var1);
			}
		}

	}

	public int method3344(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.field1781 == var1 && (-1 == this.field1782 || this.field1768[this.field1782] < 125)) {
				return -1;
			} else if (var2 == this.field1768[var1]) {
				return -1;
			} else {
				this.field1768[var1] = var2;
				this.method3385();
				return var1;
			}
		} else {
			return -1;
		}
	}

	public boolean method3384(int var1) {
		if (var1 != this.field1781 && this.field1768[var1] != 126) {
			this.field1768[this.field1781] = 125;
			this.field1782 = this.field1781;
			this.field1768[var1] = 126;
			this.field1781 = var1;
			return true;
		} else {
			return false;
		}
	}

	public int method3337(int var1, boolean var2) {
		if (this.field1780[var1] == var2) {
			return -1;
		} else {
			this.field1780[var1] = var2;
			return var1;
		}
	}

	public int method3347(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		int var9 = this.field1778[var1];
		if ((var9 & var8) == var2) {
			return -1;
		} else {
			var9 &= ~var8;
			this.field1778[var1] = var9 | var2;
			return var1;
		}
	}

	public boolean method3389(int var1, int var2) {
		if (this.field1762 != null) {
			Class506 var4 = this.field1762.method9326((long)var1);
			if (var4 != null) {
				if (var4 instanceof Class516) {
					Class516 var5 = (Class516)var4;
					if (var5.field5199 == var2) {
						return false;
					}

					var5.field5199 = var2;
					return true;
				}

				var4.method9277();
			}
		} else {
			this.field1762 = new Class515(4);
		}

		this.field1762.method9333(new Class516(var2), (long)var1);
		return true;
	}

	public boolean method3360(int var1, int var2, int var3, int var4) {
		int var6 = (1 << var3) - 1;
		int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var8 = var7 ^ var6;
		var2 <<= var3;
		var2 &= var8;
		if (this.field1762 != null) {
			Class506 var9 = this.field1762.method9326((long)var1);
			if (var9 != null) {
				if (var9 instanceof Class516) {
					Class516 var10 = (Class516)var9;
					if ((var10.field5199 & var8) == var2) {
						return false;
					}

					var10.field5199 &= ~var8;
					var10.field5199 |= var2;
					return true;
				}

				var9.method9277();
			}
		} else {
			this.field1762 = new Class515(4);
		}

		this.field1762.method9333(new Class516(var2), (long)var1);
		return true;
	}

	public boolean method3350(int var1, long var2) {
		if (this.field1762 != null) {
			Class506 var4 = this.field1762.method9326((long)var1);
			if (var4 != null) {
				if (var4 instanceof Class512) {
					Class512 var5 = (Class512)var4;
					if (var5.field5186 == var2) {
						return false;
					}

					var5.field5186 = var2;
					return true;
				}

				var4.method9277();
			}
		} else {
			this.field1762 = new Class515(4);
		}

		this.field1762.method9333(new Class512(var2), (long)var1);
		return true;
	}

	public boolean method3351(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.field1762 != null) {
			Class506 var4 = this.field1762.method9326((long)var1);
			if (var4 != null) {
				if (var4 instanceof Class498) {
					Class498 var5 = (Class498)var4;
					if (var5.field5095 instanceof String) {
						if (var2.equals(var5.field5095)) {
							return false;
						}

						var5.method9277();
						this.field1762.method9333(new Class498(var2), var5.field5170);
						return true;
					}
				}

				var4.method9277();
			}
		} else {
			this.field1762 = new Class515(4);
		}

		this.field1762.method9333(new Class498(var2), (long)var1);
		return true;
	}

	public void method3352(Class521 var1) {
		int var3 = var1.method9405();
		if (var3 >= 1 && var3 <= 6) {
			int var4 = var1.method9405();
			if (0 != (var4 & 1)) {
				this.field1763 = true;
			}

			if (0 != (var4 & 2)) {
				this.field1764 = true;
			}

			if (!this.field1763) {
				this.field1775 = null;
				this.field1784 = null;
			}

			if (!this.field1764) {
				this.field1785 = null;
				this.field1786 = null;
			}

			this.field1766 = var1.method9410();
			this.field1767 = var1.method9410();
			if (var3 <= 3 && 0 != this.field1767) {
				this.field1767 += 16912800;
			}

			this.field1774 = var1.method9407();
			this.field1769 = var1.method9405();
			this.field1772 = var1.method9415();
			if (var3 >= 4) {
				var1.method9410();
			}

			this.field1765 = var1.method9405() == 1;
			this.field1770 = var1.method9406();
			this.field1771 = var1.method9406();
			this.field1776 = var1.method9406();
			this.field1773 = var1.method9406();
			int var5;
			if (this.field1774 > 0) {
				if (this.field1763 && (this.field1775 == null || this.field1775.length < this.field1774)) {
					this.field1775 = new long[this.field1774];
				}

				if (this.field1764 && (this.field1785 == null || this.field1785.length < this.field1774)) {
					this.field1785 = new String[this.field1774];
				}

				if (this.field1768 == null || this.field1768.length < this.field1774) {
					this.field1768 = new byte[this.field1774];
				}

				if (this.field1778 == null || this.field1778.length < this.field1774) {
					this.field1778 = new int[this.field1774];
				}

				if (this.field1779 == null || this.field1779.length < this.field1774) {
					this.field1779 = new int[this.field1774];
				}

				if (this.field1780 == null || this.field1780.length < this.field1774) {
					this.field1780 = new boolean[this.field1774];
				}

				for (var5 = 0; var5 < this.field1774; ++var5) {
					if (this.field1763) {
						this.field1775[var5] = var1.method9411();
					}

					if (this.field1764) {
						this.field1785[var5] = var1.method9414();
					}

					this.field1768[var5] = var1.method9406();
					if (var3 >= 2) {
						this.field1778[var5] = var1.method9410();
					}

					if (var3 >= 5) {
						this.field1779[var5] = var1.method9407();
					} else {
						this.field1779[var5] = 0;
					}

					if (var3 >= 6) {
						this.field1780[var5] = var1.method9405() == 1;
					} else {
						this.field1780[var5] = false;
					}
				}

				this.method3385();
			}

			if (this.field1769 > 0) {
				if (this.field1763 && (this.field1784 == null || this.field1784.length < this.field1769)) {
					this.field1784 = new long[this.field1769];
				}

				if (this.field1764 && (this.field1786 == null || this.field1786.length < this.field1769)) {
					this.field1786 = new String[this.field1769];
				}

				for (var5 = 0; var5 < this.field1769; ++var5) {
					if (this.field1763) {
						this.field1784[var5] = var1.method9411();
					}

					if (this.field1764) {
						this.field1786[var5] = var1.method9414();
					}
				}
			}

			if (var3 >= 3) {
				var5 = var1.method9407();
				if (var5 > 0) {
					this.field1762 = new Class515(var5 < 16 ? Class248.method4765(var5) : 16);

					while (var5-- > 0) {
						int var6 = var1.method9410();
						int var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.method9410();
							this.field1762.method9333(new Class516(var9), (long)var7);
						} else if (var8 == 1) {
							long var11 = var1.method9411();
							this.field1762.method9333(new Class512(var11), (long)var7);
						} else if (var8 == 2) {
							String var12 = var1.method9415();
							this.field1762.method9333(new Class498(var12), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var3);
		}
	}
}
