package ceasarcypher;

public class CeasarCypher {
		private String palphabet = " abcdefghijklmnopqrstuvwxyz";
		private String calphabet = " xyzabcdefghijklmnopqrstuvw";
		private String plainText;
		private String cypherText = "";
		
		public CeasarCypher(String uPText) 
		{
			plainText = uPText;
		}
		public String getCyText() 
		{
			return cypherText;
		}
		public void setCyText(String cypherText) 
		{
			this.cypherText = cypherText;
		}
		public String getPlainText() 
		{
			return plainText;	
		}
		public void encrypt() 
		{
			for (int i = 0; i < plainText.length();i++) 
			{
				char p = plainText.charAt(i);
				int loc = palphabet.indexOf(p);
				char c = calphabet.charAt(loc);
				cypherText += c;
			}
			
		}
		
}
