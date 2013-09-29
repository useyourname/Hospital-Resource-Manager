 	/**
 	   An abstract data structure called a <code>Nurse</code>.
		@version 1.0 2012-03-02
		@author useyourname
 	*/
   public class Nurse
   {
		//private class variables
		private static int IDCreator = 1000;
		//private instance variables
      private String firstName;
      private String familyName;
      private int ID;
   	
   	/**
   		Constructs a Nurse with the specified data and a link to
   		a Nurse which follows this Nurse.
   	*/
      public Nurse()
      {
         firstName = "";
         familyName = "";
         ID = IDCreator;
			IDCreator++;
      }//end of constructor public Nurse()
   	
   	//accessors			   	
   	/**
   		Returns the family name of this <code>Nurse</code>.
   		@return the family name of this <code>Nurse</code>
   	*/
      public String getFamilyName()
      {
         return familyName;
      }//end getFamilyName()
			
   	/**
   		Returns the first name of this <code>Nurse</code>.
   		@return the first name of this <code>Nurse</code>
   	*/
      public String getFirstName()
      {
         return firstName;
      }//end of getFirstName()
   	
   	/**
   		Returns the ID of this <code>Nurse</code>.
   		@return the ID of this <code>Nurse</code>
   	*/
      public int getID()
      {
         return ID;
      }//end of getID()
		
		/**
			Returns a String representation of this <code>Nurse</code>.
			@return a String representation of this <code>Nurse</code>
		*/
   	public String toString()
		{
			return firstName + "#" + familyName + "#" + ID + "#";
		}//end of toString()
		
   	//mutators   	
   	/**
   		Sets the family name of this <code>Nurse</code>.
   		@param familyName the family name of this <code>Nurse</code><br />
   	*/
      public void setFamilyName(String familyName)
      {
         this.familyName = familyName;
      }//end of setFamilyName(String familyName)
		
   	/**
   		Sets the first name of the <code>Nurse</code>.
   		@param firstName the first name of this <code>Nurse</code><br />
   	*/
      public void setFirstName(String firstName)
      {
         this.firstName = firstName;
      }//end of setFirstName(String firstName)
   	
   	/**
   		Sets the ID of this <code>Nurse</code>.
   		@param ID the ID of this <code>Nurse</code><br />
   	*/
      public void setID(int ID)
      {
         this.ID = ID;
      }//end of setID(int ID)
   }//end of class Nurse