import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "pg")
public class Class397 implements Iterator {
	@ObfInfo(name = "aq", desc = "Lpi;")
	public Class399 field4612;
	@ObfInfo(name = "ag", desc = "Ltz;")
	public Class520 field4611;
	@ObfInfo(name = "ad", desc = "Ltz;")
	public Class520 field4613;

	public Class397(Class399 var1) {
		this.field4611 = null;
		this.method7385(var1);
	}

	@ObfInfo(name = "aq", desc = "(Lpi;)V")
	public void method7385(Class399 var1) {
		this.field4612 = var1;
		this.method7386();
	}

	@ObfInfo(name = "ad", desc = "()V")
	public void method7386() {
		this.field4613 = this.field4612 != null ? this.field4612.field4620.field5235 : null;
		this.field4611 = null;
	}

	public Object next() {
		Class520 var1 = this.field4613;
		if (this.field4612.field4620 == var1) {
			var1 = null;
			this.field4613 = null;
		} else {
			this.field4613 = var1.field5235;
		}

		this.field4611 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field4613 != this.field4612.field4620 && this.field4613 != null;
	}

	public void remove() {
		if (this.field4611 == null) {
			throw new IllegalStateException();
		} else {
			this.field4611.method9267();
			this.field4611 = null;
		}
	}
}
