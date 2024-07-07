import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "to")
public class Class509 implements Iterator {
	@ObfInfo(name = "aq", desc = "Lth;")
	public Class502 field5098;
	@ObfInfo(name = "ad", desc = "Ltz;")
	public Class520 field5096;
	@ObfInfo(name = "ak", desc = "Ltz;")
	public Class520 field5097;
	@ObfInfo(name = "ag", desc = "I")
	public int field5095;

	public Class509(Class502 var1) {
		this.field5097 = null;
		this.field5098 = var1;
		this.method8975();
	}

	@ObfInfo(name = "aq", desc = "()V")
	public void method8975() {
		this.field5096 = this.field5098.field5074[0].field5235;
		this.field5095 = 1;
		this.field5097 = null;
	}

	@ObfInfo(name = "ad", desc = "()Ltz;")
	public Class520 method8974() {
		this.method8975();
		return (Class520)this.next();
	}

	public Object next() {
		Class520 var1;
		if (this.field5096 != this.field5098.field5074[this.field5095 - 1]) {
			var1 = this.field5096;
			this.field5096 = var1.field5235;
			this.field5097 = var1;
			return var1;
		} else {
			do {
				if (this.field5095 >= this.field5098.field5076) {
					return null;
				}

				var1 = this.field5098.field5074[this.field5095++].field5235;
			} while(var1 == this.field5098.field5074[this.field5095 - 1]);

			this.field5096 = var1.field5235;
			this.field5097 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field5096 != this.field5098.field5074[this.field5095 - 1]) {
			return true;
		} else {
			while (this.field5095 < this.field5098.field5076) {
				if (this.field5098.field5074[this.field5095++].field5235 != this.field5098.field5074[this.field5095 - 1]) {
					this.field5096 = this.field5098.field5074[this.field5095 - 1].field5235;
					return true;
				}

				this.field5096 = this.field5098.field5074[this.field5095 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field5097 == null) {
			throw new IllegalStateException();
		} else {
			this.field5097.method9267();
			this.field5097 = null;
		}
	}
}
