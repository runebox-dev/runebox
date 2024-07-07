import io.runebox.ObfInfo;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(name = "rw")
public class Class465 {
	@ObfInfo(name = "an", desc = "Ljava/text/DecimalFormat;")
	public final DecimalFormat field4918;
	@ObfInfo(name = "ak", desc = "Ljava/util/Map;")
	public final Map field4915;
	@ObfInfo(name = "ap", desc = "Ljava/util/Map;")
	public final Map field4916;

	public Class465() {
		this.field4915 = new HashMap();
		this.field4916 = new HashMap();
		this.field4918 = new DecimalFormat();
		this.field4918.setMaximumFractionDigits(2);
	}

	@ObfInfo(name = "aq", desc = "(Ljavax/net/ssl/HttpsURLConnection;I)V")
	public void method8474(HttpsURLConnection var1) {
		Iterator var3 = this.field4915.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
		}

	}

	@ObfInfo(name = "ad", desc = "(I)Ljava/util/Map;")
	public Map method8491() {
		return this.field4915;
	}

	@ObfInfo(name = "ag", desc = "(Ljava/lang/String;Ljava/lang/String;I)V", opaque = "-139644004")
	public void method8494(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4915.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;I)V", opaque = "1496039647")
	public void method8508(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4915.remove(var1);
		}

	}

	@ObfInfo(name = "ap", desc = "(Lrr;Ljava/lang/String;I)V")
	public void method8505(Class460 var1, String var2) {
		String var4 = String.format("%s %s", var1.method8466(), var2);
		this.method8494("Authorization", var4);
	}

	@ObfInfo(name = "an", desc = "(Ljava/lang/String;I)V")
	public void method8511(String var1) {
		this.method8505(Class460.field4897, var1);
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/String;I)V")
	public void method8499(String var1) {
		this.method8505(Class460.field4894, var1);
	}

	@ObfInfo(name = "av", desc = "(Lsb;B)V")
	public void method8473(Class470 var1) {
		this.field4915.put("Content-Type", var1.method8549());
	}

	@ObfInfo(name = "ab", desc = "(I)V")
	public void method8506() {
		this.field4915.remove("Content-Type");
	}

	@ObfInfo(name = "ai", desc = "(Lsb;I)V")
	public void method8483(Class470 var1) {
		this.method8507(var1, 1.0F);
	}

	@ObfInfo(name = "ae", desc = "(Lsb;FI)V")
	public void method8507(Class470 var1, float var2) {
		this.field4916.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method8484();
	}

	@ObfInfo(name = "au", desc = "(S)V", opaque = "3099")
	public void method8484() {
		this.field4915.remove("Accept");
		if (!this.field4916.isEmpty()) {
			this.field4915.put("Accept", this.method8478());
		}

	}

	@ObfInfo(name = "ah", desc = "(B)Ljava/lang/String;", opaque = "-1")
	public String method8478() {
		ArrayList var2 = new ArrayList(this.field4916.entrySet());
		Collections.sort(var2, new Class443(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((Class470)var5.getKey()).method8549());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = this.field4918.format((double)var6);
				var3.append(";q=").append(var7);
			}
		}

		return var3.toString();
	}
}
