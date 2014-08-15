/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adam.convertcurrency;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Adam Bodie 
 */
public class CurrencyConverter extends JPanel {

    private static JFrame frame;
    private static ResourceBundle labels;

//Buttons
    private JButton clearButton;
    private JButton convertButton;

//FormattedTextFields
    private JFormattedTextField dateTextField;
    private JFormattedTextField endCurrencySymbol;
    private JFormattedTextField endFormattedTextField;
    private JFormattedTextField rateTextField;
    private JFormattedTextField startCurrencySymbol;
    private JFormattedTextField startFormattedTextField;
    private JFormattedTextField hiddenStartField;
    private JFormattedTextField hiddenEndField;

//Date Objects
    private DateFormat dateFormatter;
    private Date today;
    private String dateOut;

//Combo Boxes
    private JComboBox endComboBox;
    private JComboBox startComboBox;

//Labels
    private JLabel startCurrencyLabel;
    private JLabel endCurrencyLabel;
    private JLabel exchangeRateAsOfLabel;
    private JLabel exchangeRateLabel;

//MenuBar
    private JMenuBar convertMenuBar;

//Menus
    private JMenu localeMenu;
    private JMenu moreInfoMenu;
    private JMenu helpMenu;

//Actions
    protected Action enLocaleAction, frLocaleAction, jpLocaleAction, 
            deLocaleAction, ruLocaleAction, esLocaleAction, 
            zhLocaleAction, inLocaleAction;

//Locales
    private Locale usLocale;
    private Locale frLocale;
    private Locale caENLocale;
    private Locale auLocale;
    private Locale jaLocale;
    private Locale ukLocale;
    private Locale ruLocale;
    private Locale mxLocale;
    private Locale zhLocale;
    private Locale inLocale;

//Currencies
    private Currency getUSCurrency;
    private Currency getFRCurrency;
    private Currency getCACurrency;
    private Currency getAUCurrency;
    private Currency getJACurrency;
    private Currency getUKCurrency;
    private Currency getRUCurrency;
    private Currency getMXCurrency;
    private Currency getZHCurrency;
    private Currency getINCurrency;

//Currency Strings
    private String myUSCurrency;
    private String myFRCurrency;
    private String myCACurrency;
    private String myAUCurrency;
    private String myJACurrency;
    private String myUKCurrency;
    private String myRUCurrency;
    private String myMXCurrency;
    private String myZHCurrency;
    private String myINCurrency;

    
    public CurrencyConverter(Locale currentLocale) {

        usLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        frLocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
        caENLocale = new Locale.Builder().setLanguage("en").setRegion("CA").build();
        auLocale = new Locale.Builder().setLanguage("en").setRegion("AU").build();
        jaLocale = new Locale.Builder().setLanguage("ja").setRegion("JP").build();
        ukLocale = new Locale.Builder().setLanguage("en").setRegion("GB").build();
        ruLocale = new Locale.Builder().setLanguage("ru").setRegion("RU").build();
        mxLocale = new Locale.Builder().setLanguage("es").setRegion("MX").build();
        zhLocale = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
        inLocale = new Locale.Builder().setLanguage("hi").setRegion("IN").build();
        
        getUSCurrency = Currency.getInstance(usLocale);
        getFRCurrency = Currency.getInstance(frLocale);
        getCACurrency = Currency.getInstance(caENLocale);
        getAUCurrency = Currency.getInstance(auLocale);
        getJACurrency = Currency.getInstance(jaLocale);
        getUKCurrency = Currency.getInstance(ukLocale);
        getRUCurrency = Currency.getInstance(ruLocale);
        getMXCurrency = Currency.getInstance(mxLocale);
        getZHCurrency = Currency.getInstance(zhLocale);
        getINCurrency = Currency.getInstance(inLocale);
        
        myUSCurrency = getUSCurrency.getCurrencyCode() + " - " + getUSCurrency.getDisplayName();
        myFRCurrency = getFRCurrency.getCurrencyCode() + " - " + getFRCurrency.getDisplayName();
        myCACurrency = getCACurrency.getCurrencyCode() + " - " + getCACurrency.getDisplayName();
        myAUCurrency = getAUCurrency.getCurrencyCode() + " - " + getAUCurrency.getDisplayName();
        myJACurrency = getJACurrency.getCurrencyCode() + " - " + getJACurrency.getDisplayName();
        myUKCurrency = getUKCurrency.getCurrencyCode() + " - " + getUKCurrency.getDisplayName();
        myRUCurrency = getRUCurrency.getCurrencyCode() + " - " + getRUCurrency.getDisplayName();
        myMXCurrency = getMXCurrency.getCurrencyCode() + " - " + getMXCurrency.getDisplayName();
        myZHCurrency = getZHCurrency.getCurrencyCode() + " - " + getZHCurrency.getDisplayName();
        myINCurrency = getINCurrency.getCurrencyCode() + " - " + getINCurrency.getDisplayName();
        
        enLocaleAction = new Change("English", new Locale.Builder().setLanguage("en").setRegion("US").build());
        frLocaleAction = new Change("French", new Locale.Builder().setLanguage("fr").setRegion("FR").build());
        deLocaleAction = new Change("German", new Locale.Builder().setLanguage("de").setRegion("DE").build());
        jpLocaleAction = new Change("Japanese", new Locale.Builder().setLanguage("jp").setRegion("JA").build());
        ruLocaleAction = new Change("Russian", new Locale.Builder().setLanguage("ru").setRegion("RU").build());
        esLocaleAction = new Change("Spanish", new Locale.Builder().setLanguage("es").setRegion("MX").build());
        zhLocaleAction = new Change("Chinese (Simplified)", new Locale.Builder().setLanguage("zh").setRegion("CN").build());
        inLocaleAction = new Change("Hindi", new Locale.Builder().setLanguage("hi").setRegion("IN").build());
        labels = ResourceBundle.getBundle("Resources", currentLocale);

        startCurrencyLabel = new JLabel(labels.getString("START_STRING"));
        endCurrencyLabel = new JLabel(labels.getString("END_STRING"));
        exchangeRateLabel = new JLabel(labels.getString("RATE_STRING"));
        exchangeRateAsOfLabel = new JLabel(labels.getString("DATE_STRING"));
        convertButton = new JButton(labels.getString("CONVERT_STRING"));
        clearButton = new JButton(labels.getString("CLEAR_STRING"));

        startCurrencySymbol = new JFormattedTextField();
        startCurrencySymbol.setEditable(false);
        startCurrencySymbol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        startCurrencySymbol.setBackground(Color.LIGHT_GRAY);
        
        endCurrencySymbol = new JFormattedTextField();
        endCurrencySymbol.setEditable(false);
        endCurrencySymbol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        endCurrencySymbol.setBackground(Color.LIGHT_GRAY);
        startFormattedTextField = new JFormattedTextField();
        endFormattedTextField = new JFormattedTextField();
        rateTextField = new JFormattedTextField();
        dateTextField = new JFormattedTextField();
        hiddenStartField = new JFormattedTextField();
        hiddenStartField.setVisible(false);
        hiddenEndField = new JFormattedTextField();
        hiddenEndField.setVisible(false);

        dateFormatter = DateFormat.getDateInstance(DateFormat.LONG, currentLocale);
        today = new Date();
        dateOut = dateFormatter.format(today);
        dateTextField.setValue(dateOut);

        String[] codes = {labels.getString("CHOOSE_STRING"), myAUCurrency, myCACurrency, 
            myZHCurrency, myFRCurrency, myUKCurrency, myINCurrency, myJACurrency, 
            myMXCurrency, myRUCurrency, myUSCurrency};
        startComboBox = new JComboBox(codes);
        endComboBox = new JComboBox(codes);

        JPanel labelsAndFieldsPane = new JPanel(new GridBagLayout());
        //StartCurrencyLabel
        GridBagConstraints startLabelConstraints = new GridBagConstraints();
        startLabelConstraints.gridx = 1;
        startLabelConstraints.gridy = 0;
        startLabelConstraints.gridwidth = 3;
        startLabelConstraints.anchor = GridBagConstraints.WEST;
        startLabelConstraints.insets = new Insets(80, 50, 0, 290);
        labelsAndFieldsPane.add(startCurrencyLabel, startLabelConstraints);
        
        //EndCurrencyLabel
        GridBagConstraints endLabelConstraints = new GridBagConstraints();
        endLabelConstraints.gridx = 4;
        endLabelConstraints.gridy = 0;
        endLabelConstraints.gridwidth = 2;
        endLabelConstraints.anchor = GridBagConstraints.WEST;
        endLabelConstraints.insets = new Insets(80, 0, 0, 190);
        labelsAndFieldsPane.add(endCurrencyLabel, endLabelConstraints);

        //StartCurrencySymbol
        GridBagConstraints startSymbolConstraints = new GridBagConstraints();
        startSymbolConstraints.ipadx = 20;
        startSymbolConstraints.gridx = 1;
        startSymbolConstraints.gridy = 1;
        startSymbolConstraints.anchor = GridBagConstraints.WEST;
        startSymbolConstraints.insets = new Insets(30, 50, 0, 0);
        labelsAndFieldsPane.add(startCurrencySymbol, startSymbolConstraints);

        //StartFormattedTextField
        GridBagConstraints startTextFieldConstraints = new GridBagConstraints();
        startTextFieldConstraints.ipadx = 150;
        startTextFieldConstraints.gridx = 2;
        startTextFieldConstraints.gridy = 1;
        startTextFieldConstraints.anchor = GridBagConstraints.WEST;
        startTextFieldConstraints.insets = new Insets(30, 10, 0, 50);
        labelsAndFieldsPane.add(startFormattedTextField, startTextFieldConstraints);

        //EndCurrencySymbol
        GridBagConstraints endSymbolConstraints = new GridBagConstraints();
        endSymbolConstraints.ipadx = 20;
        endSymbolConstraints.gridx = 4;
        endSymbolConstraints.gridy = 1;
        endSymbolConstraints.anchor = GridBagConstraints.WEST;
        endSymbolConstraints.insets = new Insets(30, 0, 0, 0);
        labelsAndFieldsPane.add(endCurrencySymbol, endSymbolConstraints);

        //EndFormattedTextField
        GridBagConstraints endTextFieldConstraints = new GridBagConstraints();
        endTextFieldConstraints.ipadx = 150;
        endTextFieldConstraints.gridx = 5;
        endTextFieldConstraints.gridy = 1;
        endTextFieldConstraints.anchor = GridBagConstraints.WEST;
        endTextFieldConstraints.insets = new Insets(30, 10, 0, 50);
        labelsAndFieldsPane.add(endFormattedTextField, endTextFieldConstraints);
       
        //StartComboBox
        GridBagConstraints startComboConstraints = new GridBagConstraints();
        startComboConstraints.gridx = 1;
        startComboConstraints.gridy = 2;
        startComboConstraints.gridwidth = 2;
        startComboConstraints.ipadx = 25;
        startComboConstraints.anchor = GridBagConstraints.WEST;
        startComboConstraints.insets = new Insets(25, 50, 0, 0);
        labelsAndFieldsPane.add(startComboBox, startComboConstraints);
        
        //EndComboBox
        GridBagConstraints endComboConstraints = new GridBagConstraints();
        endComboConstraints.gridx = 4;
        endComboConstraints.gridy = 2;
        endComboConstraints.gridwidth = 2;
        endComboConstraints.ipadx = 25;
        endComboConstraints.anchor = GridBagConstraints.WEST;
        endComboConstraints.insets = new Insets(25, 0, 0, 50);
        labelsAndFieldsPane.add(endComboBox, endComboConstraints);
        
        //convertButton
        GridBagConstraints convertConstraints = new GridBagConstraints();
        convertConstraints.gridx = 2;
        convertConstraints.gridy = 3;
        convertConstraints.insets = new Insets (60, 120, 0, 0);
        labelsAndFieldsPane.add(convertButton, convertConstraints);

        //clearButton
        GridBagConstraints clearConstraints = new GridBagConstraints();
        clearConstraints.gridx = 3;
        clearConstraints.gridy = 3;
        clearConstraints.insets = new Insets (60, 40, 0, 0);
        labelsAndFieldsPane.add(clearButton, clearConstraints);
        
        //ExchangeRateLabel
        GridBagConstraints rateConstraints = new GridBagConstraints();
        rateConstraints.gridx = 1;
        rateConstraints.gridy = 4;
        rateConstraints.gridwidth = 2;
        rateConstraints.anchor = GridBagConstraints.WEST;
        rateConstraints.insets = new Insets(50, 30, 0, 0);
        labelsAndFieldsPane.add(exchangeRateLabel, rateConstraints);

        //RateTextField
        GridBagConstraints rateTextConstraints = new GridBagConstraints();
        rateTextConstraints.gridx = 1;
        rateTextConstraints.gridy = 5;
        rateTextConstraints.gridwidth = 2;
        rateTextConstraints.ipadx = 150;
        rateTextConstraints.anchor = GridBagConstraints.WEST;
        rateTextConstraints.insets = new Insets(10, 30, 0, 0);
        labelsAndFieldsPane.add(rateTextField, rateTextConstraints);

        //exchangeRateAsOfLabel
        GridBagConstraints dateConstraints = new GridBagConstraints();
        dateConstraints.gridx = 1;
        dateConstraints.gridy = 6;
        dateConstraints.gridwidth = 2;
        dateConstraints.anchor = GridBagConstraints.WEST;
        dateConstraints.insets = new Insets(30, 30, 0, 0);
        labelsAndFieldsPane.add(exchangeRateAsOfLabel, dateConstraints);

        //dateTextField
        GridBagConstraints dateTextConstraints = new GridBagConstraints();
        dateTextConstraints.gridx = 1;
        dateTextConstraints.gridy = 7;
        dateTextConstraints.ipadx = 50;
        dateTextConstraints.gridwidth = 2;
        dateTextConstraints.anchor = GridBagConstraints.WEST;
        dateTextConstraints.insets = new Insets(10, 30, 0, 0);
        labelsAndFieldsPane.add(dateTextField, dateTextConstraints);

        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(labelsAndFieldsPane, BorderLayout.CENTER);
        
        startComboBox.setSelectedIndex(0);
        startComboBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startComboBoxActionPerformed(evt);
            }
        });

        endComboBox.setSelectedIndex(0);
        endComboBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endComboBoxActionPerformed(evt);
            }
        });

        convertButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        clearButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
    }

    // Creates the Menu Bar
    @SuppressWarnings("empty-statement")
    public JMenuBar createMenuBar() {

        JMenuItem AUD = new JMenuItem("Australian Dollar");
        JMenuItem CAD = new JMenuItem("Canadian Dollar");
        JMenuItem CNY = new JMenuItem("Chinese Yuan");
        JMenuItem EUR = new JMenuItem("Euro");
        JMenuItem GBP = new JMenuItem("Great Britian Pound");
        JMenuItem INR = new JMenuItem("Indian Rupee");
        JMenuItem JPY = new JMenuItem("Japanese Yen");
        JMenuItem MXN = new JMenuItem("Mexican Peso");
        JMenuItem RUB = new JMenuItem("Russian Ruble");
        JMenuItem USD = new JMenuItem("United States Dollar");
        JMenuItem About = new JMenuItem(labels.getString("ABOUT"));
        JMenuItem Help = new JMenuItem(labels.getString("HELP"));
        JMenuItem menuItem = null;

        convertMenuBar = new JMenuBar();

        localeMenu = new JMenu(labels.getString("LOCALE"));
        moreInfoMenu = new JMenu(labels.getString("MORE_INFORMATION"));
        helpMenu = new JMenu(labels.getString("HELP"));
        Action[] locales = {enLocaleAction, zhLocaleAction, frLocaleAction,
            deLocaleAction, inLocaleAction, jpLocaleAction, ruLocaleAction, esLocaleAction};
        for (Action locale : locales) {
            menuItem = new JMenuItem(locale);
            localeMenu.add(menuItem);
        }

        helpMenu.add(Help);
        helpMenu.add(About);
        
        moreInfoMenu.add(AUD);
        moreInfoMenu.add(CAD);
        moreInfoMenu.add(CNY);
        moreInfoMenu.add(EUR);
        moreInfoMenu.add(GBP);
        moreInfoMenu.add(INR);
        moreInfoMenu.add(JPY);
        moreInfoMenu.add(MXN);
        moreInfoMenu.add(RUB);
        moreInfoMenu.add(USD);

        AUD.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUDActionPerformed(evt);
            }
        });

        CAD.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADActionPerformed(evt);
            }
        });

        EUR.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EURActionPerformed(evt);
            }
        });

        GBP.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GBPActionPerformed(evt);
            }
        });

        JPY.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPYActionPerformed(evt);
            }
        });
        RUB.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUBActionPerformed(evt);
            }
        });
        USD.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USDActionPerformed(evt);
            }
        });
        
        CNY.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNYActionPerformed(evt);
            }
        });
        MXN.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MXNActionPerformed(evt);
            }
        });
        INR.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INRActionPerformed(evt);
            }
        });
        About.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        
        Help.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        
        convertMenuBar.add(localeMenu);
        convertMenuBar.add(moreInfoMenu);
        convertMenuBar.add(helpMenu);
        return convertMenuBar;
    }

    // Changes the Locale
    public class Change extends AbstractAction {

        private Locale currentLocale;
        public Change(String textArg, Locale localeArg) {
            super(textArg);
            currentLocale = localeArg;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            createAndShowGUI(currentLocale);
        }

    }

    /* Retrieves converted values and places them in text field when button
     is pressed*/
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Object startCurrency = hiddenStartField.getValue();
            Object endCurrency = hiddenEndField.getValue();
            convertNumber((String) startCurrency, (String) endCurrency);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, labels.getString("PLEASE_KEY"), 
                    labels.getString("WARNING"), JOptionPane.WARNING_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(frame, labels.getString("PICK_CURRENCY"), 
                    labels.getString("ERROR"), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Listens to the start ComboBox
    private void startComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        JComboBox scb = (JComboBox) evt.getSource();
        String scbName;
        scbName = (String) scb.getSelectedItem();
        hiddenStartField.setValue(scbName);
    }

    //Listens to the end ComboBox
    private void endComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        JComboBox ecb = (JComboBox) evt.getSource();
        String ecbName;
        ecbName = (String) ecb.getSelectedItem();
        hiddenEndField.setValue(ecbName);
    }

    // Clears the text fields
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        startFormattedTextField.setText(null);
        endFormattedTextField.setText(null);
        startCurrencySymbol.setText(null);
        endCurrencySymbol.setText(null);
        rateTextField.setText(null);
    }
    
    // Opens the More Information Frames
    private void AUDActionPerformed(java.awt.event.ActionEvent evt) {
        AUDinfo infoFrame = new AUDinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }
    
    private void CADActionPerformed(java.awt.event.ActionEvent evt) {
        CADinfo infoFrame = new CADinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }
    
    private void CNYActionPerformed(java.awt.event.ActionEvent evt) {
        CNYinfo infoFrame = new CNYinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }
    
    private void EURActionPerformed(java.awt.event.ActionEvent evt) {
        EURinfo infoFrame = new EURinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }

    private void GBPActionPerformed(java.awt.event.ActionEvent evt) {
        GBPinfo infoFrame = new GBPinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }

    private void INRActionPerformed(java.awt.event.ActionEvent evt) {
        INRinfo infoFrame = new INRinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }
    
    private void JPYActionPerformed(java.awt.event.ActionEvent evt) {
        JPYinfo infoFrame = new JPYinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }    
    private void MXNActionPerformed(java.awt.event.ActionEvent evt) {
        MXNinfo infoFrame = new MXNinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }    
    private void RUBActionPerformed(java.awt.event.ActionEvent evt) {
        RUBinfo infoFrame = new RUBinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    } 
    private void USDActionPerformed(java.awt.event.ActionEvent evt) {
        USDinfo infoFrame = new USDinfo();
        infoFrame.setVisible(true);
        infoFrame.setBounds(0, 0, 550, 700);
    }

    private void AboutActionPerformed (java.awt.event.ActionEvent evt) {
        About about = new About();
        about.setVisible(true);
        about.setBounds(0, 0, 400, 300);
    }
    
    private void HelpActionPerformed (java.awt.event.ActionEvent evt) {
        Help help = new Help();
        help.setVisible(true);
        help.setBounds(0, 0, 545, 700);
    }
    //Creates and shows the Graphical User Interface
    private static void createAndShowGUI(Locale currentLocale) {
        CurrencyConverter demo = new CurrencyConverter(currentLocale);

        if (frame == null) {
            frame = new JFrame(labels.getString("WINDOW_TITLE"));
        } else {
            frame.getContentPane().removeAll();
            frame.setTitle(labels.getString("WINDOW_TITLE"));
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(demo);
        frame.setJMenuBar(demo.createMenuBar());
        frame.applyComponentOrientation(ComponentOrientation.getOrientation(currentLocale));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                    getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Locale currentLocale = new Locale.Builder().setLanguage("en")
                        .setRegion("US").build();
                UIManager.put("swing.boldMetal", Boolean.FALSE);

                createAndShowGUI(currentLocale);
            }
        });
    }

    // Converts old currency to new currency value
    public void convertNumber(String oldCurrency, String newCurrency) {
        double startingCurrencyText = Double.parseDouble(startFormattedTextField.getText());
        double rate = 0;
        String symbol = null;
        if (oldCurrency.equals(myAUCurrency)) {
            AUD aud = new AUD(newCurrency, startingCurrencyText);
            rate = aud.newCurrency;
            startCurrencySymbol.setValue("$");
            symbol = aud.newSymbol;
        }
        if (oldCurrency.equals(myCACurrency)) {
            CAD cad = new CAD(newCurrency, startingCurrencyText);
            rate = cad.newCurrency;
            startCurrencySymbol.setValue("$");
            symbol = cad.newSymbol;
        }
        if (oldCurrency.equals(myZHCurrency)) {
            CNY cny = new CNY(newCurrency, startingCurrencyText);
            rate = cny.newCurrency;
            startCurrencySymbol.setValue("$");
            symbol = cny.newSymbol;
        }
        if (oldCurrency.equals(myFRCurrency)) {
            EUR eur = new EUR(newCurrency, startingCurrencyText);
            rate = eur.newCurrency;
            startCurrencySymbol.setValue("€");
            symbol = eur.newSymbol;
        }
        if (oldCurrency.equals(myUKCurrency)) {
            GBP gbp = new GBP(newCurrency, startingCurrencyText);
            rate = gbp.newCurrency;
            startCurrencySymbol.setValue("£");
            symbol = gbp.newSymbol;
        }
        if (oldCurrency.equals(myINCurrency)) {
            INR inr = new INR(newCurrency, startingCurrencyText);
            rate = inr.newCurrency;
            startCurrencySymbol.setValue("Rs");
            symbol = inr.newSymbol;
        }        
        if (oldCurrency.equals(myJACurrency)) {
            JPY jpy = new JPY(newCurrency, startingCurrencyText);
            rate = jpy.newCurrency;
            rateTextField.setValue(rate / startingCurrencyText);
            startCurrencySymbol.setValue("¥");
            symbol = jpy.newSymbol;
        }
        if (oldCurrency.equals(myMXCurrency)) {
            MXN mxn = new MXN(newCurrency, startingCurrencyText);
            rate = mxn.newCurrency;
            startCurrencySymbol.setValue("$");
            symbol = mxn.newSymbol;
        }
        if (oldCurrency.equals(myRUCurrency)) {
            RUB rub = new RUB(newCurrency, startingCurrencyText);
            rate = rub.newCurrency;
            startCurrencySymbol.setValue("руб");
            symbol = rub.newSymbol;
        }
        if (oldCurrency.equals(myUSCurrency)) {
            USD usd = new USD(newCurrency, startingCurrencyText);
            rate = usd.newCurrency;
            startCurrencySymbol.setValue("$");
            symbol = usd.newSymbol;
        }
        endFormattedTextField.setValue(rate);
        endFormattedTextField.setEditable(false);
        rateTextField.setValue(rate / startingCurrencyText);
        endCurrencySymbol.setValue(symbol);
    }

}
