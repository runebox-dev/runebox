import io.runebox.ObfInfo;
import java.util.Comparator;
import java.util.Map.Entry;

@ObfInfo(name = "ra")
class Class443 implements Comparator {
	// $FF: synthetic field
	public final Class465 this$0;

	public Class443(Class465 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I")
	public int method8252(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method8252((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
