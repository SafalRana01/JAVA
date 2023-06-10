1.  Command to write your first name with proper syntax

public class MyName{
      public static void main(String[] args)
      {
         System.out.println("Safal Rana") //IT WILL PRINT MY NAME AS OUTPUT
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


public class MathWorkPractise
{
    public static void main(String[] args){
        int a = 100;
        int b = 54;
        
        System.out.println("Maximum value: "+Math.max(a,b)); // output 100
        System.out.println("Manimum value: "+Math.min(200, 65)); // output 65
        System.out.println("Round value of 10.99: "+Math.round(10.99)); // out put 11
        System.out.println("Floor value of 10.99: "+Math.floor(10.99)); //output 10.0
        System.out.println("Ceil Value "+Math.ceil(10.1)); // output 11.0
        System.out.println("Square Root "+Math.sqrt(25)); // output 5.0
        System.out.println("Cube "+Math.pow(5,3)); // output 125.0
        
        //FLOOR GIVES THE VALUE BEFORE DECIMAL NUMBERS FOR EXAMPLE THERE IS 10.99 IT'S FLOOR VALUE IS 10..
        // IT NEGLECT THE DECIMAL NUMBER WHILE CEIL VALUE JUST ROUND OFF THE NUMBERS  IF IT 10.01 ALSO IT GIVES
        // VALUE 11 IT JUST ROUND OFF IT....
        
        System.out.println(Math.random()); //IT WILL GIVE THE RANDOW VALUES
    }
}



7. String Practise

public class StringWork
{
    public static void main(String[] args){ //STRING METHOD
        String country = "Nepal";
        String capital = "Kathmandu";// IF SPACE IS ENTERED AFTER KTM OR NEPAL ALSO IT WILL COUNT FOR EXAMPLE NEPAL HAVE 
                                    // FIVE LETTERS BUT IT WILL COUNT 6 IF SPACE IS GIVEN AFTER NEPAL
        System.out.println("The length of country is "+country.length()); //IT COUNT HOW MANY LETTERS ARE THERE IN STRINGS     //OUTPUT = 5
        System.out.println("The length of capital is "+capital.length());    //OUT PUT = 9
        
        System.out.println(country.charAt(0)); // IT IS USED TO FIND WHAT LETTER IS THERE AT NO 0,1,2      //OUTPUT = N
        System.out.println(country.charAt(2)); // IT WILL SHOW N FOR 0 AND 2 FOR P                          //OUTPUT = P
        
        
    }
}



8. a. IF Clause

/*. There are Five types of Clause basically used in array following are:
* 1.IF CLAUSE  
  2.IF-ELSE CLAUSE  
  3.IF-ELSE-IF CLAUSE  
  4.SWITCH CLAUSE  5.NESTED-IF 
*/

public class PractiseIfClause
{
       public static void main (String[] args)
       {
         
                  int a = 5; //IF CLAUSES EXAMPLES
        
                  if (a >= 0 && a == 100){ //CONDITION OF IF CLAUSE
                        System.out.println("YES");
                  }   
                  System.out.println("NOT");
        
                   /* IF THE CONDITION OF IF CLAUSE IS TRUE.IT WILL PRINT BOTH INSIDE AND OUTSIDE'S STATEMENT (i.e YES AND NOT).
                    * BUT IF THE IF CLAUSE CONDITION IS FALSE.IT WILL PRINT ONLY OUTSIDE STATEMENT(ie NOT).  BUT IF IF CONDITION IS
                    * FALSE AND THERE IS NO ANY OUTSIDE STATEMENT THEN IT WILL NOT PRINT ANYTHING IT WILL JUST CRASH....
                    */
       }
}



8. b.  IF - ELSE CLAUSE

public class PractiseIfElseClause
{
                  public static void main (String[] args)
                  {  
                        
                        int a = 30;
        
                        if(a < 30){//IF/ELSE CLAUSES EXAMPLES...
                              System.out.println("a is less than 15");
                        }
                        else{ 
                              System.out.println("a is greater than 15");
                        }  
            
                        /* WE SHOULDN'T WRITE CONDITION IN ELSE CLAUSE. ELSE DEPEND ON IF CLAUSE. IF IF CONDITION IS TRUE 
                        * IT WILL PRINT IF'S STATEMENT AND IF IT IS FALSE IT WILL PRINT ELSE'S STATEMENT.
                        * (i.e IN ABOVE EXAMPLE ALSO THE IF CONSITION IS FALSE SO IT WILL PRINT ELSE'S STATEMENT i.e a IS GREATER THAN 15)
                        * IF TAKE TRUE STATEMENT WHILE ELSE CONTAIN FALSE STATEMENT.
                        * IT WILL NOT PRINT BOTH AS LIKE ABOVE IF CLAUSE EXAMPLE...
                        */
       }
}                        



8. c.  IF - ELSE - IF  CLAUSE

public class PractiseIfElseIfClause
{
                  public static void main (String[] args)
                  {  
                        
                        int a = 20;
         
                        if (a < 10){//CONDITION-1     
                              System.out.println("a is less than 10");
                        }
                        else if(a > 25){//CONDITION-2 
                              System.out.println("a is greater than 25"); 
                        }
                        else if(a == 19){//CONDITION-3      
                              System.out.println("a is equal to 19");  
                        }
                        else{
                              System.out.println("The value of a is "+a);
                        }
         
                        /* IN THIS IF-ELSE-IF CLAUSES IF THE 1ST CONDITION BECAME TRUE THAN REMAINING CONDITIONS CANNOT BE EXCUTED.
                        * IF THE 1ST CONDITION IS FALSE,THEN IT WILL GO TO 2ND CONDITION IF AGAIN THE 2ND ONE IS FALSE THEN
                        * IT WILL GO TO THE 3RD ONE AND IT GOES LIKE THIS..... AT THE END IF ALL CONDITION ARE FALSE THEN
                        * ELSE CONDITION WILL EXCUTED ITSELF
                        * FOR EXAMPLE.. IN THIS EXAMPLE ALSO THE 1ST, 2ND, 3RD ALL CONDITION IS FALSE SO IT WILL AUTOMATICALLY
                        * PRINT ELSE STATEMENT i.e THE VALUE OF A IS 20...
                        */
       }
}                        



9. Operator Work

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




10. Using AND OR

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



11. Math Work

public class MathWorkPractise
{
    public static void main(String[] args){
        int a = 100;
        int b = 54;
        
        System.out.println("Maximum value: "+Math.max(a,b)); // output 100
        System.out.println("Manimum value: "+Math.min(200, 65)); // output 65
        System.out.println("Round value of 10.99: "+Math.round(10.99)); // out put 11
        System.out.println("Floor value of 10.99: "+Math.floor(10.99)); //output 10.0
        System.out.println("Ceil Value "+Math.ceil(10.1)); // output 11.0
        System.out.println("Square Root "+Math.sqrt(25)); // output 5.0
        System.out.println("Cube "+Math.pow(5,3)); // output 125.0
        
        //FLOOR GIVES THE VALUE BEFORE DECIMAL NUMBERS FOR EXAMPLE THERE IS 10.99 IT'S FLOOR VALUE IS 10..
        // IT NEGLECT THE DECIMAL NUMBER WHILE CEIL VALUE JUST ROUND OFF THE NUMBERS  IF IT 10.01 ALSO IT GIVES
        // VALUE 11 IT JUST ROUND OFF IT....
        
        System.out.println(Math.random()); //IT WILL GIVE THE RANDOW VALUES
    }
}



12. String Work

public class StringWork
{
    public static void main(String[] args){ //STRING METHOD
        String country = "Nepal";
        String capital = "Kathmandu";// IF SPACE IS ENTERED AFTER KTM OR NEPAL ALSO IT WILL COUNT FOR EXAMPLE NEPAL HAVE 
                                    // FIVE LETTERS BUT IT WILL COUNT 6 IF SPACE IS GIVEN AFTER NEPAL
        System.out.println("The length of country is "+country.length()); //IT COUNT HOW MANY LETTERS ARE THERE IN STRINGS     //OUTPUT = 5
        System.out.println("The length of capital is "+capital.length());    //OUT PUT = 9
        
        System.out.println(country.charAt(0)); // IT IS USED TO FIND WHAT LETTER IS THERE AT NO 0,1,2      //OUTPUT = N
        System.out.println(country.charAt(2)); // IT WILL SHOW N FOR 0 AND 2 FOR P                          //OUTPUT = P
        
        
    }
}


13. IF - Clause

public class PractiseIfClause
{
       public static void main (String[] args)
       {
            /*. There are Five types of Clause basically used in array following are:
            * 1.IF CLAUSE  2.IF-ELSE CLAUSE  3.IF-ELSE-IF CLAUSE  4.SWITCH CLAUSE  5.NESTED-IF 
            */
            int a = 5; //IF CLAUSES EXAMPLES
        
            if (a >= 0 && a == 100){ //CONDITION OF IF CLAUSE
                      System.out.println("YES");
            }   
            System.out.println("NOT");
        
                   /* IF THE CONDITION OF IF CLAUSE IS TRUE.IT WILL PRINT BOTH INSIDE AND OUTSIDE'S STATEMENT (i.e YES AND NOT).
                    * BUT IF THE IF CLAUSE CONDITION IS FALSE.IT WILL PRINT ONLY OUTSIDE STATEMENT(ie NOT).  BUT IF IF CONDITION IS
                    * FALSE AND THERE IS NO ANY OUTSIDE STATEMENT THEN IT WILL NOT PRINT ANYTHING IT WILL JUST CRASH....
                    */
       }
}        



14. IF - ELSE Clause


public class PractiseIfClause
{
       public static void main (String[] args)
       {
                  //IF - ELSE CLAUSE EXAMPLE
                  int a = 30;
        
                  if(a < 30){//IF/ELSE CLAUSES EXAMPLES...
                        System.out.println("a is less than 15");
                  }
                  else{ 
                        System.out.println("a is greater than 15");
                  } 
            
                  /* WE SHOULDN'T WRITE CONDITION IN ELSE CLAUSE. ELSE DEPEND ON IF CLAUSE. IF IF CONDITION IS TRUE 
                  * IT WILL PRINT IF'S STATEMENT AND IF IT IS FALSE IT WILL PRINT ELSE'S STATEMENT.
                  * (i.e IN ABOVE EXAMPLE ALSO THE IF CONSITION IS FALSE SO IT WILL PRINT ELSE'S STATEMENT i.e a IS GREATER THAN 15)
                  * IF TAKE TRUE STATEMENT WHILE ELSE CONTAIN FALSE STATEMENT.
                  * IT WILL NOT PRINT BOTH AS LIKE ABOVE IF CLAUSE EXAMPLE...
                  */
         }
}          


15. IF - ELSE - IF Clause

          //IF-ELSE-IF EXAMPLES
           int a = 20;
         
           if (a < 10){//CONDITION-1     
                System.out.println("a is less than 10");
           }
            else if(a > 25){//CONDITION-2 
                System.out.println("a is greater than 25"); 
           }
            else if(a == 19){//CONDITION-3      
                System.out.println("a is equal to 19");  
           }
            else{
                System.out.println("The value of a is "+a);
           }
         
              /* IN THIS IF-ELSE-IF CLAUSES IF THE 1ST CONDITION BECAME TRUE THAN REMAINING CONDITIONS CANNOT BE EXCUTED.
               * IF THE 1ST CONDITION IS FALSE,THEN IT WILL GO TO 2ND CONDITION IF AGAIN THE 2ND ONE IS FALSE THEN
               * IT WILL GO TO THE 3RD ONE AND IT GOES LIKE THIS..... AT THE END IF ALL CONDITION ARE FALSE THEN
               * ELSE CONDITION WILL EXCUTED ITSELF
               * FOR EXAMPLE.. IN THIS EXAMPLE ALSO THE 1ST, 2ND, 3RD ALL CONDITION IS FALSE SO IT WILL AUTOMATICALLY
               * PRINT ELSE STATEMENT i.e THE VALUE OF A IS 20...
               */
