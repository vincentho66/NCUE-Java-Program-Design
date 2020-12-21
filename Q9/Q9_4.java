import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q9_4 {
    static JFrame jFrame = new JFrame("¥|«h¹Bºâ");
    static JTextField jTextField1 = new JTextField(5);
    static JTextField jTextField2 = new JTextField(5);
    static JComboBox<String> jComboBox = new JComboBox<String>();
    static JLabel jLabel = new JLabel();
    static Container container = jFrame.getContentPane();
    static SpringLayout springLayout = new SpringLayout();

    static public void main(String arg[]){
        setjFrame();
        jComboBox.addActionListener(new mylistener());
        jTextField1.getDocument().addDocumentListener(new myDocumentListener());
        jTextField2.getDocument().addDocumentListener(new myDocumentListener());
    }

    static public void setjFrame(){
        jFrame.setSize(380,200);
        container.setLayout(springLayout);
        container.add(jTextField1);
        container.add(jComboBox);
        container.add(jTextField2);
        container.add(jLabel);
        jComboBox.addItem("+");
        jComboBox.addItem("-");
        jComboBox.addItem("*");
        jComboBox.addItem("/");
        springLayout.putConstraint(SpringLayout.NORTH,jTextField1,50,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,jTextField1,50,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jComboBox,50,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,jComboBox,50,SpringLayout.EAST,jTextField1);
        springLayout.putConstraint(SpringLayout.NORTH,jTextField2,50,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.WEST,jTextField2,50,SpringLayout.EAST,jComboBox);
        springLayout.putConstraint(SpringLayout.NORTH,jLabel,50,SpringLayout.SOUTH,jComboBox);
        springLayout.putConstraint(SpringLayout.WEST,jLabel,150,SpringLayout.WEST,container);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class mylistener implements java.awt.event.ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            cou();

        }
    }
    static class myDocumentListener implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            cou();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            cou();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            cou();
        }
    }

    static public void cou(){
        if(!jTextField1.getText().equals("") && !jTextField2.getText().equals("")){
            switch ((String)jComboBox.getSelectedItem()){

                case "-":
                    jLabel.setText(jTextField1.getText()+"-"+jTextField2.getText()+"="+(Integer.parseInt(jTextField1.getText())-Integer.parseInt(jTextField2.getText())));
                    break;
                case "*":
                    jLabel.setText(jTextField1.getText()+"*"+jTextField2.getText()+"="+(Integer.parseInt(jTextField1.getText())*Integer.parseInt(jTextField2.getText())));
                    break;
                case "/":
                    jLabel.setText(jTextField1.getText()+"/"+jTextField2.getText()+"="+(Integer.parseInt(jTextField1.getText())/Integer.parseInt(jTextField2.getText())));
                    break;
                default:

                case "+":
                    jLabel.setText(jTextField1.getText()+"+"+jTextField2.getText()+"="+(Integer.parseInt(jTextField1.getText())+Integer.parseInt(jTextField2.getText())));
                    break;
            }

        }
    }
}
