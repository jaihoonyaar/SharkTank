package com.code.api.sharktank.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pitches")
public class Pitch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "investment_ask")
    private String investmentAsk;

    @Column(name = "contact_info")
    private String contactInfo;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "founder_id")
    private FounderProfile founder;

    @OneToOne(mappedBy = "pitch", cascade = CascadeType.ALL)
    private PitchStats pitchStats;

    @OneToMany(mappedBy = "pitch", cascade = CascadeType.ALL)
    private List<Comment> comments;

	public Pitch(Long id, String title, String description, String videoUrl, String investmentAsk, String contactInfo,
			LocalDateTime createdAt, FounderProfile founder, PitchStats pitchStats, List<Comment> comments) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.videoUrl = videoUrl;
		this.investmentAsk = investmentAsk;
		this.contactInfo = contactInfo;
		this.createdAt = createdAt;
		this.founder = founder;
		this.pitchStats = pitchStats;
		this.comments = comments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getInvestmentAsk() {
		return investmentAsk;
	}

	public void setInvestmentAsk(String investmentAsk) {
		this.investmentAsk = investmentAsk;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public FounderProfile getFounder() {
		return founder;
	}

	public void setFounder(FounderProfile founder) {
		this.founder = founder;
	}

	public PitchStats getPitchStats() {
		return pitchStats;
	}

	public void setPitchStats(PitchStats pitchStats) {
		this.pitchStats = pitchStats;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Pitch [id=" + id + ", title=" + title + ", description=" + description + ", videoUrl=" + videoUrl
				+ ", investmentAsk=" + investmentAsk + ", contactInfo=" + contactInfo + ", createdAt=" + createdAt
				+ ", founder=" + founder + ", pitchStats=" + pitchStats + ", comments=" + comments + "]";
	}
    
}