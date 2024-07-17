package ca.ucalgary.ensf380;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private static int lastPersonalNumber;
    
    protected Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
        this.address = address;
        lastPersonalNumber++;
    }

    public boolean hasValidAddress() {
        return address != null && address.validate();
    }

    protected String nextPersonalNumber(short type) {
        return String.format("%d-%d", type, lastPersonalNumber);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
	

    // Getters and setters for all fields...
    // (Omitted for brevity)
}
