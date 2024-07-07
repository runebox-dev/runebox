import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "un")
class Class534 implements Iterator {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -1486813323)
	public int field5290;
	// $FF: synthetic field
	public final Class538 this$0;

	public Class534(Class538 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5290 < this.this$0.method8813();
	}

	public Object next() {
		int var1 = ++this.field5290 - 1;
		Class477 var2 = (Class477)this.this$0.field5300.method5997((long)var1);
		return var2 != null ? var2 : this.this$0.method9466(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
