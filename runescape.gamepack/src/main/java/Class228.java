import io.runebox.ObfInfo;
import java.awt.datatransfer.Clipboard;

@ObfInfo(name = "it")
public class Class228 implements Class39 {
	@ObfInfo(name = "aq", desc = "Lnx;")
	public Class362 field2461;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field2459;
	@ObfInfo(name = "ag", desc = "Z")
	public boolean field2460;

	public Class228() {
		this.field2461 = null;
		this.field2459 = false;
		this.field2460 = false;
	}

	@ObfInfo(name = "au", desc = "(Lnx;I)V", opaque = "-1386535715")
	public void method4398(Class362 var1) {
		if (var1 != null) {
			if (this.field2461 != var1) {
				this.method4400();
				this.field2461 = var1;
			}

			Class342 var3 = var1.method6657();
			if (var3 != null) {
				if (!var3.field3712.method6825() && var3.field3713 != null) {
					Class99 var4 = new Class99();
					var4.method2642(var1);
					var4.method2640(var3.field3713);
					Client.method6545().method7506(var4);
				}

				var3.field3712.method6953(true);
			}
		} else {
			this.method4400();
		}

	}

	@ObfInfo(name = "ah", desc = "(B)Lnx;")
	public Class362 method4399() {
		return this.field2461;
	}

	@ObfInfo(name = "az", desc = "(I)V", opaque = "-927911127")
	public void method4400() {
		if (this.field2461 != null) {
			Class342 var2 = this.field2461.method6657();
			Class362 var3 = this.field2461;
			this.field2461 = null;
			if (var2 != null) {
				if (var2.field3712.method6825() && var2.field3713 != null) {
					Class99 var4 = new Class99();
					var4.method2642(var3);
					var4.method2640(var2.field3713);
					Client.method6545().method7506(var4);
				}

				var2.field3712.method6953(false);
			}
		}
	}

	@ObfInfo(name = "aq", desc = "(II)Z", opaque = "-704783138")
	public boolean method562(int var1) {
		if (this.field2461 == null) {
			return false;
		} else {
			Class36 var3 = this.field2461.method6705();
			if (var3 == null) {
				return false;
			} else {
				if (var3.method491(var1)) {
					switch(var1) {
					case 81:
						this.field2460 = true;
						break;
					case 82:
						this.field2459 = true;
						break;
					default:
						if (this.method4405(var1)) {
							Class490.method8827(this.field2461);
						}
					}
				}

				return var3.method489(var1);
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(IB)Z")
	public boolean method564(int var1) {
		switch(var1) {
		case 81:
			this.field2460 = false;
			return false;
		case 82:
			this.field2459 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfInfo(name = "ag", desc = "(CI)Z", opaque = "-327979221")
	public boolean method556(char var1) {
		if (this.field2461 == null) {
			return false;
		} else if (!Class225.method4342(var1)) {
			return false;
		} else {
			Class363 var3 = this.field2461.method6756();
			if (var3 != null && var3.method6830()) {
				Class36 var4 = this.field2461.method6705();
				if (var4 == null) {
					return false;
				} else {
					if (var4.method492(var1) && var3.method6791(var1)) {
						Class490.method8827(this.field2461);
					}

					return var4.method490(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfInfo(name = "ak", desc = "(ZS)Z")
	public boolean method557(boolean var1) {
		return false;
	}

	@ObfInfo(name = "ax", desc = "(IB)Z", opaque = "6")
	public boolean method4405(int var1) {
		if (this.field2461 == null) {
			return false;
		} else {
			Class363 var3 = this.field2461.method6756();
			if (var3 != null && var3.method6830()) {
				Clipboard var6;
				switch(var1) {
				case 13:
					this.method4400();
					return true;
				case 48:
					if (this.field2459) {
						var3.method6844();
					}

					return true;
				case 65:
					if (this.field2459) {
						var6 = Client.field4671.method632();
						var3.method6816(var6);
					}

					return true;
				case 66:
					if (this.field2459) {
						var6 = Client.field4671.method632();
						var3.method6815(var6);
					}

					return true;
				case 67:
					if (this.field2459) {
						var6 = Client.field4671.method632();
						var3.method6938(var6);
					}

					return true;
				case 84:
					if (var3.method6974() == 0) {
						var3.method6791(10);
					} else if (this.field2460 && var3.method6840()) {
						var3.method6791(10);
					} else {
						Class342 var4 = this.field2461.method6657();
						Class99 var5 = new Class99();
						var5.method2642(this.field2461);
						var5.method2640(var4.field3714);
						Client.method6545().method7506(var5);
						this.method4400();
					}

					return true;
				case 85:
					if (this.field2459) {
						var3.method6794();
					} else {
						var3.method6976();
					}

					return true;
				case 96:
					if (this.field2459) {
						var3.method6805(this.field2460);
					} else {
						var3.method6955(this.field2460);
					}

					return true;
				case 97:
					if (this.field2459) {
						var3.method6792(this.field2460);
					} else {
						var3.method6804(this.field2460);
					}

					return true;
				case 98:
					if (this.field2459) {
						var3.method6824();
					} else {
						var3.method6984(this.field2460);
					}

					return true;
				case 99:
					if (this.field2459) {
						var3.method6819();
					} else {
						var3.method6808(this.field2460);
					}

					return true;
				case 101:
					if (this.field2459) {
						var3.method6772();
					} else {
						var3.method6793();
					}

					return true;
				case 102:
					if (this.field2459) {
						var3.method6983(this.field2460);
					} else {
						var3.method6799(this.field2460);
					}

					return true;
				case 103:
					if (this.field2459) {
						var3.method6802(this.field2460);
					} else {
						var3.method6800(this.field2460);
					}

					return true;
				case 104:
					if (this.field2459) {
						var3.method6797(this.field2460);
					} else {
						var3.method6809(this.field2460);
					}

					return true;
				case 105:
					if (this.field2459) {
						var3.method6812(this.field2460);
					} else {
						var3.method6932(this.field2460);
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
