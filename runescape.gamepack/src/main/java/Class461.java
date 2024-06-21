import io.runebox.ObfInfo;
import java.util.ArrayList;

public class Class461 extends Class447 {
	@ObfInfo(name = "ak", desc = "Ljava/util/ArrayList;")
	public ArrayList field4873;

	public Class461(Class447 var1, ArrayList var2) {
		super(var1);
		this.field4873 = var2;
		super.field4807 = "ConcurrentMidiTask";
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		for (int var2 = 0; var2 < this.field4873.size(); ++var2) {
			Class447 var3 = (Class447)this.field4873.get(var2);
			if (var3 == null) {
				this.field4873.remove(var2);
				--var2;
			} else if (var3.method7832()) {
				if (var3.method8375()) {
					this.method8379(var3.method8393());
					this.field4873.clear();
					return true;
				}

				if (var3.method8378() != null) {
					this.field4873.add(var3.method8378());
				}

				super.field4812 = var3.field4812;
				this.field4873.remove(var2);
				--var2;
			}
		}

		if (this.field4873.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
