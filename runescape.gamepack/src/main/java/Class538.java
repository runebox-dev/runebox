import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "ur")
public class Class538 extends Class487 implements Class311 {
	@ObfInfo(name = "ag", desc = "Llx;")
	public final Class310 field5300;
	@ObfInfo(name = "ad", desc = "Lok;")
	public final Class375 field5301;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -575168409)
	public final int field5302;

	public Class538(Class370 var1, int var2, Class395 var3, Class375 var4) {
		super(var1, var3, var4 != null ? var4.method7144(var2) : 0);
		this.field5300 = new Class310(64);
		this.field5301 = var4;
		this.field5302 = var2;
	}

	@ObfInfo(name = "aq", desc = "(II)Lsm;", opaque = "243889008")
	public Class481 method8824(int var1) {
		synchronized(this.field5300) {
			Class477 var3 = (Class477)this.field5300.method5997((long)var1);
			if (var3 == null) {
				var3 = this.method9466(var1);
				this.field5300.method5995(var3, (long)var1);
			}

			return var3;
		}
	}

	@ObfInfo(name = "az", desc = "(IB)Lsi;", opaque = "0")
	public Class477 method9466(int var1) {
		byte[] var3 = this.field5301.method7132(this.field5302, var1);
		Class477 var4 = new Class477(var1);
		if (var3 != null) {
			var4.method8712(new Class562(var3));
		}

		return var4;
	}

	@ObfInfo(name = "ax", desc = "(S)V")
	public void method9467() {
		synchronized(this.field5300) {
			this.field5300.method5992();
		}
	}

	public Iterator iterator() {
		return new Class534(this);
	}
}
