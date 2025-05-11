package com.code.api.sharktank.models;
import jakarta.persistence.*;

@Entity
@Table(name = "shark_profiles")
public class SharkProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "age")
    private int age;

    @Column(name = "company_names")
    private String companyNames;

    @Column(name = "net_worth")
    private double netWorth;

    @Column(name = "field_of_interest")
    private String fieldOfInterest;

    @Column(name = "verification_doc_path")
    private String verificationDocPath;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

	public SharkProfile(Long id, int age, String companyNames, double netWorth, String fieldOfInterest,
			String verificationDocPath) {
		super();
		this.id = id;
		this.age = age;
		this.companyNames = companyNames;
		this.netWorth = netWorth;
		this.fieldOfInterest = fieldOfInterest;
		this.verificationDocPath = verificationDocPath;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompanyNames() {
		return companyNames;
	}

	public void setCompanyNames(String companyNames) {
		this.companyNames = companyNames;
	}

	public double getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(double netWorth) {
		this.netWorth = netWorth;
	}

	public String getFieldOfInterest() {
		return fieldOfInterest;
	}

	public void setFieldOfInterest(String fieldOfInterest) {
		this.fieldOfInterest = fieldOfInterest;
	}

	public String getVerificationDocPath() {
		return verificationDocPath;
	}

	public void setVerificationDocPath(String verificationDocPath) {
		this.verificationDocPath = verificationDocPath;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SharkProfile [id=" + id + ", age=" + age + ", companyNames=" + companyNames + ", netWorth=" + netWorth
				+ ", fieldOfInterest=" + fieldOfInterest + ", verificationDocPath=" + verificationDocPath + ", user="
				+ user + "]";
	}
    
}