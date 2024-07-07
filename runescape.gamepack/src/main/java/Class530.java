import io.runebox.ObfInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfInfo(name = "uj")
public class Class530 implements Class546 {
	@ObfInfo(name = "aq", desc = "Ljava/util/Map;")
	public Map field5280;
	@ObfInfo(name = "ad", desc = "Lvu;")
	public final Class567 field5279;

	public Class530(Class567 var1) {
		this.field5279 = var1;
	}

	@ObfInfo(name = "aq", desc = "(IB)I", opaque = "0")
	public int method9397(int var1) {
		if (this.field5280 != null) {
			Class566 var3 = (Class566)this.field5280.get(var1);
			if (var3 != null) {
				return (Integer)var3.field5492;
			}
		}

		return (Integer)this.field5279.method8821(var1);
	}

	@ObfInfo(name = "ad", desc = "(ILjava/lang/Object;I)V", opaque = "122236130")
	public void method9391(int var1, Object var2) {
		if (this.field5280 == null) {
			this.field5280 = new HashMap();
			this.field5280.put(var1, new Class566(var1, var2));
		} else {
			Class566 var4 = (Class566)this.field5280.get(var1);
			if (var4 == null) {
				this.field5280.put(var1, new Class566(var1, var2));
			} else {
				var4.field5492 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5280 == null ? Collections.emptyList().iterator() : this.field5280.values().iterator();
	}
}
