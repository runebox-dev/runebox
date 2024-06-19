import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class434 implements Iterator {
	public Class419 field4716;
	public int field4717;
	public int field4718;

	public Class434(Class419 var1) {
		this.field4717 = 0;
		this.field4718 = this.field4716.field4670;
		this.field4716 = var1;
	}

	public boolean hasNext() {
		return this.field4717 < this.field4716.field4669;
	}

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

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
