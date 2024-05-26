import java.awt.*;
import java.awt.event.*;
class Addition implements ActionListener
{
    Frame f;
    TextField tf,tf1,tf2;
    Label l,l1,l2;
    Button b,b1;
    Addition(String s)
	{
	    f = new Frame(s);
	    b = new Button("Sum");
	    b1= new Button("Cancel");
	    l = new Label("First No.:");
	    l1= new Label("Second No.");
	    l2= new Label("Addition:");
	    tf= new TextField();
	    tf1= new TextField();
	    tf2= new TextField();

	    l.setBounds(40,40,50,30);
	    tf.setBounds(150,40,50,30);
	    l1.setBounds(40,100,50,30);
	    tf1.setBounds(150,100,50,30);
	    l2.setBounds(40,180,50,30);
	    tf2.setBounds(150,180,50,30);
	    b.setBounds(40,250,50,30);
	    b1.setBounds(150,250,50,30);

            b.addActionListener(this);
            b1.addActionListener(this);

	    f.add(l);
	    f.add(l1);
	    f.add(l2);
	    f.add(tf);
	    f.add(tf1);
	    f.add(tf2);
	    f.add(b);
	    f.add(b1);

	    f.setLayout(null);
	    f.setSize(500,500);
	    f.setVisible(true);
	}
    public void actionPerformed(ActionEvent e)
	{
	    if(e.getSource()==b)
		{
		    String s1 = tf.getText();
		    String s2 = tf1.getText();
                    int n1 = Integer.parseInt(s1);
                    int n2 = Integer.parseInt(s2);
		    int n3 = n1+n2;
		    tf2.setText(String.valueOf(n3));
		    //Float f1 = Float.valueOf(s1);
		    //float f2 = f1.floatValue();
		}
	    if(e.getSource()==b1)
		{
		    tf.setText(" ");
		    tf1.setText(" ");
		    tf2.setText(" ");
		}
	}
    public static void main(String... S)
	{
	    new Addition("Sum");
	}
}