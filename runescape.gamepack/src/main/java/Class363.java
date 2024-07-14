import io.runebox.ObfInfo;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfInfo(name = "ny")
public class Class363 {
	@ObfInfo(name = "bu", desc = "Lnj;")
	public Class348 field3976;
	@ObfInfo(name = "bx", desc = "Lnj;")
	public Class348 field3990;
	@ObfInfo(name = "ay", desc = "Lql;")
	public Class428 field3971;
	@ObfInfo(name = "ao", desc = "Lql;")
	public Class428 field3972;
	@ObfInfo(name = "at", desc = "Z")
	public boolean field3968;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field3981;
	@ObfInfo(name = "as", desc = "Z")
	public boolean field3984;
	@ObfInfo(name = "bs", desc = "I", intMultiplier = -1273574081)
	public int field3965;
	@ObfInfo(name = "be", desc = "I", intMultiplier = 502615579)
	public int field3973;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = -750548211)
	public int field3975;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 980897855)
	public int field3977;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = -1896169033)
	public int field3978;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 535951409)
	public int field3979;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 854950137)
	public int field3982;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = 2065933361)
	public int field3983;
	@ObfInfo(name = "bi", desc = "I", intMultiplier = 1092874469)
	public int field3985;
	@ObfInfo(name = "ba", desc = "I", intMultiplier = -670226323)
	public int field3986;
	@ObfInfo(name = "bg", desc = "I", intMultiplier = 1971877053)
	public int field3987;
	@ObfInfo(name = "bj", desc = "I", intMultiplier = -1513845077)
	public int field3988;
	@ObfInfo(name = "bp", desc = "I", intMultiplier = 1349805081)
	public int field3991;
	@ObfInfo(name = "bo", desc = "I", intMultiplier = 1593022913)
	public int field3992;

	public Class363() {
		this.field3971 = new Class428();
		this.field3972 = new Class428();
		this.field3981 = false;
		this.field3984 = true;
		this.field3975 = 0;
		this.field3968 = false;
		this.field3977 = 0;
		this.field3982 = 0;
		this.field3979 = 0;
		this.field3978 = 0;
		this.field3988 = 0;
		this.field3973 = 0;
		this.field3983 = 0;
		this.field3992 = Integer.MAX_VALUE;
		this.field3985 = Integer.MAX_VALUE;
		this.field3986 = 0;
		this.field3987 = 0;
		this.field3965 = 0;
		this.field3991 = 0;
		this.field3971.method7881(1);
		this.field3972.method7881(1);
	}

	@ObfInfo(name = "aq", desc = "(B)V", opaque = "1")
	public void method7022() {
		this.field3975 = (this.field3975 + 1) % 60;
		if (this.field3983 > 0) {
			--this.field3983;
		}

	}

	@ObfInfo(name = "ad", desc = "(ZB)Z", opaque = "5")
	public boolean method6953(boolean var1) {
		var1 = var1 && this.field3984;
		boolean var3 = this.field3981 != var1;
		this.field3981 = var1;
		if (!this.field3981) {
			this.method6798(this.field3978, this.field3978);
		}

		return var3;
	}

	@ObfInfo(name = "ag", desc = "(ZI)V", opaque = "73575238")
	public void method6775(boolean var1) {
		this.field3984 = var1;
		this.field3981 = var1 && this.field3981;
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;I)Z", opaque = "1134998565")
	public boolean method6848(String var1) {
		String var3 = this.field3971.method7876();
		if (!var3.equals(var1)) {
			var1 = this.method6842(var1);
			this.field3971.method7992(var1);
			this.method6798(this.field3988, this.field3978);
			this.method6920(this.field3965, this.field3991);
			this.method6846();
			this.method6851();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ap", desc = "(Ljava/lang/String;I)Z")
	public boolean method6777(String var1) {
		this.field3972.method7992(var1);
		return true;
	}

	@ObfInfo(name = "an", desc = "(Lqz;B)Z", opaque = "7")
	public boolean method6985(Class442 var1) {
		boolean var3 = !this.field3968;
		this.field3971.method7926(var1);
		this.field3972.method7926(var1);
		this.field3968 = true;
		var3 |= this.method6920(this.field3965, this.field3991);
		var3 |= this.method6798(this.field3988, this.field3978);
		if (this.method6846()) {
			this.method6851();
			var3 = true;
		}

		return var3;
	}

	@ObfInfo(name = "aj", desc = "(III)Z", opaque = "-382329429")
	public boolean method6827(int var1, int var2) {
		boolean var4 = this.field3986 != var1 || this.field3987 != var2;
		this.field3986 = var1;
		this.field3987 = var2;
		var4 |= this.method6920(this.field3965, this.field3991);
		return var4;
	}

	@ObfInfo(name = "av", desc = "(IB)Z", opaque = "2")
	public boolean method6906(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var3 = this.field3971.method7896() == var1;
		this.field3971.method7961(var1);
		this.field3972.method7961(var1);
		if (this.method6846()) {
			this.method6851();
			var3 = true;
		}

		return var3;
	}

	@ObfInfo(name = "ab", desc = "(IS)Z", opaque = "256")
	public boolean method6781(int var1) {
		this.field3971.method7982(var1);
		if (this.method6846()) {
			this.method6851();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ai", desc = "(II)Z", opaque = "1478386211")
	public boolean method6782(int var1) {
		this.field3985 = var1;
		if (this.method6846()) {
			this.method6851();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ae", desc = "(IIB)Z", opaque = "46")
	public boolean method6920(int var1, int var2) {
		if (!this.method6830()) {
			this.field3965 = var1;
			this.field3991 = var2;
			return false;
		} else {
			int var4 = this.field3965;
			int var5 = this.field3991;
			int var6 = Math.max(0, this.field3971.method7893() - this.field3986 + 2);
			int var7 = Math.max(0, this.field3971.method7894() - this.field3987 + 1);
			this.field3965 = Math.max(0, Math.min(var6, var1));
			this.field3991 = Math.max(0, Math.min(var7, var2));
			return this.field3965 != var4 || this.field3991 != var5;
		}
	}

	@ObfInfo(name = "au", desc = "(III)Z", opaque = "-167698724")
	public boolean method6839(int var1, int var2) {
		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}

		return var4 ? this.field3971.method7981(var1, var2) : false;
	}

	@ObfInfo(name = "ah", desc = "(II)V")
	public void method6810(int var1) {
		this.field3971.method7883(var1);
	}

	@ObfInfo(name = "az", desc = "(IB)V")
	public void method6939(int var1) {
		this.field3977 = var1;
	}

	@ObfInfo(name = "ax", desc = "(IB)V")
	public void method6787(int var1) {
		this.field3971.method7881(var1);
	}

	@ObfInfo(name = "ac", desc = "(IB)V")
	public void method6803(int var1) {
		this.field3971.method7879(var1);
	}

	@ObfInfo(name = "al", desc = "(II)Z", opaque = "1009932172")
	public boolean method6789(int var1) {
		this.field3979 = var1;
		String var3 = this.field3971.method7876();
		int var4 = var3.length();
		var3 = this.method6842(var3);
		if (var3.length() != var4) {
			this.field3971.method7992(var3);
			this.method6920(this.field3965, this.field3991);
			this.method6846();
			this.method6851();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ay", desc = "(I)V")
	public void method6790() {
		this.field3968 = false;
	}

	@ObfInfo(name = "ao", desc = "(II)Z")
	public boolean method6791(int var1) {
		if (this.method6852(var1)) {
			this.method6796();
			Class427 var3 = this.field3971.method7971((char)var1, this.field3978, this.field3992);
			this.method6798(var3.method7867(), var3.method7867());
			this.method6846();
			this.method6851();
		}

		return true;
	}

	@ObfInfo(name = "aa", desc = "(B)V")
	public void method6976() {
		if (!this.method6796() && this.field3978 > 0) {
			int var2 = this.field3971.method7933(this.field3978 - 1);
			this.method6851();
			this.method6798(var2, var2);
		}

	}

	@ObfInfo(name = "as", desc = "(I)V", opaque = "675803200")
	public void method6793() {
		if (!this.method6796() && this.field3978 < this.field3971.method7936()) {
			int var2 = this.field3971.method7933(this.field3978);
			this.method6851();
			this.method6798(var2, var2);
		}

	}

	@ObfInfo(name = "aw", desc = "(I)V", opaque = "1470814709")
	public void method6794() {
		if (!this.method6796() && this.field3978 > 0) {
			Class515 var2 = this.method6936(this.field3978 - 1);
			int var3 = this.field3971.method7890((Integer)var2.field5155, this.field3978);
			this.method6851();
			this.method6798(var3, var3);
		}

	}

	@ObfInfo(name = "at", desc = "(B)V", opaque = "6")
	public void method6772() {
		if (!this.method6796() && this.field3978 < this.field3971.method7936()) {
			Class515 var2 = this.method6936(this.field3978);
			int var3 = this.field3971.method7890(this.field3978, (Integer)var2.field5152);
			this.method6851();
			this.method6798(var3, var3);
		}

	}

	@ObfInfo(name = "af", desc = "(S)Z", opaque = "128")
	public boolean method6796() {
		if (!this.method6841()) {
			return false;
		} else {
			int var2 = this.field3971.method7890(this.field3988, this.field3978);
			this.method6851();
			this.method6798(var2, var2);
			return true;
		}
	}

	@ObfInfo(name = "am", desc = "(I)V")
	public void method6844() {
		this.method6798(0, this.field3971.method7936());
	}

	@ObfInfo(name = "ar", desc = "(III)Z", opaque = "1160990117")
	public boolean method6798(int var1, int var2) {
		if (!this.method6830()) {
			this.field3988 = var1;
			this.field3978 = var2;
			return false;
		} else {
			if (var1 > this.field3971.method7936()) {
				var1 = this.field3971.method7936();
			}

			if (var2 > this.field3971.method7936()) {
				var2 = this.field3971.method7936();
			}

			boolean var4 = this.field3988 != var1 || this.field3978 != var2;
			this.field3988 = var1;
			if (this.field3978 != var2) {
				this.field3978 = var2;
				this.field3975 = 0;
				this.method7042();
			}

			if (var4 && this.field3976 != null) {
				this.field3976.method2915();
			}

			return var4;
		}
	}

	@ObfInfo(name = "bt", desc = "(ZI)V")
	public void method6799(boolean var1) {
		Class515 var3 = this.method6845(this.field3978);
		this.method6818((Integer)var3.field5155, var1);
	}

	@ObfInfo(name = "bj", desc = "(ZB)V")
	public void method6800(boolean var1) {
		Class515 var3 = this.method6845(this.field3978);
		this.method6818((Integer)var3.field5152, var1);
	}

	@ObfInfo(name = "be", desc = "(ZB)V")
	public void method6983(boolean var1) {
		this.method6818(0, var1);
	}

	@ObfInfo(name = "bm", desc = "(ZB)V")
	public void method6802(boolean var1) {
		this.method6818(this.field3971.method7936(), var1);
	}

	@ObfInfo(name = "bo", desc = "(ZB)V", opaque = "-1")
	public void method6955(boolean var1) {
		if (this.method6841() && !var1) {
			this.method6818(Math.min(this.field3988, this.field3978), var1);
		} else if (this.field3978 > 0) {
			this.method6818(this.field3978 - 1, var1);
		}

	}

	@ObfInfo(name = "bi", desc = "(ZI)V", opaque = "-2139775874")
	public void method6804(boolean var1) {
		if (this.method6841() && !var1) {
			this.method6818(Math.max(this.field3988, this.field3978), var1);
		} else if (this.field3978 < this.field3971.method7936()) {
			this.method6818(this.field3978 + 1, var1);
		}

	}

	@ObfInfo(name = "ba", desc = "(ZB)V", opaque = "76")
	public void method6805(boolean var1) {
		if (this.field3978 > 0) {
			Class515 var3 = this.method6936(this.field3978 - 1);
			this.method6818((Integer)var3.field5155, var1);
		}

	}

	@ObfInfo(name = "bg", desc = "(ZB)V", opaque = "1")
	public void method6792(boolean var1) {
		if (this.field3978 < this.field3971.method7936()) {
			Class515 var3 = this.method6936(this.field3978 + 1);
			this.method6818((Integer)var3.field5152, var1);
		}

	}

	@ObfInfo(name = "bs", desc = "(ZB)V")
	public void method6984(boolean var1) {
		if (this.field3978 > 0) {
			this.method6818(this.field3971.method7892(this.field3978, -1), var1);
		}

	}

	@ObfInfo(name = "bp", desc = "(ZI)V", opaque = "314150757")
	public void method6808(boolean var1) {
		if (this.field3978 < this.field3971.method7936()) {
			this.method6818(this.field3971.method7892(this.field3978, 1), var1);
		}

	}

	@ObfInfo(name = "bx", desc = "(ZS)V", opaque = "178")
	public void method6809(boolean var1) {
		if (this.field3978 > 0) {
			int var3 = this.method6960();
			this.method6818(this.field3971.method7892(this.field3978, -var3), var1);
		}

	}

	@ObfInfo(name = "bu", desc = "(ZI)V", opaque = "-1661868993")
	public void method6932(boolean var1) {
		if (this.field3978 < this.field3971.method7936()) {
			int var3 = this.method6960();
			this.method6818(this.field3971.method7892(this.field3978, var3), var1);
		}

	}

	@ObfInfo(name = "by", desc = "(ZB)V")
	public void method6797(boolean var1) {
		Class439 var3 = this.field3971.method7884(0, this.field3978);
		Class515 var4 = var3.method8093();
		this.method6818(this.field3971.method7878((Integer)var4.field5155, this.field3991), var1);
	}

	@ObfInfo(name = "bw", desc = "(ZB)V")
	public void method6812(boolean var1) {
		Class439 var3 = this.field3971.method7884(0, this.field3978);
		Class515 var4 = var3.method8093();
		this.method6818(this.field3971.method7878((Integer)var4.field5155, this.field3991 + this.field3987), var1);
	}

	@ObfInfo(name = "bl", desc = "(IIZZB)V", opaque = "54")
	public void method6813(int var1, int var2, boolean var3, boolean var4) {
		boolean var6 = false;
		Class515 var7;
		int var9;
		if (!this.field3968) {
			var9 = 0;
		} else {
			var1 += this.field3965;
			var2 += this.field3991;
			var7 = this.method6853();
			var9 = this.field3971.method7878(var1 - (Integer)var7.field5155, var2 - (Integer)var7.field5152);
		}

		if (var3 && var4) {
			this.field3982 = 1;
			var7 = this.method6936(var9);
			Class515 var8 = this.method6936(this.field3973);
			this.method6843(var8, var7);
		} else if (var3) {
			this.field3982 = 1;
			var7 = this.method6936(var9);
			this.method6798((Integer)var7.field5155, (Integer)var7.field5152);
			this.field3973 = (Integer)var7.field5155;
		} else if (var4) {
			this.method6798(this.field3973, var9);
		} else {
			if (this.field3983 > 0 && this.field3973 == var9) {
				if (this.field3988 == this.field3978) {
					this.field3982 = 1;
					var7 = this.method6936(var9);
					this.method6798((Integer)var7.field5155, (Integer)var7.field5152);
				} else {
					this.field3982 = 2;
					var7 = this.method6845(var9);
					this.method6798((Integer)var7.field5155, (Integer)var7.field5152);
				}
			} else {
				this.field3982 = 0;
				this.method6798(var9, var9);
				this.field3973 = var9;
			}

			this.field3983 = 25;
		}

	}

	@ObfInfo(name = "bc", desc = "(IIB)V", opaque = "0")
	public void method6814(int var1, int var2) {
		if (this.field3968 && this.method6825()) {
			var1 += this.field3965;
			var2 += this.field3991;
			Class515 var4 = this.method6853();
			int var5 = this.field3971.method7878(var1 - (Integer)var4.field5155, var2 - (Integer)var4.field5152);
			Class515 var6;
			Class515 var7;
			switch(this.field3982) {
			case 0:
				this.method6798(this.field3988, var5);
				break;
			case 1:
				var6 = this.method6936(this.field3973);
				var7 = this.method6936(var5);
				this.method6843(var6, var7);
				break;
			case 2:
				var6 = this.method6845(this.field3973);
				var7 = this.method6845(var5);
				this.method6843(var6, var7);
			}
		}

	}

	@ObfInfo(name = "bv", desc = "(Ljava/awt/datatransfer/Clipboard;I)V", opaque = "1500532859")
	public void method6815(Clipboard var1) {
		Class439 var3 = this.field3971.method7884(this.field3988, this.field3978);
		if (!var3.method8089()) {
			String var4 = var3.method8087();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
			}
		}

	}

	@ObfInfo(name = "bb", desc = "(Ljava/awt/datatransfer/Clipboard;I)V", opaque = "-1740959494")
	public void method6816(Clipboard var1) {
		if (this.method6841()) {
			this.method6815(var1);
			this.method6796();
		}

	}

	@ObfInfo(name = "bn", desc = "(Ljava/awt/datatransfer/Clipboard;I)V", opaque = "-623242343")
	public void method6938(Clipboard var1) {
		Transferable var3 = var1.getContents((Object)null);
		if (var3 != null && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = this.method6842((String)var3.getTransferData(DataFlavor.stringFlavor));
				this.method6796();
				Class427 var5 = this.field3971.method7997(var4, this.field3978, this.field3992);
				this.method6798(var5.method7867(), var5.method7867());
				this.method6846();
				this.method6851();
			} catch (Exception var6) {
			}
		}

	}

	@ObfInfo(name = "bh", desc = "(I)V")
	public void method6824() {
		this.field3991 = Math.max(0, this.field3991 - this.field3971.method7895());
	}

	@ObfInfo(name = "bq", desc = "(I)V")
	public void method6819() {
		int var2 = Math.max(0, this.field3971.method7894() - this.field3987);
		this.field3991 = Math.min(var2, this.field3991 + this.field3971.method7895());
	}

	@ObfInfo(name = "bd", desc = "(Lnj;I)V")
	public void method6820(Class348 var1) {
		this.field3990 = var1;
	}

	@ObfInfo(name = "bz", desc = "(Lnj;I)V")
	public void method6821(Class348 var1) {
		this.field3976 = var1;
	}

	@ObfInfo(name = "bk", desc = "(I)Lql;")
	public Class428 method6822() {
		return this.field3971;
	}

	@ObfInfo(name = "br", desc = "(B)Lql;")
	public Class428 method6865() {
		return this.field3972;
	}

	@ObfInfo(name = "bf", desc = "(B)Lqw;")
	public Class439 method6987() {
		return this.field3971.method7884(this.field3988, this.field3978);
	}

	@ObfInfo(name = "cf", desc = "(I)Z")
	public boolean method6825() {
		return this.field3981;
	}

	@ObfInfo(name = "cv", desc = "(I)Z")
	public boolean method6826() {
		return this.field3984;
	}

	@ObfInfo(name = "cl", desc = "(B)Z", opaque = "39")
	public boolean method7028() {
		return this.method6825() && this.field3975 % 60 < 30;
	}

	@ObfInfo(name = "cm", desc = "(B)I")
	public int method6969() {
		return this.field3978;
	}

	@ObfInfo(name = "cg", desc = "(I)I")
	public int method6829() {
		return this.field3988;
	}

	@ObfInfo(name = "cu", desc = "(B)Z")
	public boolean method6830() {
		return this.field3968;
	}

	@ObfInfo(name = "cn", desc = "(I)I")
	public int method6831() {
		return this.field3965;
	}

	@ObfInfo(name = "ce", desc = "(I)I")
	public int method6832() {
		return this.field3991;
	}

	@ObfInfo(name = "co", desc = "(I)I")
	public int method6833() {
		return this.field3971.method7896();
	}

	@ObfInfo(name = "ch", desc = "(I)I")
	public int method6834() {
		return this.field3971.method7945();
	}

	@ObfInfo(name = "ct", desc = "(I)I")
	public int method6835() {
		return this.field3985;
	}

	@ObfInfo(name = "cd", desc = "(B)I")
	public int method6974() {
		return this.field3977;
	}

	@ObfInfo(name = "ck", desc = "(B)I")
	public int method6837() {
		return this.field3971.method7900();
	}

	@ObfInfo(name = "cq", desc = "(I)I")
	public int method6838() {
		return this.field3979;
	}

	@ObfInfo(name = "cs", desc = "(B)I")
	public int method7020() {
		return this.field3971.method7901();
	}

	@ObfInfo(name = "cp", desc = "(I)Z")
	public boolean method6840() {
		return this.method6834() > 1;
	}

	@ObfInfo(name = "cy", desc = "(I)Z", opaque = "-1787595803")
	public boolean method6841() {
		return this.field3988 != this.field3978;
	}

	@ObfInfo(name = "cw", desc = "(Ljava/lang/String;I)Ljava/lang/String;", opaque = "-2132000749")
	public String method6842(String var1) {
		StringBuilder var3 = new StringBuilder(var1.length());

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			char var5 = var1.charAt(var4);
			if (this.method6852(var5)) {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	@ObfInfo(name = "ci", desc = "(Ltu;Ltu;I)V")
	public void method6843(Class515 var1, Class515 var2) {
		if ((Integer)var2.field5155 < (Integer)var1.field5155) {
			this.method6798((Integer)var1.field5152, (Integer)var2.field5155);
		} else {
			this.method6798((Integer)var1.field5155, (Integer)var2.field5152);
		}

	}

	@ObfInfo(name = "cc", desc = "(IB)Ltu;", opaque = "8")
	public Class515 method6936(int var1) {
		int var3 = this.field3971.method7936();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.method6850(this.field3971.method7871(var6 - 1).field4693)) {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.method6850(this.field3971.method7871(var6).field4693)) {
				var5 = var6;
				break;
			}
		}

		return new Class515(var4, var5);
	}

	@ObfInfo(name = "cr", desc = "(IB)Ltu;", opaque = "9")
	public Class515 method6845(int var1) {
		int var3 = this.field3971.method7936();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.field3971.method7871(var6 - 1).field4693 == '\n') {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.field3971.method7871(var6).field4693 == '\n') {
				var5 = var6;
				break;
			}
		}

		return new Class515(var4, var5);
	}

	@ObfInfo(name = "cb", desc = "(B)Z", opaque = "1")
	public boolean method6846() {
		if (!this.method6830()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.field3971.method7936() > this.field3985) {
				this.field3971.method7890(this.field3985, this.field3971.method7936());
				var2 = true;
			}

			int var3 = this.method6834();
			int var4;
			if (this.field3971.method7987() > var3) {
				var4 = this.field3971.method7892(0, var3) - 1;
				this.field3971.method7890(var4, this.field3971.method7936());
				var2 = true;
			}

			if (var2) {
				var4 = this.field3978;
				int var5 = this.field3988;
				int var6 = this.field3971.method7936();
				if (this.field3978 > var6) {
					var4 = var6;
				}

				if (this.field3988 > var6) {
					var5 = var6;
				}

				this.method6798(var5, var4);
			}

			return var2;
		}
	}

	@ObfInfo(name = "cz", desc = "(IZI)V", opaque = "-291773691")
	public void method6818(int var1, boolean var2) {
		if (var2) {
			this.method6798(this.field3988, var1);
		} else {
			this.method6798(var1, var1);
		}

	}

	@ObfInfo(name = "cj", desc = "(I)I")
	public int method6960() {
		return this.field3987 / this.field3971.method7895();
	}

	@ObfInfo(name = "cx", desc = "(I)V", opaque = "-1504726761")
	public void method7042() {
		Class439 var2 = this.field3971.method7884(0, this.field3978);
		Class515 var3 = var2.method8093();
		int var4 = this.field3971.method7895();
		int var5 = (Integer)var3.field5155 - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.field5152 - 3;
		int var8 = var7 + 6 + var4;
		int var9 = this.field3965;
		int var10 = this.field3986 + var9;
		int var11 = this.field3991;
		int var12 = this.field3987 + var11;
		int var13 = this.field3965;
		int var14 = this.field3991;
		if (var5 < var9) {
			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.field3986;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.field3987;
		}

		this.method6920(var13, var14);
	}

	@ObfInfo(name = "ca", desc = "(II)Z", opaque = "-1787897975")
	public boolean method6850(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfInfo(name = "df", desc = "(B)V", opaque = "63")
	public void method6851() {
		if (this.field3990 != null) {
			this.field3990.method2915();
		}

	}

	@ObfInfo(name = "dd", desc = "(IB)Z", opaque = "7")
	public boolean method6852(int var1) {
		switch(this.field3979) {
		case 1:
			return Class413.method3588((char)var1);
		case 2:
			return Class413.method6364((char)var1);
		case 3:
			return Class413.method5044((char)var1);
		case 4:
			char var3 = (char)var1;
			if (Class413.method5044(var3)) {
				return true;
			} else {
				if (var3 != 'k' && var3 != 'K' && var3 != 'm' && var3 != 'M' && var3 != 'b' && var3 != 'B') {
					return false;
				}

				return true;
			}
		default:
			return true;
		}
	}

	@ObfInfo(name = "dg", desc = "(B)Ltu;")
	public Class515 method6853() {
		int var2 = this.field3971.method8011(this.field3986);
		int var3 = this.field3971.method7880(this.field3987);
		return new Class515(var2, var3);
	}
}
