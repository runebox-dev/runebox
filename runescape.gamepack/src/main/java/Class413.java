import java.util.Iterator;

public class Class413 implements Iterator {
	public Class409 field4652;
	public Class506 field4653;
	public Class506 field4654;

	public Class413(Class409 var1) {
		this.field4654 = null;
		this.method7736(var1);
	}

	public void method7736(Class409 var1) {
		this.field4652 = var1;
		this.method7732();
	}

	public void method7732() {
		this.field4653 = this.field4652 != null ? this.field4652.field4644.field5169 : null;
		this.field4654 = null;
	}

	public Object next() {
		Class506 var1 = this.field4653;
		if (this.field4652.field4644 == var1) {
			var1 = null;
			this.field4653 = null;
		} else {
			this.field4653 = var1.field5169;
		}

		this.field4654 = var1;
		return var1;
	}

	public boolean hasNext() {
		return this.field4653 != this.field4652.field4644 && this.field4653 != null;
	}

	public void remove() {
		if (this.field4654 == null) {
			throw new IllegalStateException();
		} else {
			this.field4654.method9277();
			this.field4654 = null;
		}
	}
}