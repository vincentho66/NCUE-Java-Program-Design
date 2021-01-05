import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Q10_2 {
    static JFrame jFrame = new JFrame("電子字典");
    static Container container = jFrame.getContentPane();
    static SpringLayout springLayout = new SpringLayout();

    static JTextField jTextField = new JTextField(10);
    static JLabel jLabel0 = new JLabel("電子字典");
    static JLabel jLabel1 = new JLabel("英文單字");
    static JLabel jLabel2 = new JLabel("中文:");
    static JLabel jLabel3 = new JLabel("");
    static JLabel jLabel4 = new JLabel("例句:");
    static JLabel jLabel5 = new JLabel("");
    static JButton jButton = new JButton("查詢");

    public static void main(String args[]){
        setjFrame();
        jButton.addActionListener(new mylistener());
    }

    public static void setjFrame(){
        jFrame.setSize(800,400);
        container.setLayout(springLayout);
        container.add(jLabel0);
        container.add(jLabel1);
        container.add(jLabel2);
        container.add(jLabel3);
        container.add(jLabel4);
        container.add(jLabel5);
        container.add(jTextField);
        container.add(jButton);
        springLayout.putConstraint(SpringLayout.WEST,jLabel0,150,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jLabel0,10,SpringLayout.NORTH,container);

        springLayout.putConstraint(SpringLayout.WEST,jLabel1,50,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jLabel1,10,SpringLayout.SOUTH,jLabel0);

        springLayout.putConstraint(SpringLayout.WEST,jTextField,20,SpringLayout.EAST,jLabel1);
        springLayout.putConstraint(SpringLayout.NORTH,jTextField,10,SpringLayout.SOUTH,jLabel0);

        springLayout.putConstraint(SpringLayout.WEST,jButton,20,SpringLayout.EAST,jTextField);
        springLayout.putConstraint(SpringLayout.NORTH,jButton,10,SpringLayout.SOUTH,jLabel0);

        springLayout.putConstraint(SpringLayout.WEST,jLabel2,50,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jLabel2,10,SpringLayout.SOUTH,jButton);

        springLayout.putConstraint(SpringLayout.WEST,jLabel3,20,SpringLayout.EAST,jLabel2);
        springLayout.putConstraint(SpringLayout.NORTH,jLabel3,10,SpringLayout.SOUTH,jButton);

        springLayout.putConstraint(SpringLayout.WEST,jLabel4,50,SpringLayout.WEST,container);
        springLayout.putConstraint(SpringLayout.NORTH,jLabel4,10,SpringLayout.SOUTH,jLabel3);

        springLayout.putConstraint(SpringLayout.WEST,jLabel5,20,SpringLayout.EAST,jLabel4);
        springLayout.putConstraint(SpringLayout.NORTH,jLabel5,10,SpringLayout.SOUTH,jLabel3);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class mylistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); // Load the JDBC driver
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/AAA/IdeaProjects/work/src/dictionary.mdb");//Connect to the databse
                System.out.println("資料庫連線測試成功！");
                Statement stmt=con.createStatement();


                ResultSet rs=stmt.executeQuery("select * from dictionary where eng='"+jTextField.getText()+"'");
                if(rs.next()){
                    jLabel3.setText(rs.getString("ch"));
                    jLabel5.setText(rs.getString("sentence"));
                }else{
                    jLabel3.setText("null");
                    jLabel5.setText("");
                }

            }
            catch(ClassNotFoundException ex)
            {
                System.out.println("找不到驅動程式類別");
                ex.printStackTrace();
            }
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }

}

