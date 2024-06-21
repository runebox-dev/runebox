import io.runebox.ObfInfo;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfInfo(name = "np")
public class Class354 {
	@ObfInfo(name = "bu", desc = "Lnl;")
	public Class350 field3926;
	@ObfInfo(name = "bh", desc = "Lnl;")
	public Class350 field3927;
	@ObfInfo(name = "au", desc = "Lqw;")
	public Class439 field3907;
	@ObfInfo(name = "as", desc = "Lqw;")
	public Class439 field3908;
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field3910;
	@ObfInfo(name = "aw", desc = "Z")
	public boolean field3919;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field3921;
	@ObfInfo(name = "bo", desc = "I", intMultiplier = -1680593439)
	public int field3901;
	@ObfInfo(name = "bl", desc = "I", intMultiplier = 573482059)
	public int field3902;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 1938382695)
	public int field3909;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1476265967)
	public int field3911;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 859979755)
	public int field3914;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1966868349)
	public int field3915;
	@ObfInfo(name = "bs", desc = "I", intMultiplier = 1383013209)
	public int field3916;
	@ObfInfo(name = "bf", desc = "I", intMultiplier = -340689853)
	public int field3917;
	@ObfInfo(name = "bn", desc = "I", intMultiplier = -1092299803)
	public int field3918;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = 1781594129)
	public int field3920;
	@ObfInfo(name = "bw", desc = "I", intMultiplier = 901723077)
	public int field3922;
	@ObfInfo(name = "be", desc = "I", intMultiplier = 591817547)
	public int field3923;
	@ObfInfo(name = "bi", desc = "I", intMultiplier = -1950948635)
	public int field3924;
	@ObfInfo(name = "bg", desc = "I", intMultiplier = 1826285097)
	public int field3925;

	public Class354() {
		this.field3907 = new Class439();
		this.field3908 = new Class439();
		this.field3919 = false;
		this.field3910 = true;
		this.field3911 = 0;
		this.field3921 = false;
		this.field3914 = 0;
		this.field3909 = 0;
		this.field3915 = 0;
		this.field3916 = 0;
		this.field3917 = 0;
		this.field3901 = 0;
		this.field3924 = 0;
		this.field3920 = Integer.MAX_VALUE;
		this.field3918 = Integer.MAX_VALUE;
		this.field3922 = 0;
		this.field3902 = 0;
		this.field3923 = 0;
		this.field3925 = 0;
		this.field3907.method8130(1);
		this.field3908.method8130(1);
	}

	@ObfInfo(name = "ak", desc = "(I)V")
	public void method6752() {
		this.field3911 = (this.field3911 + 1) % 60;
		if (this.field3924 > 0) {
			--this.field3924;
		}

	}

	@ObfInfo(name = "al", desc = "(ZI)Z", opaque = "-1333263022")
	public boolean method6753(boolean var1) {
		var1 = var1 && this.field3910;
		boolean var3 = this.field3919 != var1;
		this.field3919 = var1;
		if (!this.field3919) {
			this.method7023(this.field3916, this.field3916);
		}

		return var3;
	}

	@ObfInfo(name = "aj", desc = "(ZI)V", opaque = "-1338932815")
	public void method6876(boolean var1) {
		this.field3910 = var1;
		this.field3919 = var1 && this.field3919;
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;I)Z")
	public boolean method6755(String var1) {
		String var3 = this.field3907.method8125();
		if (!var3.equals(var1)) {
			var1 = this.method6777(var1);
			this.field3907.method8169(var1);
			this.method7023(this.field3917, this.field3916);
			this.method6985(this.field3923, this.field3925);
			this.method6825();
			this.method6856();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "af", desc = "(Ljava/lang/String;B)Z")
	public boolean method6756(String var1) {
		this.field3908.method8169(var1);
		return true;
	}

	@ObfInfo(name = "aa", desc = "(Lqt;I)Z")
	public boolean method6757(Class436 var1) {
		boolean var3 = !this.field3921;
		this.field3907.method8129(var1);
		this.field3908.method8129(var1);
		this.field3921 = true;
		var3 |= this.method6985(this.field3923, this.field3925);
		var3 |= this.method7023(this.field3917, this.field3916);
		if (this.method6825()) {
			this.method6856();
			var3 = true;
		}

		return var3;
	}

	@ObfInfo(name = "at", desc = "(III)Z", opaque = "1477323383")
	public boolean method6758(int var1, int var2) {
		boolean var4 = this.field3922 != var1 || this.field3902 != var2;
		this.field3922 = var1;
		this.field3902 = var2;
		var4 |= this.method6985(this.field3923, this.field3925);
		return var4;
	}

	@ObfInfo(name = "ab", desc = "(II)Z", opaque = "2126439277")
	public boolean method6759(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var3 = this.field3907.method8148() == var1;
		this.field3907.method8126(var1);
		this.field3908.method8126(var1);
		if (this.method6825()) {
			this.method6856();
			var3 = true;
		}

		return var3;
	}

	@ObfInfo(name = "ac", desc = "(II)Z", opaque = "1482629101")
	public boolean method6957(int var1) {
		this.field3907.method8127(var1);
		if (this.method6825()) {
			this.method6856();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ao", desc = "(II)Z", opaque = "-514506050")
	public boolean method6761(int var1) {
		this.field3918 = var1;
		if (this.method6825()) {
			this.method6856();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ah", desc = "(IIB)Z", opaque = "1")
	public boolean method6985(int var1, int var2) {
		if (!this.method6809()) {
			this.field3923 = var1;
			this.field3925 = var2;
			return false;
		} else {
			int var4 = this.field3923;
			int var5 = this.field3925;
			int var6 = Math.max(0, this.field3907.method8143() - this.field3922 + 2);
			int var7 = Math.max(0, this.field3907.method8200() - this.field3902 + 1);
			this.field3923 = Math.max(0, Math.min(var6, var1));
			this.field3925 = Math.max(0, Math.min(var7, var2));
			return var4 != this.field3923 || this.field3925 != var5;
		}
	}

	@ObfInfo(name = "av", desc = "(III)Z", opaque = "248257907")
	public boolean method6763(int var1, int var2) {
		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}

		return var4 ? this.field3907.method8131(var1, var2) : false;
	}

	@ObfInfo(name = "aq", desc = "(II)V")
	public void method6764(int var1) {
		this.field3907.method8170(var1);
	}

	@ObfInfo(name = "ap", desc = "(II)V")
	public void method6765(int var1) {
		this.field3914 = var1;
	}

	@ObfInfo(name = "ae", desc = "(II)V")
	public void method6766(int var1) {
		this.field3907.method8130(var1);
	}

	@ObfInfo(name = "ax", desc = "(IB)V")
	public void method6767(int var1) {
		this.field3907.method8128(var1);
	}

	@ObfInfo(name = "ay", desc = "(IB)Z", opaque = "8")
	public boolean method6768(int var1) {
		this.field3915 = var1;
		String var3 = this.field3907.method8125();
		int var4 = var3.length();
		var3 = this.method6777(var3);
		if (var3.length() != var4) {
			this.field3907.method8169(var3);
			this.method6985(this.field3923, this.field3925);
			this.method6825();
			this.method6856();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "au", desc = "(B)V")
	public void method6898() {
		this.field3921 = false;
	}

	@ObfInfo(name = "as", desc = "(IB)Z", opaque = "1")
	public boolean method6770(int var1) {
		if (this.method6831(var1)) {
			this.method6998();
			Class435 var3 = this.field3907.method8220((char)var1, this.field3916, this.field3920);
			this.method7023(var3.method7981(), var3.method7981());
			this.method6825();
			this.method6856();
		}

		return true;
	}

	@ObfInfo(name = "aw", desc = "(I)V", opaque = "-868727591")
	public void method6771() {
		if (!this.method6998() && this.field3916 > 0) {
			int var2 = this.field3907.method8190(this.field3916 - 1);
			this.method6856();
			this.method7023(var2, var2);
		}

	}

	@ObfInfo(name = "ad", desc = "(I)V", opaque = "968764110")
	public void method6772() {
		if (!this.method6998() && this.field3916 < this.field3907.method8175()) {
			int var2 = this.field3907.method8190(this.field3916);
			this.method6856();
			this.method7023(var2, var2);
		}

	}

	@ObfInfo(name = "ai", desc = "(I)V", opaque = "-103813122")
	public void method6910() {
		if (!this.method6998() && this.field3916 > 0) {
			Class509 var2 = this.method6793(this.field3916 - 1);
			int var3 = this.field3907.method8140((Integer)var2.field5176, this.field3916);
			this.method6856();
			this.method7023(var3, var3);
		}

	}

	@ObfInfo(name = "an", desc = "(B)V", opaque = "8")
	public void method6834() {
		if (!this.method6998() && this.field3916 < this.field3907.method8175()) {
			Class509 var2 = this.method6793(this.field3916);
			int var3 = this.field3907.method8140(this.field3916, (Integer)var2.field5175);
			this.method6856();
			this.method7023(var3, var3);
		}

	}

	@ObfInfo(name = "am", desc = "(I)Z")
	public boolean method6998() {
		if (!this.method6779()) {
			return false;
		} else {
			int var2 = this.field3907.method8140(this.field3917, this.field3916);
			this.method6856();
			this.method7023(var2, var2);
			return true;
		}
	}

	@ObfInfo(name = "ar", desc = "(I)V")
	public void method6932() {
		this.method7023(0, this.field3907.method8175());
	}

	@ObfInfo(name = "ag", desc = "(III)Z", opaque = "1515618731")
	public boolean method7023(int var1, int var2) {
		if (!this.method6809()) {
			this.field3917 = var1;
			this.field3916 = var2;
			return false;
		} else {
			if (var1 > this.field3907.method8175()) {
				var1 = this.field3907.method8175();
			}

			if (var2 > this.field3907.method8175()) {
				var2 = this.field3907.method8175();
			}

			boolean var4 = this.field3917 != var1 || this.field3916 != var2;
			this.field3917 = var1;
			if (var2 != this.field3916) {
				this.field3916 = var2;
				this.field3911 = 0;
				this.method6828();
			}

			if (var4 && this.field3927 != null) {
				this.field3927.method2874();
			}

			return var4;
		}
	}

	@ObfInfo(name = "bs", desc = "(ZI)V")
	public void method6840(boolean var1) {
		Class509 var3 = this.method6885(this.field3916);
		this.method6762((Integer)var3.field5176, var1);
	}

	@ObfInfo(name = "bf", desc = "(ZB)V")
	public void method6818(boolean var1) {
		Class509 var3 = this.method6885(this.field3916);
		this.method6762((Integer)var3.field5175, var1);
	}

	@ObfInfo(name = "bo", desc = "(ZI)V")
	public void method6780(boolean var1) {
		this.method6762(0, var1);
	}

	@ObfInfo(name = "bi", desc = "(ZI)V")
	public void method6781(boolean var1) {
		this.method6762(this.field3907.method8175(), var1);
	}

	@ObfInfo(name = "bt", desc = "(ZI)V", opaque = "-173676435")
	public void method6782(boolean var1) {
		if (this.method6779() && !var1) {
			this.method6762(Math.min(this.field3917, this.field3916), var1);
		} else if (this.field3916 > 0) {
			this.method6762(this.field3916 - 1, var1);
		}

	}

	@ObfInfo(name = "bn", desc = "(ZI)V", opaque = "1962081623")
	public void method6760(boolean var1) {
		if (this.method6779() && !var1) {
			this.method6762(Math.max(this.field3917, this.field3916), var1);
		} else if (this.field3916 < this.field3907.method8175()) {
			this.method6762(1 + this.field3916, var1);
		}

	}

	@ObfInfo(name = "bw", desc = "(ZI)V")
	public void method6784(boolean var1) {
		if (this.field3916 > 0) {
			Class509 var3 = this.method6793(this.field3916 - 1);
			this.method6762((Integer)var3.field5176, var1);
		}

	}

	@ObfInfo(name = "bl", desc = "(ZI)V", opaque = "-1106851119")
	public void method6785(boolean var1) {
		if (this.field3916 < this.field3907.method8175()) {
			Class509 var3 = this.method6793(this.field3916 + 1);
			this.method6762((Integer)var3.field5175, var1);
		}

	}

	@ObfInfo(name = "be", desc = "(ZB)V", opaque = "0")
	public void method6946(boolean var1) {
		if (this.field3916 > 0) {
			this.method6762(this.field3907.method8142(this.field3916, -1), var1);
		}

	}

	@ObfInfo(name = "bg", desc = "(ZI)V", opaque = "-304973003")
	public void method6787(boolean var1) {
		if (this.field3916 < this.field3907.method8175()) {
			this.method6762(this.field3907.method8142(this.field3916, 1), var1);
		}

	}

	@ObfInfo(name = "bu", desc = "(ZB)V", opaque = "9")
	public void method6788(boolean var1) {
		if (this.field3916 > 0) {
			int var3 = this.method6975();
			this.method6762(this.field3907.method8142(this.field3916, -var3), var1);
		}

	}

	@ObfInfo(name = "bh", desc = "(ZB)V", opaque = "9")
	public void method6789(boolean var1) {
		if (this.field3916 < this.field3907.method8175()) {
			int var3 = this.method6975();
			this.method6762(this.field3907.method8142(this.field3916, var3), var1);
		}

	}

	@ObfInfo(name = "bk", desc = "(ZI)V")
	public void method6967(boolean var1) {
		Class438 var3 = this.field3907.method8133(0, this.field3916);
		Class509 var4 = var3.method8105();
		this.method6762(this.field3907.method8141((Integer)var4.field5176, this.field3925), var1);
	}

	@ObfInfo(name = "bp", desc = "(ZI)V")
	public void method6791(boolean var1) {
		Class438 var3 = this.field3907.method8133(0, this.field3916);
		Class509 var4 = var3.method8105();
		this.method6762(this.field3907.method8141((Integer)var4.field5176, this.field3925 + this.field3902), var1);
	}

	@ObfInfo(name = "br", desc = "(IIZZB)V", opaque = "3")
	public void method6804(int var1, int var2, boolean var3, boolean var4) {
		boolean var6 = false;
		Class509 var7;
		int var9;
		if (!this.field3921) {
			var9 = 0;
		} else {
			var1 += this.field3923;
			var2 += this.field3925;
			var7 = this.method6961();
			var9 = this.field3907.method8141(var1 - (Integer)var7.field5176, var2 - (Integer)var7.field5175);
		}

		if (var3 && var4) {
			this.field3909 = 1;
			var7 = this.method6793(var9);
			Class509 var8 = this.method6793(this.field3901);
			this.method6993(var8, var7);
		} else if (var3) {
			this.field3909 = 1;
			var7 = this.method6793(var9);
			this.method7023((Integer)var7.field5176, (Integer)var7.field5175);
			this.field3901 = (Integer)var7.field5176;
		} else if (var4) {
			this.method7023(this.field3901, var9);
		} else {
			if (this.field3924 > 0 && this.field3901 == var9) {
				if (this.field3917 == this.field3916) {
					this.field3909 = 1;
					var7 = this.method6793(var9);
					this.method7023((Integer)var7.field5176, (Integer)var7.field5175);
				} else {
					this.field3909 = 2;
					var7 = this.method6885(var9);
					this.method7023((Integer)var7.field5176, (Integer)var7.field5175);
				}
			} else {
				this.field3909 = 0;
				this.method7023(var9, var9);
				this.field3901 = var9;
			}

			this.field3924 = 25;
		}

	}

	@ObfInfo(name = "bx", desc = "(IIB)V", opaque = "52")
	public void method6839(int var1, int var2) {
		if (this.field3921 && this.method6929()) {
			var1 += this.field3923;
			var2 += this.field3925;
			Class509 var4 = this.method6961();
			int var5 = this.field3907.method8141(var1 - (Integer)var4.field5176, var2 - (Integer)var4.field5175);
			Class509 var6;
			Class509 var7;
			switch(this.field3909) {
			case 0:
				this.method7023(this.field3917, var5);
				break;
			case 1:
				var6 = this.method6793(this.field3901);
				var7 = this.method6793(var5);
				this.method6993(var6, var7);
				break;
			case 2:
				var6 = this.method6885(this.field3901);
				var7 = this.method6885(var5);
				this.method6993(var6, var7);
			}
		}

	}

	@ObfInfo(name = "bd", desc = "(Ljava/awt/datatransfer/Clipboard;B)V", opaque = "0")
	public void method6794(Clipboard var1) {
		Class438 var3 = this.field3907.method8133(this.field3917, this.field3916);
		if (!var3.method8101()) {
			String var4 = var3.method8113();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
			}
		}

	}

	@ObfInfo(name = "bv", desc = "(Ljava/awt/datatransfer/Clipboard;B)V", opaque = "0")
	public void method6820(Clipboard var1) {
		if (this.method6779()) {
			this.method6794(var1);
			this.method6998();
		}

	}

	@ObfInfo(name = "bm", desc = "(Ljava/awt/datatransfer/Clipboard;I)V", opaque = "-660637347")
	public void method6796(Clipboard var1) {
		Transferable var3 = var1.getContents((Object)null);
		if (var3 != null && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = this.method6777((String)var3.getTransferData(DataFlavor.stringFlavor));
				this.method6998();
				Class435 var5 = this.field3907.method8135(var4, this.field3916, this.field3920);
				this.method7023(var5.method7981(), var5.method7981());
				this.method6825();
				this.method6856();
			} catch (Exception var6) {
			}
		}

	}

	@ObfInfo(name = "bq", desc = "(B)V")
	public void method6797() {
		this.field3925 = Math.max(0, this.field3925 - this.field3907.method8145());
	}

	@ObfInfo(name = "bj", desc = "(I)V")
	public void method6798() {
		int var2 = Math.max(0, this.field3907.method8200() - this.field3902);
		this.field3925 = Math.min(var2, this.field3925 + this.field3907.method8145());
	}

	@ObfInfo(name = "bc", desc = "(Lnl;I)V")
	public void method6799(Class350 var1) {
		this.field3926 = var1;
	}

	@ObfInfo(name = "bz", desc = "(Lnl;B)V")
	public void method6800(Class350 var1) {
		this.field3927 = var1;
	}

	@ObfInfo(name = "ba", desc = "(B)Lqw;")
	public Class439 method6801() {
		return this.field3907;
	}

	@ObfInfo(name = "bb", desc = "(I)Lqw;")
	public Class439 method6802() {
		return this.field3908;
	}

	@ObfInfo(name = "by", desc = "(B)Lqv;")
	public Class438 method6803() {
		return this.field3907.method8133(this.field3917, this.field3916);
	}

	@ObfInfo(name = "cw", desc = "(I)Z")
	public boolean method6929() {
		return this.field3919;
	}

	@ObfInfo(name = "ck", desc = "(B)Z")
	public boolean method6867() {
		return this.field3910;
	}

	@ObfInfo(name = "cn", desc = "(S)Z", opaque = "237")
	public boolean method6806() {
		return this.method6929() && this.field3911 % 60 < 30;
	}

	@ObfInfo(name = "ch", desc = "(I)I")
	public int method6807() {
		return this.field3916;
	}

	@ObfInfo(name = "cp", desc = "(B)I")
	public int method6958() {
		return this.field3917;
	}

	@ObfInfo(name = "cd", desc = "(I)Z")
	public boolean method6809() {
		return this.field3921;
	}

	@ObfInfo(name = "cs", desc = "(I)I")
	public int method6808() {
		return this.field3923;
	}

	@ObfInfo(name = "cm", desc = "(I)I")
	public int method6833() {
		return this.field3925;
	}

	@ObfInfo(name = "ci", desc = "(S)I")
	public int method6812() {
		return this.field3907.method8148();
	}

	@ObfInfo(name = "cc", desc = "(B)I")
	public int method6813() {
		return this.field3907.method8149();
	}

	@ObfInfo(name = "cb", desc = "(B)I")
	public int method6814() {
		return this.field3918;
	}

	@ObfInfo(name = "cr", desc = "(I)I")
	public int method6815() {
		return this.field3914;
	}

	@ObfInfo(name = "co", desc = "(I)I")
	public int method6816() {
		return this.field3907.method8132();
	}

	@ObfInfo(name = "cf", desc = "(I)I")
	public int method6817() {
		return this.field3915;
	}

	@ObfInfo(name = "ce", desc = "(I)I")
	public int method6934() {
		return this.field3907.method8151();
	}

	@ObfInfo(name = "cz", desc = "(S)Z", opaque = "301")
	public boolean method6819() {
		return this.method6813() > 1;
	}

	@ObfInfo(name = "ca", desc = "(I)Z", opaque = "974330790")
	public boolean method6779() {
		return this.field3917 != this.field3916;
	}

	@ObfInfo(name = "cl", desc = "(Ljava/lang/String;I)Ljava/lang/String;", opaque = "1986224271")
	public String method6777(String var1) {
		StringBuilder var3 = new StringBuilder(var1.length());

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			char var5 = var1.charAt(var4);
			if (this.method6831(var5)) {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	@ObfInfo(name = "cq", desc = "(Lto;Lto;I)V", opaque = "-1742791259")
	public void method6993(Class509 var1, Class509 var2) {
		if ((Integer)var2.field5176 < (Integer)var1.field5176) {
			this.method7023((Integer)var1.field5175, (Integer)var2.field5176);
		} else {
			this.method7023((Integer)var1.field5176, (Integer)var2.field5175);
		}

	}

	@ObfInfo(name = "cy", desc = "(IB)Lto;", opaque = "13")
	public Class509 method6793(int var1) {
		int var3 = this.field3907.method8175();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.method6989(this.field3907.method8120(var6 - 1).field4708)) {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.method6989(this.field3907.method8120(var6).field4708)) {
				var5 = var6;
				break;
			}
		}

		return new Class509(var4, var5);
	}

	@ObfInfo(name = "ct", desc = "(II)Lto;", opaque = "1696193564")
	public Class509 method6885(int var1) {
		int var3 = this.field3907.method8175();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.field3907.method8120(var6 - 1).field4708 == '\n') {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.field3907.method8120(var6).field4708 == '\n') {
				var5 = var6;
				break;
			}
		}

		return new Class509(var4, var5);
	}

	@ObfInfo(name = "cg", desc = "(I)Z", opaque = "25215159")
	public boolean method6825() {
		if (!this.method6809()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.field3907.method8175() > this.field3918) {
				this.field3907.method8140(this.field3918, this.field3907.method8175());
				var2 = true;
			}

			int var3 = this.method6813();
			int var4;
			if (this.field3907.method8160() > var3) {
				var4 = this.field3907.method8142(0, var3) - 1;
				this.field3907.method8140(var4, this.field3907.method8175());
				var2 = true;
			}

			if (var2) {
				var4 = this.field3916;
				int var5 = this.field3917;
				int var6 = this.field3907.method8175();
				if (this.field3916 > var6) {
					var4 = var6;
				}

				if (this.field3917 > var6) {
					var5 = var6;
				}

				this.method7023(var5, var4);
			}

			return var2;
		}
	}

	@ObfInfo(name = "cv", desc = "(IZB)V", opaque = "1")
	public void method6762(int var1, boolean var2) {
		if (var2) {
			this.method7023(this.field3917, var1);
		} else {
			this.method7023(var1, var1);
		}

	}

	@ObfInfo(name = "cj", desc = "(B)I")
	public int method6975() {
		return this.field3902 / this.field3907.method8145();
	}

	@ObfInfo(name = "cu", desc = "(I)V", opaque = "1995706413")
	public void method6828() {
		Class438 var2 = this.field3907.method8133(0, this.field3916);
		Class509 var3 = var2.method8105();
		int var4 = this.field3907.method8145();
		int var5 = (Integer)var3.field5176 - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.field5175 - 3;
		int var8 = var7 + 6 + var4;
		int var9 = this.field3923;
		int var10 = this.field3922 + var9;
		int var11 = this.field3925;
		int var12 = var11 + this.field3902;
		int var13 = this.field3923;
		int var14 = this.field3925;
		if (var5 < var9) {
			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.field3922;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.field3902;
		}

		this.method6985(var13, var14);
	}

	@ObfInfo(name = "cx", desc = "(IB)Z", opaque = "2")
	public boolean method6989(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfInfo(name = "dj", desc = "(I)V", opaque = "-1450055512")
	public void method6856() {
		if (this.field3926 != null) {
			this.field3926.method2874();
		}

	}

	@ObfInfo(name = "dq", desc = "(II)Z", opaque = "-2115689482")
	public boolean method6831(int var1) {
		switch(this.field3915) {
		case 1:
			return Class412.method2605((char)var1);
		case 2:
			return Class328.method6267((char)var1);
		case 3:
			return Class412.method293((char)var1);
		case 4:
			char var3 = (char)var1;
			if (Class412.method293(var3)) {
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

	@ObfInfo(name = "dm", desc = "(B)Lto;")
	public Class509 method6961() {
		int var2 = this.field3907.method8152(this.field3922);
		int var3 = this.field3907.method8153(this.field3902);
		return new Class509(var2, var3);
	}
}
