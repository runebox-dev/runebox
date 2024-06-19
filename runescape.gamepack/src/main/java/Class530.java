import java.util.Iterator;

public class Class530 extends Class469 implements Class287 {
	public final Class290 field5253;
	public final Class382 field5252;
	public final int field5254;

	public Class530(Class390 var1, int var2, Class402 var3, Class382 var4) {
		super(var1, var3, var4 != null ? var4.method7237(var2) : 0);
		this.field5253 = new Class290(64);
		this.field5252 = var4;
		this.field5254 = var2;
	}

	public Class484 method8608(int var1) {
		synchronized(this.field5253) {
			Class489 var3 = (Class489)this.field5253.method5885((long)var1);
			if (var3 == null) {
				var3 = this.method9749(var1);
				this.field5253.method5888(var3, (long)var1);
			}

			return var3;
		}
	}

	public Class489 method9749(int var1) {
		byte[] var3 = this.field5252.method7216(this.field5254, var1);
		Class489 var4 = new Class489(var1);
		if (var3 != null) {
			var4.method8872(new Class521(var3));
		}

		return var4;
	}

	public void method9750() {
		synchronized(this.field5253) {
			this.field5253.method5894();
		}
	}

	public Iterator iterator() {
		return new Class524(this);
	}
}
