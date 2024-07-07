import io.runebox.ObfInfo;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfInfo(name = "is")
public class Class227 {
	@ObfInfo(name = "ac", desc = "Lez;")
	public Class130 field2457;
	@ObfInfo(name = "ae", desc = "Lif;")
	public Class214 field2452;
	@ObfInfo(name = "ai", desc = "Lin;")
	public Class222 field2456;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1575492419)
	public int field2453;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 407404605)
	public int field2454;
	@ObfInfo(name = "ax", desc = "Ljava/lang/String;")
	public String field2446;
	@ObfInfo(name = "ah", desc = "Ljava/lang/String;")
	public String field2451;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field2455;

	public Class227() {
		this.field2453 = -1;
		this.field2454 = 0;
	}

	@ObfInfo(name = "aq", desc = "(I)Lin;")
	public Class222 method4348() {
		return this.field2456;
	}

	@ObfInfo(name = "ad", desc = "(Ljava/lang/String;Ljava/lang/String;Lea;I)Z", opaque = "1277915291")
	public boolean method4349(String var1, String var2, Class105 var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4371();

				try {
					this.field2451 = var1;
					this.field2457 = var3.method2781(new URL(this.field2451));
					this.field2453 = 0;
				} catch (MalformedURLException var6) {
					this.method4371();
					this.field2453 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2446 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ag", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
	public void method4350(String var1, String var2, String var3) {
		this.field2456 = Class222.method7869();
		this.field2455 = var1;
		this.field2456.method4289(this.field2455, var2, var3);
	}

	@ObfInfo(name = "ak", desc = "(Lea;I)V")
	public void method4351(Class105 var1) {
		switch(this.field2453) {
		case 0:
			this.method4366(var1);
			break;
		case 1:
			this.method4363();
			break;
		default:
			return;
		}

	}

	@ObfInfo(name = "ap", desc = "(B)I")
	public int method4352() {
		return this.field2453;
	}

	@ObfInfo(name = "an", desc = "(Ljava/lang/String;I)I")
	public int method4353(String var1) {
		return this.field2452.field2330.containsKey(var1) ? (Integer)this.field2452.field2330.get(var1) : -1;
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;I)Ljava/lang/String;", opaque = "687763989")
	public String method4354(String var1) {
		return (String)((String)(this.field2452.field2326.containsKey(var1) ? this.field2452.field2326.get(var1) : null));
	}

	@ObfInfo(name = "av", desc = "(B)Ljava/util/ArrayList;")
	public ArrayList method4355() {
		return this.field2452.field2325;
	}

	@ObfInfo(name = "ab", desc = "(B)Ljava/util/ArrayList;")
	public ArrayList method4356() {
		return this.field2452.field2324;
	}

	@ObfInfo(name = "ai", desc = "(I)Ljava/util/ArrayList;")
	public ArrayList method4357() {
		return this.field2452.field2327;
	}

	@ObfInfo(name = "ae", desc = "(I)Ljava/lang/String;")
	public String method4358() {
		return this.field2452.field2321;
	}

	@ObfInfo(name = "au", desc = "(I)[F")
	public float[] method4359() {
		return this.field2452.field2328;
	}

	@ObfInfo(name = "ah", desc = "(B)Ljava/lang/String;")
	public String method4360() {
		return this.field2452.method4099();
	}

	@ObfInfo(name = "az", desc = "(I)V")
	public void method4371() {
		this.field2457 = null;
	}

	@ObfInfo(name = "ax", desc = "(Lea;I)V", opaque = "999384333")
	public void method4366(Class105 var1) {
		if (this.field2457 != null && this.field2457.method3050()) {
			byte[] var3 = this.field2457.method3051();
			if (var3 == null) {
				this.method4371();
				this.field2453 = 4;
			} else {
				try {
					Class504 var4 = new Class504(var3);
					JSONObject var5 = var4.method8935();
					if (var5 == null) {
						return;
					}

					try {
						this.field2454 = var5.getInt("version");
					} catch (Exception var8) {
						this.method4371();
						this.field2453 = 6;
						return;
					}

					if (this.field2454 < 2) {
						if (!this.field2452.method4094(var5, this.field2454, var1)) {
							this.field2453 = 6;
						}
					} else if (2 == this.field2454) {
						Class220 var6 = Class220.field2395;
						var6.method4247(var5, this.field2454, var1);
						this.field2452 = var6.method4240(this.field2446);
						if (this.field2452 != null) {
							this.method4363();
							this.field2453 = 1;
						} else {
							this.field2453 = 7;
						}
					}
				} catch (UnsupportedEncodingException var9) {
					this.method4371();
					this.field2453 = 6;
					return;
				}

				if (this.field2452 != null) {
					this.field2453 = this.field2452.field2325.size() > 0 ? 1 : 2;
				}

				this.field2457 = null;
			}
		}
	}

	@ObfInfo(name = "ac", desc = "(I)V", opaque = "109380094")
	public void method4363() {
		Iterator var2 = this.field2452.field2325.iterator();

		Class229 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field2452.field2325.iterator();

				while (var2.hasNext()) {
					var3 = (Class229)var2.next();
					if (var3.field2466 != null) {
						byte[] var4 = var3.field2466.method3051();
						if (var4 != null && var4.length > 0) {
							this.field2453 = 2;
							return;
						}
					}
				}

				this.method4371();
				this.field2453 = 5;
				return;
			}

			var3 = (Class229)var2.next();
		} while(var3.field2466 == null || var3.field2466.method3050());

	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/String;Lea;S)Z", opaque = "3133")
	public boolean method4364(String var1, Class105 var2) {
		try {
			JSONObject var4 = (new Class504(var1.getBytes())).method8935();

			try {
				this.field2454 = var4.getInt("version");
			} catch (Exception var6) {
				this.method4371();
				this.field2453 = 6;
				return false;
			}

			if (!this.field2452.method4094(var4, this.field2454, var2)) {
				this.field2453 = 6;
			}

			this.field2453 = this.field2452.field2325.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var7) {
			this.field2453 = 6;
		}

		return this.field2453 < 3;
	}

	@ObfInfo(name = "ak", desc = "(BI)Ljb;", opaque = "-1350959674")
	public static Class236 method4395(byte var0) {
		Class236[] var2 = Class236.field2500;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Class236 var4 = var2[var3];
			if (var4.field2507 == var0) {
				return var4;
			}
		}

		throw new RuntimeException("Could not find MoveSpeed with ID " + var0);
	}
}
