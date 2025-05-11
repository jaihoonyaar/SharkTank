package com.code.api.sharktank.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private SharkProfile sharkProfile;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private FounderProfile founderProfile;

	public User(Long id, String name, String email, String password, Role role, LocalDateTime createdAt,
			SharkProfile sharkProfile, FounderProfile founderProfile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.createdAt = createdAt;
		this.sharkProfile = sharkProfile;
		this.founderProfile = founderProfile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public SharkProfile getSharkProfile() {
		return sharkProfile;
	}

	public void setSharkProfile(SharkProfile sharkProfile) {
		this.sharkProfile = sharkProfile;
	}

	public FounderProfile getFounderProfile() {
		return founderProfile;
	}

	public void setFounderProfile(FounderProfile founderProfile) {
		this.founderProfile = founderProfile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", createdAt=" + createdAt + ", sharkProfile=" + sharkProfile + ", founderProfile=" + founderProfile
				+ "]";
	}

    // Getters and setters
	
    
}
