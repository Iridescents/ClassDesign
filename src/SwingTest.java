import javax.swing.JOptionPane;
import javax.swing.*;
public class SwingTest {
	public static void main(String[] args){
		//JOptionPane.showMessageDialog(null,"ҪŬ��ѧ��JAVA����","ʹ��Swing�Ի���ʵ�����",2);
		int max,i=0,j=0;
		String n,m;
		n=JOptionPane.showInputDialog(null," �����һ������");
		m=JOptionPane.showInputDialog(null," ����ڶ�������");
		i=Integer.parseInt(n);
		j=Integer.parseInt(m);
		max=i>j?i:j;
		JOptionPane.showMessageDialog(null, i+"��"+j+"���������"+max,"ʹ��Swing�Ի���ʵ�����",1);
		//System.exit(0);
	}

}
