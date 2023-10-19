package uhu.amc1a;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraficaExh extends JFrame {

    private final double[][] d;

    public GraficaExh(double[][] datos) {
        d = datos;
        
        //crear la grafica
        XYPlot plot2 = new XYPlot();

        //crear dmin0
        XYDataset setDist0 = createDist(0, "Exh");
        //caracteristicas de dmin0
        XYItemRenderer renderer0 = new XYLineAndShapeRenderer(true, true);
        renderer0.setSeriesShape(0, new Rectangle2D.Double(-3.0, 0.0, 6.0, 6.0));
        renderer0.setSeriesPaint(0, Color.CYAN);
        renderer0.setSeriesStroke(0, new BasicStroke(2.0f));
        //añadir dmin0 a la grafica
        plot2.setDataset(0, setDist0);
        plot2.setRenderer(0, renderer0);

        //crear y añadir los ejes
        ValueAxis domain2 = new NumberAxis("Talla");
        ValueAxis range2 = new NumberAxis("Tiempo(ms)");
        plot2.setDomainAxis(0, domain2);
        plot2.setRangeAxis(0, range2);

        //crear el area de trazado
        JFreeChart chart2 = new JFreeChart("", JFreeChart.DEFAULT_TITLE_FONT, plot2, true);
        plot2.setBackgroundPaint(Color.DARK_GRAY);

        //crear la ventana 
        ChartPanel panel2 = new ChartPanel(chart2);
        panel2.setDomainZoomable(true);
        panel2.setRangeZoomable(true);
        setContentPane(panel2);

    }

    private XYDataset createDist(int tipo, String nombre) {
        XYSeriesCollection dataset = new XYSeriesCollection();
        //distancia minima
        XYSeries series = new XYSeries(nombre);
        for (int i = 0; i < 5; i++) {
            series.add(d[i][0], d[i][tipo + 1]);
        }
        dataset.addSeries(series);
        return dataset;
    }
}


