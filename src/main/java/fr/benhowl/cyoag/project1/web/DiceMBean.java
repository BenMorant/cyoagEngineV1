package fr.benhowl.cyoag.project1.web;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@SessionScoped
@Getter @Setter
public class DiceMBean implements Serializable  {


		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	final static public int MIN = 1;
	final static public int MAX = 6;

	private int diceNumber = MIN + (int)(Math.random() * ((MAX - MIN) + 1));

	



}