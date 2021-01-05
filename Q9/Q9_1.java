import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Q9_1 {
    static JFrame jFrame = new JFrame("個人資料登入");
    static Container container = jFrame.getContentPane();
    static JPanel jPanel = new JPanel();
    static JLabel tit = new JLabel("學生個人基本資料");
    static JLabel name = new JLabel("姓名");
    static JLabel sex = new JLabel("性別");
    static JLabel cj = new JLabel("系所");
    static JLabel ha = new JLabel("興趣");
    static JTextField tname = new JTextField(10);
    static JComboBox jComboBox = new JComboBox();
    static ButtonGroup buttonGroup = new ButtonGroup();
    static JRadioButton jRadioButton1 = new JRadioButton("男生");
    static JRadioButton jRadioButton2 = new JRadioButton("女生");
    static JCheckBox jCheckBox1 = new JCheckBox("打籃球");
    static JCheckBox jCheckBox2 = new JCheckBox("游泳");
    static JCheckBox jCheckBox3 = new JCheckBox("慢跑");
    static JTextArea jTextArea = new JTextArea(2,20);
    static JScrollPane jScrollPane = new JScrollPane(jTextArea);
    static SpringLayout springLayout = new SpringLayout();
    static JButton jButton = new JButton("存檔");
    static Border border = BorderFactory.createTitledBorder("自我介紹");


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
        jComboBox.addItem("資工系");
        jComboBox.addItem("其他系");
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
                    s+="男 , ";
                }else{
                    s+="女 , ";
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
