package com.exam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int runscored;
	private String playertype;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the runscored
	 */
	public int getRunscored() {
		return runscored;
	}
	/**
	 * @param runscored the runscored to set
	 */
	public void setRunscored(int runscored) {
		this.runscored = runscored;
	}
	/**
	 * @return the playertype
	 */
	public String getPlayertype() {
		return playertype;
	}
	/**
	 * @param playertype the playertype to set
	 */
	public void setPlayertype(String playertype) {
		this.playertype = playertype;
	}
	public Player(int id, String name, int runscored, String playertype) {
		super();
		this.id = id;
		this.name = name;
		this.runscored = runscored;
		this.playertype = playertype;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

}
