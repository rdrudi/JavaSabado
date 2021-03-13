package util;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Configuracao {
	
	public static void lookAndFeel(String laf) {
		  try {
		    for (LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
		      if (laf.equals(info.getName())) {
		        UIManager.setLookAndFeel(info.getClassName());
		        break;
		      }
		    }
		  } catch (UnsupportedLookAndFeelException | ClassNotFoundException | 	  	    InstantiationException | IllegalAccessException e) {
		            System.out.println("Erro: " + e.getMessage());
		            e.printStackTrace();
		  }
	}	

}
