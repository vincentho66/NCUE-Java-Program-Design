import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Q8_2 {
    static JFrame jFrame = new JFrame();
    static Container container = jFrame.getContentPane();
    static JPanel jPanel = new JPanel(new GridLayout(3,3));
    //static JLabel jLabel = new JLabel();
    static JTextField jTextField = new JTextField(JTextField.LEFT);

    static class mylistener implements ActionListener{
        public  void actionPerformed(ActionEvent e){
            String temp = e.getActionCommand();
            jTextField.setText(jTextField.getText()+temp);
        }
    }

    public static void main(String[] args){
        jFrame.setLayout(null);
        jFrame.setSize(280,280);
        jFrame.setResizable(false);
        jTextField.setBounds(30,20,200,25);
//        jTextField.setBackground(Color.gray);
//        jTextField.setText("abcdefg");
        jPanel.setBounds(30,50,200,150);
        jTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                jFrame.dispose();
            }
        });
        for(int i = 0 ;i<9;i++){
            JButton j = new JButton(Integer.toString(i+1));
            j.addActionListener(new mylistener());
            jPanel.add(j);

        }
        container.add(jTextField);
        container.add(jPanel);
        jFrame.setVisible(true);
    }
}

