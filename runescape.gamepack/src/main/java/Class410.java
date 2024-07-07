import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "pt")
public class Class410 implements Iterable {
	@ObfInfo(name = "ad", desc = "Ltv;")
	public Class516 field4666;
	@ObfInfo(name = "aq", desc = "Ltv;")
	public Class516 field4667;

	public Class410() {
		this.field4667 = new Class516();
		this.field4667.field5158 = this.field4667;
		this.field4667.field5156 = this.field4667;
	}

	@ObfInfo(name = "aq", desc = "()V")
	public void method7562() {
		while (this.field4667.field5158 != this.field4667) {
			this.field4667.field5158.method9044();
		}

	}

	@ObfInfo(name = "ad", desc = "(Ltv;)V")
	public void method7558(Class516 var1) {
		if (var1.field5156 != null) {
			var1.method9044();
		}

		var1.field5156 = this.field4667.field5156;
		var1.field5158 = this.field4667;
		var1.field5156.field5158 = var1;
		var1.field5158.field5156 = var1;
	}

	@ObfInfo(name = "ak", desc = "()Ltv;")
	public Class516 method7570() {
		Class516 var1 = this.field4667.field5158;
		if (this.field4667 == var1) {
			return null;
		} else {
			var1.method9044();
			return var1;
		}
	}

	@ObfInfo(name = "ap", desc = "()Ltv;")
	public Class516 method7560() {
		return this.method7575((Class516)null);
	}

	@ObfInfo(name = "an", desc = "(Ltv;)Ltv;")
	public Class516 method7575(Class516 var1) {
		Class516 var2;
		if (var1 == null) {
			var2 = this.field4667.field5158;
		} else {
			var2 = var1;
		}

		if (this.field4667 == var2) {
			this.field4666 = null;
			return null;
		} else {
			this.field4666 = var2.field5158;
			return var2;
		}
	}

	@ObfInfo(name = "aj", desc = "()Ltv;")
	public Class516 method7557() {
		Class516 var1 = this.field4666;
		if (this.field4667 == var1) {
			this.field4666 = null;
			return null;
		} else {
			this.field4666 = var1.field5158;
			return var1;
		}
	}

	public Iterator iterator() {
		return new Class396(this);
	}

	@ObfInfo(name = "ag", desc = "(Ltv;Ltv;)V")
	public static void method7559(Class516 var0, Class516 var1) {
		if (var0.field5156 != null) {
			var0.method9044();
		}

		var0.field5156 = var1;
		var0.field5158 = var1.field5158;
		var0.field5156.field5158 = var0;
		var0.field5158.field5156 = var0;
	}
}
