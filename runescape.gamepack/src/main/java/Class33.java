import io.runebox.ObfInfo;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfInfo(name = "bg")
public class Class33 implements MouseListener, MouseMotionListener, FocusListener {
	@ObfInfo(name = "az", desc = "Lbg;")
	public static Class33 field223;
	@ObfInfo(desc = "LClass382;")
	public static Class382 field2397;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -423215907)
	public static int field220;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 648460905)
	public static int field227;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 1924775019)
	public static int field229;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -808968321)
	public static int field237;
	@ObfInfo(name = "as", desc = "I", intMultiplier = -1689524785)
	public static int field238;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 836550005)
	public static int field239;
	@ObfInfo(name = "aq", desc = "J", longMultiplier = -2316088996274707615L)
	public static long field232;
	@ObfInfo(name = "ad", desc = "J", longMultiplier = 7688200359304513325L)
	public static long field240;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -23818427)
	public static volatile int field224;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1982863033)
	public static volatile int field225;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1281806781)
	public static volatile int field226;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -655854391)
	public static volatile int field233;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -2076335465)
	public static volatile int field234;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -790745065)
	public static volatile int field241;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 2076661571)
	public static volatile int field244;
	@ObfInfo(name = "ac", desc = "J", longMultiplier = -6905195731352535155L)
	public static volatile long field228;
	@ObfInfo(name = "ay", desc = "J", longMultiplier = -9146466446811248275L)
	public static volatile long field236;

	static {
		field223 = new Class33();
		field241 = 0;
		field225 = 0;
		field226 = -1;
		field233 = -1;
		field228 = -1L;
		field227 = 0;
		field229 = 0;
		field220 = 0;
		field232 = 0L;
		field224 = 0;
		field244 = 0;
		field234 = 0;
		field236 = 0L;
		field237 = 0;
		field238 = 0;
		field239 = 0;
		field240 = 0L;
	}

	@ObfInfo(name = "af", desc = "(Ljava/awt/event/MouseEvent;I)I", opaque = "1843712670")
	public final int method678(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	@ObfInfo(desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mousePressed(MouseEvent var1) {
		if (field223 != null) {
			field241 = 0;
			field244 = var1.getX();
			field234 = var1.getY();
			field236 = Class327.method3047();
			field224 = this.method678(var1);
			if (field224 != 0) {
				field225 = field224;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseReleased(MouseEvent var1) {
		if (field223 != null) {
			field241 = 0;
			field225 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(desc = "(Ljava/awt/event/MouseEvent;)V")
	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfInfo(desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseExited(MouseEvent var1) {
		if (field223 != null) {
			field241 = 0;
			field226 = -1;
			field233 = -1;
			field228 = var1.getWhen();
		}

	}

	@ObfInfo(desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfInfo(desc = "(Ljava/awt/event/MouseEvent;)V")
	public final synchronized void mouseMoved(MouseEvent var1) {
		if (field223 != null) {
			field241 = 0;
			field226 = var1.getX();
			field233 = var1.getY();
			field228 = var1.getWhen();
		}

	}

	@ObfInfo(desc = "(Ljava/awt/event/FocusEvent;)V")
	public final void focusGained(FocusEvent var1) {
	}

	@ObfInfo(desc = "(Ljava/awt/event/FocusEvent;)V")
	public final synchronized void focusLost(FocusEvent var1) {
		if (field223 != null) {
			field225 = 0;
		}

	}

	@ObfInfo(name = "al", desc = "(II)Lit;", opaque = "1505481636")
	public static Class228 method714(int var0) {
		Class228 var2 = (Class228)Class228.field2393.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2397.method7216(14, var0);
			var2 = new Class228();
			if (var3 != null) {
				var2.method4389(new Class521(var3));
			}

			Class228.field2393.method5987(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(desc = "(Ljava/awt/Component;)V")
	public static void method4769(Component var0) {
		var0.removeMouseListener(field223);
		var0.removeMouseMotionListener(field223);
		var0.removeFocusListener(field223);
		field225 = 0;
	}

	@ObfInfo(desc = "()I")
	public static int method5159() {
		return ++field241 - 1;
	}
}
