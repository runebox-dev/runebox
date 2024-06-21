import io.runebox.ObfInfo;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfInfo(name = "qr")
public class Class434 implements Iterator {
	@ObfInfo(name = "ak", desc = "Lqc;")
	public Class419 field4716;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 258225695)
	public int field4717;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1135055625)
	public int field4718;

	public Class434(Class419 var1) {
		this.field4717 = 0;
		this.field4718 = this.field4716.field4670;
		this.field4716 = var1;
	}

	@ObfInfo(name = "hasNext", desc = "()Z")
	public boolean hasNext() {
		return this.field4717 < this.field4716.field4669;
	}

	@ObfInfo(name = "next", desc = "()Ljava/lang/Object;")
	public Object next() {
		if (this.field4716.field4670 != this.field4718) {
			throw new ConcurrentModificationException();
		} else if (this.field4717 < this.field4716.field4669) {
			Object var1 = this.field4716.field4671[this.field4717].field4714;
			++this.field4717;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	@ObfInfo(name = "remove", desc = "()V")
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
