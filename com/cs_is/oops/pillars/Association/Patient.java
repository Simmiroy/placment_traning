package com.cs_is.oops.pillars.Association;
//Aggregation
public class Patient {
    String patientName;
    String disease;
    Information info;
    Payment pay;
    int PatientAge;
    String dateOfArrival;

    public Patient(String patientName, String disease, String dateOfArrival, int patientAge,Information info,Payment pay) {
        this.patientName = patientName;
        this.disease = disease;
        this.dateOfArrival = dateOfArrival;
        PatientAge = patientAge;
        this.info = info;
        this.pay= pay;
    }
    void PatientDetails(){
        System.out.println("Name :" +this.patientName);
        System.out.println("Age :" +this.PatientAge);
        System.out.println("Disease"+this.disease);
        System.out.println("Date of Arrival"+this.dateOfArrival);
        System.out.println("Room Number:"+this.info.roomNo);
        System.out.println("Block Number" +this.info.blockNo);
        System.out.println("Bed Number"+this.info.bedNo);
        System.out.println("Admission fees:"+this.pay.admFees);
        System.out.println("Registration fees:"+this.pay.regFees);
        System.out.println("Balance Amount:"+this.pay.balAmt);
    }

    public static void main(String[] args ) {
        Information info=new Information(57,2,5,205);
        Payment pay=new Payment(1000,500,1500);
        Patient P1=new Patient("Aman","Viral","26/02/2026",23, info, pay);
        P1.PatientDetails();
    }
}
