package uhu.amc1a;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
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

public class Grafica extends JFrame {

    private final Double[][] v;

    public Grafica(Double[][] valores) {
        v = valores;
        // Create a single plot containing both the scatter and line
        XYPlot plot = new XYPlot();
        // Create the scatter data, renderer, and axis
        XYDataset setNube = createDist(2);
        XYItemRenderer renderer1 = new XYLineAndShapeRenderer(false, true);	// Shapes only
        renderer1.setSeriesShape(0, new Ellipse2D.Double(-3.0, 0.0, 3.0, 3.0));
        renderer1.setSeriesPaint(0, Color.MAGENTA);

        ValueAxis domain1 = new NumberAxis("");
        ValueAxis range1 = new NumberAxis("");
        // Set the scatter data, renderer, and axis into plot
        plot.setDataset(0, setNube);
        plot.setRenderer(0, renderer1);
        plot.setDomainAxis(0, domain1);
        plot.setRangeAxis(0, range1);
        // Map the scatter to the first Domain and first Range
        plot.mapDatasetToDomainAxis(0, 0);
        plot.mapDatasetToRangeAxis(0, 0);
        // Create the line data, renderer, and axis
        XYDataset setDist0 = createDist(3);
        XYItemRenderer renderer2 = new XYLineAndShapeRenderer(true, true);
        renderer2.setSeriesShape(0, new Rectangle2D.Double(-3.0, 0.0, 6.0, 6.0));
        renderer2.setSeriesPaint(0, Color.CYAN);
        renderer2.setSeriesStroke(0, new BasicStroke(2.0f));
        // Set the line data, renderer, and axis into plot
        plot.setDataset(1, setDist0);
        plot.setRenderer(1, renderer2);
        // Create the chart with the plot and a legend
        JFreeChart chart = new JFreeChart("", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        plot.setBackgroundPaint(Color.darkGray);

        // Create Panel  
        ChartPanel panel = new ChartPanel(chart);
        panel.setDomainZoomable(true);
        panel.setRangeZoomable(true);

        setContentPane(panel);
    }

    private XYDataset createDist(int tipo) {
        XYSeriesCollection dataset = new XYSeriesCollection();
        //ciudades 
        XYSeries series1 = new XYSeries("Ciudades");
        for (int i = 0; i < 5; i++) {
            series1.add(v[tipo][i], v[i][tipo]);
        }
        dataset.addSeries(series1);
        return dataset;
    }
}
