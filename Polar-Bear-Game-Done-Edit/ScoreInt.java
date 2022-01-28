import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * A ScoreInt class that allows you to display a textual value on screen.
 * 
 * The ScoreInt is an actor, so you will need to create it, and then add it to the world
 * in Greenfoot.  If you keep a reference to the ScoreInt then you can change the text it
 * displays.  
 *
 * @author Amjad Altadmri 
 * @version 1.1
 */
public class ScoreInt extends Actor
{
    private String value;
    private int fontSize;
    private int scoreLength;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    private static final Color transparent = new Color(0,0,0,0);

    public void act() {
        setValue(Double.valueOf(value) + 0.1);
        if (value.length() > scoreLength) {
            setLocation(getX() + 8, getY());
            scoreLength++;
        }
    }
    
    /**
     * Create a new label, initialise it with the int value to be shown and the font size 
     */
    public ScoreInt(int value, int fontSize)
    {
        this(Integer.toString(value), fontSize);
    }
    
    /**
     * Create a new label, initialise it with the needed text and the font size 
     */
    public ScoreInt(String value, int fontSize)
    {
        this.value = value;
        this.fontSize = fontSize;
        updateImage();
    }

    /**
     * Sets the value  as text
     * 
     * @param value the text to be show
     */
    public void setValue(String value)
    {
        this.value = value;
        updateImage();
    }
    
    /**
     * Sets the value as integer
     * 
     * @param value the value to be show
     */
    public void setValue(int value)
    {
        this.value = Integer.toString(value);
        updateImage();
    }
    
    public void setValue(double value) {
        this.value = Double.toString(round(value, 1));
        updateImage();
    }
    /**
     * Sets the line color of the text
     * 
     * @param lineColor the line color of the text
     */
    public void setLineColor(Color lineColor)
    {
        this.lineColor = lineColor;
        updateImage();
    }
    
    /**
     * Sets the fill color of the text
     * 
     * @param fillColor the fill color of the text
     */
    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
        updateImage();
    }
    

    /**
     * Update the image on screen to show the current value.
     */
    private void updateImage()
    {
        setImage(new GreenfootImage(value, fontSize, fillColor, transparent, lineColor));
    }
    
    public String getValue() {
        return value;
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
