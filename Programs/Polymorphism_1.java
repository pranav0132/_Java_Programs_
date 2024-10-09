class Bank {
    float perRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float perRateOfInterest() {
    return 8.4f;
}
}

class ICICI extends Bank {
    float perRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank{
    float perRateOfInterest(){
        return 9.7f;
    }
}

public class Exp10_1 {
    public static void main(String[] args) {
        Bank b;
        b = new ICICI();
        System.out.println("ICICI Rate of Interest is "+ b.perRateOfInterest());
        b = new SBI();
        System.out.println("SBI Rate of Interest is "+b.perRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest is "+b.perRateOfInterest());
    }
}
