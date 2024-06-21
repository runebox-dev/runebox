import io.runebox.ObfInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class Class4 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -993178463)
	public final int field14;
	@ObfInfo(name = "aj", desc = "Ljava/lang/String;")
	public final String field15;
	@ObfInfo(name = "al", desc = "Ljava/util/Map;")
	public final Map field18;

	public Class4(HttpURLConnection var1) throws IOException {
		this.field14 = var1.getResponseCode();
		var1.getResponseMessage();
		this.field18 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field14 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field15 = var2.toString();
	}

	public Class4(String var1) {
		this.field14 = 400;
		this.field18 = null;
		this.field15 = "";
	}

	@ObfInfo(name = "ak", desc = "(B)I")
	public int method46() {
		return this.field14;
	}

	@ObfInfo(name = "al", desc = "(B)Ljava/util/Map;")
	public Map method47() {
		return this.field18;
	}

	@ObfInfo(name = "aj", desc = "(I)Ljava/lang/String;")
	public String method48() {
		return this.field15;
	}
}
