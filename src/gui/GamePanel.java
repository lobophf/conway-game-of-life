package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import model.World;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private final static int CELLSIZE = 15;
	
	private final static Color backgroundColor = new Color(7, 7, 7);
	private final static Color foregroundColor = new Color(250, 250, 250);
	private final static Color gridColor = new Color(25, 25, 25);
	
	private int topBottomMargin;
	private int leftRightMargin;
	
	private World world;
	
	public GamePanel() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row = (e.getY() - topBottomMargin)/CELLSIZE;
				int col = (e.getX() - leftRightMargin)/CELLSIZE;
				
				if(row >= world.getRows() || col >= world.getColumns()) {
					return;
				}
			
				boolean status = world.getCell(row, col);
				world.setCell(row, col, !status);
				
				repaint();
			}
		});
		Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> next(), 500, 200, TimeUnit.MILLISECONDS);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		
		int width = getWidth();
		int height = getHeight();
		
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE)/2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE)/2;
		
		int rows = (height - 2 * topBottomMargin)/CELLSIZE;
		int columns = (width - 2 * leftRightMargin)/CELLSIZE;
		
		if(world == null) {
			world = new World(rows, columns);
		}else if(world.getRows() != rows || world.getColumns() != columns){
				world = new World(rows, columns);
		}
		
		g2.setColor(backgroundColor);
		g2.fillRect(0, 0, width, height);
		
		drawGrid(g2, width, height);
		
		for(int col = 0; col < columns; col++) {
			for(int row = 0; row < rows; row++) {
				
				boolean status = world.getCell(row, col);
				fillCell(g2, row, col, status);
			}
		}
	}
	
	private void fillCell(Graphics2D g2, int row, int col, boolean status){
		if(status){
			g2.setColor(foregroundColor);
			g2.fillRect(leftRightMargin + col * CELLSIZE + 2, topBottomMargin + row * CELLSIZE + 2, CELLSIZE - 3, CELLSIZE - 3);
		}
	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		g2.setColor(gridColor);
		
		for(int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		
		for(int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}
	}

	public void randomize() {
		
		world.randomize();
		repaint();
	}

	public void clear() {
		world.clear();
		repaint();
	}
	
	public void next() {
		world.next();
		repaint();
	}
}
