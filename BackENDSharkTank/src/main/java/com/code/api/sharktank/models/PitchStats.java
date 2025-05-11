package com.code.api.sharktank.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "pitch_stats")
public class PitchStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "views")
    private int views;

    @ManyToMany
    @JoinTable(
        name = "interested_sharks",
        joinColumns = @JoinColumn(name = "pitch_stats_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> interestedSharks;

    @OneToOne
    @JoinColumn(name = "pitch_id")
    private Pitch pitch;

	public PitchStats(Long id, int views, List<User> interestedSharks, Pitch pitch) {
		super();
		this.id = id;
		this.views = views;
		this.interestedSharks = interestedSharks;
		this.pitch = pitch;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public List<User> getInterestedSharks() {
		return interestedSharks;
	}

	public void setInterestedSharks(List<User> interestedSharks) {
		this.interestedSharks = interestedSharks;
	}

	public Pitch getPitch() {
		return pitch;
	}

	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}

	@Override
	public String toString() {
		return "PitchStats [id=" + id + ", views=" + views + ", interestedSharks=" + interestedSharks + ", pitch="
				+ pitch + "]";
	}

    // Getters and setters
    
}
