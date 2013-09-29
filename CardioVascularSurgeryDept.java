   import java.io.BufferedReader;
   import java.io.BufferedWriter;
   import java.io.FileWriter;
   import java.io.FileReader;
   import java.util.InputMismatchException;
   import java.lang.Integer;
   import java.io.IOException;
   import java.io.FileNotFoundException;
   import java.util.Scanner;
	   
   /**
		The main class which utilizes all the other classes
      @version 1.0 2012-3-1
      @author  useyourname
   */
   public class CardioVascularSurgeryDept
   {
   	//class variables		
      private static String flush;
   	
   	/*the counters that keep track of the total number of patients, teams, nurses
   	and hospital beds
   	*/
      private static int patientCounter = -1;
      private static int teamCounter = -1;
      private static int nurseCounter = -1;
      private static int bedCounter = -1;
   	
      private static final int SIZE = 300;
   	
   	//mastery aspect: use of arrays
      private static Patient[] Patient = new Patient[SIZE];
      private static HospitalBed[] HospitalBed = new HospitalBed[SIZE];
   	
   	//mastery aspect: user-defined objects
      private static Nurse[] Nurse = new Nurse[SIZE];
      private static SurgicalTeam[] SurgicalTeam = new SurgicalTeam[SIZE];
   	
   	//global scanner of this class
   	//mastery aspect: use of additional libraries
      public static Scanner read = new Scanner(System.in); 
   	
      public static void main(String[] arguments)
      {
         for(int i = 0; i < SIZE; i++)
         {
            Patient[i] = new Patient();
            HospitalBed[i] = new HospitalBed();
            Nurse[i] = new Nurse();
            SurgicalTeam[i] = new SurgicalTeam();
         }//end of for(int i = 0; i < SIZE; i++)
      	     	
         if(readFile("bed.text") != null)
         {
            initializeBed();
         }//end of if(readFile("bed.text") != null)
      	
         if(readFile("patient.text") != null)
         {
            initializePatient();        
         }//end of if(readFile("patient.text") != null)
      	
         if(readFile("nurse.text") != null)
         {
            initializeNurse();
         }//end of if(readFile("nurse.text") != null)
      	
         if(readFile("team.text") != null)
         {
         	initializeTeam();
         }//end of if(readFile("team.text") != null)
      				
         int mainMenu;
         do
         {
            mainMenu = mainMenu();
         	//master aspect: simple selection
            if(mainMenu == 1)
            {
               if(emergency().equals(""))
               {
                  System.out.println("There is no available space in this deparment.");
               }
               else
               {
                  System.out.println(emergency());
               }//end of if(emergency().equals(""))
            }//end of if(mainMenu() == 1)   
         	
         	//mastery aspect: complex selection; nested if structure  
            if (mainMenu == 2)
            {
               int subMenu = subMenu();
               if(subMenu == 1)
               {
                  addPatient();
               }
               if(subMenu == 2)
               {
                  addNurse();
               }
               if(subMenu == 3)
               {
                  addTeam();
               }
               if(subMenu == 4)
               {
                  addBed();
               }
            }//end of if (mainMenu() == 2)  
         
            if(mainMenu == 3)
            {
               int subMenu2 = subMenu2();
               if(subMenu2 == 1)
               {
                  if(searchPatient() != ""){System.out.println(searchPatient());}
                  else {System.out.println("The patient you were searching for was not found");}
               }
               if(subMenu2 == 2)
               {
                  if(searchNurse() != ""){System.out.println(searchNurse());}
                  else {System.out.println("The nurse you were searching for was not found");}
               }
               if(subMenu2 == 3)
               {
                  if(searchTeam() != ""){System.out.println(searchTeam());}
                  else {System.out.println("The team you were searching for was not found");}
               }
               if(subMenu2 == 4)
               {
                  if(searchBed() != ""){System.out.println(searchBed());}
                  else {System.out.println("The bed you were searching for was not found");}
               }               
            }//end of if(mainMenu() == 3)
         	
            if(mainMenu == 4)
            {
            	//mastery aspect: File I/O
               try
               {
               //these are the four writers that will write to four text files
                  BufferedWriter out1 =
                     new BufferedWriter(new FileWriter("patient.text"));					
                  BufferedWriter out2 = 
                     new BufferedWriter(new FileWriter("nurse.text"));					
                  BufferedWriter out3 = 
                     new BufferedWriter(new FileWriter("bed.text"));					
                  BufferedWriter out4 = 
                     new BufferedWriter(new FileWriter("team.text"));
               	//this for loop writes all data in this data base to a specific file
                  for(int i = 0; i <= patientCounter; i++)
                  {
                     out1.write(Patient[i].toString());
                     out1.newLine();
                  }//end of for(int i = 0; i < SIZE; i++)
               	
                  for(int i = 0; i <= nurseCounter; i++)
                  {
                     out2.write(Nurse[i].toString());
                     out2.newLine();
                  }//end of for(int i = 0; i < SIZE; i++)
               	
                  for(int i = 0; i <= bedCounter; i++)
                  {
                     out3.write(HospitalBed[i].toString());
                     out3.newLine();
                  }//end of for(int i = 0; i < SIZE; i++)
               	
                  for(int i = 0; i <= teamCounter; i++)
                  {
                     out4.write(SurgicalTeam[i].toString());
                     out4.newLine();
                  }//end of for(int i = 0; i < SIZE; i++)						
                  out1.close();
                  out2.close();
                  out3.close();
                  out4.close();
               }
                  catch(IOException io)
                  {
                     System.out.println("Error");
                  }//end of try-catch(IOException IO)
               System.exit(0); //exits the program
            }//end of if(mainMenu() == 4)
         }
         while(mainMenu != 4); //end of do-while(mainMenu() != 4);     
      }//end of method main(String[] arguments)
   	
   	/**
   		Adds a hospital bed
   	*/
      public static void addBed()
      {
         bedCounter++;
         flush = read.nextLine();
         System.out.print("Enter the room number: ");
         HospitalBed[bedCounter].setRoomNum(read.nextInt());
         System.out.print("Enter the bed number: ");
         HospitalBed[bedCounter].setBedNum(read.nextInt());
         System.out.println("Enter the ID of the patient assigned to this bed");
         System.out.print("If the bed is currently empty, input 0:  ");
         HospitalBed[bedCounter].setID(read.nextInt());
         System.out.println("The bed has been added to the system.");
      }//end of addBed 
   	   	
   	/**
   		Adds nurse to the database.
   	*/
      public static void addNurse()
      {
         nurseCounter++;
         flush = read.nextLine();
         System.out.print("Enter first name: ");
         Nurse[nurseCounter].setFirstName(read.nextLine());
         System.out.print("Enter family name: ");
         Nurse[nurseCounter].setFamilyName(read.nextLine());
         System.out.println("The nurse has been added to the database.");
      }//end of addNurse()
   	
   	/**
   		Adds patient to the database.
   	*/
      public static void addPatient()
      {
         patientCounter++;
         flush = read.nextLine();
         System.out.print("Enter first name: ");
         Patient[patientCounter].setFirstName(read.nextLine());
         System.out.print("Enter family name: ");
         Patient[patientCounter].setFamilyName(read.nextLine());
         System.out.print("Enter marital status: ");
         Patient[patientCounter].setMarital(read.nextLine());
         System.out.print("Enter current address: ");
         Patient[patientCounter].setAddress(read.nextLine());
         System.out.print("Enter postal code: ");
         Patient[patientCounter].setPostalCode(read.nextLine());
         System.out.print("Enter health condition: ");
         Patient[patientCounter].setHealthCondition(read.nextLine());
         System.out.print("Enter possible medication: ");
         Patient[patientCounter].setMedication(read.nextLine());
         System.out.print("Enter family name of nurse assigned: ");
         Patient[patientCounter].setNurseAssigned(read.nextLine());
         System.out.print("Enter age: ");
         Patient[patientCounter].setAge(read.nextInt());
         flush = read.nextLine();
         System.out.print("Enter telephone number: ");
         Patient[patientCounter].setTelephone(read.nextLine());
         System.out.print("Enter cellphone number: ");
         Patient[patientCounter].setCellphone(read.nextLine());
         System.out.print("Enter bed number that the patient is assigned to: ");
         Patient[patientCounter].setBedNum(read.nextInt());
         System.out.print("Enter room number that the patient is assigned to: ");
         Patient[patientCounter].setRoomNum(read.nextInt());
         flush = read.nextLine();
         System.out.print("Enter gender: ");			
         Patient[patientCounter].setGender(read.nextLine().charAt(0));
         System.out.println("The patient has been registered.");
      }//end of addPatient();  
   	
   	/**
   		Adds a surgical team to the data base
   	*/
      public static void addTeam()
      {
         teamCounter++;
         flush = read.nextLine();
         System.out.print("Enter medical doctor name:  ");
         SurgicalTeam[teamCounter].setMD(read.nextLine());
         System.out.print("Enter pager number of MD:  ");
         SurgicalTeam[teamCounter].setPagerNum(read.nextLine());
         //System.out.print("Enter ID of patient assigned:  ");
         //SurgicalTeam[teamCounter].setPatientID(read.nextInt());
         System.out.println("The surgical team has been added");
      }//end of addTeam
   	
   	/**
   		Determines the emergency status of the department
   		@return a String representing the availibility situation of the department
   	*/
      public static String emergency()
      {
         String s; //the String to be returned to the main method
      	//mastery aspect: use of a loop structure
         for(int i = 0; i < SIZE; i++)
         {
            if(HospitalBed[i].getID() == 0)
            {
               s = "There is space available. The bed number is "
                  + HospitalBed[i].getBedNumber() + " in room "
                  + HospitalBed[i].getRoomNumber();
               return s;
            }//end of if(HospitalBed[i].getID() == 0)
         }//end of for(int i = 0; i < SIZE; i++)
         return "";
      }//end of emergency()
   	
   	/**
   		Initializes a Hospital Bed
   	*/
      public static void initializeBed()
      {
         String[] field = readFile("bed.text");
         int fieldCounter = 0;
         while(fieldCounter < field.length - 1)
         {
            bedCounter++;
            HospitalBed[bedCounter].setID(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
            HospitalBed[bedCounter].setBedNum(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
            HospitalBed[bedCounter].setRoomNum(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
         }//end of while(fieldCounter < field.length)
      }//end of initializePatient()  
   	
   	/**
   		Initializes all Nurses upon start-up
   	*/
      public static void initializeNurse()
      {
         String[] field = readFile("nurse.text"); 	
         int fieldCounter = 0;
         while(fieldCounter < field.length - 1)
         {
            nurseCounter++;
            Nurse[nurseCounter].setFirstName(field[fieldCounter]);
            fieldCounter++;
            Nurse[nurseCounter].setFamilyName(field[fieldCounter]);
            fieldCounter++;
            Nurse[nurseCounter].setID(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
         }//end of while(fieldCounter < field.length)
      }//end initializeNurse()
   	
   	/**
   		Initializes all Patients upon start-up
   	*/
      public static void initializePatient()
      {	
         String[] field = readFile("patient.text"); 	
         int fieldCounter = 0;
         while(fieldCounter < field.length - 1)
         {
            patientCounter++;	
            Patient[patientCounter].setFirstName(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setFamilyName(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setMarital(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setAddress(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setPostalCode(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setHealthCondition(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setMedication(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setNurseAssigned(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setID(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
            Patient[patientCounter].setAge(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
            Patient[patientCounter].setTelephone(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setCellphone(field[fieldCounter]);
            fieldCounter++;
            Patient[patientCounter].setBedNum(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
            Patient[patientCounter].setRoomNum(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
            Patient[patientCounter].setGender(field[fieldCounter].charAt(0));
            fieldCounter++;
         }//end of while(fieldCounter < field.length)
      }//end of initializePatient()
   	
      public static void initializeTeam()
      {
         String[] field = readFile("patient.text"); 	
         int fieldCounter = 0;
         while(fieldCounter < field.length - 1)
         {
            teamCounter++;
            SurgicalTeam[teamCounter].setMD(field[fieldCounter]);
            fieldCounter++;
            SurgicalTeam[teamCounter].setPatientID(Integer.parseInt(field[fieldCounter]));
            fieldCounter++;
            SurgicalTeam[teamCounter].setPagerNum(field[fieldCounter]);
            fieldCounter++;
         }//end of while(fieldCounter < field.length)
      }//end of initializeTeam()
   	
    	/**
   		Method that displays the main menu of the software.
   		@return the menu choice of the user
   	*/
      public static int mainMenu()
      {   
         int menu = 0;
         System.out.println("1. Emergency Patient Admission Information");
         System.out.println("2. Add to the database");
         System.out.println("3. View Information");
         System.out.println("4. Exit");
         menu = validChoice(1, 4);
         return menu;
      }//end of mainMenu()
   	
   	/**
   		Reads a file and returns a String array with all the fields
   		@param fileName the name of the file<br />
   		@return a String array containing all the fields or an empty String
   	*/
      public static String[] readFile(String fileName)
      {              	
      	 //contains all the fields in a file
         String line = null; //a String that will hold all the info in a file 
         String[] field;     
         try
         {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));   
            line = reader.readLine();      
            while(reader.readLine() != null)
            {
               line = line + reader.readLine();
            }//end of while(reader1.readLine() != null)
            reader.close();
         }
            catch(FileNotFoundException e)
            {
               return null;
            }
            catch(IOException e)
            {
               return null;
            }
            catch(Exception e)
            {
               return null;
            }//end of try-catch
         try
         {
            field = line.split("\\#");		
         }
            catch(NullPointerException e)
            {
               return null;
            }//end of try-catch
         return field;
      }//end of readFile(String fileName)
   	
   	/**
   	   First this method prompts the user for the bed number of the bed. It then
   		searches for a bed and returns a String representation of the bed.
   	*/
      public static String searchBed()
      {
         int temp; //holds the bed number
         flush = read.nextLine();
         System.out.print("Enter the bed number of the bed:  ");
         temp = read.nextInt();
      	
      	//mastery aspect: searching
         for(int i = 0; i < SIZE; i++)
         {
            if(HospitalBed[i].getBedNumber() ==  temp)
            {
               return HospitalBed[i].toString();
            }
         }//end of for(int i = 0; i < SIZE; i++)
         return "";
      }//end of searchBed()
   	
   	/**
   		First this method prompts the user for the family name of the nurse. It then
   		searches for a nurse and returns a String representation of the nurse.
   	*/
      public static String searchNurse()
      {
         String temp; //holds the family name
         flush = read.nextLine();
         System.out.print("Enter the family name of the nurse:  ");
         temp = read.nextLine();
      	
      	//mastery aspect: searching
         for(int i = 0; i < SIZE; i++)
         {
            if((Nurse[i].getFamilyName().equals(temp)))
            {
               return Nurse[i].toString();
            }
         }//end of for(int i = 0; i < SIZE; i++)
         return "";
      }//end of searchNurse()
   	   	      	
   	/**
   		First this method prompts the user for the family name of the patient. It then
   		searches for a patient and returns a String representation of the patient.
   	*/
      public static String searchPatient()
      {
         String temp; //holds the family name of the patient
         flush = read.nextLine();
         System.out.print("Enter the family name of the patient:  ");
         temp = read.nextLine();
      	
      	//mastery aspect: searching
         for(int i = 0; i < SIZE; i++)
         {
            if((Patient[i].getFamilyName().equals(temp)))
            {
               return Patient[i].toString();
            }
         }//end of for(int i = 0; i < SIZE; i++)
         return "";
      }//end of searchPatient()
   	
   	/**
   		First this method prompts the user for the family name of the patient. It then
   		searches for a patient and returns a String representation of the patient.
   	*/
      public static String searchTeam()
      {
         String temp; //holds the family name of the patient
         flush = read.nextLine();
         System.out.print("Enter the MD name of the surgical team:  ");
         temp = read.nextLine();
      	
      	//mastery aspect: searching
         for(int i = 0; i < SIZE; i++)
         {
            if((SurgicalTeam[i].getMD().equals(temp)))
            {
               return SurgicalTeam[i].toString();
            }
         }//end of for(int i = 0; i < SIZE; i++)
         return "";
      }//end of searchTeam()
   	
   	/**
   		Displays the submenu
   		@return the menu choice of the sub menu 
   	*/
      public static int subMenu()
      {
         int subMenu = 0;
         System.out.println("1. Add Patient");
         System.out.println("2. Add Nurse");
         System.out.println("3. Add Surgical Team");
         System.out.println("4. Add Hospital Bed");
         subMenu = validChoice(1, 4);
         return subMenu;     
      }//end of subMenu()  
   	
   	/**
   		Displays the submenu for option 2 from the main menu
   		@return the menu choice of the sub menu 
   	*/
      public static int subMenu2()
      {
         int subMenu = 0;
         System.out.println("1. View patient Information");
         System.out.println("2. View nurse Information");
         System.out.println("3. View surgical team information");
         System.out.println("4. View hospital bed information");
         subMenu = validChoice(1, 4);
         return subMenu;
      }//end of subMenu2()
   	/**
   		Validates choice of the user.
   		@param min the minimum value of the range of choices<br />
   		@param max the maximum value of the range of choices<br />
   		@return the menu choice of the user
   	*/  
      public static int validChoice(int min, int max)
      {
      	//mastery aspect: use of sentinel or flag
         boolean checkType = true;
         String flush; //variable that clears any data remaining in the scanner
         int menu = 0;
         System.out.print("Please enter a choice: ");
         try
         {
            menu = read.nextInt();
         }
            catch(InputMismatchException e)
            {
               checkType = false;
               flush = read.next();
            }//end of try-catch
                  
         while(menu < min || menu > max || checkType == false)
         {
            checkType = true;
            System.out.print("Error. Invalid choice. Please try again: ");
            try
            {
               menu = read.nextInt();
            }
               catch(InputMismatchException e)
               {
                  checkType = false;
                  flush = read.next();
               }//end of try-catch
         }//end of while(menuChoice < min || menuChoice > max)
         return menu;
      }//end of validChoice(int menuChoice, int min, int max)
   }//end of class CardioVascularSurgeryDept