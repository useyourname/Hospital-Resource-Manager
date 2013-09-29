	/**
 	   A data structure called a <code>Patient</code> which containts information
		about a Patient.
		@version 1.0 2012-03-02
		@author useyourname
 	*/
   public class Patient
   {
   	//public class constants
   	//the code for the gender <code>male</code>
      public static final char MALE = 'm';
   	//the code for the gender <code>female</code>
      public static final char FEMALE = 'f';
   	//the code for the gender <code>transgendered</code>
      public static final char TRANSGENDERED = 't';
   	//the code for the word 'yes'
      public static final char YES = 'y';
   	// the code for the word 'no'
      public static final char NO = 'n';
		
		//private class variables
		private static int IDCreator = 1000;
   	
   	//instance fields
      private String firstName;
      private String familyName;
      private String marital;
      private String address;
      private String postalCode;
      private String healthCondition;
      private String medication;
      private String nurseAssigned;
      private int ID;
      private int age;		
      private String telephone;
      private String cellphone;
      private int aptNumber;
      private int bedNum;
      private int roomNum;
      private char gender;
      private char healthInsurance;
      private double amountDue;
       	
   	/**
   		Constructs a <code>Patient</code> with the specified data and a link to
   		a <code>Patient</code> which follows this <code>Patient</code>.
   	*/
		//mastery aspect: object as data record
      public Patient()
      {
         firstName = "";
         familyName = "";
         marital = "";
         address = "";
         postalCode = "";
         healthCondition = "";
         medication = "";
         nurseAssigned = "";
         ID = IDCreator;
         age = Integer.MAX_VALUE;
         telephone = "";
         cellphone = "";
         bedNum = Integer.MAX_VALUE;
         roomNum = Integer.MAX_VALUE;
         gender = TRANSGENDERED;
         healthInsurance = ' ';
         amountDue = Double.MAX_VALUE;  
			IDCreator++;    	
      }//end of constructor Patient(Patient next)
   	
   	//accessors
   	/**
   		Returns the first name of <code>Patient</code>.
   		@return first name of <code>Patient</code>
   	*/
      public String getFirstName()
      {
         return firstName;
      }//end getFirstName()
   	
   	/**
   		Returns the family name of the <code>Patient</code>.
   		@return family name of <code>Patient</code>
   	*/
      public String getFamilyName()
      {
         return familyName;
      }//end getfamilyName()
   	
   	/**
   		Returns the marital status of the <code>Patient</code>.
   		@return marital status of the <code>Patient</code>
   	*/
      public String getMarital()
      {
         return marital;
      }//end of getMarital()
   	
   	/**
   		Returns the address of the <code>Patient</code>.
   		@return address of the <code>Patient</code>
   	*/
      public String getAddress()
      {
         return address;
      }//end of getAddress()
   	
   	/**
   		Returns the postal code of the <code>Patient</code>.
   		@return returns postal code of the <code>Patient</code>
   	*/
      public String postalCode()
      {
         return postalCode;
      }//end of postalCode()
   	
   	/**
   		Returns the health condition of the <code>Patient</code>.
   		@return the health condition of the <code>Patient</code>
   	*/
      public String getHealthCondition()
      {
         return healthCondition;
      }//end of getHealthCondition()
   	
   	/**
   		Returns the medication that the <code>Patient</code> is taking.
   		@return medication that the <code>Patient</code> is taking
   	*/
      public String getMedication()
      {
         return medication;
      }//end getMedication()
   	
   	/**
   		Returns <code>Patient</code> ID.
   		@return <code>Patient</code> ID
   	*/
      public int getID()
      {
         return ID;
      }//end of getID()
   	
   	/**
   		Returns <code>Patient</code> age.
   		@return the age of the <code>Patient</code>		
   	*/
      public int getAge()
      {
         return age;
      }//end of getAge()
   	
   	/**
   		Returns <code>Patient</code> telephone number.
   		@return the telephone number of the <code>Patient</code>
   	*/
      public String getTelephone()
      {
         return telephone;
      }//end of getTelephone()
   	
   	/**
   		Returns <code>Patient</code> cellphone number.
   		@return the cellphone number of the <code>Patient</code>
   	*/
      public String getCellphone()
      {
         return cellphone;
      }//end of getCellphone()
   	
   	/**
   		Returns <code>Patient</code> bed number.
   		@return the bed number of the <code>Patient</code>
   	*/
      public int getBedNum()
      {
         return bedNum;
      }//end of getBedNum()
   	
   	/**
   		Returns <code>Patient</code> room number.
   		@return the room number of the room the <code>Patient</code> is assigned to
   	*/
      public int getRoomNum()
      {
         return roomNum;
      }//end of getRoomNum()
   	
   	/**
   		Returns <code>Patient</code> gender.
   		@return character 'm' or 'f' representing gender of the <code>Patient</code>
   	*/
      public char getGender()
      {
         return gender;
      }//end getGender()
   	
   	/**
   		Returns whether <code>Patient</code> has private health insurance.
   		@return character 'y' or 'n' denoting whether the <code>Patient</code> 
   		has private health insurance or not
   	*/	
      public char getHealthInsurance()
      {
         return healthInsurance;
      }//end getHealthInsurance()
   	
   	/**
   		Returns the amount the <code>Patient</code> has due.
   		@return the amount the <code>Patient</code> has due to the hospital
   	*/
      public double getAmountDue()
      {
         return amountDue;
      }//end of getAmountDue()
		
		/**
			Returns a String representation of this <code>Patient</code>.
			@return a String representation of this <code>Patient</code>
		*/
   	public String toString()
		{
			return firstName + "#"
         	+ familyName + "#"
         	+ marital + "#"
         	+ address + "#"
         	+ postalCode + "#"
         	+ healthCondition + "#"
         	+ medication + "#"
         	+ nurseAssigned + "#"
         	+ ID  + "#"
         	+ age + "#"
         	+ telephone + "#"
         	+ cellphone + "#"
         	+ bedNum + "#"
         	+ roomNum + "#"
         	+ gender + "#";
		}//end of toString()
   	//mutators
   	/**
   		Sets the first name of the <code>Patient</code>.
   		@param firstName the first name of the <code>Patient</code><br />
   	*/
      public void setFirstName(String firstName)
      {
         this.firstName = firstName;
      }//end of setFirstName(String firstName)
   	
   	/**
   		Sets the family name of the <code>Patient</code>.
   		@param familyName the family name of the <code>Patient</code><br />
   	*/
      public void setFamilyName(String familyName)
      {
         this.familyName = familyName;
      }//end of setFirstName(String familyName)
   	
   	/**
   		Sets the marital status of the <code>Patient</code>.
   		@param marital the marital status of the <code>Patient</code><br />
   	*/
      public void setMarital(String marital)
      {
         this.marital = marital;
      }//end of setMarital(String marital)
   	
   	/**
   		Sets the address of the <code>Patient</code>.
   		@param address the address of the <code>Patient</code><br />
   	*/
      public void setAddress(String address)
      {
         this.address = address;
      }//end setAddress(String address)
   	
   	/**
   		Sets the postal code of the <code>Patient</code>.
   		@param postalCode the postal code of the <code>Patient</code><br />
   	*/
      public void setPostalCode(String postalCode)
      {
         this.postalCode = postalCode;
      }//end of setPostalCode()
   	
   	/**
   		Defines the health condition of the <code>Patient</code>.
   		@param healthCondition health condition of the <code>Patient</code><br />
   	*/
      public void setHealthCondition(String healthCondition)
      {
         this.healthCondition = healthCondition;
      }//end of setHealthCondition(String healthCondition)
   	
   	/**
   		Defines the medication that the <code>Patient</code> needs.
   		@param medication the medication needed by the <code>Patient</code><br />
   	*/
      public void setMedication(String medication)
      {
         this.medication = medication;
      }//end of setMedication(String medication)
   	
   	/**
   		Sets the ID of the <code>Patient</code>.
   		@param ID the ID of the <code>Patient</code><br />
   	*/
      public void setID(int ID)
      {
         this.ID = ID;
      }//end of setID(int ID)
   	
   	/**
   		Sets the age of the <code>Patient</code>.
   		@param age the age of the <code>Patient</code><br />
   	*/
      public void setAge(int age)
      {
         this.age = age;
      }//end of setAge(int age)
   	
   	/**
   		Sets the telephone number of the <code>Patient</code>.
   		@param telephone the telephone number of the <code>Patient</code><br />
   	*/
      public void setTelephone(String telephone)
      {
         this.telephone = telephone;
      }//end of setTelephone(String telephone)
   	
   	/**
   		Sets the cellphone number of the <code>Patient</code>.
   		@param cellphone the cellphone number of the <code>Patient</code><br />
   	*/
      public void setCellphone(String cellphone)
      {
         this.cellphone = cellphone;
      }//end of setcellPhone(String cellphone)
   	
   	/**
   		Sets the bed number of the <code>Patient</code>.
   		@param bedNum the bed number of the <code>Patient</code><br />
   	*/
      public void setBedNum(int bedNum)
      {
         this.bedNum = bedNum;
      }//end of setBedNum(int bedNum)
   	
   	/**
   		Sets the room number of the <code>Patient</code>.
   		@param roomNum the room number of the <code>Patient</code><br />
   	*/
      public void setRoomNum(int roomNum)
      {
         this.roomNum = roomNum;
      }//end of setRoomNum(int roomNum)
   	
   	/**
   		Sets the gender of the <code>Patient</code>.
   		@param gender the gender of the <code>Patient</code><br />
   		(precondition: gender must be one of the relevant class constants)
   	*/
      public void setGender(char gender)
      {
         this.gender = gender;
      }//end of setGender(char gender)
   	
   	/**
   		Sets whether the <code>Patient</code> has private health insurance.
   		@param healthInsurance a character showing whether the 
   		<code>Patient</code> has health insurance<br />
   		(precondition: parameter must be one of the relevant class constants)
   	*/
      public void setHealthInsurance(char healthInsurance)
      {
         this.healthInsurance = healthInsurance;
      }//end of setHealthInsurance(char healthInsurance)
		
		/**
			Sets the nurse assigned to this <code>Patient</code>
			@param nurseAssigned family name of nurse assigned
		*/
		public void setNurseAssigned(String nurseAssigned)
		{
			this.nurseAssigned = nurseAssigned;
		}//end of setNurseAssigned(String nurseAssigned)
   	
   	/**
   		Sets the amount due by the <code>Patient</code>.
   		@param amountDue the amount the <code>Patient</code> has to pay<br />
   	*/
      public void setAmountDue(double amountDue)
      {
         this.amountDue = amountDue;
      }//end of setAmountDue(double amountDue)
   }//end of class Patient