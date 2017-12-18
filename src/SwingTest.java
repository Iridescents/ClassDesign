import javax.swing.JOptionPane;
import javax.swing.*;
public class SwingTest {
	public static void main(String[] args){
		//JOptionPane.showMessageDialog(null,"要努力学好JAVA语言","使用Swing对话框实现输出",2);
		int max,i=0,j=0;
		String n,m;
		n=JOptionPane.showInputDialog(null," 输入第一个整数");
		m=JOptionPane.showInputDialog(null," 输入第二个整数");
		i=Integer.parseInt(n);
		j=Integer.parseInt(m);
		max=i>j?i:j;
		JOptionPane.showMessageDialog(null, i+"和"+j+"的最大数是"+max,"使用Swing对话框实现输出",1);
		//System.exit(0);
	}

}
