import java.util.ArrayList;

public class Class439 {
	public Class436 field4756;
	public boolean field4765;
	public int field4751;
	public int field4760;
	public int field4761;
	public int field4762;
	public int field4763;
	public int field4764;
	public int field4769;
	public ArrayList field4767;

	public Class439() {
		this.field4760 = Integer.MAX_VALUE;
		this.field4751 = Integer.MAX_VALUE;
		this.field4762 = 0;
		this.field4763 = 0;
		this.field4764 = 0;
		this.field4765 = true;
		this.field4767 = new ArrayList();
		this.field4761 = 0;
		this.field4769 = 0;
	}

	public Class431 method8120(int var1) {
		return (Class431)this.field4767.get(var1);
	}

	public Class431 method8121() {
		return this.field4767.size() == 0 ? null : (Class431)this.field4767.get(this.field4767.size() - 1);
	}

	public boolean method8122() {
		return this.field4767.size() == 0;
	}

	public boolean method8123() {
		return this.field4751 > 1;
	}

	public int method8175() {
		return this.field4767.size();
	}

	public String method8125() {
		if (this.method8122()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method8175());

			for (int var3 = 0; var3 < this.method8175(); ++var3) {
				Class431 var4 = this.method8120(var3);
				var2.append(var4.field4708);
			}

			return var2.toString();
		}
	}

	public void method8126(int var1) {
		if (this.field4756 != null && var1 < this.field4756.field4730 * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (var1 != this.field4760) {
			this.field4760 = var1;
			this.method8154();
		}

	}

	public void method8127(int var1) {
		if (this.field4751 != var1) {
			this.field4751 = var1;
			this.method8154();
		}

	}

	public void method8128(int var1) {
		if (this.field4769 != var1) {
			this.field4769 = var1;
			this.method8154();
		}

	}

	public void method8129(Class436 var1) {
		if (this.field4756 != var1) {
			this.field4756 = var1;
			if (this.field4756 != null) {
				if (0 == this.field4764) {
					this.field4764 = this.field4756.field4730;
				}

				if (!this.method8122()) {
					this.method8154();
				}
			}
		}

	}

	public void method8130(int var1) {
		if (var1 != this.field4761) {
			this.field4761 = var1;
			this.method8154();
		}

	}

	public boolean method8131(int var1, int var2) {
		if (var1 != this.field4762 || this.field4763 != var2) {
			this.field4762 = var1;
			this.field4763 = var2;
			this.method8154();
		}

		return true;
	}

	public void method8170(int var1) {
		if (var1 != this.field4764) {
			this.field4764 = var1;
			this.method8154();
		}

	}

	public Class438 method8133(int var1, int var2) {
		if (var2 == var1) {
			return new Class438(this, 0, 0);
		} else if (var1 <= this.field4767.size() && var2 <= this.field4767.size()) {
			return var2 < var1 ? new Class438(this, var2, var1) : new Class438(this, var1, var2);
		} else {
			return new Class438(this, 0, 0);
		}
	}

	public Class435 method8220(char var1, int var2, int var3) {
		return this.method8135(Character.toString(var1), var2, var3);
	}

	public Class435 method8135(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var5 = var2;
		if (this.field4767.size() >= var3) {
			this.method8155(var2, var2);
			return new Class435(var2, true);
		} else {
			this.field4767.ensureCapacity(this.field4767.size() + var1.length());

			for (int var6 = 0; var6 < var1.length() && this.field4767.size() < var3; ++var6) {
				Class431 var7 = new Class431();
				var7.field4708 = var1.charAt(var6);
				this.field4767.add(var5, var7);
				++var5;
			}

			this.method8155(var2, var5);
			if (this.field4751 != 0 && this.method8160() > this.field4751) {
				while (var5 != var2) {
					--var5;
					this.method8190(var5);
					if (this.method8160() <= this.field4751) {
						break;
					}
				}

				return new Class435(var5, true);
			} else {
				return new Class435(var5, false);
			}
		}
	}

	public Class435 method8136(String var1, int var2) {
		return this.method8135(var1, this.field4767.size(), var2);
	}

	public Class435 method8169(String var1) {
		this.method8138();
		return this.method8136(var1, 0);
	}

	public void method8138() {
		this.field4767.clear();
	}

	public int method8190(int var1) {
		return this.method8140(var1, var1 + 1);
	}

	public int method8140(int var1, int var2) {
		int var4;
		if (var2 < var1) {
			var4 = var2;
			var2 = var1;
			var1 = var4;
		}

		this.field4767.subList(var1, var2).clear();
		var4 = var1;
		if (this.method8123() && this.field4761 == 1) {
			while (var4 > 0) {
				--var4;
				char var5 = ((Class431)this.field4767.get(var4)).field4708;
				if (var5 == ' ' || var5 == '\t') {
					break;
				}
			}
		}

		this.method8155(var4, var2);
		return var1;
	}

	public int method8141(int var1, int var2) {
		if (this.field4756 == null) {
			return 0;
		} else if (this.method8123() && var1 > this.field4760) {
			return this.field4767.size();
		} else {
			if (!this.field4767.isEmpty()) {
				for (int var4 = 0; var4 < this.field4767.size(); ++var4) {
					Class431 var5 = (Class431)this.field4767.get(var4);
					if (var2 <= var5.field4710 + this.method8145()) {
						if (var2 < var5.field4710) {
							break;
						}

						if (var1 < var5.field4709) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != this.field4767.size() && ((Class431)this.field4767.get(var4 + 1)).field4710 != var5.field4710) {
							int var6 = this.method8157((Class431)this.field4767.get(var4), false);
							if (var1 < var6 + var5.field4709) {
								return var4;
							}

							if (var2 <= var5.field4710 + this.method8145()) {
								return var4 + 1;
							}
						}
					}
				}

				Class431 var7 = (Class431)this.field4767.get(this.field4767.size() - 1);
				if (var1 >= var7.field4709 && var1 <= var7.field4709 + this.method8206() && var2 >= var7.field4710 && var2 <= var7.field4710 + this.method8145()) {
					return this.field4767.size() - 1;
				}
			}

			return this.field4767.size();
		}
	}

	public int method8142(int var1, int var2) {
		if (this.field4756 != null && !this.method8122() && var1 <= this.field4767.size()) {
			byte var4;
			if (var2 > 0) {
				var4 = 1;
			} else {
				var4 = -1;
				var2 = -var2;
			}

			int var5 = 0;
			int var6 = 0;
			if (var1 > 0) {
				Class431 var7 = (Class431)this.field4767.get(var1 - 1);
				var5 = var7.field4709 + this.method8156(var1 - 1);
				var6 = var7.field4710;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.field4767.size() + 1 : 0;

			for (int var12 = var4 + var1; var12 != var11; var12 += var4) {
				Class431 var13 = (Class431)this.field4767.get(var12 - 1);
				if (var6 != var13.field4710) {
					++var8;
					var6 = var13.field4710;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var8 == var2) {
					int var14 = Math.abs(var13.field4709 + this.method8156(var12 - 1) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (var4 == 1) {
				return this.field4767.size();
			} else {
				if (var6 != 0) {
					++var8;
				}

				return var10 != 16777215 && (var8 != var2 || var5 >= var10) ? var9 : 0;
			}
		} else {
			return 0;
		}
	}

	public int method8143() {
		if (!this.field4767.isEmpty() && this.method8160() == 1) {
			return this.field4767.isEmpty() ? 0 : ((Class431)this.field4767.get(this.field4767.size() - 1)).field4709 + this.method8206();
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.field4767.size() - 1; var4 >= 0; --var4) {
				Class431 var5 = (Class431)this.field4767.get(var4);
				if (var5.field4710 != var2) {
					int var6 = this.method8157(var5, false) + var5.field4709;
					var3 = Math.max(var6, var3);
					var2 = var5.field4710;
				}
			}

			return var3;
		}
	}

	public int method8200() {
		return this.method8122() ? 0 : this.field4756.field4730 + ((Class431)this.field4767.get(this.field4767.size() - 1)).field4710;
	}

	public int method8145() {
		return this.field4764;
	}

	public int method8160() {
		return this.method8200() / this.field4756.field4730;
	}

	public int method8206() {
		return this.method8122() ? 0 : this.method8157((Class431)this.field4767.get(this.field4767.size() - 1), false);
	}

	public int method8148() {
		return this.field4760;
	}

	public int method8149() {
		return this.field4751;
	}

	public int method8132() {
		return this.field4761;
	}

	public int method8151() {
		return this.field4769;
	}

	public int method8152(int var1) {
		switch(this.field4762) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	public int method8153(int var1) {
		switch(this.field4763) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	public void method8154() {
		this.method8155(0, this.field4767.size());
	}

	public void method8155(int var1, int var2) {
		if (!this.method8122() && this.field4756 != null) {
			Class509 var4 = this.method8158(var1, var2);
			boolean var5 = (Integer)var4.field5176 == 0 && (Integer)var4.field5175 == this.field4767.size();
			int var6 = (Integer)var4.field5176;
			int var7 = 0;
			int var8 = var5 ? 0 : ((Class431)this.field4767.get((Integer)var4.field5176)).field4710;
			int var9 = 0;

			int var10;
			for (var10 = (Integer)var4.field5176; var10 <= (Integer)var4.field5175; ++var10) {
				boolean var11 = var10 >= this.field4767.size();
				Class431 var12 = (Class431)this.field4767.get(!var11 ? var10 : this.field4767.size() - 1);
				int var13 = !var11 ? this.method8157(var12, false) : 0;
				boolean var14 = !var11 && var12.field4708 == '\n';
				boolean var15 = !var11 && this.method8123() && var13 + var7 > this.field4760;
				if (var14 || var15 || var11) {
					int var16 = var10;
					int var17 = 0;
					int var18;
					int var19;
					Class431 var20;
					if (var15) {
						var18 = 0;
						if (1 == this.field4761) {
							for (var19 = var10; var19 > var6; --var19) {
								var20 = (Class431)this.field4767.get(var19);
								var18 += var19 < var10 ? this.method8157(var20, false) : 0;
								if (var20.field4708 == ' ' || var20.field4708 == '\n') {
									var16 = var19;
									var7 -= var18;
									var17 = var18;
									break;
								}
							}
						}
					}

					var18 = -this.method8152(var7);

					for (var19 = var6; var19 < var16; ++var19) {
						var20 = (Class431)this.field4767.get(var19);
						int var21 = this.method8157(var20, false);
						var20.field4709 = var18;
						var20.field4710 = var8;
						var18 += var21;
					}

					var6 = var16;
					var7 = var17;
					var8 += this.method8145();
					++var9;
				}

				var7 += !var11 ? var13 : 0;
			}

			if (this.field4763 != 0 && var5) {
				var10 = this.method8145() * var9;
				int var22 = this.method8153(var10);

				for (int var23 = 0; var23 < this.field4767.size(); ++var23) {
					Class431 var24 = (Class431)this.field4767.get(var23);
					var24.field4710 -= var22;
				}
			}

		}
	}

	public int method8156(int var1) {
		return var1 < this.field4767.size() ? this.method8157((Class431)this.field4767.get(var1), false) : 0;
	}

	public int method8157(Class431 var1, boolean var2) {
		if (var1.field4708 == '\n') {
			return 0;
		} else if (!var2 && 0 != this.field4769) {
			return this.field4756.field4725[42];
		} else {
			int var4 = this.field4756.field4725[var1.field4708];
			if (var4 == 0) {
				return var1.field4708 == '\t' ? 3 * this.field4756.field4725[32] : this.field4756.field4725[32];
			} else {
				return var4;
			}
		}
	}

	public Class509 method8158(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.field4767.size();
		if (var4 == 0 && var6 == var5) {
			return new Class509(0, var6);
		} else {
			int var7 = this.method8159(var4, false);
			int var8 = this.method8224(var5, false);
			int var9;
			switch(this.field4763) {
			case 0:
				if (this.field4762 == 0) {
					return new Class509(var7, var6);
				}

				var9 = this.method8159(var4, true);
				return new Class509(var9, var6);
			case 1:
				return new Class509(0, var6);
			case 2:
				if (2 == this.field4762) {
					return new Class509(0, var8);
				}

				var9 = this.method8224(var5, true);
				return new Class509(0, var9);
			default:
				return new Class509(0, var6);
			}
		}
	}

	public int method8159(int var1, boolean var2) {
		if (var1 < this.field4767.size()) {
			int var4 = ((Class431)this.field4767.get(var1)).field4710;

			for (int var5 = var1; var5 > 0; --var5) {
				if (((Class431)this.field4767.get(var5 - 1)).field4710 < var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((Class431)this.field4767.get(var5 - 1)).field4710;
				}
			}
		}

		return 0;
	}

	public int method8224(int var1, boolean var2) {
		if (var1 < this.field4767.size()) {
			int var4 = ((Class431)this.field4767.get(var1)).field4710;

			for (int var5 = var1; var5 < this.field4767.size() - 1; ++var5) {
				if (((Class431)this.field4767.get(var5 + 1)).field4710 > var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((Class431)this.field4767.get(var5 + 1)).field4710;
				}
			}
		}

		return this.field4767.size();
	}
}
