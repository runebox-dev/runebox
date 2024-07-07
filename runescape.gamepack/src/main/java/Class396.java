import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "pf")
public class Class396 implements Iterator {
	@ObfInfo(name = "aq", desc = "Lpt;")
	public Class410 field4608;
	@ObfInfo(name = "ad", desc = "Ltv;")
	public Class516 field4609;
	@ObfInfo(name = "ag", desc = "Ltv;")
	public Class516 field4610;

	public Class396(Class410 var1) {
		this.field4610 = null;
		this.field4608 = var1;
		this.field4609 = this.field4608.field4667.field5158;
		this.field4610 = null;
	}

	public Object next() {
		Class516 var1 = this.field4609;
		if (this.field4608.field4667 == var1) {
			var1 = null;
			this.field4609 = null;
		} else {
			this.field4609 = var1.field5158;
		}

		this.field4610 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field4609 != this.field4608.field4667;
	}

	public void remove() {
		if (this.field4610 == null) {
			throw new IllegalStateException();
		} else {
			this.field4610.method9044();
			this.field4610 = null;
		}
	}
}
