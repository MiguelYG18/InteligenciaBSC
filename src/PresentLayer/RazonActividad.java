/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PresentLayer;


import BussinesLayer.ActividadAñoBO;
import BussinesLayer.CuentaAñoBO;
import DataTransferObject.ActividadAño;
import DataTransferObject.CuentaAño;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author MIGUEL
 */
public class RazonActividad extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    JFreeChart grafico;
    DefaultCategoryDataset datos=new DefaultCategoryDataset();
    
    JFreeChart graficos;
    DefaultCategoryDataset dato=new DefaultCategoryDataset();
    
    public RazonActividad() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrar();
        ajustarTabla();
        IngresoActividades();
        TablaCuenta();
        CuentasporCobrar(); 
        TablaCobrar();        
    }
    public void mostrar(){
        try {
                ArrayList<ActividadAño>actividadAño= null;
                DefaultTableModel modelo = (DefaultTableModel)tablactividad.getModel();
                modelo.setRowCount(0);

                ActividadAñoBO actividadAñoBO = new ActividadAñoBO();
                actividadAño= new ArrayList<>();
                actividadAño=actividadAñoBO.RazonActividad();

               for(ActividadAño p: actividadAño){
                    Object[]registro={
                    tablactividad.getRowCount()+1    
                        ,p.getActividad().getNombre_actividad()
                        ,p.getMonto21()
                        ,p.getMonto22()    
                    };
                    modelo.addRow(registro);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);
            }           
    }
    public void CuentasporCobrar(){
        try {
                ArrayList<ActividadAño>actividadAño= null;
                DefaultTableModel modelo = (DefaultTableModel)tablaCobrar.getModel();
                modelo.setRowCount(0);

                ActividadAñoBO actividadAñoBO = new ActividadAñoBO();
                actividadAño= new ArrayList<>();
                actividadAño=actividadAñoBO.CuentasporCobrar();

               for(ActividadAño p: actividadAño){
                    Object[]registro={
                    tablaCobrar.getRowCount()+1    
                        ,p.getActividad().getNombre_actividad()
                        ,p.getMonto21()
                        ,p.getMonto22()    
                    };
                    modelo.addRow(registro);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);
            }           
    }    
    public void IngresoActividades(){
        try {
                ArrayList<CuentaAño>cuentasAño= null;
                DefaultTableModel modelo = (DefaultTableModel)tablaCuenta.getModel();
                modelo.setRowCount(0);

                CuentaAñoBO cuentaAñoBO = new CuentaAñoBO();
                cuentasAño= new ArrayList<>();
                cuentasAño=cuentaAñoBO.IngresoActividades();

               for(CuentaAño p: cuentasAño){
                    Object[]registro={
                    tablaCuenta.getRowCount()+1    
                        ,p.getCuenta().getNombre_cuenta()
                        ,p.getMonto21()
                        ,p.getMonto22()    
                    };
                    modelo.addRow(registro);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);
            }           
    }    
     void ajustarTabla() {
        TableColumnModel columnModel = tablactividad.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(25);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(80);
    }
     void TablaCuenta() {
        TableColumnModel columnModel = tablaCuenta.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(25);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(80);
    }
     void TablaCobrar() {
        TableColumnModel columnModel = tablaCobrar.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(25);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(80);
        columnModel.getColumn(3).setPreferredWidth(80);
    }      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablactividad = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtn1 = new javax.swing.JTextField();
        txtn2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtm1 = new javax.swing.JTextField();
        txtm2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtc1 = new javax.swing.JTextField();
        txtc2 = new javax.swing.JTextField();
        CalularActivdad_I = new javax.swing.JButton();
        GraficarActividad_I = new javax.swing.JButton();
        grafica21 = new javax.swing.JPanel();
        grafica22 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtr21 = new javax.swing.JTextField();
        gaugeChart1 = new chart.GaugeChart();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtr22 = new javax.swing.JTextField();
        gaugeChart2 = new chart.GaugeChart();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCobrar = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCuenta = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtn3 = new javax.swing.JTextField();
        txtn4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtm3 = new javax.swing.JTextField();
        txtm4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtc3 = new javax.swing.JTextField();
        txtc4 = new javax.swing.JTextField();
        CalcularActividad_II = new javax.swing.JButton();
        GraficarActividad_II = new javax.swing.JButton();
        grafica23 = new javax.swing.JPanel();
        grafica24 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtro21 = new javax.swing.JTextField();
        gaugeChart3 = new chart.GaugeChart();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtro22 = new javax.swing.JTextField();
        gaugeChart4 = new chart.GaugeChart();
        Title = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 255, 153));

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tablas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        tablactividad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Cuenta", "2021", "2022"
            }
        ));
        tablactividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablactividadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablactividad);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Costo de Venta");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("2021");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("2022");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtn1.setEditable(false);
        jPanel5.add(txtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 110, -1));

        txtn2.setEditable(false);
        jPanel5.add(txtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 310, 10));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Inventario");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("2021");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("2022");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtm1.setEditable(false);
        jPanel5.add(txtm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, -1));

        txtm2.setEditable(false);
        jPanel5.add(txtm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 10));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Rotación de Inventario Anual");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("2021");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("2022");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtc1.setEditable(false);
        jPanel5.add(txtc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 110, -1));

        txtc2.setEditable(false);
        jPanel5.add(txtc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, -1));

        CalularActivdad_I.setBackground(new java.awt.Color(255, 255, 255));
        CalularActivdad_I.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CalularActivdad_I.setForeground(new java.awt.Color(255, 51, 51));
        CalularActivdad_I.setText("CALCULAR");
        CalularActivdad_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalularActivdad_IActionPerformed(evt);
            }
        });
        jPanel5.add(CalularActivdad_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        GraficarActividad_I.setBackground(new java.awt.Color(255, 255, 255));
        GraficarActividad_I.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GraficarActividad_I.setForeground(new java.awt.Color(255, 51, 51));
        GraficarActividad_I.setText("GRAFICAR");
        GraficarActividad_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActividad_IActionPerformed(evt);
            }
        });
        jPanel5.add(GraficarActividad_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        grafica21.setBackground(new java.awt.Color(153, 255, 153));
        grafica21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráfica 2021", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout grafica21Layout = new javax.swing.GroupLayout(grafica21);
        grafica21.setLayout(grafica21Layout);
        grafica21Layout.setHorizontalGroup(
            grafica21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        grafica21Layout.setVerticalGroup(
            grafica21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        grafica22.setBackground(new java.awt.Color(153, 255, 153));
        grafica22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráfica 2022", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout grafica22Layout = new javax.swing.GroupLayout(grafica22);
        grafica22.setLayout(grafica22Layout);
        grafica22Layout.setHorizontalGroup(
            grafica22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        grafica22Layout.setVerticalGroup(
            grafica22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Semáforo 2021", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("DÍAS:");

        txtr21.setEditable(false);

        gaugeChart1.setColor1(new java.awt.Color(255, 51, 51));
        gaugeChart1.setColor2(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtr21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtr21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(153, 255, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Semáforo 2022", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("DÍAS:");

        txtr22.setEditable(false);

        gaugeChart2.setColor1(new java.awt.Color(255, 0, 0));
        gaugeChart2.setColor2(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(gaugeChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtr22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(gaugeChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtr22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grafica21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grafica22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(grafica21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grafica22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        jTabbedPane1.addTab("Rotación de Inventario", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jPanel9.setBackground(new java.awt.Color(153, 255, 153));

        jPanel10.setBackground(new java.awt.Color(153, 255, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tablas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        tablaCobrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Actividades", "2021", "2022"
            }
        ));
        tablaCobrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCobrarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCobrar);

        tablaCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Cuenta", "2021", "2022"
            }
        ));
        tablaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCuentaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCuenta);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(153, 255, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ingresos de Actividades Ordinarias");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("2021");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("2022");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtn3.setEditable(false);
        jPanel11.add(txtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 110, -1));

        txtn4.setEditable(false);
        jPanel11.add(txtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel11.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 310, 10));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Inventario");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("2021");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("2022");
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtm3.setEditable(false);
        jPanel11.add(txtm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, -1));

        txtm4.setEditable(false);
        jPanel11.add(txtm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel11.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 10));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Rotación de Inventario Anual");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("2021");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("2022");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtc3.setEditable(false);
        jPanel11.add(txtc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 110, -1));

        txtc4.setEditable(false);
        jPanel11.add(txtc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, -1));

        CalcularActividad_II.setBackground(new java.awt.Color(255, 255, 255));
        CalcularActividad_II.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CalcularActividad_II.setForeground(new java.awt.Color(255, 51, 51));
        CalcularActividad_II.setText("CALCULAR");
        CalcularActividad_II.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActividad_IIActionPerformed(evt);
            }
        });
        jPanel11.add(CalcularActividad_II, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        GraficarActividad_II.setBackground(new java.awt.Color(255, 255, 255));
        GraficarActividad_II.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GraficarActividad_II.setForeground(new java.awt.Color(255, 51, 51));
        GraficarActividad_II.setText("GRAFICAR");
        GraficarActividad_II.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActividad_IIActionPerformed(evt);
            }
        });
        jPanel11.add(GraficarActividad_II, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        grafica23.setBackground(new java.awt.Color(153, 255, 153));
        grafica23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráfica 2021", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout grafica23Layout = new javax.swing.GroupLayout(grafica23);
        grafica23.setLayout(grafica23Layout);
        grafica23Layout.setHorizontalGroup(
            grafica23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        grafica23Layout.setVerticalGroup(
            grafica23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        grafica24.setBackground(new java.awt.Color(153, 255, 153));
        grafica24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráfica 2022", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout grafica24Layout = new javax.swing.GroupLayout(grafica24);
        grafica24.setLayout(grafica24Layout);
        grafica24Layout.setHorizontalGroup(
            grafica24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        grafica24Layout.setVerticalGroup(
            grafica24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(153, 255, 153));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Semáforo 2021", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("DÍAS:");

        txtro21.setEditable(false);

        gaugeChart3.setColor1(new java.awt.Color(255, 51, 51));
        gaugeChart3.setColor2(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(gaugeChart3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtro21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(gaugeChart3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtro21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(153, 255, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Semáforo 2022", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setText("DÍAS:");

        txtro22.setEditable(false);

        gaugeChart4.setColor1(new java.awt.Color(255, 0, 0));
        gaugeChart4.setColor2(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(gaugeChart4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txtro22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(gaugeChart4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtro22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grafica23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grafica24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grafica23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grafica24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Rotación de Cuentas por Cobrar", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1060, 680));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        red_squr.setBackground(new java.awt.Color(255, 255, 255));
        red_squr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Razón de Actividad");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 461, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(442, 442, 442)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(red_squr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        MenuBSC ventana= new MenuBSC();
        ventana.pestaña(1);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitMousePressed

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_red_squrMouseExited

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void tablactividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablactividadMouseClicked
        //Activos y Pasivos 2021
        txtn1.setText(tablactividad.getValueAt(0, 2).toString());
        txtm1.setText(tablactividad.getValueAt(1, 2).toString());
        //Activos y Pasivos 2022
        txtn2.setText(tablactividad.getValueAt(0, 3).toString());
        txtm2.setText(tablactividad.getValueAt(1, 3).toString());
    }//GEN-LAST:event_tablactividadMouseClicked

    private void CalularActivdad_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalularActivdad_IActionPerformed
        try{
            //Costo de Venta
            double n1=Double.parseDouble(txtn1.getText());
            double n2=Double.parseDouble(txtn2.getText());
            //PInventario
            double m1=Double.parseDouble(txtm1.getText());
            double m2=Double.parseDouble(txtm2.getText());
            //Inventario Anual
            double n3;
            double m3;
            n3= -(n1/m1);
            m3= -(n2/m2);
            //Inventario por Días
            double n4,m4;
            n4=(365/n3);
            m4=(365/m3);
            //Limitar decimales
            DecimalFormat form = new DecimalFormat("#.##");
            String pc1=form.format(n3);
            String pc2=form.format(m3);
            String pc3=form.format(n4);
            String pc4=form.format(m4);
            txtr21.setText(String.valueOf(pc3));
            txtr22.setText(String.valueOf(pc4));
            txtc1.setText(String.valueOf(pc1));
            txtc2.setText(String.valueOf(pc2));
            //Semáforo
            gaugeChart1.setValueWithAnimation((int)n4);
            gaugeChart2.setValueWithAnimation((int)m4);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO hay Valores Ingresados","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CalularActivdad_IActionPerformed

    private void GraficarActividad_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActividad_IActionPerformed
        try{
            for(int i=0;i<tablactividad.getRowCount();i++){
                datos.addValue(Double.parseDouble(tablactividad.getValueAt(i, 2).toString()),
                    tablactividad.getValueAt(i,1).toString(),
                    "2021");
            }
            grafico=ChartFactory.createBarChart("Gráfica 2021","Actividades",
                "Montos ", datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
            ChartPanel panel=new ChartPanel(grafico);
            panel.setMouseWheelEnabled(true);
            panel.setPreferredSize(new Dimension(350,250));
            grafica21.setLayout(new BorderLayout());
            grafica21.add(panel,BorderLayout.NORTH);
            pack();
            repaint();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO hay Valores Ingresados","Aviso",JOptionPane.ERROR_MESSAGE);
        }
        try{
            for(int i=0;i<tablactividad.getRowCount();i++){
                dato.addValue(Double.parseDouble(tablactividad.getValueAt(i, 3).toString()),
                    tablactividad.getValueAt(i,1).toString(),
                    "2022");
            }
            graficos=ChartFactory.createBarChart("Gráfica 2022","Actividades",
                "Montos ", dato,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
            ChartPanel panels=new ChartPanel(graficos);
            panels.setMouseWheelEnabled(true);
            panels.setPreferredSize(new Dimension(350,250));
            grafica22.setLayout(new BorderLayout());
            grafica22.add(panels,BorderLayout.NORTH);
            pack();
            repaint();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO hay Valores Ingresados","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GraficarActividad_IActionPerformed

    private void tablaCobrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCobrarMouseClicked
        txtm3.setText(tablaCobrar.getValueAt(0, 2).toString());
        txtm4.setText(tablaCobrar.getValueAt(0, 3).toString());  
    }//GEN-LAST:event_tablaCobrarMouseClicked

    private void CalcularActividad_IIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActividad_IIActionPerformed
        try{
            //Costo de Venta
            double n1=Double.parseDouble(txtn3.getText());
            double n2=Double.parseDouble(txtn4.getText());
            //PInventario
            double m1=Double.parseDouble(txtm3.getText());
            double m2=Double.parseDouble(txtm4.getText());
            //Inventario Anual
            double n3;
            double m3;
            n3= (n1/m1);
            m3= (n2/m2);
            //Inventario por Días
            double n4,m4;
            n4=(365/n3);
            m4=(365/m3);
            //Limitar decimales
            DecimalFormat form = new DecimalFormat("#.##");
            String pc1=form.format(n3);
            String pc2=form.format(m3);
            String pc3=form.format(n4);
            String pc4=form.format(m4);
            txtro21.setText(String.valueOf(pc3));
            txtro22.setText(String.valueOf(pc4));
            txtc3.setText(String.valueOf(pc1));
            txtc4.setText(String.valueOf(pc2));
            //Semáforo
            gaugeChart3.setValueWithAnimation((int)n4);
            gaugeChart4.setValueWithAnimation((int)m4);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO hay Valores Ingresados","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CalcularActividad_IIActionPerformed

    private void GraficarActividad_IIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActividad_IIActionPerformed
       try{
            double n1=Double.parseDouble(txtn3.getText());
            double n2=Double.parseDouble(txtn4.getText());

            
            DefaultCategoryDataset datos= new DefaultCategoryDataset();

            datos.setValue(n1, "2021", "Ingreso de Actividades Orndinarias");
            datos.setValue(n2, "2022", "Ingreso de Actividades Orndinarias");
            
            JFreeChart graficos= ChartFactory.createBarChart3D(
                "Razon de Actividad-Rotación Cuentas por Cobrar", //nombre del gráfico
                "Cuenta-Actividad", //nombre de las barras o columnas
                "Monto", //nombre de la numeracion
                datos,  //datos del grafico
                PlotOrientation.VERTICAL, //orientacion
                true, //legenda de barras individuales por color
                true, //herramientas
                true //url grafico
            );
            ChartPanel panels=new ChartPanel(graficos);
            panels.setMouseWheelEnabled(true);
            panels.setPreferredSize(new Dimension(350,250));
            grafica23.setLayout(new BorderLayout());
            grafica23.add(panels,BorderLayout.NORTH);
            pack();
            repaint();            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO hay Valores Ingresados","Aviso",JOptionPane.ERROR_MESSAGE); 
        }
       try{
            double m1=Double.parseDouble(txtm3.getText());
            double m2=Double.parseDouble(txtm4.getText());
            DefaultCategoryDataset dato= new DefaultCategoryDataset();
            dato.setValue(m1, "2021", "Cuentas por Cobrar");
            dato.setValue(m2, "2022", "Cuentas por Cobrar");            
            JFreeChart grafico= ChartFactory.createBarChart3D(
                "Razon de Actividad-Rotación Cuentas por Cobrar", //nombre del gráfico
                "Cuenta-Actividad", //nombre de las barras o columnas
                "Monto", //nombre de la numeracion
                dato,  //datos del grafico
                PlotOrientation.VERTICAL, //orientacion
                true, //legenda de barras individuales por color
                true, //herramientas
                true //url grafico
            );
            ChartPanel panels=new ChartPanel(grafico);
            panels.setMouseWheelEnabled(true);
            panels.setPreferredSize(new Dimension(350,250));
            grafica24.setLayout(new BorderLayout());
            grafica24.add(panels,BorderLayout.NORTH);
            pack();
            repaint();             
       }catch(Exception e){
            JOptionPane.showMessageDialog(null,"NO hay Valores Ingresados","Aviso",JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_GraficarActividad_IIActionPerformed

    private void tablaCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCuentaMouseClicked
        txtn3.setText(tablaCuenta.getValueAt(0, 2).toString());
        txtn4.setText(tablaCuenta.getValueAt(0, 3).toString());        
    }//GEN-LAST:event_tablaCuentaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RazonActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RazonActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RazonActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RazonActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RazonActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularActividad_II;
    private javax.swing.JButton CalularActivdad_I;
    private javax.swing.JButton GraficarActividad_I;
    private javax.swing.JButton GraficarActividad_II;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel exit;
    private chart.GaugeChart gaugeChart1;
    private chart.GaugeChart gaugeChart2;
    private chart.GaugeChart gaugeChart3;
    private chart.GaugeChart gaugeChart4;
    private javax.swing.JPanel grafica21;
    private javax.swing.JPanel grafica22;
    private javax.swing.JPanel grafica23;
    private javax.swing.JPanel grafica24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel red_squr;
    private javax.swing.JTable tablaCobrar;
    private javax.swing.JTable tablaCuenta;
    private javax.swing.JTable tablactividad;
    private javax.swing.JTextField txtc1;
    private javax.swing.JTextField txtc2;
    private javax.swing.JTextField txtc3;
    private javax.swing.JTextField txtc4;
    private javax.swing.JTextField txtm1;
    private javax.swing.JTextField txtm2;
    private javax.swing.JTextField txtm3;
    private javax.swing.JTextField txtm4;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    private javax.swing.JTextField txtn3;
    private javax.swing.JTextField txtn4;
    private javax.swing.JTextField txtr21;
    private javax.swing.JTextField txtr22;
    private javax.swing.JTextField txtro21;
    private javax.swing.JTextField txtro22;
    // End of variables declaration//GEN-END:variables
}
