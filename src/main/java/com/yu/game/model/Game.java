package com.yu.game.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name=" ";
    private String description=" ";
    private String status=" ";
    
    public Game(){
    	
    }
    public Game(String name,String description,String status){
        super();
        this.name=name;
        this.description=description;
        this.status=status;	
    }
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + "]";
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}    
    
}
   