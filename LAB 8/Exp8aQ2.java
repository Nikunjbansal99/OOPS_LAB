import javax.swing.JOptionPane;
public class Exp8aQ2
{
	public static void main (String []args)
	{
		String s=JOptionPane.showInputDialog("Input String ");
		int N = s.length();
		String OrigString=s;
		s=s.toUpperCase();
		StringBuffer stringbuf= new StringBuffer();
		for(int x=0;x<N;x++)
		{
			stringbuf.append(""+s.charAt(x));
			stringbuf.append("\n\n");
		}
		String ModfString="";
		ModfString= stringbuf.toString();
		JOptionPane.showMessageDialog(null,"~~~~~~~~~~~~ORIGINAL STRING~~~~~~~~~~~~\n\n" +OrigString+
		"\n\n~~~~~~~~~~~~MODIFIED STRING~~~~~~~~~~~~\n\n"+ModfString);
	}    
}

