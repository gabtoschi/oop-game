package application;

import buildings.Temple;
import core.BuildingTools;
import core.GameManager;

/**
 * Tela de interface para gerenciar um Templo.
 * @author Fernanda Marana
 */
public class TempleManager extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	GameManager gameData;
    int row, col;

    public TempleManager(GameManager gameData, int row, int col) {
        this.setResizable(false);
        this.gameData = gameData;
        this.row = row;
        this.col = col;
        
        Temple temple = (Temple) gameData.grid.getBuilding(row, col);
        temple.reconfig(gameData.resources);
        
        initComponents();
        labelOopyiesEdit.setText(Integer.toString(gameData.resources.getOopyies()));
        
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        
        SpinnerOopyies.setModel(new javax.swing.SpinnerNumberModel(0, 0, 
        		gameData.resources.getOopyies(), 1));
        SpinnerSeeds.setModel(new javax.swing.SpinnerNumberModel(0, 0, 
        		gameData.resources.getJavaSeeds(), 1));
        SpinnerCoco.setModel(new javax.swing.SpinnerNumberModel(0, 0, 
        		gameData.resources.getSharpCocos(), 1));
        
        jComboBox1.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.GEM_PRODUCTION));
        SpinnerOopyies.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.GEM_PRODUCTION));   
        CheckBoxPerlRitual.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PERL_RITUAL));  
        SpinnerSeeds.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PERL_RITUAL));  
        CheckBoxPyramidRitual.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL));  
        SpinnerCoco.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL));
        CheckBoxGreatRitual.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.GREAT_RITUAL));
        
        CheckBoxPyramidRitual.setEnabled(false);
        SpinnerCoco.setEnabled(false);
    }

    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        labelTEMPLE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelOopyiesEdit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnResources = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CheckBoxPerlRitual = new javax.swing.JCheckBox();
        CheckBoxPyramidRitual = new javax.swing.JCheckBox();
        CheckBoxGreatRitual = new javax.swing.JCheckBox();
        SpinnerOopyies = new javax.swing.JSpinner();
        SpinnerSeeds = new javax.swing.JSpinner();
        SpinnerCoco = new javax.swing.JSpinner();
        btnClose = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TempleBig.png"))); // NOI18N

        labelTEMPLE.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        labelTEMPLE.setText("TEMPLO");

        jLabel3.setText("Oopyies Disponiveis:");

        labelOopyiesEdit.setText("0");

        jLabel5.setText("Producao Magica:");

        jLabel6.setText("Oopyies Alocados:");

        btnResources.setText("Recursos");
        btnResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResourcesActionPerformed(evt);
            }
        });

        jLabel7.setText("Ritual das Sombras:");

        jLabel8.setText("Sementes Usadas:");

        jLabel9.setText("Ritual das Luzes:");

        jLabel10.setText("Cocos Usados:");

        jLabel11.setText("Grande Ritual Rubro:");

        CheckBoxGreatRitual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGreatRitualActionPerformed(evt);
            }
        });

        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perl", "PYramid" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(labelImage)
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnResources))
                                .addComponent(labelTEMPLE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckBoxPerlRitual))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckBoxPyramidRitual))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckBoxGreatRitual))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerSeeds, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerCoco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelOopyiesEdit)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnClose)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(labelTEMPLE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResources)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelOopyiesEdit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(CheckBoxPerlRitual))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(SpinnerSeeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(CheckBoxPyramidRitual))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SpinnerCoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CheckBoxGreatRitual, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(17, 17, 17))
        );

        pack();
    }

    private void CheckBoxGreatRitualActionPerformed(java.awt.event.ActionEvent evt) {
    	if (CheckBoxGreatRitual.isSelected()){
    		SpinnerOopyies.setEnabled(false);   
            CheckBoxPerlRitual.setEnabled(false);
            SpinnerSeeds.setEnabled(false);  
            CheckBoxPyramidRitual.setEnabled(false);  
            SpinnerCoco.setEnabled(false);
            
    	} else {
    		SpinnerOopyies.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.GEM_PRODUCTION));   
            CheckBoxPerlRitual.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PERL_RITUAL));  
            SpinnerSeeds.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PERL_RITUAL));  
            CheckBoxPyramidRitual.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL));  
            SpinnerCoco.setEnabled(BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL));
            
            CheckBoxPyramidRitual.setEnabled(false);
            SpinnerCoco.setEnabled(false);
    	}
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jComboBox1.getSelectedItem().toString().equals("Perl")){
            CheckBoxPyramidRitual.setEnabled(false);
            CheckBoxPyramidRitual.setSelected(false);
            SpinnerCoco.setEnabled(false);
            SpinnerCoco.setValue(0);
            
            if (BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PERL_RITUAL)){
            	CheckBoxPerlRitual.setEnabled(true);
                SpinnerSeeds.setEnabled(true);
            }
        } else if(jComboBox1.getSelectedItem().toString().equals("PYramid")){
        	CheckBoxPerlRitual.setEnabled(false);
        	CheckBoxPerlRitual.setSelected(false);
        	SpinnerSeeds.setEnabled(false);
        	SpinnerSeeds.setValue(0);
            
            if (BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL)){
            	CheckBoxPyramidRitual.setEnabled(true);
            	SpinnerCoco.setEnabled(true);
            }
        }
        
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
    	Temple temple = (Temple) gameData.grid.getBuilding(row, col);
    	
        if(CheckBoxGreatRitual.isSelected()){
        	// great production
        	temple.checkGreatRitual(true);
        	gameData.resources.updateGreatRubies(-1);
        } else {
        	// gem type
        	if(jComboBox1.getSelectedItem().toString().equals("Perl"))
        		temple.setGemType(Temple.PERL);
        	else temple.setGemType(Temple.PYRAMID);
        	
        	// oopyies allocated
        	int oopyies = (Integer) SpinnerOopyies.getValue();
        	temple.allocateOopyies(oopyies);
        	gameData.resources.updateOopyies(-oopyies);
        	
        	// perl ritual
        	if (CheckBoxPerlRitual.isSelected()){
        		int seeds = (Integer) SpinnerSeeds.getValue();
        		temple.setSeeds(seeds);
        		gameData.resources.updateJavaSeeds(-seeds);
        	}
        	
        	// pyramid ritual
        	if (CheckBoxPyramidRitual.isSelected()){
        		int cocos = (Integer) SpinnerCoco.getValue();
        		temple.setCocos(cocos);
        		gameData.resources.updateSharpCocos(-cocos);
        	}
        } 	
    	
        this.dispose();
        new MapForUse(gameData).setVisible(true);
    }

    private void btnResourcesActionPerformed(java.awt.event.ActionEvent evt) {      
        new Resources(gameData, 1).setVisible(true);
    }

    private javax.swing.JCheckBox CheckBoxGreatRitual;
    private javax.swing.JCheckBox CheckBoxPerlRitual;
    private javax.swing.JCheckBox CheckBoxPyramidRitual;
    private javax.swing.JSpinner SpinnerCoco;
    private javax.swing.JSpinner SpinnerOopyies;
    private javax.swing.JSpinner SpinnerSeeds;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnResources;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelOopyiesEdit;
    private javax.swing.JLabel labelTEMPLE;
}
