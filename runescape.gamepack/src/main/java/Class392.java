import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "pb")
public class Class392 implements Iterable {
	@ObfInfo(name = "ak", desc = "Ltm;")
	public Class507 field4560;
	@ObfInfo(name = "al", desc = "Ltm;")
	public Class507 field4561;

	public Class392() {
		this.field4560 = new Class507();
		this.field4560.field5172 = this.field4560;
		this.field4560.field5174 = this.field4560;
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method7388() {
		while (this.field4560.field5172 != this.field4560) {
			this.field4560.field5172.method9280();
		}

	}

	@ObfInfo(name = "al", desc = "(Ltm;)V")
	public void method7389(Class507 var1) {
		if (var1.field5174 != null) {
			var1.method9280();
		}

		var1.field5174 = this.field4560.field5174;
		var1.field5172 = this.field4560;
		var1.field5174.field5172 = var1;
		var1.field5172.field5174 = var1;
	}

	@ObfInfo(name = "az", desc = "()Ltm;")
	public Class507 method7401() {
		Class507 var1 = this.field4560.field5172;
		if (this.field4560 == var1) {
			return null;
		} else {
			var1.method9280();
			return var1;
		}
	}

	@ObfInfo(name = "af", desc = "()Ltm;")
	public Class507 method7392() {
		return this.method7393((Class507)null);
	}

	@ObfInfo(name = "aa", desc = "(Ltm;)Ltm;")
	public Class507 method7393(Class507 var1) {
		Class507 var2;
		if (var1 == null) {
			var2 = this.field4560.field5172;
		} else {
			var2 = var1;
		}

		if (this.field4560 == var2) {
			this.field4561 = null;
			return null;
		} else {
			this.field4561 = var2.field5172;
			return var2;
		}
	}

	@ObfInfo(name = "at", desc = "()Ltm;")
	public Class507 method7394() {
		Class507 var1 = this.field4561;
		if (this.field4560 == var1) {
			this.field4561 = null;
			return null;
		} else {
			this.field4561 = var1.field5172;
			return var1;
		}
	}

	public Iterator iterator() {
		return new Class400(this);
	}

	@ObfInfo(name = "aj", desc = "(Ltm;Ltm;)V")
	public static void method7390(Class507 var0, Class507 var1) {
		if (var0.field5174 != null) {
			var0.method9280();
		}

		var0.field5174 = var1;
		var0.field5172 = var1.field5172;
		var0.field5174.field5172 = var0;
		var0.field5172.field5174 = var0;
	}
}
