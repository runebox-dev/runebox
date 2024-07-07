import io.runebox.ObfInfo;
import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

@ObfInfo(name = "bs")
public abstract class Class45 extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfInfo(name = "bh", desc = "Lar;")
	public static Class18 field275;
	@ObfInfo(owner = "fu", name = "ae", desc = "Lix;")
	public static Class232 field1704;
	@ObfInfo(name = "ad", desc = "Lbs;")
	public static Class45 field250;
	@ObfInfo(name = "ap", desc = "Z")
	public static boolean field248;
	@ObfInfo(owner = "gs", name = "aj", desc = "I", intMultiplier = -1095420729)
	public static int field1878;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 952788633)
	public static int field245;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -843017577)
	public static int field252;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -346913947)
	public static int field254;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -1606866427)
	public static int field263;
	@ObfInfo(name = "bs", desc = "I", intMultiplier = 1670919295)
	public static int field269;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1301322249)
	public static int field277;
	@ObfInfo(owner = "mw", name = "ac", desc = "I", intMultiplier = 440453039)
	public static int field3656;
	@ObfInfo(owner = "dy", name = "be", desc = "Ljava/awt/Font;")
	public static Font field1331;
	@ObfInfo(name = "bm", desc = "Ljava/awt/FontMetrics;")
	public static FontMetrics field265;
	@ObfInfo(owner = "gt", name = "bg", desc = "Ljava/awt/Image;")
	public static Image field1884;
	@ObfInfo(owner = "ua", name = "bq", desc = "Ljava/lang/management/GarbageCollectorMXBean;")
	public static GarbageCollectorMXBean field5238;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = 7888700868123221241L)
	public static long field244;
	@ObfInfo(name = "bd", desc = "J", longMultiplier = -6613666108012219409L)
	public static long field278;
	@ObfInfo(name = "bz", desc = "J", longMultiplier = 5693631408863609669L)
	public static long field279;
	@ObfInfo(name = "ah", desc = "[J")
	public static long[] field253;
	@ObfInfo(name = "ax", desc = "[J")
	public static long[] field255;
	@ObfInfo(name = "bb", desc = "Z")
	public static volatile boolean field276;
	@ObfInfo(name = "bl", desc = "Law;")
	public Class23 field247;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field261;
	@ObfInfo(name = "bj", desc = "Z")
	public boolean field264;
	@ObfInfo(name = "bp", desc = "Z")
	public boolean field270;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 1556082277)
	public int field251;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -484823375)
	public int field256;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 804948849)
	public int field257;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = 1466302067)
	public int field258;
	@ObfInfo(name = "as", desc = "I", intMultiplier = 964979307)
	public int field259;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1732148147)
	public int field260;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 131784241)
	public int field262;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 373494117)
	public int field273;
	@ObfInfo(name = "bi", desc = "Ljava/awt/Canvas;")
	public Canvas field267;
	@ObfInfo(name = "bo", desc = "Ljava/awt/Frame;")
	public Frame field266;
	@ObfInfo(name = "bc", desc = "Ljava/awt/datatransfer/Clipboard;")
	public Clipboard field274;
	@ObfInfo(name = "bv", desc = "Ljava/awt/EventQueue;")
	public final EventQueue field246;
	@ObfInfo(name = "ba", desc = "Z")
	public volatile boolean field268;
	@ObfInfo(name = "bx", desc = "Z")
	public volatile boolean field271;
	@ObfInfo(name = "bu", desc = "J", longMultiplier = 3441533685991574943L)
	public volatile long field272;

	static {
		field250 = null;
		field263 = 0;
		field244 = 0L;
		field248 = false;
		field254 = 20;
		field277 = 1;
		field252 = 0;
		field253 = new long[32];
		field255 = new long[32];
		field269 = 500;
		field276 = true;
		field275 = new Class18();
		field278 = -1L;
		field279 = -1L;
	}

	public Class45() {
		this.field261 = false;
		this.field257 = 0;
		this.field259 = 0;
		this.field264 = false;
		this.field268 = true;
		this.field270 = false;
		this.field271 = false;
		this.field272 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.field246 = var1;
		Class20 var2 = new Class20();
		Client.field479 = var2;
	}

	public abstract void init();

	@ObfInfo(name = "bw", desc = "(B)V")
	public abstract void method626();

	@ObfInfo(name = "ao", desc = "(I)V")
	public abstract void method638();

	@ObfInfo(name = "by", desc = "(I)V")
	public abstract void method653();

	@ObfInfo(name = "bl", desc = "(ZI)V")
	public abstract void method655(boolean var1);

	@ObfInfo(name = "bk", desc = "(I)V")
	public abstract void method663();

	@ObfInfo(name = "bc", desc = "(I)V")
	public abstract void method691();

	@ObfInfo(name = "aj", desc = "(III)V", opaque = "2094475893")
	public final void method627(int var1, int var2) {
		if (this.field262 != var1 || var2 != this.field258) {
			this.method650();
		}

		this.field262 = var1;
		this.field258 = var2;
	}

	@ObfInfo(name = "av", desc = "(Ljava/lang/Object;B)V", opaque = "-1")
	public final void method628(Object var1) {
		if (this.field246 != null) {
			for (int var3 = 0; var3 < 50 && this.field246.peekEvent() != null; ++var3) {
				Class336.method3895(1L);
			}

			if (var1 != null) {
				this.field246.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfInfo(name = "ab", desc = "(B)Liv;", opaque = "1")
	public Class230 method678() {
		if (this.field247 == null) {
			this.field247 = new Class23();
			this.field247.method307(this.field267);
		}

		return this.field247;
	}

	@ObfInfo(name = "ai", desc = "(B)V")
	public void method630() {
		this.field274 = this.getToolkit().getSystemClipboard();
	}

	@ObfInfo(name = "ae", desc = "(Ljava/lang/String;I)V")
	public void method698(String var1) {
		this.field274.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfInfo(name = "au", desc = "(B)Ljava/awt/datatransfer/Clipboard;")
	public Clipboard method632() {
		return this.field274;
	}

	@ObfInfo(name = "ah", desc = "(I)V", opaque = "1953437785")
	public final void method633() {
		if (Class552.field2386.toLowerCase().indexOf("microsoft") != -1) {
			Class31.field155[186] = 57;
			Class31.field155[187] = 27;
			Class31.field155[188] = 71;
			Class31.field155[189] = 26;
			Class31.field155[190] = 72;
			Class31.field155[191] = 73;
			Class31.field155[192] = 58;
			Class31.field155[219] = 42;
			Class31.field155[220] = 74;
			Class31.field155[221] = 43;
			Class31.field155[222] = 59;
			Class31.field155[223] = 28;
		} else {
			Class31.field155[44] = 71;
			Class31.field155[45] = 26;
			Class31.field155[46] = 72;
			Class31.field155[47] = 73;
			Class31.field155[59] = 57;
			Class31.field155[61] = 27;
			Class31.field155[91] = 42;
			Class31.field155[92] = 74;
			Class31.field155[93] = 43;
			Class31.field155[192] = 28;
			Class31.field155[222] = 58;
			Class31.field155[520] = 59;
		}

		field275.method252(this.field267);
	}

	@ObfInfo(name = "ax", desc = "(I)V")
	public final void method634() {
		field275.method262();
	}

	@ObfInfo(name = "ac", desc = "(Lbm;II)V")
	public void method635(Class39 var1, int var2) {
		field275.method228(var1, var2);
	}

	@ObfInfo(name = "al", desc = "(B)V")
	public final void method636() {
		Class42.method8063(this.field267);
	}

	@ObfInfo(name = "ay", desc = "(B)V", opaque = "8")
	public final void method674() {
		Container var2 = this.method660();
		if (var2 != null) {
			Class417 var3 = this.method661();
			this.field256 = Math.max(var3.field4677, this.field260);
			this.field273 = Math.max(var3.field4680, this.field251);
			if (this.field256 <= 0) {
				this.field256 = 1;
			}

			if (this.field273 <= 0) {
				this.field273 = 1;
			}

			Client.field954 = Math.min(this.field256, this.field262);
			Client.field15 = Math.min(this.field273, this.field258);
			this.field257 = (this.field256 - Client.field954) / 2;
			this.field259 = 0;
			this.field267.setSize(Client.field954, Client.field15);
			Client.field4695 = new Class27(Client.field954, Client.field15, this.field267, this.field264);
			if (this.field266 == var2) {
				Insets var4 = this.field266.getInsets();
				this.field267.setLocation(this.field257 + var4.left, this.field259 + var4.top);
			} else {
				this.field267.setLocation(this.field257, this.field259);
			}

			this.field268 = true;
			this.method638();
		}
	}

	@ObfInfo(name = "aa", desc = "(I)V", opaque = "-2071720493")
	public void method639() {
		int var2 = this.field257;
		int var3 = this.field259;
		int var4 = this.field256 - Client.field954 - var2;
		int var5 = this.field273 - Client.field15 - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.method660();
				int var7 = 0;
				int var8 = 0;
				if (this.field266 == var6) {
					Insets var9 = this.field266.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}

				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.field273);
				}

				if (var3 > 0) {
					var11.fillRect(var7, var8, this.field256, var3);
				}

				if (var4 > 0) {
					var11.fillRect(this.field256 + var7 - var4, var8, var4, this.field273);
				}

				if (var5 > 0) {
					var11.fillRect(var7, this.field273 + var8 - var5, this.field256, var5);
				}
			} catch (Exception var10) {
			}
		}

	}

	@ObfInfo(name = "as", desc = "(I)V", opaque = "1836836485")
	public final void method640() {
		field275.method231(this.field267);
		Class42.method432(this.field267);
		if (this.field247 != null) {
			this.field247.method308(this.field267);
		}

		this.method642();
		field275.method252(this.field267);
		Class42.method8063(this.field267);
		if (this.field247 != null) {
			this.field247.method307(this.field267);
		}

		this.method650();
	}

	@ObfInfo(name = "aw", desc = "(IIIIB)V", opaque = "3")
	public final void method641(int var1, int var2, int var3, int var4) {
		try {
			if (field250 != null) {
				++field263;
				if (field263 >= 3) {
					this.method773("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			field250 = this;
			Client.field954 = var1;
			Client.field15 = var2;
			Class552.field75 = var3;
			Class552.field5416 = var4;
			Class552.field4736 = this;
			if (Client.field249 == null) {
				Client.field249 = new Class219();
			}

			Client.field249.method4229(this, 1);
		} catch (Exception var7) {
			Class552.method8390((String)null, var7);
			this.method773("crash");
		}

	}

	@ObfInfo(name = "at", desc = "(B)V", opaque = "1")
	public final synchronized void method642() {
		Container var2 = this.method660();
		if (this.field267 != null) {
			this.field267.removeFocusListener(this);
			var2.remove(this.field267);
		}

		Client.field954 = Math.max(var2.getWidth(), this.field260);
		Client.field15 = Math.max(var2.getHeight(), this.field251);
		Insets var3;
		if (this.field266 != null) {
			var3 = this.field266.getInsets();
			Client.field954 -= var3.left + var3.right;
			Client.field15 -= var3.top + var3.bottom;
		}

		this.field267 = new Class6(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout((LayoutManager)null);
		var2.add(this.field267);
		this.field267.setSize(Client.field954, Client.field15);
		this.field267.setVisible(true);
		this.field267.setBackground(Color.BLACK);
		if (this.field266 == var2) {
			var3 = this.field266.getInsets();
			this.field267.setLocation(var3.left + this.field257, var3.top + this.field259);
		} else {
			this.field267.setLocation(this.field257, this.field259);
		}

		this.field267.addFocusListener(this);
		this.field267.requestFocus();
		this.field268 = true;
		if (Client.field4695 != null && Client.field954 == Client.field4695.field5513 && Client.field15 == Client.field4695.field5512) {
			((Class27)Client.field4695).method390(this.field267);
			Client.field4695.method391(0, 0);
		} else {
			Client.field4695 = new Class27(Client.field954, Client.field15, this.field267, this.field264);
		}

		this.field271 = false;
		this.field272 = Class329.method4953();
	}

	@ObfInfo(name = "af", desc = "(ZI)V", opaque = "298982067")
	public void method643(boolean var1) {
		if (this.field264 != var1) {
			this.field264 = var1;
			Client.field4695.method10207(var1);
			Client.field4695.method10205();
		}

	}

	@ObfInfo(name = "am", desc = "(B)Z", opaque = "1")
	public final boolean method644() {
		String var2 = this.getDocumentBase().getHost().toLowerCase();
		if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
			if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
				if (var2.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
						var2 = var2.substring(0, var2.length() - 1);
					}

					if (var2.endsWith("192.168.1.")) {
						return true;
					} else {
						this.method773("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public void run() {
		try {
			if (Class552.field2386 != null) {
				String var1 = Class552.field2386.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = Class552.field2389;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method773("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && Class413.method5044(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (Class86.method2366(var4) && Class413.method7482(var4) < 10) {
							this.method773("wrongjava");
							return;
						}
					}

					field277 = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.method642();
			this.method653();
			field1704 = Class232.method7395();

			while (field244 == 0L || Class329.method4953() < field244) {
				field1878 = field1704.method4048(field254, field277);

				for (int var6 = 0; var6 < field1878; ++var6) {
					this.method646();
				}

				this.method648();
				this.method628(this.field267);
			}
		} catch (Exception var5) {
			Class552.method8390((String)null, var5);
			this.method773("crash");
		}

		this.method665();
	}

	@ObfInfo(name = "ar", desc = "(I)V", opaque = "-74295398")
	public void method646() {
		long var2 = Class329.method4953();
		long var4 = field255[field3656];
		field255[field3656] = var2;
		field3656 = 1 + field3656 & 31;
		if (0L != var4 && var2 > var4) {
		}

		synchronized(this) {
			Client.field5071 = field276;
		}

		this.method626();
	}

	@ObfInfo(name = "bt", desc = "(I)V")
	public final void method647() {
		this.field268 = true;
	}

	@ObfInfo(name = "bj", desc = "(I)V", opaque = "205128515")
	public void method648() {
		Container var2 = this.method660();
		long var3 = Class329.method4953();
		long var5 = field253[field245];
		field253[field245] = var3;
		field245 = 1 + field245 & 31;
		if (0L != var5 && var3 > var5) {
			int var7 = (int)(var3 - var5);
			field252 = (32000 + (var7 >> 1)) / var7;
		}

		if (++field269 - 1 > 50) {
			field269 -= 50;
			this.field268 = true;
			this.field267.setSize(Client.field954, Client.field15);
			this.field267.setVisible(true);
			if (this.field266 == var2) {
				Insets var8 = this.field266.getInsets();
				this.field267.setLocation(var8.left + this.field257, var8.top + this.field259);
			} else {
				this.field267.setLocation(this.field257, this.field259);
			}
		}

		if (this.field271) {
			this.method640();
		}

		this.method649();
		this.method655(this.field268);
		if (this.field268) {
			this.method639();
		}

		this.field268 = false;
	}

	@ObfInfo(name = "bs", desc = "(I)V", opaque = "929999033")
	public final void method649() {
		Class417 var2 = this.method661();
		if (var2.field4677 != this.field256 || this.field273 != var2.field4680 || this.field270) {
			this.method674();
			this.field270 = false;
		}

	}

	@ObfInfo(name = "bp", desc = "(B)V")
	public final void method650() {
		this.field270 = true;
	}

	@ObfInfo(name = "bx", desc = "(B)V", opaque = "-1")
	public final synchronized void method665() {
		if (!field248) {
			field248 = true;

			try {
				this.field267.removeFocusListener(this);
			} catch (Exception var6) {
			}

			try {
				this.method691();
			} catch (Exception var5) {
			}

			if (this.field266 != null) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}

			if (Client.field249 != null) {
				try {
					Client.field249.method4233();
				} catch (Exception var3) {
				}
			}

			this.method663();
		}
	}

	public final void start() {
		if (field250 == this && !field248) {
			field244 = 0L;
		}
	}

	public final void stop() {
		if (field250 == this && !field248) {
			field244 = Class329.method4953() + 4000L;
		}
	}

	public final void destroy() {
		if (field250 == this && !field248) {
			field244 = Class329.method4953();
			Class336.method3895(5000L);
			this.method665();
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final synchronized void paint(Graphics var1) {
		if (field250 == this && !field248) {
			this.field268 = true;
			if (Class329.method4953() - this.field272 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Client.field954 && var2.height >= Client.field15) {
					this.field271 = true;
				}
			}

		}
	}

	public final void focusGained(FocusEvent var1) {
		field276 = true;
		this.field268 = true;
	}

	public final void focusLost(FocusEvent var1) {
		field276 = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	@ObfInfo(name = "bv", desc = "(ILjava/lang/String;ZZI)V", opaque = "-1252176375")
	public final void method688(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var6 = this.field267.getGraphics();
			if (field1331 == null) {
				field1331 = new Font("Helvetica", 1, 13);
				field265 = this.field267.getFontMetrics(field1331);
			}

			if (var3 && !var4) {
				var6.setColor(Color.black);
				var6.fillRect(0, 0, Client.field954, Client.field15);
			}

			Color var7 = new Color(140, 17, 17);

			try {
				if (field1884 == null) {
					field1884 = this.field267.createImage(304, 34);
				}

				Graphics var8 = field1884.getGraphics();
				var8.setColor(var7);
				var8.drawRect(0, 0, 303, 33);
				var8.fillRect(2, 2, var1 * 3, 30);
				var8.setColor(Color.black);
				var8.drawRect(1, 1, 301, 31);
				var8.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var8.setFont(field1331);
				var8.setColor(Color.white);
				var8.drawString(var2, (304 - field265.stringWidth(var2)) / 2, 22);
				var6.drawImage(field1884, Client.field954 / 2 - 152, Client.field15 / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var11) {
				int var9 = Client.field954 / 2 - 152;
				int var10 = Client.field15 / 2 - 18;
				var6.setColor(var7);
				var6.drawRect(var9, var10, 303, 33);
				var6.fillRect(var9 + 2, var10 + 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(var9 + 1, var10 + 1, 301, 31);
				var6.fillRect(var1 * 3 + var9 + 2, var10 + 2, 300 - var1 * 3, 30);
				var6.setFont(field1331);
				var6.setColor(Color.white);
				var6.drawString(var2, var9 + (304 - field265.stringWidth(var2)) / 2, var10 + 22);
			}
		} catch (Exception var12) {
			this.field267.repaint();
		}

	}

	@ObfInfo(name = "bb", desc = "(I)V")
	public final void method737() {
		field1884 = null;
		field1331 = null;
		field265 = null;
	}

	@ObfInfo(name = "bn", desc = "(Ljava/lang/String;B)V", opaque = "-1")
	public void method773(String var1) {
		if (!this.field261) {
			this.field261 = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}

		}
	}

	@ObfInfo(name = "bh", desc = "(I)Ljava/awt/Container;")
	public Container method660() {
		return (Container)(this.field266 != null ? this.field266 : this);
	}

	@ObfInfo(name = "bq", desc = "(I)Lqa;", opaque = "2021932269")
	public Class417 method661() {
		Container var2 = this.method660();
		int var3 = Math.max(var2.getWidth(), this.field260);
		int var4 = Math.max(var2.getHeight(), this.field251);
		if (this.field266 != null) {
			Insets var5 = this.field266.getInsets();
			var3 -= var5.left + var5.right;
			var4 -= var5.top + var5.bottom;
		}

		return new Class417(var3, var4);
	}

	@ObfInfo(name = "bd", desc = "(I)Z", opaque = "399287109")
	public final boolean method629() {
		return this.field266 != null;
	}

	@ObfInfo(owner = "cz", name = "az", desc = "(I)I")
	public static int method2227() {
		return field275.method229();
	}

	@ObfInfo(owner = "sx", name = "bu", desc = "(I)V", opaque = "109380096")
	public static void method8829() {
		field1704.method4046();

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			field253[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; ++var1) {
			field255[var1] = 0L;
		}

		field1878 = 0;
	}

	@ObfInfo(owner = "hw", name = "bz", desc = "(I)I", opaque = "-1575001716")
	public static int method4006() {
		int var1 = 0;
		if (field5238 == null || !field5238.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						field5238 = var3;
						field279 = -1L;
						field278 = -1L;
					}
				}
			} catch (Throwable var10) {
			}
		}

		if (field5238 != null) {
			long var11 = Class329.method4953();
			long var4 = field5238.getCollectionTime();
			if (field278 != -1L) {
				long var6 = var4 - field278;
				long var8 = var11 - field279;
				if (0L != var8) {
					var1 = (int)(var6 * 100L / var8);
				}
			}

			field278 = var4;
			field279 = var11;
		}

		return var1;
	}

	@ObfInfo(name = "au", desc = "(Lnx;II)V", opaque = "153337811")
	public static void method659(Class362 var0, int var1) {
		if (var0.field3889 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3959 == null) {
				var0.field3959 = new int[var0.field3889.length];
			}

			var0.field3959[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfInfo(name = "nn", desc = "(II)Z", opaque = "452126736")
	public static boolean method798(int var0) {
		for (int var2 = 0; var2 < Client.field767; ++var2) {
			if (var0 == Client.field618[var2]) {
				return true;
			}
		}

		return false;
	}
}
