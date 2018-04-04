package examples.com.intelligt.modbus.examples;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import java.text.SimpleDateFormat;


public class XYLineChartExample extends javax.swing.JFrame {
public XYLineChartExample() {
        super("XY Line Chart Example with JFreechart");

        JPanel chartPanel = createChartPanel();
       add(chartPanel, BorderLayout.CENTER);
       //add(chartPanel, BorderLayout.WEST);

        setSize(720 , 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static JPanel createChartPanel() {
    // creates a line chart object
    // returns the chart panel
    String chartTitle = "LXT-330 Interface";
    String xAxisLabel = "Time";
    String yAxisLabel = "pH";
 
   JDBCCategoryDataset dataset =  createDataset();
 
    JFreeChart chart;
    chart = ChartFactory.createLineChart(chartTitle, xAxisLabel, yAxisLabel, dataset, PlotOrientation.VERTICAL, false, false, true);


    return new ChartPanel(chart);

    }

    public  static JDBCCategoryDataset createDataset() {
        //Date curdate = new Date();
        
        //     SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
             Timestamp timestamp = new Timestamp(System.currentTimeMillis());
             
             int HH = timestamp.getHours();
             int MM = timestamp.getMinutes();
             int SS = timestamp.getSeconds();
            System.out.format("\nCuurent Timestamp = %s\n",timestamp);
            
            Timestamp B = timestamp;
      
            B.setMinutes(timestamp.getMinutes()-3800);
            
            
            System.out.format("\nCurr Time-1=%s\n",B);
            
            
            // System.out.format("Curr Time+5 = %d\nCurr Time-5=%d\n",tplus25,tminus25);
             
            //System.out.format("\Curr Time = %d:%d:%d\n",HH,MM,SS);
            
                        //2016-11-16 06:43:19.77
            

     String query = "select timestmp,ph1 from Reading where timestmp <= '"+timestamp+"' ";//and timestmp >= '"+B+"'" ;
     JDBCCategoryDataset dataset = null;
        try {
            dataset = new JDBCCategoryDataset(JdbcSQLiteConnection.createConnection(), query);
            
        } catch (SQLException ex) {
            Logger.getLogger(XYLineChartExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new XYLineChartExample().setVisible(true);
            }
        });
    }
    /** Creates new form XYLineChartExample */


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChartPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ChartPanelLayout = new javax.swing.GroupLayout(ChartPanel);
        ChartPanel.setLayout(ChartPanelLayout);
        ChartPanelLayout.setHorizontalGroup(
            ChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        ChartPanelLayout.setVerticalGroup(
            ChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChartPanel;
    // End of variables declaration//GEN-END:variables

}
