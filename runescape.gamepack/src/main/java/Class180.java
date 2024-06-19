public class Class180 {
	public Class409 field1892;
	public long field1891;
	public long field1897;

	public Class180(Class521 var1) {
		this.field1891 = -1L;
		this.field1892 = new Class409();
		this.method3631(var1);
	}

	public void method3631(Class521 var1) {
		this.field1897 = var1.method9411();
		this.field1891 = var1.method9411();

		for (int var3 = var1.method9405(); var3 != 0; var3 = var1.method9405()) {
			Object var4;
			if (var3 == 1) {
				var4 = new Class169(this);
			} else if (var3 == 4) {
				var4 = new Class174(this);
			} else if (var3 == 3) {
				var4 = new Class153(this);
			} else if (var3 == 2) {
				var4 = new Class136(this);
			} else {
				if (var3 != 5) {
					throw new RuntimeException("");
				}

				var4 = new Class166(this);
			}

			((Class181)var4).method3087(var1);
			this.field1892.method7597((Class506)var4);
		}

	}

	public void method3625(Class171 var1) {
		if (this.field1897 == var1.field5170 && var1.field1850 == this.field1891) {
			for (Class181 var3 = (Class181)this.field1892.method7600(); var3 != null; var3 = (Class181)this.field1892.method7637()) {
				var3.method3089(var1);
			}

			++var1.field1850;
		} else {
			throw new RuntimeException("");
		}
	}
}
