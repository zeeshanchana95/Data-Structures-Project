import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Toolkit;
import java.awt.Label;
import java.awt.Font;

public class SwingTester {
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {    
      JFrame frmSorter = new JFrame("SORTER");
      frmSorter.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Desktop\\Images\\Blue-Documents-icon.png"));
      frmSorter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frmSorter);
      frmSorter.setSize(600, 200);   
      frmSorter.setLocationRelativeTo(null);  
      frmSorter.setVisible(true);
   }

   private static void createUI(final JFrame frame){  
      JPanel panel = new JPanel();
      panel.setBackground(Color.CYAN);
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Sort Files");
      button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\New folder (2)\\icons8-folder-64.png"));
      JButton button2 = new JButton(" Delete a File !");
      button2.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\New folder (2)\\download (1).png"));
      JButton button4 = new JButton(" Open a File !");
      button4.addFocusListener(new FocusAdapter() {
      });
      button4.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\New folder (2)\\download.png"));
      button4.setForeground(Color.BLACK);
      JButton button5 = new JButton(" Remove duplicate Files !");
      button5.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\New folder (2)\\icons8-merge-files-64.png"));
      button5.setSelectedIcon(new ImageIcon("C:\\Users\\user\\Desktop\\New folder\\icons8-diff-files-64.png"));

      final JLabel label = new JLabel();

      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int option = fileChooser.showOpenDialog(frame);
            if(option == JFileChooser.APPROVE_OPTION){
               File file = fileChooser.getSelectedFile();
               label.setText(file.getAbsolutePath());
               FindFolder A=new FindFolder(label.getText());
         	  A.Create();
         	 Linkedlist a=new Linkedlist();
         	a.addAtStart(label.getText());
        	
        	try {
				A.sot(a);
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
         	

         	  JDialog d=new JDialog (frame,"Sort");
         	  JLabel lp=new JLabel ("Sorted successfully");
         	  d.getContentPane().add(lp);
         	  d.setSize(100, 100);
         	  d.setVisible(true);
            }else{
            	JDialog d=new JDialog (frame,"Sort");
           	  JLabel lp=new JLabel ("Sorted unsuccessfully");
           	  d.getContentPane().add(lp);
           	  d.setSize(100, 100);
           	  d.setVisible(true);
            }
         }
      });
     
      button2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             JFileChooser fileChooser = new JFileChooser();
             fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
             int option = fileChooser.showOpenDialog(frame);
             if(option == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                label.setText(file.getAbsolutePath());
                FindFolder A=new FindFolder(label.getText());
          	  A.Delete();
          	  JDialog d=new JDialog (frame,"Deleted");
          	  JLabel lp=new JLabel ("Deleted successfully");
          	  d.getContentPane().add(lp);
          	  d.setSize(100, 100);
          	  d.setVisible(true);
          			  
             }else{
            		JDialog d=new JDialog (frame,"Delete");
                 	  JLabel lp=new JLabel ("Not selected any file Delete Unsuccessful");
                 	  d.getContentPane().add(lp);
                 	  d.setSize(280	, 150);
                 	  d.setVisible(true);
             }
          }
       });
      button4.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             JFileChooser fileChooser = new JFileChooser();
             fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
             int option = fileChooser.showOpenDialog(frame);
             if(option == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                label.setText(file.getAbsolutePath());
                FindFolder A=new FindFolder(label.getText());
          	  A.OpenFile();
          			  
             }else{
            		JDialog d=new JDialog (frame,"Open");
                 	  JLabel lp=new JLabel ("Not selected any file ");
                 	  d.getContentPane().add(lp);
                 	  d.setSize(280	, 150);
                 	  d.setVisible(true);
             }
          }
       });button5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              JFileChooser fileChooser = new JFileChooser();
              fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
              int option = fileChooser.showOpenDialog(frame);
              if(option == JFileChooser.APPROVE_OPTION){
                 File file = fileChooser.getSelectedFile();
                 label.setText(file.getAbsolutePath());
                 FindFolder A=new FindFolder(label.getText());
                 Linkedlist a=new Linkedlist();
              	a.addAtStart(label.getText());
                a.remove_duplicates();
                
                JDialog d=new JDialog (frame,"Duplicated");
           	  JLabel lp=new JLabel ("Duplicated Deleted");
           	  d.getContentPane().add(lp);
           	  d.setSize(100, 100);
           	  d.setVisible(true);
              }
           }
       });
    
      panel.add(button4);
      panel.add(button2);
      JButton button3 = new JButton(" Rename a File !");
      button3.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\New folder (2)\\icons8-edit-file-64.png"));
      button3.setSelectedIcon(new ImageIcon("C:\\Users\\user\\Desktop\\New folder\\icons8-edit-file-64.png"));
      button3.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             JFileChooser fileChooser = new JFileChooser();
             fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
             int option = fileChooser.showOpenDialog(frame);
             if(option == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                label.setText(file.getPath());
                JTextField f=new JTextField();
      
                String result=(String)JOptionPane.showInputDialog(frame,"Rename your File","Rename",JOptionPane.PLAIN_MESSAGE,null,null,"");
                FindFolder A=new FindFolder(label.getText());
                A.Rename(result);
          	 		  
             }else{
            		JDialog d=new JDialog (frame,"Rename");
                 	  JLabel lp=new JLabel ("Not selected any file rename Unsuccessful");
                 	  d.getContentPane().add(lp);
                 	  d.setSize(280	, 150);
                 	  d.setVisible(true);
             }
          }
       });
      panel.add(button3);
      
      Label label_1 = new Label("By : Ismail & Zeeshan");
      label_1.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 14));
      panel.add(label_1);
      panel.add(button);
      panel.add(button5);

      frame.getContentPane().add(panel, BorderLayout.CENTER);    
   }  
}
