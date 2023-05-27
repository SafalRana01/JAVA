1.  Command to write your first name with proper syntax

public class MyName{
      public static void main(String[] args)
      {
         System.out.println("Safal Rana"); //IT WILL PRINT MY NAME AS OUTPUT
      }
}   



2.  Using of Arthematics Operator

public class UsingArthematicOperator
{
      public static void main(String[] args)
      {
           int a = 20;
           int b = 5;
           int sum = a + b;  //  20 + 5 
           int diff = a - b; // 20 - 5
           int div = a / b;  // 20 / 5
           int mul = a * b;  // 20 * 5
           int mod = a % b;  // REMAINDER AFTER 20 IS DIVIDED BY 5 (i.e 0)
               
                System.out.println(sum); //OUTPUT = 25
                System.out.println(diff); // OUTPUT = 15
                System.out.println(div); // OUTPUT = 4
                System.out.println(mul); // OUTPUT = 100
                System.out.println(mod); // OUTPUT = 0
       }
}       



3. Full Introduction

public class MyFullIntroduction
{  
    public static void main(String[] args)
    {
        //Filling My Details 
        String name="Safal Rana.";
        String pernament_address="Syangja";
        String temporary_address="Pokhara.";
        String age="23 years old." ;
        String citizenshipNo="42-02-73-03776.";
        boolean married=false;
        String height="164 cm.";
        char gender = 'M'
        String slc="BETHANY HIGHER SECONDARY SCHOOL";
        String plus2="SHISHU NIKETAN HIGHER SECONDARY SCHOOL.";
        String recently="INFORMATICS.";
        String familyMembers="5 family members.Mom,Dad and my two elder sisters.";
        String fatherName="Himal Rana.";
        String motherName="Hima Rana.";
        String elderSisterName="Sunita Rana";
        String secondSisterName="Sabina Rana.";
        String me="And I am the youngest one of my family";
        
        
              //Trying to printout all in paragraph
              System.out.println("Hello Everyone");
              System.out.print("My Name is "+name);
              System.out.print("I am "+age);
              System.out.print("My Pernament Address is "+pernament_address);
              System.out.println(" And now I live in "+temporary_address);
              System.out.print("My Citizenship No is "+citizenshipNo);
              System.out.print("My Height is "+height);
        
              if (married){
                   System.out.print("I am Married");
              }
               else{
                   System.out.print("I am not married.");
              }
        
              if(gender == 'M'){
                  System.out.print("My gender is Male");
              }
               else if(gender == 'F'){
                  System.out.print("I am Female");
              } 
               else{
                  System.out.printl("I am neither Male nor Female");
              }
        
              System.out.print("I had completed my SLC from "+slc);
              System.out.println(" And my +2 from "+plus2);
              System.out.print("Recently I am studying in "+recently);
              System.out.println("I have "+familyMembers);
              System.out.print("My Father name is "+fatherName);
              System.out.print("My Mother name is "+motherName);
              System.out.println("My First sister name is "+elderSisterName);
              System.out.print("And my second sister name is "+secondSisterName);
              System.out.print(me);
         
        
              /*
               * THis is my full introduction in paragraph if you want to get some knowlege
               * you can take a tips hahah 
               */
             }
     }
}



4. Operator Work

public class OperatorWork
{
     public static void main(String[] args)
     {
           int number = 500;
     
                   System.out.println(number == 500); //To compare  //OUTPUT = true
                   System.out.println(number != 500); // Not equals to  //OUTPUT = FALSE
                   System.out.println(number < 500); //number is less than 500 //OUTPUT = FALSE
                   System.out.println(number > 500); // number is Greater tha 500 //OUTPUT = FALSE
                   System.out.println(number <= 500); // number is less than or equals to 500 //OUTPUT = TRUE
                   System.out.println(number >= 500); // number is greater than or equals to 500 //OUTPUT = TRUE
     } 
}



5. And(&&) OR(||)

public class AndOr
{
   public static void main(String[] args){
       
       String userID= "_safal_";
       int password= 1111;
       
       //How to use and check "AND"
       System.out.println(userID =="_safal_" && password == 1111);  //OUTPUR- TRUE
       /*
        * USING NOT(!)
        * From above we get true value so now not(!) is applied now the result will be
        * opposite (ie it will show false result)
        */
       System.out.println(!(userID =="_safal_" && password == 1111)); // OUTPUT =  FALSE
       //wRONG PASSWORD entering
       System.out.println(userID == "_safal_" && password == 1121); //OUTPUT = FALSE

       /*
        * Using "OR" will show true if one of the both variable is true
        */
       System.out.println(userID == "_safal_" || password == 8888);       //OUTPUT = TRUE
   }
}



6. Math Work Practise
