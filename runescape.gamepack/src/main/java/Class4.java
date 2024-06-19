import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class Class4 {
	public static Class382 field1988;
	public final int field14;
	public final String field15;
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

	public int method46() {
		return this.field14;
	}

	public Map method47() {
		return this.field18;
	}

	public String method48() {
		return this.field15;
	}

	public static void method49(Class382 var0) {
		field1988 = var0;
	}
}
