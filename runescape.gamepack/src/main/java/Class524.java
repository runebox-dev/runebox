import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "ud")
class Class524 implements Iterator {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -382792011)
	public int field5228;
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Luj;")
	public final Class530 this$0;

	public Class524(Class530 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "hasNext", desc = "()Z")
	public boolean hasNext() {
		return this.field5228 < this.this$0.method8609();
	}

	@ObfInfo(name = "next", desc = "()Ljava/lang/Object;")
	public Object next() {
		int var1 = ++this.field5228 - 1;
		Class489 var2 = (Class489)this.this$0.field5253.method5885((long)var1);
		return var2 != null ? var2 : this.this$0.method9749(var1);
	}

	@ObfInfo(name = "remove", desc = "()V")
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
