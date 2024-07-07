import io.runebox.ObfInfo;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(name = "rt")
public class Class462 {
	@ObfInfo(name = "aa", desc = "Ljava/text/DecimalFormat;")
	public final DecimalFormat field4880;
	@ObfInfo(name = "az", desc = "Ljava/util/Map;")
	public final Map field4878;
	@ObfInfo(name = "af", desc = "Ljava/util/Map;")
	public final Map field4881;

	public Class462() {
		this.field4878 = new HashMap();
		this.field4881 = new HashMap();
		this.field4880 = new DecimalFormat();
		this.field4880.setMaximumFractionDigits(2);
	}

	@ObfInfo(name = "ak", desc = "(Ljavax/net/ssl/HttpsURLConnection;I)V", opaque = "1564402898")
	public void method8508(HttpsURLConnection var1) {
		Iterator var3 = this.field4878.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
		}

	}

	@ObfInfo(name = "al", desc = "(I)Ljava/util/Map;")
	public Map method8509() {
		return this.field4878;
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;Ljava/lang/String;I)V", opaque = "-569260576")
	public void method8544(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4878.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;B)V", opaque = "1")
	public void method8511(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4878.remove(var1);
		}

	}

	@ObfInfo(name = "af", desc = "(Lru;Ljava/lang/String;I)V")
	public void method8510(Class463 var1, String var2) {
		String var4 = String.format("%s %s", var1.method8548(), var2);
		this.method8544("Authorization", var4);
	}

	@ObfInfo(name = "aa", desc = "(Ljava/lang/String;I)V")
	public void method8513(String var1) {
		this.method8510(Class463.field4883, var1);
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;B)V")
	public void method8514(String var1) {
		this.method8510(Class463.field4882, var1);
	}

	@ObfInfo(name = "ab", desc = "(Lsd;B)V")
	public void method8515(Class472 var1) {
		this.field4878.put("Content-Type", var1.method8653());
	}

	@ObfInfo(name = "ac", desc = "(I)V")
	public void method8516() {
		this.field4878.remove("Content-Type");
	}

	@ObfInfo(name = "ao", desc = "(Lsd;I)V")
	public void method8517(Class472 var1) {
		this.method8518(var1, 1.0F);
	}

	@ObfInfo(name = "ah", desc = "(Lsd;FI)V")
	public void method8518(Class472 var1, float var2) {
		this.field4881.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method8533();
	}

	@ObfInfo(name = "av", desc = "(B)V", opaque = "7")
	public void method8533() {
		this.field4878.remove("Accept");
		if (!this.field4881.isEmpty()) {
			this.field4878.put("Accept", this.method8541());
		}

	}

	@ObfInfo(name = "aq", desc = "(B)Ljava/lang/String;", opaque = "20")
	public String method8541() {
		ArrayList var2 = new ArrayList(this.field4881.entrySet());
		Collections.sort(var2, new Class454(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((Class472)var5.getKey()).method8653());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = this.field4880.format((double)var6);
				var3.append(";q=").append(var7);
			}
		}

		return var3.toString();
	}
}
