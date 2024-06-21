import io.runebox.ObfInfo;
import java.util.concurrent.Future;

@ObfInfo(name = "as")
public class Class19 {
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field94;
	@ObfInfo(name = "ak", desc = "Ljava/util/concurrent/Future;")
	public Future field93;

	public Class19(Future var1) {
		this.field93 = var1;
	}

	public Class19(String var1) {
		this.method277(var1);
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;I)V", opaque = "-1339869163")
	public void method277(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field94 = var1;
		if (this.field93 != null) {
			this.field93.cancel(true);
			this.field93 = null;
		}

	}

	@ObfInfo(name = "al", desc = "(I)Ljava/lang/String;")
	public final String method281() {
		return this.field94;
	}

	@ObfInfo(name = "aj", desc = "(I)Z", opaque = "137471638")
	public boolean method278() {
		return this.field94 != null || this.field93 == null;
	}

	@ObfInfo(name = "az", desc = "(S)Z")
	public final boolean method279() {
		return this.method278() ? true : this.field93.isDone();
	}

	@ObfInfo(name = "af", desc = "(I)Lad;", opaque = "32769")
	public final Class4 method285() {
		if (this.method278()) {
			return new Class4(this.field94);
		} else if (!this.method279()) {
			return null;
		} else {
			try {
				return (Class4)this.field93.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.method277(var3);
				return new Class4(var3);
			}
		}
	}

	@ObfInfo(name = "af", desc = "(I)V", opaque = "1857648377")
	public static void method276() {
		if (Class76.field955 == null || Class76.field955.length() <= 0) {
			if (Client.field4851.method2629() != null) {
				Class76.field955 = Client.field4851.method2629();
				Client.field540 = true;
			} else {
				Client.field540 = false;
			}

		}
	}
}
