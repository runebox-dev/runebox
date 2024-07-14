import io.runebox.ObfInfo;
import java.util.ArrayList;

@ObfInfo(name = "ql")
public class Class428 {
	@ObfInfo(name = "aw", desc = "Lqz;")
	public Class442 field4719;
	@ObfInfo(name = "as", desc = "Z")
	public boolean field4731;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 1391544929)
	public int field4723;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -21565275)
	public int field4726;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -59088811)
	public int field4727;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -746841467)
	public int field4730;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1599545561)
	public int field4732;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1840112385)
	public int field4734;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 199041437)
	public int field4735;
	@ObfInfo(name = "at", desc = "Ljava/util/ArrayList;")
	public ArrayList field4733;

	public Class428() {
		this.field4726 = Integer.MAX_VALUE;
		this.field4727 = Integer.MAX_VALUE;
		this.field4730 = 0;
		this.field4732 = 0;
		this.field4735 = 0;
		this.field4731 = true;
		this.field4733 = new ArrayList();
		this.field4734 = 0;
		this.field4723 = 0;
	}

	@ObfInfo(name = "aq", desc = "(IB)Lqf;")
	public Class422 method7871(int var1) {
		return (Class422)this.field4733.get(var1);
	}

	@ObfInfo(name = "ad", desc = "(S)Lqf;", opaque = "4095")
	public Class422 method7951() {
		return this.field4733.size() == 0 ? null : (Class422)this.field4733.get(this.field4733.size() - 1);
	}

	@ObfInfo(name = "ag", desc = "(B)Z", opaque = "0")
	public boolean method7888() {
		return this.field4733.size() == 0;
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "2009455501")
	public boolean method7874() {
		return this.field4727 > 1;
	}

	@ObfInfo(name = "ap", desc = "(B)I")
	public int method7936() {
		return this.field4733.size();
	}

	@ObfInfo(name = "an", desc = "(B)Ljava/lang/String;", opaque = "0")
	public String method7876() {
		if (this.method7888()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method7936());

			for (int var3 = 0; var3 < this.method7936(); ++var3) {
				Class422 var4 = this.method7871(var3);
				var2.append(var4.field4693);
			}

			return var2.toString();
		}
	}

	@ObfInfo(name = "aj", desc = "(IB)V", opaque = "1")
	public void method7961(int var1) {
		if (this.field4719 != null && var1 < this.field4719.field4784 * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4726 != var1) {
			this.field4726 = var1;
			this.method7904();
		}

	}

	@ObfInfo(name = "av", desc = "(IB)V", opaque = "0")
	public void method7982(int var1) {
		if (this.field4727 != var1) {
			this.field4727 = var1;
			this.method7904();
		}

	}

	@ObfInfo(name = "ab", desc = "(II)V", opaque = "161057042")
	public void method7879(int var1) {
		if (this.field4723 != var1) {
			this.field4723 = var1;
			this.method7904();
		}

	}

	@ObfInfo(name = "ai", desc = "(Lqz;B)V", opaque = "13")
	public void method7926(Class442 var1) {
		if (this.field4719 != var1) {
			this.field4719 = var1;
			if (this.field4719 != null) {
				if (this.field4735 == 0) {
					this.field4735 = this.field4719.field4784;
				}

				if (!this.method7888()) {
					this.method7904();
				}
			}
		}

	}

	@ObfInfo(name = "ae", desc = "(IB)V", opaque = "8")
	public void method7881(int var1) {
		if (this.field4734 != var1) {
			this.field4734 = var1;
			this.method7904();
		}

	}

	@ObfInfo(name = "au", desc = "(III)Z", opaque = "1099939946")
	public boolean method7981(int var1, int var2) {
		if (this.field4730 != var1 || this.field4732 != var2) {
			this.field4730 = var1;
			this.field4732 = var2;
			this.method7904();
		}

		return true;
	}

	@ObfInfo(name = "ah", desc = "(IB)V", opaque = "94")
	public void method7883(int var1) {
		if (this.field4735 != var1) {
			this.field4735 = var1;
			this.method7904();
		}

	}

	@ObfInfo(name = "az", desc = "(IIB)Lqw;", opaque = "-1")
	public Class439 method7884(int var1, int var2) {
		if (var1 == var2) {
			return new Class439(this, 0, 0);
		} else if (var1 <= this.field4733.size() && var2 <= this.field4733.size()) {
			return var2 < var1 ? new Class439(this, var2, var1) : new Class439(this, var1, var2);
		} else {
			return new Class439(this, 0, 0);
		}
	}

	@ObfInfo(name = "ax", desc = "(CIIS)Lqk;")
	public Class427 method7971(char var1, int var2, int var3) {
		return this.method7997(Character.toString(var1), var2, var3);
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/String;III)Lqk;", opaque = "-1908492223")
	public Class427 method7997(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var5 = var2;
		if (this.field4733.size() >= var3) {
			this.method7905(var2, var2);
			return new Class427(var2, true);
		} else {
			this.field4733.ensureCapacity(this.field4733.size() + var1.length());

			for (int var6 = 0; var6 < var1.length() && this.field4733.size() < var3; ++var6) {
				Class422 var7 = new Class422();
				var7.field4693 = var1.charAt(var6);
				this.field4733.add(var5, var7);
				++var5;
			}

			this.method7905(var2, var5);
			if (this.field4727 != 0 && this.method7987() > this.field4727) {
				while (var2 != var5) {
					--var5;
					this.method7933(var5);
					if (this.method7987() <= this.field4727) {
						break;
					}
				}

				return new Class427(var5, true);
			} else {
				return new Class427(var5, false);
			}
		}
	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/String;IB)Lqk;")
	public Class427 method7887(String var1, int var2) {
		return this.method7997(var1, this.field4733.size(), var2);
	}

	@ObfInfo(name = "ay", desc = "(Ljava/lang/String;B)Lqk;")
	public Class427 method7992(String var1) {
		this.method8022();
		return this.method7887(var1, 0);
	}

	@ObfInfo(name = "ao", desc = "(I)V")
	public void method8022() {
		this.field4733.clear();
	}

	@ObfInfo(name = "aa", desc = "(IB)I")
	public int method7933(int var1) {
		return this.method7890(var1, var1 + 1);
	}

	@ObfInfo(name = "as", desc = "(IIB)I", opaque = "0")
	public int method7890(int var1, int var2) {
		int var4;
		if (var2 < var1) {
			var4 = var2;
			var2 = var1;
			var1 = var4;
		}

		this.field4733.subList(var1, var2).clear();
		var4 = var1;
		if (this.method7874() && this.field4734 == 1) {
			while (var4 > 0) {
				--var4;
				char var5 = ((Class422)this.field4733.get(var4)).field4693;
				if (var5 == ' ' || var5 == '\t') {
					break;
				}
			}
		}

		this.method7905(var4, var2);
		return var1;
	}

	@ObfInfo(name = "aw", desc = "(III)I", opaque = "1073281454")
	public int method7878(int var1, int var2) {
		if (this.field4719 == null) {
			return 0;
		} else if (this.method7874() && var1 > this.field4726) {
			return this.field4733.size();
		} else {
			if (!this.field4733.isEmpty()) {
				for (int var4 = 0; var4 < this.field4733.size(); ++var4) {
					Class422 var5 = (Class422)this.field4733.get(var4);
					if (var2 <= var5.field4694 + this.method7895()) {
						if (var2 < var5.field4694) {
							break;
						}

						if (var1 < var5.field4696) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != this.field4733.size() && ((Class422)this.field4733.get(var4 + 1)).field4694 != var5.field4694) {
							int var6 = this.method7907((Class422)this.field4733.get(var4), false);
							if (var1 < var5.field4696 + var6) {
								return var4;
							}

							if (var2 <= var5.field4694 + this.method7895()) {
								return var4 + 1;
							}
						}
					}
				}

				Class422 var7 = (Class422)this.field4733.get(this.field4733.size() - 1);
				if (var1 >= var7.field4696 && var1 <= var7.field4696 + this.method7946() && var2 >= var7.field4694 && var2 <= var7.field4694 + this.method7895()) {
					return this.field4733.size() - 1;
				}
			}

			return this.field4733.size();
		}
	}

	@ObfInfo(name = "at", desc = "(IIB)I", opaque = "0")
	public int method7892(int var1, int var2) {
		if (this.field4719 != null && !this.method7888() && var1 <= this.field4733.size()) {
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
				Class422 var7 = (Class422)this.field4733.get(var1 - 1);
				var5 = var7.field4696 + this.method7995(var1 - 1);
				var6 = var7.field4694;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.field4733.size() + 1 : 0;

			for (int var12 = var1 + var4; var11 != var12; var12 += var4) {
				Class422 var13 = (Class422)this.field4733.get(var12 - 1);
				if (var13.field4694 != var6) {
					++var8;
					var6 = var13.field4694;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var2 == var8) {
					int var14 = Math.abs(var13.field4696 + this.method7995(var12 - 1) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (var4 == 1) {
				return this.field4733.size();
			} else {
				if (var6 != 0) {
					++var8;
				}

				return var10 == 16777215 || var2 == var8 && var5 < var10 ? 0 : var9;
			}
		} else {
			return 0;
		}
	}

	@ObfInfo(name = "af", desc = "(I)I", opaque = "992973642")
	public int method7893() {
		if (!this.field4733.isEmpty() && this.method7987() == 1) {
			return this.field4733.isEmpty() ? 0 : ((Class422)this.field4733.get(this.field4733.size() - 1)).field4696 + this.method7946();
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.field4733.size() - 1; var4 >= 0; --var4) {
				Class422 var5 = (Class422)this.field4733.get(var4);
				if (var5.field4694 != var2) {
					int var6 = this.method7907(var5, false) + var5.field4696;
					var3 = Math.max(var6, var3);
					var2 = var5.field4694;
				}
			}

			return var3;
		}
	}

	@ObfInfo(name = "am", desc = "(I)I", opaque = "-1369224754")
	public int method7894() {
		return this.method7888() ? 0 : this.field4719.field4784 + ((Class422)this.field4733.get(this.field4733.size() - 1)).field4694;
	}

	@ObfInfo(name = "ar", desc = "(B)I")
	public int method7895() {
		return this.field4735;
	}

	@ObfInfo(name = "bt", desc = "(B)I")
	public int method7987() {
		return this.method7894() / this.field4719.field4784;
	}

	@ObfInfo(name = "bj", desc = "(I)I", opaque = "-1587256532")
	public int method7946() {
		return this.method7888() ? 0 : this.method7907((Class422)this.field4733.get(this.field4733.size() - 1), false);
	}

	@ObfInfo(name = "be", desc = "(I)I")
	public int method7896() {
		return this.field4726;
	}

	@ObfInfo(name = "bm", desc = "(B)I")
	public int method7945() {
		return this.field4727;
	}

	@ObfInfo(name = "bo", desc = "(S)I")
	public int method7900() {
		return this.field4734;
	}

	@ObfInfo(name = "bi", desc = "(I)I")
	public int method7901() {
		return this.field4723;
	}

	@ObfInfo(name = "ba", desc = "(IB)I")
	public int method8011(int var1) {
		switch(this.field4730) {
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

	@ObfInfo(name = "bg", desc = "(II)I")
	public int method7880(int var1) {
		switch(this.field4732) {
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

	@ObfInfo(name = "bs", desc = "(I)V")
	public void method7904() {
		this.method7905(0, this.field4733.size());
	}

	@ObfInfo(name = "bp", desc = "(III)V", opaque = "-1940231940")
	public void method7905(int var1, int var2) {
		if (!this.method7888() && this.field4719 != null) {
			Class515 var4 = this.method7908(var1, var2);
			boolean var5 = (Integer)var4.field5155 == 0 && (Integer)var4.field5152 == this.field4733.size();
			int var6 = (Integer)var4.field5155;
			int var7 = 0;
			int var8 = var5 ? 0 : ((Class422)this.field4733.get((Integer)var4.field5155)).field4694;
			int var9 = 0;

			int var10;
			for (var10 = (Integer)var4.field5155; var10 <= (Integer)var4.field5152; ++var10) {
				boolean var11 = var10 >= this.field4733.size();
				Class422 var12 = (Class422)this.field4733.get(!var11 ? var10 : this.field4733.size() - 1);
				int var13 = !var11 ? this.method7907(var12, false) : 0;
				boolean var14 = !var11 && var12.field4693 == '\n';
				boolean var15 = !var11 && this.method7874() && var7 + var13 > this.field4726;
				if (var14 || var15 || var11) {
					int var16 = var10;
					int var17 = 0;
					int var18;
					int var19;
					Class422 var20;
					if (var15) {
						var18 = 0;
						if (this.field4734 == 1) {
							for (var19 = var10; var19 > var6; --var19) {
								var20 = (Class422)this.field4733.get(var19);
								var18 += var19 < var10 ? this.method7907(var20, false) : 0;
								if (var20.field4693 == ' ' || var20.field4693 == '\n') {
									var16 = var19;
									var7 -= var18;
									var17 = var18;
									break;
								}
							}
						}
					}

					var18 = -this.method8011(var7);

					for (var19 = var6; var19 < var16; ++var19) {
						var20 = (Class422)this.field4733.get(var19);
						int var21 = this.method7907(var20, false);
						var20.field4696 = var18;
						var20.field4694 = var8;
						var18 += var21;
					}

					var6 = var16;
					var7 = var17;
					var8 += this.method7895();
					++var9;
				}

				var7 += !var11 ? var13 : 0;
			}

			if (this.field4732 != 0 && var5) {
				var10 = this.method7895() * var9;
				int var22 = this.method7880(var10);

				for (int var23 = 0; var23 < this.field4733.size(); ++var23) {
					Class422 var24 = (Class422)this.field4733.get(var23);
					var24.field4694 -= var22;
				}
			}

		}
	}

	@ObfInfo(name = "bx", desc = "(II)I", opaque = "-1657628020")
	public int method7995(int var1) {
		return var1 < this.field4733.size() ? this.method7907((Class422)this.field4733.get(var1), false) : 0;
	}

	@ObfInfo(name = "bu", desc = "(Lqf;ZB)I", opaque = "10")
	public int method7907(Class422 var1, boolean var2) {
		if (var1.field4693 == '\n') {
			return 0;
		} else if (!var2 && this.field4723 != 0) {
			return this.field4719.field4786[42];
		} else {
			int var4 = this.field4719.field4786[var1.field4693];
			if (var4 == 0) {
				return var1.field4693 == '\t' ? this.field4719.field4786[32] * 3 : this.field4719.field4786[32];
			} else {
				return var4;
			}
		}
	}

	@ObfInfo(name = "by", desc = "(III)Ltu;", opaque = "-209961331")
	public Class515 method7908(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.field4733.size();
		if (var4 == 0 && var5 == var6) {
			return new Class515(0, var6);
		} else {
			int var7 = this.method7909(var4, false);
			int var8 = this.method7910(var5, false);
			int var9;
			switch(this.field4732) {
			case 0:
				if (this.field4730 == 0) {
					return new Class515(var7, var6);
				}

				var9 = this.method7909(var4, true);
				return new Class515(var9, var6);
			case 1:
				return new Class515(0, var6);
			case 2:
				if (this.field4730 == 2) {
					return new Class515(0, var8);
				}

				var9 = this.method7910(var5, true);
				return new Class515(0, var9);
			default:
				return new Class515(0, var6);
			}
		}
	}

	@ObfInfo(name = "bw", desc = "(IZI)I", opaque = "-1479963303")
	public int method7909(int var1, boolean var2) {
		if (var1 < this.field4733.size()) {
			int var4 = ((Class422)this.field4733.get(var1)).field4694;

			for (int var5 = var1; var5 > 0; --var5) {
				if (((Class422)this.field4733.get(var5 - 1)).field4694 < var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((Class422)this.field4733.get(var5 - 1)).field4694;
				}
			}
		}

		return 0;
	}

	@ObfInfo(name = "bl", desc = "(IZI)I", opaque = "758337933")
	public int method7910(int var1, boolean var2) {
		if (var1 < this.field4733.size()) {
			int var4 = ((Class422)this.field4733.get(var1)).field4694;

			for (int var5 = var1; var5 < this.field4733.size() - 1; ++var5) {
				if (((Class422)this.field4733.get(var5 + 1)).field4694 > var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((Class422)this.field4733.get(var5 + 1)).field4694;
				}
			}
		}

		return this.field4733.size();
	}
}
