package com.code.api.sharktank.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text", length = 500, nullable = false)
    private String text;

    @Column(name = "timestamp")
    private LocalDateTime timestamp = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "pitch_id")
    private Pitch pitch;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	public Comment(Long id, String text, LocalDateTime timestamp, Pitch pitch, User user) {
		super();
		this.id = id;
		this.text = text;
		this.timestamp = timestamp;
		this.pitch = pitch;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Pitch getPitch() {
		return pitch;
	}

	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", timestamp=" + timestamp + ", pitch=" + pitch + ", user="
				+ user + "]";
	}

    // Getters and setters
	
    
}
