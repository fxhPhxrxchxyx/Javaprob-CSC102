package Oop.Lab9;

class Customer {
    private String firstname;
    private String lastname;
    private int customerld;

    Customer(String firstname, String lastname, int customerld) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.customerld = customerld;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCustomerld() {
        return customerld;
    }

    public void setCustomerld(int customerld) {
        this.customerld = customerld;
    }
}
