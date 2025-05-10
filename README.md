<div style="background: #f5f5f5; padding: 16px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 20px 0;">

#Starfield Simulation

A mesmerizing Java Swing animation of stars moving through 3D space

# ✨ Features
200 stars with randomized positions, sizes, and speeds

Smooth 3D perspective effect using z-depth calculations

Customizable screen dimensions (700x700 by default)

Efficient rendering with Timer-based animation loop

Minimalist white-on-black aesthetic

# 🚀 How to Run
Compile all Java files:

javac *.java
Execute the program:

java Main

# 🖥️ Project Structure
Class	Responsibility
Main	Program entry point, launches JFrame
Frame	Main window configuration
Panel	Drawing surface and animation logic
Star	Individual star properties and movement
🎨 Technical Highlights
```
dx = (int) ((x / (double) z) * Panel.SCREEN_WIDTH / 2;
dy = (int) ((y / (double) z) * Panel.SCREEN_HEIGHT / 2;
```
📂 Suggested GitHub Repository Description
*"A Java Swing implementation of a 3D starfield animation, featuring z-depth calculations and smooth rendering at 60 FPS. Perfect for learning basic game physics and Swing graphics!"*
```
Timer timer = new Timer(1000/60, this); // Animation loop (60 FPS)
```

📝 Customization Options
Change star count in Panel.java:
```
star = new Star[200]; // Modify this number
```
Adjust animation speed in Star.java:
```
zSpeed = new Random().nextInt(2) + 1;
```


® Created by Hussam Alibrahim
