import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Q9_1 {
    static JFrame jFrame = new JFrame("�ӤH��Ƶn�J");
    static Container container = jFrame.getContentPane();
    static JPanel jPanel = new JPanel();
    static JLabel tit = new JLabel("�ǥͭӤH�򥻸��");
    static JLabel name = new JLabel("�m�W");
    static JLabel sex = new JLabel("�ʧO");
    static JLabel cj = new JLabel("�t��");
    static JLabel ha = new JLabel("����");
    static JTextField tname = new JTextField(10);
    static JComboBox jComboBox = new JComboBox();
    static ButtonGroup buttonGroup = new ButtonGroup();
    static JRadioButton jRadioButton1 = new JRadioButton("�k��");
    static JRadioButton jRadioButton2 = new JRadioButton("�k��");
    static JCheckBox jCheckBox1 = new JCheckBox("���x�y");
    static JCheckBox jCheckBox2 = new JCheckBox("��a");
    static JCheckBox jCheckBox3 = new JCheckBox("�C�]");
    static JTextArea jTextArea = new JTextArea(2,20);
    static JScrollPane jScrollPane = new JScrollPane(jTextArea);
    static SpringLayout springLayout = new SpringLayout();
    static JButton jButton = new JButton("�s��");
    static Border border = BorderFactory.createTitledBorder("�ۧڤ���");


    public static void main(String arg[]){
        setjFrame();
        jButton.addActionListener(new mylistener());
    }

    public static void setjFrame(){
        jFrame.setSize(400,500);
        container.setLayout(springLayout);
        jPanel.setBorder(border);
        jPanel.setSize(300,100);
        container.add(jPanel);
        container.add(name);
        container.add(sex);
        container.add(cj);
        container.add(ha);
        container.add(tname);
        container.add(jComboBox);
        container.add(jCheckBox1);
        container.add(jCheckBox2);
        container.add(jCheckBox3);
        container.add(jRadioButton1);
        container.add(jRadioButton2);
        jPanel.add(jScrollPane);
        container.add(jPanel);
        jTextArea.setAutoscrolls(true);
        jTextArea.setLineWrap(true);
        container.add(tit);
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jComboBox.addItem("��u�t");
        jComboBox.addItem("��L�t");
        container.add(jButton);
        springLayout.putConstraint(SpringLayout.WEST,tit,140,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,tit,20,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.NORTH,name,20,SpringLayout.SOUTH,tit);
        springLayout.putConstraint(SpringLayout.WEST,name,10,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,tname,20,SpringLayout.SOUTH,tit);
        springLayout.putConstraint(SpringLayout.WEST,tname,10,SpringLayout.EAST,name);
        springLayout.putConstraint(SpringLayout.NORTH,sex,20,SpringLayout.SOUTH,name);
        springLayout.putConstraint(SpringLayout.WEST,sex,10,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jRadioButton1,20,SpringLayout.SOUTH,name);
        springLayout.putConstraint(SpringLayout.WEST,jRadioButton1,10,SpringLayout.EAST,sex);
        springLayout.putConstraint(SpringLayout.NORTH,jRadioButton2,20,SpringLayout.SOUTH,name);
        springLayout.putConstraint(SpringLayout.WEST,jRadioButton2,10,SpringLayout.EAST,jRadioButton1);
        springLayout.putConstraint(SpringLayout.NORTH,cj,20,SpringLayout.SOUTH,sex);
        springLayout.putConstraint(SpringLayout.WEST,cj,10,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jComboBox,20,SpringLayout.SOUTH,sex);
        springLayout.putConstraint(SpringLayout.WEST,jComboBox,10,SpringLayout.EAST,cj);
        springLayout.putConstraint(SpringLayout.NORTH,ha,20,SpringLayout.SOUTH,cj);
        springLayout.putConstraint(SpringLayout.WEST,ha,10,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jCheckBox1,20,SpringLayout.SOUTH,cj);
        springLayout.putConstraint(SpringLayout.WEST,jCheckBox1,10,SpringLayout.EAST,ha);
        springLayout.putConstraint(SpringLayout.NORTH,jCheckBox2,20,SpringLayout.SOUTH,cj);
        springLayout.putConstraint(SpringLayout.WEST,jCheckBox2,10,SpringLayout.EAST,jCheckBox1);
        springLayout.putConstraint(SpringLayout.NORTH,jCheckBox3,20,SpringLayout.SOUTH,cj);
        springLayout.putConstraint(SpringLayout.WEST,jCheckBox3,10,SpringLayout.EAST,jCheckBox2);
        springLayout.putConstraint(SpringLayout.NORTH,jPanel,50,SpringLayout.SOUTH,cj);
        springLayout.putConstraint(SpringLayout.WEST,jPanel,10,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jButton,50,SpringLayout.SOUTH,jPanel);
        springLayout.putConstraint(SpringLayout.WEST,jButton,140,SpringLayout.WEST,container);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class mylistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                FileWriter fileWriter = new FileWriter("c:/output.txt");
                String s = "";
                s+=tname.getText()+" ,";
                if(jRadioButton1.isSelected()){
                    s+="�k , ";
                }else{
                    s+="�k , ";
                }
                s += (String)jComboBox.getSelectedItem()+" , ";
                if(jCheckBox1.isSelected()){
                    s += jCheckBox1.getText()+" ";
                }
                if(jCheckBox2.isSelected()){
                    s += jCheckBox2.getText()+" ";
                }
                if(jCheckBox3.isSelected()){
                    s += jCheckBox3.getText()+" ";
                }
                s+= ", "+jTextArea.getText();
                fileWriter.write(s);
                jTextArea.setText("succeed");
                fileWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }
    }
}
