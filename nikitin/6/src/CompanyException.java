package src;

public abstract class CompanyException extends Exception {

    String info;

    public CompanyException(String info) {
        this.info = " ERR: " + info;
    }
}




