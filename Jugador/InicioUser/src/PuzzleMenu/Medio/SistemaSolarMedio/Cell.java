/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PuzzleMenu.Medio.SistemaSolarMedio;

/**
 *
 * @author DELL
 */
public class Cell {
	private final int x, y;
	private Figure figure;
	
	public Cell(int x, int y, Figure figure){
		this.x = x;
		this.y = y;
		this.figure = figure;
		
	}
	public Cell(int x, int y){
		this.x = x;
		this.y = y;
		figure = null;
	}
	public Figure getFigure(){
		return figure;
	}
	public void setFigure(Figure figure){
		this.figure = figure;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}