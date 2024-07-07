import io.runebox.ObfInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

@ObfInfo(name = "as")
public class Class19 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1477351693)
	public final int field91;
	@ObfInfo(name = "ag", desc = "Ljava/lang/String;")
	public final String field93;
	@ObfInfo(name = "ad", desc = "Ljava/util/Map;")
	public final Map field92;

	public Class19(HttpURLConnection var1) throws IOException {
		this.field91 = var1.getResponseCode();
		var1.getResponseMessage();
		this.field92 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field91 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field93 = var2.toString();
	}

	public Class19(String var1) {
		this.field91 = 400;
		this.field92 = null;
		this.field93 = "";
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method265() {
		return this.field91;
	}

	@ObfInfo(name = "ad", desc = "(I)Ljava/util/Map;")
	public Map method273() {
		return this.field92;
	}

	@ObfInfo(name = "ag", desc = "(I)Ljava/lang/String;")
	public String method264() {
		return this.field93;
	}
}
