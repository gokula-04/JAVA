import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.*;
class Button implements ActionListener{
TextField t=new TextField("Check your remark");
JButton p=new JButton("10-9");
JButton q=new JButton("9-8");
JButton r=new JButton("8-7");
JButton s=new JButton("7-6");
JButton u=new JButton("Below 6");
JButton h=new JButton("RESET");
JFrame f=new JFrame("javafx");

public Button()
{
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.add(t);
p.addActionListener(this);
q.addActionListener(this);
r.addActionListener(this);
s.addActionListener(this);
u.addActionListener(this);
h.addActionListener(this);
f.add(p);
f.add(q);
f.add(r);
f.add(s);
f.add(u);
f.add(h);
f.setSize(600,300);
f.setLayout(new FlowLayout());
f.setVisible(true);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==p)
t.setText("Out standing");
else if(e.getSource()==q)
t.setText("Excellent");
else if(e.getSource()==r)
t.setText("Very good");
else if(e.getSource()==s)
t.setText("Good");
else if(e.getSource()==u)
t.setText("Need to improve");
else if(e.getSource()==h)
t.setText("Check your remark");
else
t.setText(" ");
}

public static void main(String args[]){
new Button();
}}
