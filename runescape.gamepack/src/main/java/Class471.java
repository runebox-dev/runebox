import java.util.Comparator;

public abstract class Class471 implements Comparator {
	public Comparator field4921;

	public final void method8639(Comparator var1) {
		if (this.field4921 == null) {
			this.field4921 = var1;
		} else if (this.field4921 instanceof Class471) {
			((Class471)this.field4921).method8639(var1);
		}

	}

	public final int method8640(Class475 var1, Class475 var2) {
		return this.field4921 == null ? 0 : this.field4921.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
