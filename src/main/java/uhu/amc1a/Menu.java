package uhu.amc1a;

import java.awt.Cursor;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author diego
 */
public class Menu extends javax.swing.JFrame {

    public static boolean peor;
    public static String fileName;
    public static File file;
    public static Punto array[];

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        peor = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkCasoPeor = new javax.swing.JCheckBox();
        botonOpcion1 = new javax.swing.JButton();
        botonOpcion2 = new javax.swing.JButton();
        botonOpcion3 = new javax.swing.JButton();
        botonOpcion4 = new javax.swing.JButton();
        botonOpcion5 = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelArchivo = new javax.swing.JLabel();
        botonOpcionE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkCasoPeor.setText("Caso Peor");
        checkCasoPeor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCasoPeorActionPerformed(evt);
            }
        });

        botonOpcion1.setText("1) Crear un fichero .tsp aleatorio");
        botonOpcion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion1ActionPerformed(evt);
            }
        });

        botonOpcion2.setText("2) Cargar un dataset en memoria");
        botonOpcion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion2ActionPerformed(evt);
            }
        });

        botonOpcion3.setText("3) Testear todas las estrategias");
        botonOpcion3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion3ActionPerformed(evt);
            }
        });

        botonOpcion4.setText("4) Comparar todas las estrategias");
        botonOpcion4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion4ActionPerformed(evt);
            }
        });

        botonOpcion5.setText("5) Comparar dos estrategias");
        botonOpcion5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcion5ActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        labelTitulo.setText("Estrategias de búsqueda");

        labelSubtitulo.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        labelSubtitulo.setText("Distancia mínima entre dos puntos");

        labelArchivo.setText("Array cargado:");

        botonOpcionE.setText("E) Testear una estrategia");
        botonOpcionE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonOpcionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addComponent(labelSubtitulo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonOpcion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOpcion3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOpcion5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOpcion4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(botonOpcionE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkCasoPeor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(labelSubtitulo)
                .addGap(26, 26, 26)
                .addComponent(labelArchivo)
                .addGap(26, 26, 26)
                .addComponent(botonOpcion1)
                .addGap(18, 18, 18)
                .addComponent(botonOpcion2)
                .addGap(18, 18, 18)
                .addComponent(botonOpcion3)
                .addGap(18, 18, 18)
                .addComponent(botonOpcionE)
                .addGap(18, 18, 18)
                .addComponent(botonOpcion4)
                .addGap(18, 18, 18)
                .addComponent(botonOpcion5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(checkCasoPeor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkCasoPeorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCasoPeorActionPerformed
        //activar caso peor
        peor = !peor;
    }//GEN-LAST:event_checkCasoPeorActionPerformed

    private void botonOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion1ActionPerformed
        try {
            //crear array aleatorio
            int talla = 0;
            Object input = JOptionPane.showInputDialog(this,
                    "¿Tamaño del fichero?", "Crear un fichero .tsp aleatorio", JOptionPane.QUESTION_MESSAGE);
            if (input != null) {
                talla = Integer.parseInt((String) input);
                if (talla > 0 && talla <= 5000) {
                    array = Data.crearTSP(talla, peor);
                    labelArchivo.setText("Array cargado: " + fileName);
                } else {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Input no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcion1ActionPerformed

    private void botonOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion2ActionPerformed
        try {
            //abrir popup
            JFileChooser fc = new JFileChooser();
            fc.setDialogTitle("Elegir un archivo .tsp");
            FileNameExtensionFilter filter = new FileNameExtensionFilter(".tsp", "tsp");
            fc.setFileFilter(filter);
            int input = fc.showOpenDialog(this);
            //leer archivo
            if (input == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                fileName = file.getName();
                array = Data.parsearTSP(file);
                labelArchivo.setText("Array cargado: " + fileName);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Archivo no válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcion2ActionPerformed

    private void botonOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion3ActionPerformed
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            //hacer busquedas y crear archivos
            Busqueda b = new Busqueda(array);
            b.exhaustiva();
            Data.guardarBusqueda(b.array.get(b.EXH), "Exhaustiva");
            b.poda();
            Data.guardarBusqueda(b.array.get(b.PODA), "Poda");
            b.dyv();
            Data.guardarBusqueda(b.array.get(b.DYV), "DyV");
            b.dyvplus();
            Data.guardarBusqueda(b.array.get(b.DYVP), "DyVPlus");
            //definir formatos de salida
            DecimalFormat d = new DecimalFormat("#.00000000");
            DecimalFormat tp = new DecimalFormat("0.0000");
            double nano = 1000000.0;
            //rellenar tabla
            String[] atributos = {"Estrategia",
                "Punto1",
                "Punto2",
                "Distancia",
                "Calculadas",
                "Tiempo(ms)"};
            Object[][] datos = {
                {"Exhaustiva", b.min[0].p1, b.min[0].p2, d.format(b.min[0].valor), b.numcal[0], tp.format(b.t[0] / nano)},
                {"Poda", b.min[1].p1, b.min[1].p2, d.format(b.min[1].valor), b.numcal[1], tp.format(b.t[1] / nano)},
                {"DyV", b.min[2].p1, b.min[2].p2, d.format(b.min[2].valor), b.numcal[2], tp.format(b.t[2] / nano)},
                {"DyVPlus", b.min[3].p1, b.min[3].p2, d.format(b.min[3].valor), b.numcal[3], tp.format(b.t[3] / nano)}
            };
            //mostrar tabla
            JTable t = new JTable(datos, atributos);
            JScrollPane sp = new JScrollPane(t);
            JFrame f = new JFrame();
            f.add(sp);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setBounds(700, 200, 1100, 120);
            f.setTitle("Resultados - " + fileName);
            f.setVisible(true);
            //mostrar g
            Nube3 nube = new Nube3(array, b.min);
            nube.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            nube.setSize(800, 800);
            nube.setLocationRelativeTo(null);
            nube.setTitle("Representación - " + fileName);
            nube.setVisible(true);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No hay ningún array cargado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcion3ActionPerformed

    private void botonOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion4ActionPerformed
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            //definir tallas y num de iteraciones
            int T[] = {200, 500, 1500, 3250, 5000};
            double TD[] = {200.0, 500.0, 1500.0, 3250.0, 5000.0};
            int N = 10;
            Busqueda b[][] = new Busqueda[T.length][N];
            //crear arrays
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    Punto tmp[] = new Punto[T[i]];
                    Punto.rellenar(tmp, T[i], Menu.peor);
                    b[i][j] = new Busqueda(tmp);
                }
            }
            //hacer busquedas
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    b[i][j].exhaustiva();
                    b[i][j].poda();
                    b[i][j].dyv();
                    b[i][j].dyvplus();
                }
            }
            //calcular medias
            double[][] tablaT = new double[T.length][Busqueda.NUM];
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < Busqueda.NUM; j++) {
                    tablaT[i][j] = 0.0;
                }
            }
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < N; j++) {
                    tablaT[i][0] = tablaT[i][0] + b[i][j].t[0];
                    tablaT[i][1] = tablaT[i][1] + b[i][j].t[1];
                    tablaT[i][2] = tablaT[i][2] + b[i][j].t[2];
                    tablaT[i][3] = tablaT[i][3] + b[i][j].t[3];
                }
            }
            //definir formato de salida
            DecimalFormat tp = new DecimalFormat("0.0000");
            double nanoMedia = 1000000.0 * (double) (N);
            //rellenar tabla
            String[] atributos = {"Talla",
                "Exhaustiva",
                "Poda",
                "DyV",
                "DyVPlus"};
            Object[][] datos = {
                {" ", "Tiempo(ms)", "Tiempo(ms)", "Tiempo(ms)", "Tiempo(ms)"},
                {T[0], tp.format(tablaT[0][0] / nanoMedia), tp.format(tablaT[0][1] / nanoMedia), tp.format(tablaT[0][2] / nanoMedia), tp.format(tablaT[0][3] / nanoMedia)},
                {T[1], tp.format(tablaT[1][0] / nanoMedia), tp.format(tablaT[1][1] / nanoMedia), tp.format(tablaT[1][2] / nanoMedia), tp.format(tablaT[1][3] / nanoMedia)},
                {T[2], tp.format(tablaT[2][0] / nanoMedia), tp.format(tablaT[2][1] / nanoMedia), tp.format(tablaT[2][2] / nanoMedia), tp.format(tablaT[2][3] / nanoMedia)},
                {T[3], tp.format(tablaT[3][0] / nanoMedia), tp.format(tablaT[3][1] / nanoMedia), tp.format(tablaT[3][2] / nanoMedia), tp.format(tablaT[3][3] / nanoMedia)},
                {T[4], tp.format(tablaT[4][0] / nanoMedia), tp.format(tablaT[4][1] / nanoMedia), tp.format(tablaT[4][2] / nanoMedia), tp.format(tablaT[4][3] / nanoMedia)}
            };
            double[][] valores = {
                {TD[0], (tablaT[0][0] / nanoMedia), (tablaT[0][1] / nanoMedia), (tablaT[0][2] / nanoMedia), (tablaT[0][3] / nanoMedia)},
                {TD[1], (tablaT[1][0] / nanoMedia), (tablaT[1][1] / nanoMedia), (tablaT[1][2] / nanoMedia), (tablaT[1][3] / nanoMedia)},
                {TD[2], (tablaT[2][0] / nanoMedia), (tablaT[2][1] / nanoMedia), (tablaT[2][2] / nanoMedia), (tablaT[2][3] / nanoMedia)},
                {TD[3], (tablaT[3][0] / nanoMedia), (tablaT[3][1] / nanoMedia), (tablaT[3][2] / nanoMedia), (tablaT[3][3] / nanoMedia)},
                {TD[4], (tablaT[4][0] / nanoMedia), (tablaT[4][1] / nanoMedia), (tablaT[4][2] / nanoMedia), (tablaT[4][3] / nanoMedia)}
            };
            //mostrar tabla
            JTable t = new JTable(datos, atributos);
            JScrollPane sp = new JScrollPane(t);
            JFrame f = new JFrame();
            f.add(sp);
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setBounds(700, 200, 800, 150);
            f.setTitle("Resultados");
            f.setVisible(true);
            //mostrar g
            Grafica41 g = new Grafica41(valores, peor);
            g.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            g.setBounds(200, 350, 800, 400);
            g.setTitle("Representación");
            g.setVisible(true);
            if (!peor) {
                //mostrar g2
                Grafica42 g2 = new Grafica42(valores, peor);
                g2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                g2.setBounds(1000, 350, 800, 400);
                g2.setTitle("Representación");
                g2.setVisible(true);
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } catch (Exception e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No hay ningún array cargado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcion4ActionPerformed

    private void botonOpcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcion5ActionPerformed
        try {
            //abrir frame Opcion5
            Opcion5 f = new Opcion5();
            f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            f.setBounds(700, 200, 350, 250);
            f.setTitle("Elegir algoritmos");
            f.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonOpcion5ActionPerformed

    private void botonOpcionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionEActionPerformed
        if (array != null) {
            try {
                //abrir frame OpcionE
                OpcionE f = new OpcionE();
                f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                f.setBounds(700, 200, 225, 250);
                f.setTitle("Elegir un algoritmo");
                f.setVisible(true);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay ningún array cargado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonOpcionEActionPerformed

    public static void main(String args[]) {
        Menu m = new Menu();
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setBounds(200, 200, 370, 500);
        m.setTitle("AMC - Práctica 1a");
        m.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonOpcion1;
    private javax.swing.JButton botonOpcion2;
    private javax.swing.JButton botonOpcion3;
    private javax.swing.JButton botonOpcion4;
    private javax.swing.JButton botonOpcion5;
    private javax.swing.JButton botonOpcionE;
    private javax.swing.JCheckBox checkCasoPeor;
    private javax.swing.JLabel labelArchivo;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
