import io.runebox.ObfInfo;
import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfInfo(name = "hi")
public class Class191 {
	@ObfInfo(name = "ay", desc = "Lhi;")
	public static final Class191 field1957;
	@ObfInfo(name = "at", desc = "Las;")
	public Class19 field1959;
	@ObfInfo(name = "aa", desc = "Lae;")
	public Class5 field1972;
	@ObfInfo(name = "au", desc = "Z")
	public boolean field1970;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -188287101)
	public int field1963;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1776795307)
	public int field1967;
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field1958;
	@ObfInfo(name = "az", desc = "Ljava/lang/String;")
	public String field1960;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field1965;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public String field1966;
	@ObfInfo(name = "ax", desc = "Ljava/lang/String;")
	public String field1968;
	@ObfInfo(name = "af", desc = "J", longMultiplier = 1590826231487001329L)
	public long field1961;
	@ObfInfo(name = "ab", desc = "I")
	public final int field1964;
	@ObfInfo(name = "ac", desc = "I")
	public final int field1969;

	static {
		field1957 = new Class191();
	}

	public Class191() {
		this.field1965 = "";
		this.field1958 = "";
		this.field1966 = "";
		this.field1960 = "";
		this.field1961 = -1L;
		this.field1964 = 1;
		this.field1969 = 2;
		this.field1963 = 1;
		this.field1967 = 0;
	}

	@ObfInfo(name = "al", desc = "(ILjava/lang/String;I)V")
	public void method3719(int var1, String var2) {
		this.field1967 = var1;
		this.field1968 = var2;
	}

	@ObfInfo(name = "aj", desc = "(ZB)V")
	public void method3720(boolean var1) {
		this.field1970 = var1;
		this.field1972 = new Class5("crmsession", 1, 1);
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", opaque = "863389078")
	public void method3751(String var1, String var2, String var3) {
		if (this.field1963 != 2) {
			this.field1965 = var1;
			this.field1958 = var2;
			this.field1966 = var3;
			if (!this.field1965.endsWith("/")) {
				this.field1965 = this.field1965 + "/";
			}

			if (!this.field1958.equals("")) {
				String var5 = this.field1965;
				var5 = var5 + "session/open/" + this.field1958;
				if (this.field1966.equals("")) {
				}

				var5 = var5 + "?userHash=" + this.field1966;

				try {
					this.field1959 = this.method3728(var5);
					this.field1961 = Class327.method3047();
				} catch (IOException var7) {
					this.field1959 = null;
					this.field1958 = "";
					this.field1966 = "";
				}

			}
		}
	}

	@ObfInfo(name = "af", desc = "(B)V", opaque = "0")
	public void method3722() {
		if (this.field1959 == null) {
			if (!this.field1960.isEmpty() && this.field1963 == 1) {
				long var2 = Class327.method3047();
				long var4 = var2 - this.field1961;
				String var6 = this.field1965;
				var6 = var6 + "session/close/" + this.field1958 + "/" + this.field1960;
				if (this.field1966.isEmpty()) {
					var6 = var6 + "?sessionDuration=" + var4;
				} else {
					var6 = var6 + "?userHash=" + this.field1966 + "&sessionDuration=" + var4;
				}

				try {
					this.field1959 = this.method3728(var6);
				} catch (IOException var8) {
					this.field1963 = 1;
				}
			}

		}
	}

	@ObfInfo(name = "aa", desc = "(B)V", opaque = "10")
	public void method3725() {
		if (this.field1972 != null) {
			this.field1972.method60();
		}

	}

	@ObfInfo(name = "at", desc = "(I)V", opaque = "-307302726")
	public void method3724() {
		if (!this.field1960.isEmpty()) {
			String var2 = "";
			switch(this.field1967) {
			case 1:
				var2 = "events/click";
				break;
			case 2:
				var2 = "events/dismissed";
				break;
			case 3:
				var2 = "events/impression";
			}

			if (!this.field1968.isEmpty()) {
				String var3 = this.field1965;
				var3 = var3 + var2 + "/" + this.field1958 + "/" + this.field1960 + "/" + this.field1968 + "?userHash=" + this.field1966;

				try {
					this.field1959 = this.method3728(var3);
				} catch (IOException var5) {
					this.field1963 = 1;
				}

				this.field1963 = 1;
				this.field1967 = 0;
			}
		}
	}

	@ObfInfo(name = "ab", desc = "(I)V", opaque = "1338108255")
	public void method3731() {
		if (this.field1959 != null && this.field1959.method279()) {
			if (this.field1959.method279() && this.field1959.method285().method46() == 200 && this.field1960.isEmpty()) {
				String var2 = this.field1959.method285().method48();
				if (var2.isEmpty()) {
					return;
				}

				this.field1960 = var2;
			}

			if (0 != this.field1967) {
				this.method3724();
			}

		}
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/String;B)Z")
	public boolean method3743(String var1) {
		this.method3719(2, var1);
		return true;
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;I)Las;")
	public Class19 method3728(String var1) throws IOException {
		URL var3 = new URL(var1);
		Class8 var4 = new Class8(var3, Class15.field72, this.field1970);

		try {
			JSONObject var5 = new JSONObject();
			var4.method125(new Class490(var5));
		} catch (Exception var6) {
		}

		return this.field1972.method57(var4);
	}

	@ObfInfo(desc = "()LClass191;")
	public static Class191 method3562() {
		return field1957;
	}
}
