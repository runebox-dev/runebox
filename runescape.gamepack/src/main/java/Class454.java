import io.runebox.ObfInfo;
import java.util.Comparator;
import java.util.Map.Entry;

class Class454 implements Comparator {
	// $FF: synthetic field
	public final Class462 this$0;

	public Class454(Class462 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I")
	public int method8432(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method8432((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
