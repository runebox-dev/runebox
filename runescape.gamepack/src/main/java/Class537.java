import io.runebox.ObfInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfInfo(name = "uq")
public class Class537 implements Class542 {
	@ObfInfo(name = "ak", desc = "Ljava/util/Map;")
	public Map field5304;
	@ObfInfo(name = "al", desc = "Lvg;")
	public final Class552 field5303;

	public Class537(Class552 var1) {
		this.field5303 = var1;
	}

	@ObfInfo(name = "ak", desc = "(II)I", opaque = "-423215907")
	public int method9838(int var1) {
		if (this.field5304 != null) {
			Class551 var3 = (Class551)this.field5304.get(var1);
			if (var3 != null) {
				return (Integer)var3.field5369;
			}
		}

		return (Integer)this.field5303.method8610(var1);
	}

	@ObfInfo(name = "al", desc = "(ILjava/lang/Object;I)V", opaque = "1251579836")
	public void method9833(int var1, Object var2) {
		if (this.field5304 == null) {
			this.field5304 = new HashMap();
			this.field5304.put(var1, new Class551(var1, var2));
		} else {
			Class551 var4 = (Class551)this.field5304.get(var1);
			if (var4 == null) {
				this.field5304.put(var1, new Class551(var1, var2));
			} else {
				var4.field5369 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5304 == null ? Collections.emptyList().iterator() : this.field5304.values().iterator();
	}
}
