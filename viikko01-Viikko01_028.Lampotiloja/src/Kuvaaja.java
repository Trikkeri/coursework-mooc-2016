
import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.xy.*;
import org.jfree.data.xy.*;

/**
 * Tämä tiedosto kuuluu tehtäväpohjaan. Älä muokkaa tätä.
 */
public class Kuvaaja {

    private static Kuvaaja instance;

    private ChartFrame frame;
    private JFreeChart chart;
    private Plot plot;
    private XYDataset data;
    private XYSeries series;

    public Kuvaaja(String nimi) {
        series = new XYSeries(nimi);
        series.add(0, 0);
        data = new XYSeriesCollection(series);
        plot = new XYPlot(data, new NumberAxis("x"), new NumberAxis("y"), new SamplingXYLineRenderer());
        chart = new JFreeChart(plot);
        frame = new ChartFrame(nimi, chart);
        frame.pack();
        frame.setVisible(true);
    }

    public static Kuvaaja getInstance() {
        if (instance == null) {
            instance = new Kuvaaja("Kuvaaja");
        }
        return instance;
    }

    public static void setInstance(Kuvaaja instance) {
        Kuvaaja.instance = instance;
    }

    public static void lisaaNumero(double y) {
        getInstance().lisaaNumeroKuvaajaan(y);
    }

    public void lisaaNumeroKuvaajaan(double y) {
        double x = series.getMaxX() + 1;
        series.add(x, y);
    }
}
