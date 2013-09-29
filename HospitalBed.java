	/**
		A class that constructs objects containing information about hospital beds
		@version 1.0 2012-03-03
		@author useyourname
	*/
   public class HospitalBed
   {
		//instance variables
		private int ID; //the ID of the patient assigned to this hospital bed
      private int bedNum;	
      private int roomNum;
		private String empty;
   
	  	/**
   		Constructs a <code>HospitalBed</code>.
   	*/
      public HospitalBed()
      {
         ID = Integer.MAX_VALUE;
         bedNum = Integer.MAX_VALUE;
         roomNum = Integer.MAX_VALUE;
      }//end of HospitalBed()
   
   	//accessors
		//mastery aspect: user defined method
		/**
   		Returns the bed number of the patient that occupies this <code>HospitalBed</code>.
   		@return the bed number of the patient that occupies this <code>HospitalBed</code>
   	*/
      public int getBedNumber()
      {
         return bedNum;
      }//end of getBedNumber()
		
		//mastery aspect: user defined method with return value
   	/**
   		Returns the ID of the patient that occupies this <code>HospitalBed</code>.
   		@return the ID of the patient that occupies this <code>HospitalBed</code>
   	*/
      public int getID()
      {
         return ID;
      }//end of getID()
   	
   	/**
   		Returns the room number of the patient that occupies this <code>HospitalBed</code>.
   		@return the room number of the patient that occupies this <code>HospitalBed</code>
   	*/
      public int getRoomNumber()
      {
         return roomNum;
      }//end of getBedNumber()
		
		/**
			Returns a String representation of this <code>HospitalBed</code>.
			@return a String representation of this <code>HospitalBed</code>
		*/
   	public String toString()
		{
			return ID + "#" + bedNum + "#" + roomNum + "#";
		}//end of toString()
		
		//mutators
		//mastery aspect: user defined methods with parameters
		/**
			Sets the bed number of the bed
			@param bedNum the bed number of the bed
			(precondition: bedNum must positive)
		*/
		public void setBedNum(int bedNum)
		{
			if(bedNum > 0)
			{
				this.bedNum = bedNum;
			}
		}//end of setBedNum(int bedNum)
		
		/**
   		Sets the ID of the of the patient on this bed.
   		@param ID the ID of the patient assigned to this bed<br />
   	*/
      public void setID(int ID)
      {
         this.ID = ID;
      }//end of setID(int ID)
		
		/**
			Sets the room number of the <code>HospitalBed</code>
			@param roomNum the room number of the <code>HospitalBed</code>
			(precondition: the room number must be positive)	
		*/
		public void setRoomNum(int roomNum)
		{
			if(roomNum > 0)
			{
				this.roomNum = roomNum;
			}
		}//end of setRoomNum(int roomNum)
   }//end of class HospitalBed