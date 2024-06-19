import java.util.concurrent.Future;

public class Class19 {
	public String field94;
	public Future field93;

	public Class19(Future var1) {
		this.field93 = var1;
	}

	public Class19(String var1) {
		this.method277(var1);
	}

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

	public final String method281() {
		return this.field94;
	}

	public boolean method278() {
		return this.field94 != null || this.field93 == null;
	}

	public final boolean method279() {
		return this.method278() ? true : this.field93.isDone();
	}

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
}
