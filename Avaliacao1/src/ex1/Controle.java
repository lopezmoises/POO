package ex1;

/**
 *
 * @author Moisés López
 */
public class Controle extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public Controle(Tv tv) {
        initComponents();
        this.tv = tv;

        tv.setVisible(true);
        tv.setLocation(650, 200);
    }

    private Tv tv;
    private int volumeAnterior = 0;

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jBNro6 = new javax.swing.JButton();
        jBMudo = new javax.swing.JButton();
        jBNro7 = new javax.swing.JButton();
        jBNro8 = new javax.swing.JButton();
        jBAumentarCanal = new javax.swing.JButton();
        jBNro9 = new javax.swing.JButton();
        jBDisminuirCanal = new javax.swing.JButton();
        jTFCanalSeleccionado = new javax.swing.JTextField();
        jBNro0 = new javax.swing.JButton();
        jBConfirmarCanal = new javax.swing.JButton();
        jBConfirmarCanal1 = new javax.swing.JButton();
        jBNro1 = new javax.swing.JButton();
        jBNro2 = new javax.swing.JButton();
        jBNro3 = new javax.swing.JButton();
        jBNro4 = new javax.swing.JButton();
        jBAumentarVolume = new javax.swing.JButton();
        jBNro5 = new javax.swing.JButton();
        jBDisminuirVolume = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle Remoto",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 204))); // NOI18N

        jBNro6.setText("6");
        jBNro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro6ActionPerformed(evt);
            }
        });

        jBMudo.setText("Mudo");
        jBMudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMudoActionPerformed(evt);
            }
        });

        jBNro7.setText("7");
        jBNro7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro7ActionPerformed(evt);
            }
        });

        jBNro8.setText("8");
        jBNro8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro8ActionPerformed(evt);
            }
        });

        jBAumentarCanal.setText("+");
        jBAumentarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAumentarCanalActionPerformed(evt);
            }
        });

        jBNro9.setText("9");
        jBNro9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro9ActionPerformed(evt);
            }
        });

        jBDisminuirCanal.setText("-");
        jBDisminuirCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDisminuirCanalActionPerformed(evt);
            }
        });

        jTFCanalSeleccionado.setText("Trocar para canal...");

        jBNro0.setText("0");
        jBNro0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro0ActionPerformed(evt);
            }
        });

        jBConfirmarCanal.setText("IR");
        jBConfirmarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarCanalActionPerformed(evt);
            }
        });

        jBConfirmarCanal1.setText("Limpar");
        jBConfirmarCanal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarCanal1ActionPerformed(evt);
            }
        });

        jBNro1.setText("1");
        jBNro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro1ActionPerformed(evt);
            }
        });

        jBNro2.setText("2");
        jBNro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro2ActionPerformed(evt);
            }
        });

        jBNro3.setText("3");
        jBNro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro3ActionPerformed(evt);
            }
        });

        jBNro4.setText("4");
        jBNro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro4ActionPerformed(evt);
            }
        });

        jBAumentarVolume.setText("+");
        jBAumentarVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAumentarVolumeActionPerformed(evt);
            }
        });

        jBNro5.setText("5");
        jBNro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNro5ActionPerformed(evt);
            }
        });

        jBDisminuirVolume.setText("-");
        jBDisminuirVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDisminuirVolumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jBNro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBNro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(
                                                jBNro3, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jBNro4, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(52, 52, 52)
                                                        .addComponent(jBNro6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(
                                                        jBNro5, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jBDisminuirVolume,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel2Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jBAumentarCanal,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jBDisminuirCanal,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(
                                                                jBAumentarVolume,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jBConfirmarCanal1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jBMudo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout
                                                        .createSequentialGroup().addGap(52, 52, 52).addComponent(jBNro0,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup().addComponent(
                                                jBNro7, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(52, 52, 52).addComponent(jBNro9,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jBNro8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jTFCanalSeleccionado).addComponent(jBConfirmarCanal,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                        .addComponent(jTFCanalSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBConfirmarCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBNro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBNro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBNro3, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBNro5, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBNro4, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBNro6, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBNro8, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBNro7, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBNro9, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBNro0, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBConfirmarCanal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBMudo, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBAumentarCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18).addComponent(jBDisminuirCanal,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(54, 54, 54).addComponent(
                                                jBDisminuirVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup().addGap(53, 53, 53).addComponent(
                                                jBAumentarVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)));

        pack();
    }

    private void jBNro1ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("1", jTFCanalSeleccionado.getText());
    }

    private void jBNro2ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("2", jTFCanalSeleccionado.getText());
    }

    private void jBNro3ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("3", jTFCanalSeleccionado.getText());
    }

    private void jBNro4ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("4", jTFCanalSeleccionado.getText());
    }

    private void jBNro5ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("5", jTFCanalSeleccionado.getText());
    }

    private void jBNro6ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("6", jTFCanalSeleccionado.getText());
    }

    private void jBNro7ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("7", jTFCanalSeleccionado.getText());
    }

    private void jBNro8ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("8", jTFCanalSeleccionado.getText());
    }

    private void jBNro9ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("9", jTFCanalSeleccionado.getText());
    }

    private void jBNro0ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber("0", jTFCanalSeleccionado.getText());
    }

    private void jBConfirmarCanal1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTFCanalSeleccionado.setText("Trocar para canal...");
    }

    private void jBAumentarCanalActionPerformed(java.awt.event.ActionEvent evt) {
        if (tv.getjCBCanal() < 99) {
            tv.setjCBCanal(tv.getjCBCanal() + 1);
        }
    }

    private void jBDisminuirCanalActionPerformed(java.awt.event.ActionEvent evt) {
        if (tv.getjCBCanal() > 1) {
            tv.setjCBCanal(tv.getjCBCanal() - 1);
        }
    }

    private void jBAumentarVolumeActionPerformed(java.awt.event.ActionEvent evt) {
        if (tv.getjSVolume() < 96) {
            if (tv.getjSVolume() == 0 && tv.getjLVolumeValue().equals("Mudo")) {
                tv.setjSVolume(volumeAnterior);
                volumeAnterior = 0;
            } else {
                tv.setjSVolume(tv.getjSVolume() + 5);
            }
        }
    }

    private void jBDisminuirVolumeActionPerformed(java.awt.event.ActionEvent evt) {
        if (tv.getjSVolume() > 4) {
            tv.setjSVolume(tv.getjSVolume() - 5);
        }
    }

    private void jBConfirmarCanalActionPerformed(java.awt.event.ActionEvent evt) {
        int canalSelecionado = (!"Trocar para canal...".equals(jTFCanalSeleccionado.getText()))
                ? Integer.parseInt(jTFCanalSeleccionado.getText())
                : 1;
        if (canalSelecionado < 100 && canalSelecionado > 0) {
            tv.setjCBCanal(canalSelecionado);
            jTFCanalSeleccionado.setText("Trocar para canal...");
        }
    }

    private void jBMudoActionPerformed(java.awt.event.ActionEvent evt) {
        if (tv.getjSVolume() != 0) {
            volumeAnterior = tv.getjSVolume();
            tv.setjSVolume(-1);
        } else {
            tv.setjSVolume(volumeAnterior);
            volumeAnterior = 0;
        }
    }

    private void setNumber(String number, String text) {

        if (!"Trocar para canal...".equals(text)) {
            int numInt = Integer.parseInt(text + number);
            if (numInt < 100) {
                jTFCanalSeleccionado.setText(text + number);
            }
        } else {
            jTFCanalSeleccionado.setText(number);
        }
    }

    private javax.swing.JButton jBAumentarCanal;
    private javax.swing.JButton jBAumentarVolume;
    private javax.swing.JButton jBConfirmarCanal;
    private javax.swing.JButton jBConfirmarCanal1;
    private javax.swing.JButton jBDisminuirCanal;
    private javax.swing.JButton jBDisminuirVolume;
    private javax.swing.JButton jBMudo;
    private javax.swing.JButton jBNro0;
    private javax.swing.JButton jBNro1;
    private javax.swing.JButton jBNro2;
    private javax.swing.JButton jBNro3;
    private javax.swing.JButton jBNro4;
    private javax.swing.JButton jBNro5;
    private javax.swing.JButton jBNro6;
    private javax.swing.JButton jBNro7;
    private javax.swing.JButton jBNro8;
    private javax.swing.JButton jBNro9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFCanalSeleccionado;

}
