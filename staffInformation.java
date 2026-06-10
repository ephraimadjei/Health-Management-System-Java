import java.util.Scanner;
// THIS PROGRAM IS A STAFF AND PATIENT INFORMATION SYSTENM FOR A HOSPITAL. IT KEEPS IT SIMPLE AND BASIC. IT CAN BE EXPANDED TO INCLUDE MORE FEATURES IN THE FUTURE.IT INCLUDES CALCULATIONS FOR bmi, AGE, SALARY,ETC.
public class staffInformation {
  private static double[] annualSalaries;
    private static double totalStaffSalary;
    private static double[] bmis;
    private static double [] averageRatings;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputStaffInformation(scanner);
        inputPatientInformation(scanner);
        inputVitalInformation(scanner);
        inputRatingResults(scanner);
        showStaffInformationTable();
        showPatientInformationTable();
        showVitalInformationTable();
        showRatingResultsTable(scanner);
        calculateStaffAges();
        calculateAnnualSalaries();
        calculateAverageRatings();
        calculatePatientAges();
        calculateBMIs();
        calculateTemperatureInFahrenheit();
        calculateTotalAnnualSalary();
        calculatePredictedSalaries();
        calculateAverageWeight();
        calculateAverageHeight();
        calculateWeeklyPay();
        determineHighestAndLowestPaidEmployees();
        determineDoctors();
        checkObesity();
        checkBloodPressure();
        checkServiceQualityAndPromotionEligibility();
        scanner.close();
    }
        
    
    
    {
    
    }
    
    // THESE DECLARATIONS ARE FOR THE STAFF AND PATIENT INFORMATION. THEY INCLUDE THE ARRAYS TO STORE THE DATA FOR EACH STAFF AND PATIENT.
    private static int numStaffMembers;
    
    private static String[] staffFirstName;
    private static String[] staffLastName;
    private static int[] staffYearOfBirth;
    private static String[] staffGender;
    private static String[] staffDepartment;
    private static String[] staffJobTitle;
    private static int[] staffWeeklyHours;
    private static double[] staffWageRate;
    
    private static int numPatients;
    private static String[] patientFirstName;
    private static String[] patientLastName;
    private static int[] patientYearOfBirth;
    private static String[] patientGender;
    private static String[] patientPhoneNumber;
    private static double[] patientWeight;
    private static double[] patientHeight;
    private static double[] patientTemperature;
    private static double[] patientBloodPressureUL;
    private static double[] patientBloodPressureLL;
    private static int[] patientRespRate;
    private static int[] patientPulseRate;
    private static String[] patientAllergies;
    
    private static int[][] ratingResult;
    private static final int currentYear = 2024;
    // info for staff
    private static void inputStaffInformation(Scanner scanner) {
        System.out.print("Enter the number of staff members: ");
        numStaffMembers = scanner.nextInt();
        scanner.nextLine();
        staffFirstName = new String[numStaffMembers];
        staffLastName = new String[numStaffMembers];
        staffYearOfBirth = new int[numStaffMembers];
        staffGender = new String[numStaffMembers];
        staffDepartment = new String[numStaffMembers];
        staffJobTitle = new String[numStaffMembers];
        staffWeeklyHours = new int[numStaffMembers];
        staffWageRate = new double[numStaffMembers];
        annualSalaries = new double[numStaffMembers];
       
       
        for (int i = 0; i < numStaffMembers; i++) {
            System.out.println("Enter Information for Staff Member " + (i + 1) + ":");
            System.out.print("First Name: ");
            staffFirstName[i] = scanner.nextLine();
            System.out.print("Last Name: ");
            staffLastName[i] = scanner.nextLine();
            System.out.print("Year of Birth: ");
            staffYearOfBirth[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Gender: ");
            staffGender[i] = scanner.nextLine();
            System.out.print("Department (Emergency/Medical/HR/Admin): ");
            staffDepartment[i] = scanner.nextLine();
            System.out.print("Job title (Doctor/Nurse/Manager/Admin): ");
            staffJobTitle[i] = scanner.nextLine();
            System.out.print("Weekly hours: ");
            staffWeeklyHours[i] = scanner.nextInt();
            System.out.print("Wage rate: ");
            staffWageRate[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println();
            annualSalaries[i] = staffWageRate[i] * staffWeeklyHours[i] * 52;
        }
    }
   
    // THE ARRAYS FOR PATIENT INFO ARE DECLARED HERE.  USER IS PROMPTED TO ENTER THE AMOUNT OF PATIENTS THERE ARE.
    private static void inputPatientInformation(Scanner scanner) {
        System.out.print("Enter the number of Patients: ");
        numPatients = scanner.nextInt();
        scanner.nextLine();
        patientFirstName = new String[numPatients];
        patientLastName = new String[numPatients];
        patientYearOfBirth = new int[numPatients];
        patientGender = new String[numPatients];
        patientPhoneNumber = new String[numPatients];
        
        
        for (int j = 0; j < numPatients; j++) {
            System.out.println("Enter Information for Patient " + (j + 1) + ":");
            System.out.print("First Name: ");
            patientFirstName[j] = scanner.nextLine();
            System.out.print("Last Name: ");
            patientLastName[j] = scanner.nextLine();
            System.out.print("Year of Birth: ");
            patientYearOfBirth[j] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Gender: ");
            patientGender[j] = scanner.nextLine();
            System.out.print("Phone Number: ");
            patientPhoneNumber[j] = scanner.nextLine();
            System.out.println();
        
             
        }
    }
    
    // PATIENT VITALS ARE STORED IN ARRAYS. USER IS PROMPTED TO ENTER THE VITALS FOR EACH PATIENT.
    private static void inputVitalInformation(Scanner scanner) {
        patientWeight = new double[numPatients];
        patientHeight = new double[numPatients];
        patientTemperature = new double[numPatients];
        patientBloodPressureUL = new double[numPatients];
        patientBloodPressureLL = new double[numPatients];
        patientRespRate = new int[numPatients];
        patientPulseRate = new int[numPatients];
        patientAllergies = new String[numPatients];
        
        
        for (int i = 0; i < numPatients; i++) {
            System.out.println("Enter Vitals for Patient " + (i + 1) + ":");
            System.out.print("Weight (in lbs): ");
            patientWeight[i] = scanner.nextDouble();
            System.out.print("Height (in inches): ");
            patientHeight[i] = scanner.nextDouble();
            System.out.print("Temperature (in Celsius): ");
            patientTemperature[i] = scanner.nextDouble();
            System.out.print("Pulse Rate (beats/minute): ");
            patientPulseRate[i] = scanner.nextInt();
            System.out.print("Respiratory Rate (breaths/minute): ");
            patientRespRate[i] = scanner.nextInt();
            System.out.print("Blood Pressure Upper Level: ");
            patientBloodPressureUL[i] = scanner.nextDouble();
            System.out.print("Blood Pressure Lower Level: ");
            patientBloodPressureLL[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Allergies (Yes/No): ");
            patientAllergies[i] = scanner.nextLine();
            System.out.println();
       
           
        }
    }
   
   //PROMPTS PATIENT TO RATE THE SERVICE QUALITY OF EACH STAFF MEMBER
    private static void inputRatingResults(Scanner scanner) {
        ratingResult = new int[numPatients][numStaffMembers];
        
        for (int i = 0; i < numPatients; i++) {
            System.out.println("Enter ratings for all staff members by Patient " + (i + 1) + ":");
            for (int j = 0; j < numStaffMembers; j++) {
                System.out.print("Rating for Staff Member " + (j + 1) + " (out of 5 stars): ");
                ratingResult[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); 
            System.out.println();
        }
    }
    
   //STAFF INFO TABLE. THIS METHOD DISPLAYS THE STAFF INFORMATION IN A TABLE FORMAT. IT INCLUDES ALL THE DETAILS OF THE STAFF MEMBERS THAT WERE ENTERED BY THE USER.
    private static void showStaffInformationTable() {
        System.out.println("Staff Information Table:");
       System.out.println("===================================================================================================================");
       System.out.println("| First Name      | Last Name       | Year of Birth | Gender | Department | Job Title  | Weekly Hours | Wage Rate   |");
       System.out.println("===================================================================================================================");
       for (int i = 0; i < numStaffMembers; i++) {
           System.out.println("| " + staffFirstName[i] + " | " + staffLastName[i] + " | " + staffYearOfBirth[i] + " | " + staffGender[i] + " | " + staffDepartment[i] + " | " + staffJobTitle[i] + " | " + staffWeeklyHours[i] + " | " + staffWageRate[i] + " |");
       }
       System.out.println("===================================================================================================================");
       System.out.println();
    }
   
   // sAME AS STAFF INFO TABLE BUT FOR PATIENTS. THIS METHOD DISPLAYS THE PATIENT INFORMATION IN A TABLE FORMAT. IT INCLUDES ALL THE DETAILS OF THE PATIENTS THAT WERE ENTERED BY THE USER.
    private static void showPatientInformationTable() {
        System.out.println("Patient Information Table:");
System.out.println("=======================================================================================");
System.out.println("| First Name  | Last Name   | Year of Birth | Gender | Phone Number |");
System.out.println("=======================================================================================");
for (int i = 0; i < numPatients; i++) {
    System.out.println("| " + patientFirstName[i] + " | " + patientLastName[i] + " | " + patientYearOfBirth[i] + " | " + patientGender[i] + " | " + patientPhoneNumber[i] + " |");
}
System.out.println("=======================================================================================");
System.out.println();
    }
    
    // SAME AS THE TWO PREVIOUS TABLES BUT FOR THE VITAL INFORMATION OF THE PATIENTS. THIS METHOD DISPLAYS THE VITAL INFORMATION OF THE PATIENTS IN A TABLE FORMAT. IT INCLUDES ALL THE VITALS THAT WERE ENTERED BY THE USER.
    private static void showVitalInformationTable() {
        System.out.println("Patient Vital Information Table:");
System.out.println("=============================================================================================================");
System.out.println("| Weight (lbs) | Height (in) | Pulse Rate | Respiratory Rate | Blood Pressure U & L |");
System.out.println("=============================================================================================================");
for (int i = 0; i < numPatients; i++) {
    System.out.println("| " + patientWeight[i] + " | " + patientHeight[i] + " | " + patientPulseRate[i] + " | " + patientRespRate[i] + " | " + patientBloodPressureUL[i] + " / " + patientBloodPressureLL[i] + " |");
}
System.out.println("=============================================================================================================");
System.out.println();
    }
   
   //SHOW THE RESULTS OF THE RATINGS.
   private static void showRatingResultsTable(Scanner scanner) {
    // Print column headers
    System.out.println("Ratings for all staff members");
    System.out.print("| Patient # |");
   
    for (int i = 0; i < numStaffMembers; i++) {
        System.out.print(" S" + (i + 1) + " |");
       
    }
    System.out.println("\n===========================");
    
    
    for (int i = 0; i < numPatients; i++) {
        System.out.print("     " + (i + 1) + "    |");
        for (int j = 0; j < numStaffMembers; j++) {
            System.out.print("  " + ratingResult[i][j] + "  |");
        }
        System.out.println();
    }
    
    System.out.println("===========================");
    System.out.println();
}
    
    // CALCULATING STAFF AGES.
    
    private static void calculateStaffAges() {
        int currentYear = 2024;
int[] currentAges = new int[numStaffMembers];
for (int i = 0; i < numStaffMembers; i++) {
    currentAges[i] = currentYear - staffYearOfBirth[i];
    System.out.println(staffFirstName[i] + "'s age in 2024: " + currentAges[i]);
}
System.out.println();
    }
    
    //FORMULA TO CALCULATE THE ANNUAL SALARY OF EACH STAFF MEMBER. IT ALSO CALCULATES THE ANNUAL TAXES AND NET INCOME AFTER TAXES FOR EACH STAFF MEMBER. THE RESULTS ARE DISPLAYED IN THE CONSOLE.
    private static void calculateAnnualSalaries() {
        double taxRate = 0.05;
double[] annualSalaries = new double[numStaffMembers];
double[] annualTaxes = new double[numStaffMembers];
double[] netIncomes = new double[numStaffMembers];

for (int i = 0; i < numStaffMembers; i++) {
    annualSalaries[i] = staffWageRate[i] * staffWeeklyHours[i] * 52;
    annualTaxes[i] = annualSalaries[i] * taxRate;
    netIncomes[i] = annualSalaries[i] - annualTaxes[i];
    System.out.println(staffFirstName[i] + "'s Annual Salary Per Year Before Taxes: $" + annualSalaries[i]);
    System.out.println(staffFirstName[i] + "'s Annual Tax Per Year: $" + annualTaxes[i]);
    System.out.println(staffFirstName[i] + "'s Net Income After Taxes: $" + netIncomes[i]);
    System.out.println();
}
    }
    
    
    // cALCULATE THE AVERAGE RATINGS FOR EACH STAFF MEMBER BASED ON THE RATINGS GIVEN BY THE PATIENTS. THE AVERAGE RATINGS ARE DISPLAYED IN THE CONSOLE.
    private static void calculateAverageRatings() {
       averageRatings = new double[numStaffMembers];
        for (int i = 0; i < numStaffMembers; i++) {
            double sum = 0;
            for (int j = 0; j < numPatients; j++) {
                sum += ratingResult[j][i];
            }
            averageRatings[i] = sum / numPatients;
            System.out.println("Average Rating for " + staffFirstName[i] + ": " + averageRatings[i]);
            System.out.println();
        }   
    }
    
    // CALCULATIONS FOR PATIENTS AGES
    private static void calculatePatientAges() {
        int[] currentPatientAges = new int[numPatients];
for (int i = 0; i < numPatients; i++) {
    currentPatientAges[i] = currentYear - patientYearOfBirth[i];
    System.out.println(patientFirstName[i] + "'s age in 2024: " + currentPatientAges[i]);
}
System.out.println();
    }
   
   // BMI CALCULATOR. THIS METHOD CALCULATES THE BMI FOR EACH PATIENT USING THE FORMULA: BMI = (WEIGHT IN POUNDS / (HEIGHT IN INCHES * HEIGHT IN INCHES)) * 703. THE RESULTS ARE DISPLAYED IN THE CONSOLE.
    private static void calculateBMIs() {
        bmis = new double[numPatients];
for (int i = 0; i < numPatients; i++) {
    bmis[i] = (patientWeight[i] / (patientHeight[i] * patientHeight[i])) * 703;
    System.out.println("BMI of " + patientFirstName[i] + ": " + bmis[i]);
}
System.out.println();
    }
    
    
    //CALCULATING TEMPERATURE IN FAHRENHEIT. THIS METHOD CALCULATES THE TEMPERATURE IN FAHRENHEIT FOR EACH PATIENT USING THE FORMULA: F = (C * 9/5) + 32. THE RESULTS ARE DISPLAYED IN THE CONSOLE.
    private static void calculateTemperatureInFahrenheit() {
        double[] temperaturesInFahrenheit = new double[numPatients];
        for (int i = 0; i < numPatients; i++) {
            temperaturesInFahrenheit[i] = patientTemperature[i] * 9 / 5 + 32;
            System.out.println("Body Temperature of " + patientFirstName[i] + " in Fahrenheit: " + temperaturesInFahrenheit[i] + "°F");
        }
        System.out.println();
    }
    
   // ANNUAL SALARY CALCULATION.
    private static void calculateTotalAnnualSalary() {
        totalStaffSalary = 0;
        for (int i = 0; i < numStaffMembers; i++) {
            totalStaffSalary += annualSalaries[i];
        }
        System.out.println("Total Annual Salary of all " + numStaffMembers + " Staff Members: $" + totalStaffSalary);
        System.out.println();
    }
      
    
       //PREDICTED SALARY CALCULATION. THIS METHOD CALCULATES THE PREDICTED SALARY BUDGET FOR 100 STAFF MEMBERS BASED ON THE AVERAGE ANNUAL SALARY PER STAFF MEMBER. THE RESULT IS DISPLAYED IN THE CONSOLE.
    private static void calculatePredictedSalaries() {
        double averageAnnualSalaryPerStaff = totalStaffSalary / numStaffMembers;
double predictedSalariesX100 = averageAnnualSalaryPerStaff * 100;
System.out.println("Predicted Salaries Budget for 100 Staff Members: $" + predictedSalariesX100);
System.out.println();
    }
    
    // AVERAGE WEIGHT CALCULATION. THIS METHOD CALCULATES THE AVERAGE WEIGHT OF ALL THE PATIENTS USING THE FORMULA: AVERAGE WEIGHT = TOTAL WEIGHT / NUMBER OF PATIENTS. THE RESULT IS DISPLAYED IN THE CONSOLE.
    private static void calculateAverageWeight() {
        double totalWeight = 0;
for (int i = 0; i < numPatients; i++) {
    totalWeight += patientWeight[i];
}
double averageWeight = totalWeight / numPatients;
System.out.println("Average Weight for all " + numPatients + " Patients: " + averageWeight + " lbs");
System.out.println();
    }
    
    //AVERAGE HEIGHT CALCULATION. THIS METHOD CALCULATES THE AVERAGE HEIGHT OF ALL THE PATIENTS USING THE FORMULA: AVERAGE HEIGHT = TOTAL HEIGHT / NUMBER OF PATIENTS. THE RESULT IS DISPLAYED IN THE CONSOLE.
    private static void calculateAverageHeight() {
        double totalHeight = 0;
for (int i = 0; i < numPatients; i++) {
    totalHeight += patientHeight[i];
}
double averageHeight = totalHeight / numPatients;
System.out.println("Average Height for all " + numPatients + " Patients: " + averageHeight + " inches");
System.out.println();
    }
    
    
    // WEEKLY PAY CALCULATION. THIS METHOD CALCULATES THE WEEKLY PAY FOR EACH STAFF MEMBER USING THE FORMULA: WEEKLY PAY = WAGE RATE * WEEKLY HOURS. THE RESULTS ARE DISPLAYED IN THE CONSOLE.
    private static void calculateWeeklyPay() {
        double[] weeklyPay = new double[numStaffMembers];
for (int i = 0; i < numStaffMembers; i++) {
    weeklyPay[i] = staffWageRate[i] * staffWeeklyHours[i];
    System.out.println("Total weekly salary for " + staffFirstName[i] + " is: $" + weeklyPay[i]);
}
System.out.println();
    }
    
    // IDENTIFYING THE HIGHEST AND LOWEST PAID EMPLOYEES. THIS METHOD IDENTIFIES THE HIGHEST AND LOWEST PAID EMPLOYEES BASED ON THEIR ANNUAL SALARIES. THE NAMES OF THE HIGHEST AND LOWEST PAID EMPLOYEES ALONG WITH THEIR SALARIES ARE DISPLAYED IN THE CONSOLE.
    private static void determineHighestAndLowestPaidEmployees() {
        double maxSalary = annualSalaries[0];
        double minSalary = annualSalaries[0];
        String highestPaidEmployee = staffFirstName[0] + " " + staffLastName[0];
        String lowestPaidEmployee = staffFirstName[0] + " " + staffLastName[0];
        for (int i = 1; i < numStaffMembers; i++) {
            if (annualSalaries[i] > maxSalary) {
                maxSalary = annualSalaries[i];
                highestPaidEmployee = staffFirstName[i] + " " + staffLastName[i];
            }
            if (annualSalaries[i] < minSalary) {
                minSalary = annualSalaries[i];
                lowestPaidEmployee = staffFirstName[i] + " " + staffLastName[i];
            }
        }
        System.out.println("The Highest Paid Employee is " + highestPaidEmployee + " at: $" + maxSalary);
        System.out.println("The Lowest Paid Employee is " + lowestPaidEmployee + " at: $" + minSalary);
        System.out.println();
        
    }
    
    // CHECKING WHO ARE THE DOCTORS. THIS METHOD CHECKS THE JOB TITLES OF ALL THE STAFF MEMBERS AND IDENTIFIES THOSE WHO ARE DOCTORS. THE NAMES OF THE DOCTORS ARE DISPLAYED IN THE CONSOLE.
    private static void determineDoctors() {
        System.out.println("The staff members who are Doctors:");
for (int i = 0; i < numStaffMembers; i++) {
    if (staffJobTitle[i].equals("Doctor")) {
        System.out.println(staffFirstName[i] + " " + staffLastName[i]);
    }
}
    }
   
   //WHICH PATIENTS ARE OBESE. THIS METHOD CHECKS THE BMI OF EACH PATIENT AND CLASSIFIES THEM AS UNDERWEIGHT, HEALTHY WEIGHT, OVERWEIGHT, OR MORBIDLY OBESE BASED ON THEIR BMI VALUES. THE WEIGHT STATUS OF EACH PATIENT IS DISPLAYED IN THE CONSOLE.
    private static void checkObesity() {
        for (int i = 0; i < numPatients; i++) {
            System.out.print("Weight Status of " + patientFirstName[i] + ": ");
            if (bmis[i] < 18.5) {
                System.out.println("Underweight");
            } else if (bmis[i] >= 18.5 && bmis[i] < 25.0) {
                System.out.println("Healthy Weight");
            } else if (bmis[i] >= 25.0 && bmis[i] < 30.0) {
                System.out.println("Overweight");
            } else {
                System.out.println("Morbidly Obese");
            }
            System.out.println();
        }
        
    }
   
        
   
    // WHO HAS HIGH BLOOD PRESSURE. THIS METHOD CHECKS THE BLOOD PRESSURE READINGS OF EACH PATIENT AND CLASSIFIES THEM AS NORMAL, ELEVATED, HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 1, HYPERTENSION STAGE 2, OR HYPERTENSIVE CRISIS BASED ON THEIR BLOOD PRESSURE VALUES. THE BLOOD PRESSURE STATUS OF EACH PATIENT IS DISPLAYED IN THE CONSOLE.
    private static void checkBloodPressure() {
        for (int i = 0; i < numPatients; i++) {
            System.out.print("Blood Pressure Diagnosis for " + patientFirstName[i] + ": ");
            if (patientBloodPressureUL[i] <= 120 && patientBloodPressureLL[i] < 80) {
                System.out.println("Normal");
            } else if (patientBloodPressureUL[i] >= 120 && patientBloodPressureUL[i] <= 129 && patientBloodPressureLL[i] < 80) {
                System.out.println("Elevated");
            } else if (patientBloodPressureUL[i] >= 130 && patientBloodPressureUL[i] <= 139 && patientBloodPressureLL[i] >= 80 && patientBloodPressureLL[i] <= 89) {
                System.out.println("High Blood Pressure (Hypertension) Stage 1");
            } else if (patientBloodPressureUL[i] > 140 && patientBloodPressureUL[i] < 179 && patientBloodPressureLL[i] > 90 && patientBloodPressureLL[i] < 119) {
                System.out.println("Hypertension Stage 2");
            } else if (patientBloodPressureUL[i] >= 180 && patientBloodPressureLL[i] >= 120) {
                System.out.println("Hypertensive Crisis (consult your doctor immediately)");
            }
            System.out.println();
        }
    }
    
   
    //WHICH STAFF MEMBERS ARE ELIGIBLE FOR PROMOTION BASED ON SERVICE QUALITY. THIS METHOD CHECKS THE AVERAGE RATINGS OF EACH STAFF MEMBER AND CLASSIFIES THEIR SERVICE QUALITY AS EXCELLENT, GOOD, OR BAD. STAFF MEMBERS WITH EXCELLENT SERVICE QUALITY (AVERAGE RATING OF 5) ARE ELIGIBLE FOR PROMOTION. THE SERVICE QUALITY AND PROMOTION ELIGIBILITY OF EACH STAFF MEMBER ARE DISPLAYED IN THE CONSOLE.
    private static void checkServiceQualityAndPromotionEligibility() {
        for (int i = 0; i < numStaffMembers; i++) {
            System.out.print("Average Service Quality of " + staffFirstName[i] + ": ");
            if (averageRatings[i] == 5) {
                System.out.println("Excellent Service");
            } else if (averageRatings[i] >= 3 && averageRatings[i] <= 4) {
                System.out.println("Good Service");
            } else {
                System.out.println("Bad Service");
            }
            System.out.println();
            
            if (averageRatings[i] == 5) {
                System.out.println(staffFirstName[i] + " is eligible for a promotion.");
            }
        
   
     }
     
}
}
// THIS PROJECT WAS CREATED BY EPHRAIM ADJEI IN SPRING 2024. IT WAS CREATED AS A FINAL PROJECT FOR THE JAVA PROGRAMMING COURSE. THE PURPOSE OF THIS PROJECT WAS TO CREATE A STAFF AND PATIENT INFORMATION SYSTEM FOR A HOSPITAL. THE PROGRAM INCLUDES FEATURES SUCH AS CALCULATING BMI, AGES, SALARIES, AND MORE. IT ALSO INCLUDES TABLES TO DISPLAY THE INFORMATION OF THE STAFF AND PATIENTS IN A CLEAR AND ORGANIZED MANNER. THIS PROJECT CAN BE EXPANDED IN THE FUTURE TO INCLUDE MORE FEATURES AND FUNCTIONALITIES.
// EPHRAIM ADJEI, SPRING 2024, FINAL PROJECT FOR JAVA PROGRAMMING COURSE.

