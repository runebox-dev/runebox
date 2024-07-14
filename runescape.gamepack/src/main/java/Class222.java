import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfInfo(name = "in")
public class Class222 {
	@ObfInfo(name = "al", desc = "Lin;")
	public static final Class222 field2421;
	@ObfInfo(name = "aj", desc = "Lao;")
	public Class15 field2413;
	@ObfInfo(name = "an", desc = "Lax;")
	public Class24 field2412;
	@ObfInfo(name = "ay", desc = "Z")
	public boolean field2408;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1825791855)
	public int field2417;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1131252391)
	public int field2419;
	@ObfInfo(name = "ag", desc = "Ljava/lang/String;")
	public String field2409;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field2410;
	@ObfInfo(name = "aq", desc = "Ljava/lang/String;")
	public String field2416;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	public String field2420;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field2422;
	@ObfInfo(name = "ap", desc = "J", longMultiplier = 5566748389036813035L)
	public long field2411;
	@ObfInfo(name = "av", desc = "I")
	public final int field2414;
	@ObfInfo(name = "ab", desc = "I")
	public final int field2415;

	static {
		field2421 = new Class222();
	}

	public Class222() {
		this.field2416 = "";
		this.field2422 = "";
		this.field2409 = "";
		this.field2410 = "";
		this.field2411 = -1L;
		this.field2414 = 1;
		this.field2415 = 2;
		this.field2419 = 1;
		this.field2417 = 0;
	}

	@ObfInfo(name = "ad", desc = "(ILjava/lang/String;I)V")
	public void method4268(int var1, String var2) {
		this.field2417 = var1;
		this.field2420 = var2;
	}

	@ObfInfo(name = "ag", desc = "(ZI)V")
	public void method4292(boolean var1) {
		this.field2408 = var1;
		this.field2412 = new Class24("crmsession", 1, 1);
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", opaque = "1216623612")
	public void method4289(String var1, String var2, String var3) {
		if (this.field2419 != 2) {
			this.field2416 = var1;
			this.field2422 = var2;
			this.field2409 = var3;
			if (!this.field2416.endsWith("/")) {
				this.field2416 = this.field2416 + "/";
			}

			if (!this.field2422.equals("")) {
				String var5 = this.field2416;
				var5 = var5 + "session/open/" + this.field2422;
				if (this.field2409.equals("")) {
				}

				var5 = var5 + "?userHash=" + this.field2409;

				try {
					this.field2413 = this.method4275(var5);
					this.field2411 = Class329.method4953();
				} catch (IOException var7) {
					this.field2413 = null;
					this.field2422 = "";
					this.field2409 = "";
				}

			}
		}
	}

	@ObfInfo(name = "ap", desc = "(B)V", opaque = "6")
	public void method4271() {
		if (this.field2413 == null) {
			if (!this.field2410.isEmpty() && this.field2419 == 1) {
				long var2 = Class329.method4953();
				long var4 = var2 - this.field2411;
				String var6 = this.field2416;
				var6 = var6 + "session/close/" + this.field2422 + "/" + this.field2410;
				if (this.field2409.isEmpty()) {
					var6 = var6 + "?sessionDuration=" + var4;
				} else {
					var6 = var6 + "?userHash=" + this.field2409 + "&sessionDuration=" + var4;
				}

				try {
					this.field2413 = this.method4275(var6);
				} catch (IOException var8) {
					this.field2419 = 1;
				}
			}

		}
	}

	@ObfInfo(name = "an", desc = "(I)V")
	public void method4272() {
		if (this.field2412 != null) {
			this.field2412.method317();
		}

	}

	@ObfInfo(name = "aj", desc = "(B)V", opaque = "3")
	public void method4290() {
		if (!this.field2410.isEmpty()) {
			String var2 = "";
			switch(this.field2417) {
			case 1:
				var2 = "events/click";
				break;
			case 2:
				var2 = "events/dismissed";
				break;
			case 3:
				var2 = "events/impression";
			}

			if (!this.field2420.isEmpty()) {
				String var3 = this.field2416;
				var3 = var3 + var2 + "/" + this.field2422 + "/" + this.field2410 + "/" + this.field2420 + "?userHash=" + this.field2409;

				try {
					this.field2413 = this.method4275(var3);
				} catch (IOException var5) {
					this.field2419 = 1;
				}

				this.field2419 = 1;
				this.field2417 = 0;
			}
		}
	}

	@ObfInfo(name = "av", desc = "(B)V", opaque = "8")
	public void method4285() {
		if (this.field2413 != null && this.field2413.method213()) {
			if (this.field2413.method213() && this.field2413.method204().method265() == 200 && this.field2410.isEmpty()) {
				String var2 = this.field2413.method204().method264();
				if (var2.isEmpty()) {
					return;
				}

				this.field2410 = var2;
			}

			if (this.field2417 != 0) {
				this.method4290();
			}

		}
	}

	@ObfInfo(name = "ab", desc = "(Ljava/lang/String;I)Z")
	public boolean method4274(String var1) {
		this.method4268(2, var1);
		return true;
	}

	@ObfInfo(name = "ai", desc = "(Ljava/lang/String;I)Lao;")
	public Class15 method4275(String var1) throws IOException {
		URL var3 = new URL(var1);
		Class5 var4 = new Class5(var3, Class9.field44, this.field2408);

		try {
			JSONObject var5 = new JSONObject();
			var4.method44(new Class504(var5));
		} catch (Exception var6) {
		}

		return this.field2412.method322(var4);
	}

	@ObfInfo(owner = "qk", name = "aq", desc = "(B)Lin;")
	public static Class222 method7869() {
		return field2421;
	}
}
