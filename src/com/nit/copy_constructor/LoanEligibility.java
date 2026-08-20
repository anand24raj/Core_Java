package com.nit.copy_constructor;

public class LoanEligibility 
{
void main() {
           String loanApplicant = IO.readln("Enter Name Of Applicant : ");
           double civilScore = Double.parseDouble(IO.readln("Enter Civil Score : "));
           
           LoanApplicant lApp = new LoanApplicant(loanApplicant, civilScore);
           OfferedLoan offerdLoan = LoanType.getLoanType(lApp);
           IO.print(offerdLoan);
       }
}

class LoanApplicant{
   private String applicantName;
   private double civilScore;
   
   public LoanApplicant(String applicantName, double civilScore) {
       super();
       this.applicantName = applicantName;
       this.civilScore = civilScore;
   }
   public String getApplicantName() {
       return applicantName;
   }
   public void setApplicantName(String applicantName) {
       this.applicantName = applicantName;
   }
   public double getCivilScore() {
       return civilScore;
   }
   public void setCivilScore(double civilScore) {
       this.civilScore = civilScore;
   }
   @Override
   public String toString() {
       return applicantName;
   }
   
   
}
class OfferedLoan{
   private LoanApplicant loanApplicant;
   private String loanType;
   
   public OfferedLoan(LoanApplicant loanApplicant, String loanType) {
       super();
       this.loanApplicant = loanApplicant;
       this.loanType = loanType;
   }
   public LoanApplicant getLoanApplicant() {
       return loanApplicant;
   }
   public void setLoanApplicant(LoanApplicant loanApplicant) {
       this.loanApplicant = loanApplicant;
   }
   public String getLoanType() {
       return loanType;
   }
   public void setLoanType(String loanType) {
       this.loanType = loanType;
   }
   @Override
   public String toString() {
       return "OfferedLoan [loanApplicant=" + loanApplicant + ", loanType=" + loanType + "]";
   }
   
   
}
class LoanType{
   public static OfferedLoan getLoanType(LoanApplicant lApp) {
        @SuppressWarnings("unused")
        double civilScore = lApp.getCivilScore();
           
           if(lApp.getCivilScore()>1000) {
               return new OfferedLoan(lApp, "Gold");
           }
           else if(lApp.getCivilScore()>900 && lApp.getCivilScore()<1000) {
               return new OfferedLoan(lApp, "Home");
           }
           else if(lApp.getCivilScore()>800 && lApp.getCivilScore()<900) {
               return new OfferedLoan(lApp, "Personal");
           }
           else {
               return new OfferedLoan(lApp, "Bike");
           }
           
   }

}