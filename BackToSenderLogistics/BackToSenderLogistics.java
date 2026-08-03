public class BackToSenderLogistics {
    public static int numberOfSuccessfulDelivery(int number) {
    
    if(number < 50) {
        return number * 160 + 5000;
    }
    else if(number >= 50 && number < 60) {
        return number * 200 + 5000;
    }
    else if(number >= 60 && number < 70) {
        return number * 250 + 5000;
    }
    else if(number >= 70) {
        return number * 500 + 5000;
    }

    return number;
    }


    public static void main(String[] args) {

    System.out.println(numberOfSuccessfulDelivery(80));
    }

}




//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out BackToSenderLogistics.java BackToSenderLogisticsTest.java


//javac -cp "junit-platform-console-
//standalone-1.11.0.jar:out" -d out
//TestFile.java CodeFile.java
