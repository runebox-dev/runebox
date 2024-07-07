import io.runebox.ObfInfo;
import java.util.concurrent.Future;

@ObfInfo(name = "ao")
public class Class15 {
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field71;
	@ObfInfo(name = "aq", desc = "Ljava/util/concurrent/Future;")
	public Future field73;

	public Class15(Future var1) {
		this.field73 = var1;
	}

	public Class15(String var1) {
		this.method199(var1);
	}

	@ObfInfo(name = "aq", desc = "(Ljava/lang/String;B)V")
	public void method199(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field71 = var1;
		if (this.field73 != null) {
			this.field73.cancel(true);
			this.field73 = null;
		}

	}

	@ObfInfo(name = "ad", desc = "(S)Ljava/lang/String;")
	public final String method202() {
		return this.field71;
	}

	@ObfInfo(name = "ag", desc = "(I)Z", opaque = "882919522")
	public boolean method197() {
		return this.field71 != null || this.field73 == null;
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "-772475586")
	public final boolean method213() {
		return this.method197() ? true : this.field73.isDone();
	}

	@ObfInfo(name = "ap", desc = "(I)Las;", opaque = "1341649557")
	public final Class19 method204() {
		if (this.method197()) {
			return new Class19(this.field71);
		} else if (!this.method213()) {
			return null;
		} else {
			try {
				return (Class19)this.field73.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.method199(var3);
				return new Class19(var3);
			}
		}
	}
}
