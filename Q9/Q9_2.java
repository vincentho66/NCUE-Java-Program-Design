import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q9_2 {
    static JFrame jFrame = new JFrame();
    static Container container = jFrame.getContentPane();
//    static FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER,5,20);

    static JLabel title = new JLabel("BMI指數計算");
    static JLabel h = new JLabel("身高(cm):");
    static JTextField ht = new JTextField(20);
    static JLabel w = new JLabel("體重(kg):");
    static JTextField wt = new JTextField(20);
    static JLabel ans = new JLabel("診斷結果:");
    static JLabel ans2 = new JLabel("");
    static JButton jb = new JButton("看結果");
    static SpringLayout springLayout = new SpringLayout();

    static class mylistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double sum = 0;
            NumberFormat formatter = new DecimalFormat("#0.00");
            try{
                sum = Double.parseDouble(wt.getText())/Math.pow(Double.parseDouble(ht.getText())/100,2);
                if(sum >= 35){
                    ans2.setText("BMI = "+formatter.format(sum)+"(重度肥胖)");
                    ans2.setForeground(Color.red);
                }else if(sum >= 30){
                    ans2.setText("BMI = "+formatter.format(sum)+"(中度肥胖)");
                    ans2.setForeground(Color.red);
                }else if(sum >= 27){
                    ans2.setText("BMI = "+formatter.format(sum)+"(輕度肥胖)");
                    ans2.setForeground(Color.red);
                }else if(sum >= 24){
                    ans2.setText("BMI = "+formatter.format(sum)+"(過重)");
                    ans2.setForeground(Color.red);
                }else if(sum >= 18.5){
                    ans2.setText("BMI = "+formatter.format(sum)+"(正常範圍)");
                    ans2.setForeground(Color.BLUE);
                }else{
                    ans2.setText("BMI = "+formatter.format(sum)+"(體重過輕)");
                    ans2.setForeground(Color.red);
                }
            }catch (NumberFormatException exception){
                ans2.setText("error");
            }
        }
    }

    public static void main(String arg[]){
        jFrame.setSize(400,400);

        container.setLayout(springLayout);
        container.add(title);
        container.add(h);
        container.add(ht);
        container.add(w);
        container.add(wt);
        container.add(ans);
        container.add(ans2);
        container.add(jb);
        springLayout.putConstraint(SpringLayout.WEST,title,150,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,title,10,SpringLayout.NORTH,container);
        springLayout.putConstraint(SpringLayout.NORTH,h,30,SpringLayout.SOUTH,title);
        springLayout.putConstraint(SpringLayout.WEST,h,50,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,ht,30,SpringLayout.SOUTH,title);
        springLayout.putConstraint(SpringLayout.WEST,ht,10,SpringLayout.EAST,h);
        springLayout.putConstraint(SpringLayout.NORTH,w,30,SpringLayout.SOUTH,h);
        springLayout.putConstraint(SpringLayout.WEST,w,50,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,wt,30,SpringLayout.SOUTH,h);
        springLayout.putConstraint(SpringLayout.WEST,wt,10,SpringLayout.EAST,w);
        springLayout.putConstraint(SpringLayout.NORTH,ans,80,SpringLayout.SOUTH,w);
        springLayout.putConstraint(SpringLayout.WEST,ans,50,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,ans2,80,SpringLayout.SOUTH,w);
        springLayout.putConstraint(SpringLayout.WEST,ans2,10,SpringLayout.EAST,ans);
        springLayout.putConstraint(SpringLayout.NORTH,jb,50,SpringLayout.SOUTH,ans2);
        springLayout.putConstraint(SpringLayout.WEST,jb,150,SpringLayout.WEST,container);
        jb.addActionListener(new mylistener());

//        springLayout.putConstraint(SpringLayout.WEST,ht,100,SpringLayout.EAST,h);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
