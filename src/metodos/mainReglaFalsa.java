/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Aldo Memo
 */
public class mainReglaFalsa extends javax.swing.JFrame {

    double fXL;
    double fXU;
    double XR;
    
    public mainReglaFalsa() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdbtnCuarto = new javax.swing.JRadioButton();
        rdbtnTercero = new javax.swing.JRadioButton();
        rdbtnSegundo = new javax.swing.JRadioButton();
        txt4 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txtConstante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtxl = new javax.swing.JTextField();
        txtxu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        raizResultado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        btnGroup.add(rdbtnCuarto);
        btnGroup.add(rdbtnTercero);
        btnGroup.add(rdbtnSegundo);

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("MÉTODO DE REGLA FALSA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("1) Elige el grado de tu ecuación: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        rdbtnCuarto.setText("4° Grado");
        rdbtnCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnCuartoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbtnCuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        rdbtnTercero.setText("3° Grado");
        rdbtnTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTerceroActionPerformed(evt);
            }
        });
        getContentPane().add(rdbtnTercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        rdbtnSegundo.setText("2° Grado");
        rdbtnSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnSegundoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbtnSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 40, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 40, -1));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 40, -1));
        getContentPane().add(txtConstante, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 40, -1));

        jLabel8.setText("X^2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel9.setText("XU= ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel11.setText(" ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("3) Ingresa valores iniciales para : ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtxl.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        getContentPane().add(txtxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 32, 20));

        txtxu.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        getContentPane().add(txtxu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 32, 20));

        jLabel13.setText("X");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        jLabel14.setText("XL= ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel15.setText("El resultado de la raíz es: ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel10.setText("X^4");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 40, -1));

        jLabel16.setText("X^3");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        raizResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(raizResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("2) Ingresa Coeficientes para la ecuación (de ser negativos indicalos con un signo - ) ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("4) Preciona el botón \"Calcular\" para obtener la raíz");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel5.setText("Serna Segura Fernanda Ivonne ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTerceroActionPerformed
        txt4.setText("0");
        txt2.setText("0");
        txt1.setText("0");
        txtConstante.setText("0");
        txt3.setText("0");       
        
        txt4.setEditable(false);
        txt3.setEditable(true);
        txt2.setEditable(true);
        txt1.setEditable(true);
        txtConstante.setEditable(true);
    }//GEN-LAST:event_rdbtnTerceroActionPerformed

    private void rdbtnCuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnCuartoActionPerformed
        txt4.setText("0");
        txt2.setText("0");
        txt1.setText("0");
        txtConstante.setText("0");
        txt3.setText("0");
        
        txt4.setEditable(true);
        txt3.setEditable(true);
        txt2.setEditable(true);
        txt1.setEditable(true);
        txtConstante.setEditable(true);
    }//GEN-LAST:event_rdbtnCuartoActionPerformed

    private void rdbtnSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnSegundoActionPerformed
        txt4.setText("0");
        txt2.setText("0");
        txt1.setText("0");
        txtConstante.setText("0");
        txt3.setText("0");
        
        txt4.setEditable(false);
        txt3.setEditable(false);
        txt2.setEditable(true);
        txt1.setEditable(true);
        txtConstante.setEditable(true);
    }//GEN-LAST:event_rdbtnSegundoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        double termino4=Double.parseDouble(txt4.getText());
        double termino3=Double.parseDouble(txt3.getText());
        double termino2=Double.parseDouble(txt2.getText());
        double termino1=Double.parseDouble(txt1.getText());
        double terminoConstante=Double.parseDouble(txtConstante.getText());
        
        metodoReglaFalsa(termino4,termino3,termino2,termino1,terminoConstante);
        

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void raizResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raizResultadoActionPerformed

    
    private void metodoReglaFalsa(double terminoCuarto,double terminoCubico,double terminoCuadrado, double terminoLineal, double terminoConstante){
      // esto es pr xu y xl
      double xl=Double.parseDouble(txtxl.getText());
      double xu=Double.parseDouble(txtxu.getText());
      
      fXL=((Math.pow(xl, 4))*terminoCuarto) + ((Math.pow(xl, 3))*terminoCubico) + ((Math.pow(xl, 2))*terminoCuadrado) + ((Math.pow(xl, 1))*terminoLineal) + terminoConstante;
      fXU=((Math.pow(xl, 4))*terminoCuarto) + ((Math.pow(xu, 3))*terminoCubico) + ((Math.pow(xu, 2))*terminoCuadrado) + ((Math.pow(xu, 1))*terminoLineal) + terminoConstante;
      
      System.out.println("El valor de f(xl) es: " + fXL);
      System.out.println("El valor de f(xu) es: " + fXU);
     
      
      if((fXL*fXU)!=0){ 
          System.out.println();
          do{
      
               XR= ((fXU*xl)-(fXL*xu))/(fXU-fXL);
              System.out.println("Valor de Xr " + XR);
              double FxR=((Math.pow(XR, 4))*terminoCuarto) +((Math.pow(XR, 3))*terminoCubico) + ((Math.pow(XR, 2))*terminoCuadrado) + ((Math.pow(XR, 1))*terminoLineal) + terminoConstante;
                  
              
              System.out.println("El valor de alor de f(XR) es:  = "+FxR);
              //Comprueba Casos
              if(fXL*FxR<0){System.out.println("Caso a");
                  xu=XR;
                  System.out.println("-------------------------------------------");}
              if(fXL*FxR>0){ System.out.println("Caso b");
                  xl=XR;
              System.out.println("-------------------------------------------");}
              if(fXL*FxR==0){ System.out.println("Caso c");
                  System.out.println(" Respuesta ");}
              System.out.println("-------------------------------------------");
              XR= ((fXU*xl)-(fXL*xu))/(fXU-fXL);
              System.out.println("El valor  de XR es: " + XR);
          }while(Math.abs(((Math.pow(XR, 4))*terminoCuarto)+((Math.pow(XR, 3))*terminoCubico) + ((Math.pow(XR, 2))*terminoCuadrado) + ((Math.pow(XR, 1))*terminoLineal) + terminoConstante)>=0.0004);
          System.out.println("La raiz es: " + XR);
          
          double redondeado = new BigDecimal(XR)
                                     .setScale(4, RoundingMode.HALF_EVEN).doubleValue();
          raizResultado.setText(String.valueOf(redondeado));
      }
      
      else{
          System.out.println("Xu ya es una raiz");
      }
        
    }
            
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainReglaFalsa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField raizResultado;
    private javax.swing.JRadioButton rdbtnCuarto;
    private javax.swing.JRadioButton rdbtnSegundo;
    private javax.swing.JRadioButton rdbtnTercero;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txtConstante;
    private javax.swing.JTextField txtxl;
    private javax.swing.JTextField txtxu;
    // End of variables declaration//GEN-END:variables
}
