import io.runebox.ObfInfo;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfInfo(name = "ba")
public final class Class27 extends Class570 {
	@ObfInfo(name = "aq", desc = "Ljava/awt/Component;")
	public Component field121;
	@ObfInfo(name = "ad", desc = "Ljava/awt/Image;")
	public Image field120;

	public Class27(int var1, int var2, Component var3, boolean var4) {
		super.field5513 = var1;
		super.field5512 = var2;
		super.field5511 = new int[var2 * var1 + 1];
		if (var4) {
			super.field5510 = new float[var2 * var1 + 1];
		}

		DataBufferInt var5 = new DataBufferInt(super.field5511, super.field5511.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field5513, super.field5512), var5, (Point)null);
		this.field120 = new BufferedImage(var6, var7, false, new Hashtable());
		this.method390(var3);
		this.method10205();
	}

	@ObfInfo(name = "aq", desc = "(Ljava/awt/Component;I)V")
	public final void method390(Component var1) {
		this.field121 = var1;
	}

	@ObfInfo(name = "ad", desc = "(III)V")
	public final void method391(int var1, int var2) {
		this.method393(this.field121.getGraphics(), var1, var2);
	}

	@ObfInfo(name = "ag", desc = "(IIIII)V")
	public final void method389(int var1, int var2, int var3, int var4) {
		this.method397(this.field121.getGraphics(), var1, var2, var3, var4);
	}

	@ObfInfo(name = "ak", desc = "(Ljava/awt/Graphics;III)V")
	public final void method393(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field120, var2, var3, this.field121);
		} catch (Exception var6) {
			this.field121.repaint();
		}

	}

	@ObfInfo(name = "ap", desc = "(Ljava/awt/Graphics;IIIII)V")
	public final void method397(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var7 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.field120, 0, 0, this.field121);
			var1.setClip(var7);
		} catch (Exception var8) {
			this.field121.repaint();
		}

	}
}
