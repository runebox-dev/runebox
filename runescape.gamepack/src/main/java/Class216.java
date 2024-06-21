import io.runebox.ObfInfo;

public class Class216 implements Class35 {
	@ObfInfo(name = "ak", desc = "Lnb;")
	public Class340 field2183;
	@ObfInfo(name = "aj", desc = "Z")
	public boolean field2179;
	@ObfInfo(name = "al", desc = "Z")
	public boolean field2180;

	public Class216() {
		this.field2183 = null;
		this.field2180 = false;
		this.field2179 = false;
	}

	@ObfInfo(name = "as", desc = "(Lnb;I)V", opaque = "1198485950")
	public void method4068(Class340 var1) {
		if (var1 != null) {
			if (this.field2183 != var1) {
				this.method4070();
				this.field2183 = var1;
			}

			Class352 var3 = var1.method6533();
			if (var3 != null) {
				if (!var3.field3896.method6929() && var3.field3898 != null) {
					Class101 var4 = new Class101();
					var4.method2603(var1);
					var4.method2598(var3.field3898);
					Client.method398().method7477(var4);
				}

				var3.field3896.method6753(true);
			}
		} else {
			this.method4070();
		}

	}

	@ObfInfo(name = "aw", desc = "(B)Lnb;")
	public Class340 method4069() {
		return this.field2183;
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaque = "-694149925")
	public void method4070() {
		if (this.field2183 != null) {
			Class352 var2 = this.field2183.method6533();
			Class340 var3 = this.field2183;
			this.field2183 = null;
			if (var2 != null) {
				if (var2.field3896.method6929() && var2.field3898 != null) {
					Class101 var4 = new Class101();
					var4.method2603(var3);
					var4.method2598(var2.field3898);
					Client.method398().method7477(var4);
				}

				var2.field3896.method6753(false);
			}
		}
	}

	@ObfInfo(name = "ak", desc = "(II)Z", opaque = "1374510228")
	public boolean method734(int var1) {
		if (this.field2183 == null) {
			return false;
		} else {
			Class32 var3 = this.field2183.method6629();
			if (var3 == null) {
				return false;
			} else {
				if (var3.method647(var1)) {
					switch(var1) {
					case 81:
						this.field2179 = true;
						break;
					case 82:
						this.field2180 = true;
						break;
					default:
						if (this.method4071(var1)) {
							Class317.method6187(this.field2183);
						}
					}
				}

				return var3.method645(var1);
			}
		}
	}

	@ObfInfo(name = "al", desc = "(II)Z")
	public boolean method736(int var1) {
		switch(var1) {
		case 81:
			this.field2179 = false;
			return false;
		case 82:
			this.field2180 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfInfo(name = "aj", desc = "(CI)Z", opaque = "206788056")
	public boolean method723(char var1) {
		if (this.field2183 == null) {
			return false;
		} else if (!Class405.method9865(var1)) {
			return false;
		} else {
			Class354 var3 = this.field2183.method6530();
			if (var3 != null && var3.method6809()) {
				Class32 var4 = this.field2183.method6629();
				if (var4 == null) {
					return false;
				} else {
					if (var4.method648(var1) && var3.method6770(var1)) {
						Class317.method6187(this.field2183);
					}

					return var4.method643(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfInfo(name = "az", desc = "(ZS)Z")
	public boolean method737(boolean var1) {
		return false;
	}

	@ObfInfo(name = "ai", desc = "(IB)Z", opaque = "104")
	public boolean method4071(int var1) {
		if (this.field2183 == null) {
			return false;
		} else {
			Class354 var3 = this.field2183.method6530();
			if (var3 != null && var3.method6809()) {
				switch(var1) {
				case 13:
					this.method4070();
					return true;
				case 48:
					if (this.field2180) {
						var3.method6932();
					}

					return true;
				case 65:
					if (this.field2180) {
						var3.method6820(Client.method3663());
					}

					return true;
				case 66:
					if (this.field2180) {
						var3.method6794(Client.method3663());
					}

					return true;
				case 67:
					if (this.field2180) {
						var3.method6796(Client.method3663());
					}

					return true;
				case 84:
					if (var3.method6815() == 0) {
						var3.method6770(10);
					} else if (this.field2179 && var3.method6819()) {
						var3.method6770(10);
					} else {
						Class352 var4 = this.field2183.method6533();
						Class101 var5 = new Class101();
						var5.method2603(this.field2183);
						var5.method2598(var4.field3897);
						Client.method398().method7477(var5);
						this.method4070();
					}

					return true;
				case 85:
					if (this.field2180) {
						var3.method6910();
					} else {
						var3.method6771();
					}

					return true;
				case 96:
					if (this.field2180) {
						var3.method6784(this.field2179);
					} else {
						var3.method6782(this.field2179);
					}

					return true;
				case 97:
					if (this.field2180) {
						var3.method6785(this.field2179);
					} else {
						var3.method6760(this.field2179);
					}

					return true;
				case 98:
					if (this.field2180) {
						var3.method6797();
					} else {
						var3.method6946(this.field2179);
					}

					return true;
				case 99:
					if (this.field2180) {
						var3.method6798();
					} else {
						var3.method6787(this.field2179);
					}

					return true;
				case 101:
					if (this.field2180) {
						var3.method6834();
					} else {
						var3.method6772();
					}

					return true;
				case 102:
					if (this.field2180) {
						var3.method6780(this.field2179);
					} else {
						var3.method6840(this.field2179);
					}

					return true;
				case 103:
					if (this.field2180) {
						var3.method6781(this.field2179);
					} else {
						var3.method6818(this.field2179);
					}

					return true;
				case 104:
					if (this.field2180) {
						var3.method6967(this.field2179);
					} else {
						var3.method6788(this.field2179);
					}

					return true;
				case 105:
					if (this.field2180) {
						var3.method6791(this.field2179);
					} else {
						var3.method6789(this.field2179);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
