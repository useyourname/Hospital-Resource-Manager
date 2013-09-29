	/**
		A class that constructs objects containing information about hospital beds
		@version 1.0 2012-03-03
		@author useyourname
	*/
   public class SurgicalTeam
   {
   	//instance variables
      private String MD; //medical doctor name
      private int patientID; //ID of patient assigned to MD
      private String pagerNum; //the pager number of the MD
   	
   	/**
   		Constructs a <code>SurgicalTeam</code>.
   	*/		
      public SurgicalTeam()
      {
         MD = "";
         patientID = Integer.MAX_VALUE;
         pagerNum = "";
      }//end of SurgicalTeam()
   	
   	//accessors
   	/**
   		Returns the name of the MD
   		@return the name of the MD
   	*/
      public String getMD()
      {
         return MD;
      }//end of getMD()
				   	
   	/**
   		Returns the pager number of the MD
   		@return the pager number of the MD 
   	*/
      public String getPagerNum()
      {
         return pagerNum;
      }//end of getPagerNum()
   	
   	/**
   		Returns the ID of the patient assigned to this <code>SurgicalTeam</code>
   		@return the ID of the patient assigned to this <code>SurgicalTeam</code>
   	*/
      public int getPatientID()
      {
         return patientID;
      }//end of getPatientID()
   	
		/**
			Returns a String representation of this <code>SurgicalTeam</code>.
		*/
		public String toString()
		{
			return MD + "#" + pagerNum + "#";
		}//end of toString()
		
   	//mutators
   	/**
   		Sets the medical doctor name in this <code>SurgicalTeam</code>
   		@param MD the name of the medical doctor
   	*/
      public void setMD(String MD)
      {
         this.MD = MD;
      }//end of setMD(String MD)
		
   	/**
   		Sets the pager number of the MD.
   		@param pagerNum the pager number of the MD
   	*/
      public void setPagerNum(String pagerNum)
      {
         this.pagerNum = pagerNum;
      }//end of setPagerNum(String pagerNum)
   	
   	/**
   		Sets the ID of the patient assigned to this <code>SurgicalTeam</code>.
   		@param patientID the ID of the patient assigned to this
   		<code>SurgicalTeam</code><br />
   	*/
      public void setPatientID(int patientID)
      {
         this.patientID = patientID;
      }//end of setPatientID(String patientID)	
   }//end of class SurgicalTeam