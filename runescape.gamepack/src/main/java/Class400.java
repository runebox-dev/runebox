import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "pj")
public class Class400 implements Iterator {
	@ObfInfo(name = "ak", desc = "Lpb;")
	public Class392 field4604;
	@ObfInfo(name = "al", desc = "Ltm;")
	public Class507 field4602;
	@ObfInfo(name = "aj", desc = "Ltm;")
	public Class507 field4603;

	public Class400(Class392 var1) {
		this.field4603 = null;
		this.field4604 = var1;
		this.field4602 = this.field4604.field4560.field5172;
		this.field4603 = null;
	}

	public Object next() {
		Class507 var1 = this.field4602;
		if (this.field4604.field4560 == var1) {
			var1 = null;
			this.field4602 = null;
		} else {
			this.field4602 = var1.field5172;
		}

		this.field4603 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field4602 != this.field4604.field4560;
	}

	public void remove() {
		if (this.field4603 == null) {
			throw new IllegalStateException();
		} else {
			this.field4603.method9280();
			this.field4603 = null;
		}
	}
}
