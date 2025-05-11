package com.code.api.sharktank.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "founder_profiles")
public class FounderProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "age")
    private int age;

    @Column(name = "contact_info")
    private String contactInfo;

    @Column(name = "interests")
    private String interests;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "founder", cascade = CascadeType.ALL)
    private List<Pitch> pitches;

	public FounderProfile(Long id, int age, String contactInfo, String interests, User user, List<Pitch> pitches) {
		super();
		this.id = id;
		this.age = age;
		this.contactInfo = contactInfo;
		this.interests = interests;
		this.user = user;
		this.pitches = pitches;
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

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Pitch> getPitches() {
		return pitches;
	}

	public void setPitches(List<Pitch> pitches) {
		this.pitches = pitches;
	}

	@Override
	public String toString() {
		return "FounderProfile [id=" + id + ", age=" + age + ", contactInfo=" + contactInfo + ", interests=" + interests
				+ ", user=" + user + ", pitches=" + pitches + "]";
	}
    
}