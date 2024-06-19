import java.io.IOException;

public class Class116 {
	public Class338 field1449;
	public Class338 field1454;
	public Class338 field1455;
	public Class338 field1456;
	public Class409 field1453;
	public Class481 field1452;
	public Class521 field1448;
	public Class531 field1447;
	public Class563 field1446;
	public boolean field1451;
	public int field1443;
	public int field1444;
	public int field1445;
	public int field1450;

	public Class116() {
		this.field1453 = new Class409();
		this.field1445 = 0;
		this.field1448 = new Class521(5000);
		this.field1447 = new Class531(40000);
		this.field1449 = null;
		this.field1444 = 0;
		this.field1451 = true;
		this.field1450 = 0;
		this.field1443 = 0;
	}

	public final void method2895() {
		this.field1453.method7596();
		this.field1445 = 0;
	}

	public final void method2899() throws IOException {
		if (this.field1452 != null && this.field1445 > 0) {
			this.field1448.field5219 = 0;

			while (true) {
				Class316 var2 = (Class316)this.field1453.method7600();
				if (var2 == null || var2.field3376 > this.field1448.field5221.length - this.field1448.field5219) {
					this.field1452.method8626(this.field1448.field5221, 0, this.field1448.field5219);
					this.field1443 = 0;
					break;
				}

				this.field1448.method9548(var2.field3374.field5221, 0, var2.field3376);
				this.field1445 -= var2.field3376;
				var2.method9277();
				var2.field3374.method9449();
				var2.method6185();
			}
		}

	}

	public final void method2897(Class316 var1) {
		this.field1453.method7597(var1);
		var1.field3376 = var1.field3374.field5219;
		var1.field3374.field5219 = 0;
		this.field1445 += var1.field3376;
	}

	public void method2894(Class481 var1) {
		this.field1452 = var1;
	}

	public void method2901() {
		if (this.field1452 != null) {
			this.field1452.method8631();
			this.field1452 = null;
		}

	}

	public void method2903() {
		this.field1452 = null;
	}

	public Class481 method2900() {
		return this.field1452;
	}
}
