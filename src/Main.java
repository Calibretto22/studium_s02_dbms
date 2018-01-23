// shit is on fire, yo


package studium_s02_dbms;

import jdbc.*; 

public class dbconnect {

	try{
		 Connection con = DriverManager.getConnection("jdbc:mysql://bonny.cs.tu-berlin.de/Willi", “uid", “pwd");
		 Statement st = con.createStatement();
		 String anweisungstext = "SELECT * FROM Student";
		 ResultSet rs = st.executeQuery(anweisungstext);
		 while (rs.next() == true) {
		int inhaltMatNr = rs.getInt("matnr");
		String inhaltName = rs.getString(2);
		System.out.println(inhaltMatNr + "\t" + inhaltName);
		 }
		 rs.close();
		 st.close();
		 con.close();
		}catch(Exception e) {
		 System.out.println("Fehler bei der Datenbankabfrage: " + e);
		}
}
