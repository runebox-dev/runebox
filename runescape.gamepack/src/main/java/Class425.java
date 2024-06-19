import java.io.File;

public class Class425 {
	public static File field3389;
	public int field4688;
	public int field4689;
	public int field4690;
	public int field4691;

	public Class425(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public Class425(int var1, int var2, int var3, int var4) {
		this.method7840(var1, var2);
		this.method7841(var3, var4);
	}

	public void method7840(int var1, int var2) {
		this.field4691 = var1;
		this.field4689 = var2;
	}

	public void method7841(int var1, int var2) {
		this.field4690 = var1;
		this.field4688 = var2;
	}

	public boolean method7851(int var1, int var2) {
		return var1 >= this.field4691 && var1 < this.field4690 + this.field4691 && var2 >= this.field4689 && var2 < this.field4689 + this.field4688;
	}

	public String toString() {
		return null;
	}

	public void method7843(Class425 var1, Class425 var2) {
		this.method7844(var1, var2);
		this.method7845(var1, var2);
	}

	public void method7844(Class425 var1, Class425 var2) {
		var2.field4691 = this.field4691;
		var2.field4690 = this.field4690;
		if (this.field4691 < var1.field4691) {
			var2.field4690 = (var2.field4690 * -1403128623 - (var1.field4691 * -1403128623 - this.field4691 * -1403128623)) * -1160059855;
			var2.field4691 = var1.field4691;
		}

		if (var2.method7846() > var1.method7846()) {
			var2.field4690 -= var2.method7846() - var1.method7846();
		}

		if (var2.field4690 < 0) {
			var2.field4690 = 0;
		}

	}

	public void method7845(Class425 var1, Class425 var2) {
		var2.field4689 = this.field4689;
		var2.field4688 = this.field4688;
		if (this.field4689 < var1.field4689) {
			var2.field4688 = (var2.field4688 * 1658108771 - (var1.field4689 * 1658108771 - this.field4689 * 1658108771)) * -171794869;
			var2.field4689 = var1.field4689;
		}

		if (var2.method7847() > var1.method7847()) {
			var2.field4688 -= var2.method7847() - var1.method7847();
		}

		if (var2.field4688 < 0) {
			var2.field4688 = 0;
		}

	}

	public int method7846() {
		return this.field4691 + this.field4690;
	}

	public int method7847() {
		return this.field4689 + this.field4688;
	}

	public static void method7866(File var0) {
		field3389 = var0;
		if (!field3389.exists()) {
			throw new RuntimeException("");
		} else {
			Class165.field1822 = true;
		}
	}
}
