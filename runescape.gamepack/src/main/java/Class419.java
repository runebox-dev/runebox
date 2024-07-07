import io.runebox.ObfInfo;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfInfo(name = "qc")
public class Class419 implements Iterator {
	@ObfInfo(name = "aq", desc = "Lqq;")
	public Class433 field4684;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 317340959)
	public int field4685;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1536068071)
	public int field4686;

	public Class419(Class433 var1) {
		this.field4685 = 0;
		this.field4686 = this.field4684.field4753;
		this.field4684 = var1;
	}

	public boolean hasNext() {
		return this.field4685 < this.field4684.field4751;
	}

	public Object next() {
		if (this.field4684.field4753 != this.field4686) {
			throw new ConcurrentModificationException();
		} else if (this.field4685 < this.field4684.field4751) {
			Object var1 = this.field4684.field4749[this.field4685].field4741;
			++this.field4685;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
