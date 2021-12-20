import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(500, 500);

  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);

    // Setting random variables
    float fltWidth = random(0, width);
    float fltHeight = random(0, height);
    float fltColorR = random(0, 255);
    float fltColorG = random(0, 255);
    float fltColorB = random(0, 255);

    // Setting cloud object position (With random color each frame)
    noStroke();
    fill(fltColorR, fltColorG, fltColorB);
    ellipse(fltWidth / 1.3f, fltHeight / 5.2f, width / 15f, height / 15f);
    ellipse(fltWidth / 1.29f, fltHeight / 4.6f, width / 15f, height / 15f);
    ellipse(fltWidth / 1.38f, fltHeight / 4.6f, width / 15f, height / 15f);
    ellipse(fltWidth / 1.27f, fltHeight / 5.2f, width / 15f, height / 15f);
    ellipse(fltWidth / 1.2f, fltHeight / 4.6f, width / 15f, height / 15f);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Draw rectangle in front of time
    fill(255, 255);
    stroke(153);
    rect(60, 180, 400, 130);

    // Setting values for time
    int intHour = hour();
    int intMinute = minute();
    int intSecond = second();

    // Printing out time
    String strTime = (str(intHour % 12) + ":" + str(intMinute) + ":" + str(intSecond));

    // Setting font and size of text
    noStroke();
    fill(0, 0, 0);
    textSize(100);
    text(strTime, 110, 275);

  }

  // define other methods down here.
}