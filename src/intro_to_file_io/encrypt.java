package intro_to_file_io;

import java.awt.List;

import javax.swing.JOptionPane;

public class encrypt {
public static void main(String[] args) {
String decrypt = "";
String crypt = "";
String message = JOptionPane.showInputDialog("Type message you want encrypted");

for (int i = 0; i < message.length(); i++) {
	
crypt+= message.charAt(i)+1;
crypt+= " ";
}
String[] part = crypt.split(" ");
System.out.println(part);
JOptionPane.showMessageDialog(null, crypt);
for (int i = 0; i < part.length; i++) {
	System.out.println(part[i]);
	int sum = Integer.parseInt(part[i])-1;
	String var = Character.toString((char)sum);
	decrypt = decrypt+var;
}
JOptionPane.showMessageDialog(null, decrypt);

//


//JOptionPane.showMessageDialog(null, crypt);	



}
}
