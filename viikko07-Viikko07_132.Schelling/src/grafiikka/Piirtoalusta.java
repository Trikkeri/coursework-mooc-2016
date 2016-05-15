package grafiikka;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Piirtoalusta extends JPanel {

    private Color[] colors;
    private int[][] data;

    public Piirtoalusta() {
        this.colors = new Color[]{Color.WHITE, Color.RED, Color.BLUE, Color.GREEN};
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (this.data == null) {
            return;
        }

        Dimension dim = getSize();

        for (int y = 0; y < data.length; y++) {
            int kork = dim.height / data.length;

            for (int x = 0; x < data[y].length; x++) {
                int lev = dim.width / data[y].length;

                g.setColor(this.colors[data[y][x]]);
                g.fillRect(x * lev, y * kork, lev, kork);
            }
        }
    }
}
