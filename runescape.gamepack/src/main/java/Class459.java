import io.runebox.ObfInfo;
import java.util.ArrayList;

@ObfInfo(name = "rq")
public class Class459 extends Class457 {
	@ObfInfo(name = "aq", desc = "Ljava/util/ArrayList;")
	public ArrayList field4893;

	public Class459(Class457 var1, ArrayList var2) {
		super(var1);
		this.field4893 = var2;
		super.field4890 = "ConcurrentMidiTask";
	}

	@ObfInfo(name = "aq", desc = "(S)Z", opaque = "254")
	public boolean method7710() {
		for (int var2 = 0; var2 < this.field4893.size(); ++var2) {
			Class457 var3 = (Class457)this.field4893.get(var2);
			if (var3 == null) {
				this.field4893.remove(var2);
				--var2;
			} else if (var3.method7710()) {
				if (var3.method8402()) {
					this.method8406(var3.method8404());
					this.field4893.clear();
					return true;
				}

				if (var3.method8407() != null) {
					this.field4893.add(var3.method8407());
				}

				super.field4892 = var3.field4892;
				this.field4893.remove(var2);
				--var2;
			}
		}

		if (this.field4893.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
