import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;

@ObfInfo(name = "qy")
public class Class441 extends Class447 {
	@ObfInfo(name = "ak", desc = "Ljava/util/ArrayList;")
	public ArrayList field4784;

	public Class441(Class447 var1, ArrayList var2) {
		super(var1);
		super.field4807 = "ClearRequestTask";
		this.field4784 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "709593494")
	public boolean method7832() {
		if (this.field4784.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field4784.iterator();

			while (var2.hasNext()) {
				Class357 var3 = (Class357)var2.next();

				try {
					if (Class332.field3455.contains(var3)) {
						if (var3 == null) {
							Class332.field3455.remove(var3);
						} else {
							if (var3.field3940.field3509 > 0) {
								--var3.field3940.field3509;
							}

							if (var3.field3940.field3509 == 0) {
								var3.field3940.method6319();
								var3.field3940.method6313();
								var3.field3940.method6400(0);
							}

							Class332.method4921(var3.field3937, var3.field3933);
							Class332.field3455.remove(var3);
						}
					}
				} catch (Exception var5) {
					Class548.method8904((String)null, var5);
					this.method8379(var5.getMessage());
					Class332.field3455.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfInfo(name = "hk", desc = "(I)Z", opaque = "-1886345089")
	public static boolean method8271() {
		if (Client.field713 != null && Client.field785 < Client.field713.size()) {
			while (Client.field785 < Client.field713.size()) {
				Class82 var1 = (Class82)Client.field713.get(Client.field785);
				if (!var1.method2245()) {
					return false;
				}

				++Client.field785;
			}

			return true;
		} else {
			return true;
		}
	}
}
