import io.runebox.ObfInfo;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfInfo(name = "bp")
public class Class42 implements MouseListener, MouseMotionListener, FocusListener {
	@ObfInfo(name = "ak", desc = "Lbp;")
	public static Class42 field213;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 896400541)
	public static int field219;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -167698723)
	public static int field221;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1849530853)
	public static int field222;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 265354951)
	public static int field227;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1073372179)
	public static int field230;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 480166059)
	public static int field231;
	@ObfInfo(name = "ah", desc = "J", longMultiplier = -8141281389356617939L)
	public static long field211;
	@ObfInfo(name = "as", desc = "J", longMultiplier = 1298699014946310789L)
	public static long field217;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -1541374105)
	public static volatile int field214;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -578754821)
	public static volatile int field216;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -787839099)
	public static volatile int field223;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = 1568545757)
	public static volatile int field224;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 318864607)
	public static volatile int field225;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1872761615)
	public static volatile int field228;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -784218957)
	public static volatile int field229;
	@ObfInfo(name = "ab", desc = "J", longMultiplier = 3306884089864589761L)
	public static volatile long field218;
	@ObfInfo(name = "al", desc = "J", longMultiplier = 6035223071582812827L)
	public static volatile long field226;

	static {
		field213 = new Class42();
		field214 = 0;
		field228 = 0;
		field216 = -1;
		field229 = -1;
		field218 = -1L;
		field219 = 0;
		field231 = 0;
		field221 = 0;
		field211 = 0L;
		field223 = 0;
		field224 = 0;
		field225 = 0;
		field226 = 0L;
		field227 = 0;
		field230 = 0;
		field222 = 0;
		field217 = 0L;
	}

	@ObfInfo(name = "an", desc = "(Ljava/awt/event/MouseEvent;B)I", opaque = "3")
	public final int method599(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (field213 != null) {
			field214 = 0;
			field224 = var1.getX();
			field225 = var1.getY();
			field226 = Class329.method4953();
			field223 = this.method599(var1);
			if (field223 != 0) {
				field228 = field223;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (field213 != null) {
			field214 = 0;
			field228 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (field213 != null) {
			field214 = 0;
			field216 = -1;
			field229 = -1;
			field218 = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (field213 != null) {
			field214 = 0;
			field216 = var1.getX();
			field229 = var1.getY();
			field218 = var1.getWhen();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (field213 != null) {
			field228 = 0;
		}

	}

	@ObfInfo(owner = "qq", name = "aq", desc = "(Ljava/awt/Component;I)V")
	public static void method8063(Component var0) {
		var0.addMouseListener(field213);
		var0.addMouseMotionListener(field213);
		var0.addFocusListener(field213);
	}

	@ObfInfo(owner = "bd", name = "ad", desc = "(Ljava/awt/Component;B)V")
	public static void method432(Component var0) {
		var0.removeMouseListener(field213);
		var0.removeMouseMotionListener(field213);
		var0.removeFocusListener(field213);
		field228 = 0;
	}

	@ObfInfo(owner = "fy", name = "ag", desc = "(I)V")
	public static void method3327() {
		if (field213 != null) {
			synchronized(field213) {
				field213 = null;
			}
		}

	}

	@ObfInfo(owner = "fa", name = "ak", desc = "(B)V")
	public static void method3061() {
		synchronized(field213) {
			field219 = field228;
			field231 = field216;
			field221 = field229;
			field211 = field218;
			field227 = field223;
			field230 = field224;
			field222 = field225;
			field217 = field226;
			field223 = 0;
		}
	}

	@ObfInfo(owner = "ao", name = "ap", desc = "(S)I")
	public static int method207() {
		return ++field214 - 1;
	}

	@ObfInfo(name = "nl", desc = "(Lnx;III)V", opaque = "-1454606441")
	public static void method596(Class362 var0, int var1, int var2) {
		if (Client.field761 == null && !Client.field672) {
			if (var0 != null) {
				Class362 var5 = Class55.method1148(var0);
				if (var5 == null) {
					var5 = var0.field3895;
				}

				if (var5 != null) {
					Client.field761 = var0;
					var5 = Class55.method1148(var0);
					if (var5 == null) {
						var5 = var0.field3895;
					}

					Client.field710 = var5;
					Client.field653 = var1;
					Client.field725 = var2;
					Client.field5084 = 0;
					Client.field720 = false;
					int var7 = Client.field602 - 1;
					if (var7 != -1) {
						Class160.method3363(var7);
					}

					return;
				}
			}

		}
	}
}
